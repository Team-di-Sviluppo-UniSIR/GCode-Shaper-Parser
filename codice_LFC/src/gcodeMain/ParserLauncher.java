package gcodeMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import org.antlr.runtime.RecognitionException;
import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.Error;

public class ParserLauncher {
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		String fileIn = ".\\resources\\input.file";

		System.out.println("GCODE PARSING WITH ANTLR3\n");

		gcodeGrammarParser parser = new gcodeGrammarParser(fileIn);

		parser.gcode();

		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completed successfully with 0 errors\n");
			System.out.println("Block list");
			parser.h.printBlocks();

		} else {
			int i = 0;

			if (parser.getErrorList().size() == 1)
				System.out.println("Parsing failed (1 error)\n");
			else
				System.out.println("Parsing failed (" + parser.getErrorList().size() + " errors)\n");

			System.out.println("Error list");

			Collections.sort(parser.getErrorList());

			for (Error errore : parser.getErrorList())
				System.out.println(++i + " - " + errore.toString());
		}
	}
}
