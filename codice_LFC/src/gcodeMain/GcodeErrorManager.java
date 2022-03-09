package gcodeMain;

import java.util.Collection;
import java.util.Collections;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.BlockDescriptor;
import gcodeCompiler.util.Error;
import gcodeCompiler.gcodeGrammarHandler;

public class GcodeErrorManager {
	static boolean gcodeErrorMgmt(gcodeGrammarParser parser) {

		/*
		 * nel caso non ci siano errori lessicali o sintattici, effettua verifica
		 * presenza errori semantici
		 */
		if (parser.getErrorList().size() == 0) {
			GcodeErrorManager.checkM30(parser);
			GcodeErrorManager.checkToolError(parser);
			GcodeErrorManager.checkCoordinateType(parser);
			GcodeErrorManager.checkSpindleRotation(parser);
		}

		/*
		 * nel caso in cui la lista degli errori sia vuota, il parsing ha avuto successo
		 * senza errori lessicali, sintattici o semantici
		 */
		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completed successfully with 0 errors\n");
			System.out.println("Block list");
			parser.h.printBlocks();
			return true;

		} else {
			/*
			 * altrimenti stampa la lista degli errori, ordinata in base al valore [riga,
			 * colonna] in cui compaiono
			 */

			int i = 0;

			if (parser.getErrorList().size() == 1)
				System.err.println("Parsing failed (1 error)\n");
			else
				System.err.println("Parsing failed (" + parser.getErrorList().size() + " errors)\n");

			System.err.println("** Error list **");

			Collections.sort(parser.getErrorList());

			for (Error errore : parser.getErrorList())
				System.err.println(++i + " - " + errore.toString());
		}
		
		return false;
	}

	// Errore SEM_NO_END_PROG
	private static void checkM30(gcodeGrammarParser parser) {
		BlockDescriptor bd = parser.h.blocks.get(parser.h.blocks.lastKey());
		Token last = parser.h.getLast_token();
		last.setCharPositionInLine(bd.toString().length() + bd.getNum_block().toString().length() + 2);

		boolean check = false;
		if (bd.getInfoTecM() == null)
			check = true;
		else if (bd.getInfoTecM().getEnd_program() == null)
			check = true;

		if (check)
			parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_END_PROG, last, bd);
	}

	// Errore SEM_TOOL_ERR
	private static void checkToolError(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();

		int i = 0;
		for (BlockDescriptor bd : valuesCollection) {
			boolean check = false;
			if (bd.getInfotTec().getT() != null) {
				if (bd.getInfoTecM() == null)
					check = true;
				else if (bd.getInfoTecM().getChange_tool() == null)
					check = true;
			} else if (bd.getInfoTecM() != null) {
				if (bd.getInfoTecM().getChange_tool() != null)
					check = true;
			}

			if (check) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_TOOL_ERR, t, bd);
			}

			++i;
		}
	}

	// errore SEM_NO_COORDINATE_TYPE
	private static void checkCoordinateType(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();

		int i = -1;
		for (BlockDescriptor bd : valuesCollection) {
			++i;
			if (bd.getInfoGeo().getCoord_abs_rel() != null)
				break;
		}

		int j = -1;
		for (BlockDescriptor bd : valuesCollection) {
			++j;
			if (bd.getInfoGeo().getCm() != null || bd.getInfoGeo().getLm() != null) {
				if (j <= i) {
					Token t = new CommonToken(0);
					t.setLine(j);
					t.setCharPositionInLine(0);
					parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_COORDINATE_TYPE, t, bd);
				}
			}
		}
	}

	// errore SEM_NO_SPINDLE_ROTATION
	private static void checkSpindleRotation(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean presence = false;
		boolean error = false;
		boolean first = false;
		int i = 1;
		for (BlockDescriptor bd : valuesCollection) {

			if (bd.getInfoTecM() != null) {
				if (bd.getInfoTecM().getRot_tool() != null)
					presence = true;
			}
			if ((bd.getInfoGeo().getLm() != null || bd.getInfoGeo().getCm() != null) && !presence) {
				error = true;
			}

			if (error && !first) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_SPINDLE_ROTATION, t, bd);
				first = true;
			}
			i++;

		}
	}

}
