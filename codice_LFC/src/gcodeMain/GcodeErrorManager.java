package gcodeMain;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.BlockDescriptor;
import gcodeCompiler.util.Error;
import gcodeCompiler.gcodeGrammarHandler;

public class GcodeErrorManager {
	static void gcodeErrorMgmt(gcodeGrammarParser parser) {
		
		if (parser.getErrorList().size() == 0) {
			GcodeErrorManager.checkM30(parser);
			GcodeErrorManager.checkToolError(parser);
		}

		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completed successfully with 0 errors\n");
			System.out.println("Block list");
			parser.h.printBlocks();

		} else {
			int i = 0;

			if (parser.getErrorList().size() == 1)
				System.err.println("Parsing failed (1 error)\n");
			else
				System.out.println("Parsing failed (" + parser.getErrorList().size() + " errors)\n");

			System.err.println("** Error list **");

			Collections.sort(parser.getErrorList());

			for (Error errore : parser.getErrorList())
				System.err.println(++i + " - " + errore.toString());
		}
	}

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
}
