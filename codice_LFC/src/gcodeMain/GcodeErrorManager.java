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
		boolean check = false;
		for (Error e : parser.getErrorList()) {
			if (e.getType() != gcodeGrammarHandler.TOKEN_ERROR || e.getType() != gcodeGrammarHandler.ERR_ON_SYNTAX)
				check = true;
		}

		if (parser.getErrorList().size() == 0 || !check) {
			GcodeErrorManager.checkM30(parser);
			GcodeErrorManager.checkToolError(parser);
			GcodeErrorManager.checkCoordinateType(parser);
			GcodeErrorManager.checkSpindleRotation(parser);
			GcodeErrorManager.checkM05(parser);
			GcodeErrorManager.checkSF_move(parser);
			GcodeErrorManager.checkSF_job(parser);

			check = false;
		}

		/*
		 * nel caso in cui la lista degli errori sia vuota, il parsing ha avuto successo
		 * senza errori lessicali, sintattici o semantici
		 */
		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completed successfully with 0 errors\n");
			System.out.println("** Block list **");
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

		int i = 1;
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

		int i = 0;
		for (BlockDescriptor bd : valuesCollection) {
			++i;
			if (bd.getInfoGeo().getCoord_abs_rel() != null)
				break;
		}

		int j = 0;
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
			error = false;
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

	// controllo di aver chiamato M03/M04 quando chiamo M05
	private static void checkM05(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean presence = false;
		boolean error = false;
		int i = 1;
		for (BlockDescriptor bd : valuesCollection) {
			error = false;
			if (bd.getInfoTecM() != null && bd.getInfoTecM().getRot_tool() != null)
				presence = true;
			if (bd.getInfoTecM() != null) {
				if (bd.getInfoTecM().getStop_tool() != null && !presence)
					error = true;
			}

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_END_ROT_ERR, t, bd);
			}
			i++;

		}
	}

	// controllo di aver definito le velocità prima di effettuare un movimento
	private static void checkSF_move(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean define_F = false;
		boolean error = false;
		int i = 1;
		for (BlockDescriptor bd : valuesCollection) {
			error = false;
			if (bd.getInfotTec().getFree_move_speed() != null)
				define_F = true;
			if (bd.getInfoGeo().getLm() != null) {
				if (bd.getInfoGeo().getLm().getMoveType().compareTo("G00") == 0 && !define_F)
					error = true;
			}

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_MOVE_SPEED_ERR, t, bd);
			}
			i++;
		}
	}

	// controllo di aver definito le velocità prima di effettuare una lavorazione
	private static void checkSF_job(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean define_F = false;
		boolean define_S = false;
		boolean error = false;
		int i = 1;
		for (BlockDescriptor bd : valuesCollection) {
			error = false;
			if (bd.getInfotTec().getFree_move_speed() != null)
				define_F = true;
			if (bd.getInfotTec().getJob_move_speed() != null)
				define_S = true;
			if (bd.getInfoGeo().getLm() != null) {
				if (bd.getInfoGeo().getLm().getMoveType().compareTo("G01") == 0 && !define_F)
					error = true;
			}
			if (bd.getInfoGeo().getCm() != null) {
				if ((bd.getInfoGeo().getCm().getMoveType().compareTo("G02") == 0
						|| bd.getInfoGeo().getCm().getMoveType().compareTo("G03") == 0) && !define_F)
					error = true;
			}

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_JOB_SPEED_ERR, t, bd);
			}
			i++;
		}
	}

}
