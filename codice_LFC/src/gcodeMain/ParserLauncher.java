package gcodeMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import org.antlr.runtime.RecognitionException;

import gcodeCompiler.gcodeGrammarLexer;
import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.Error;

public class ParserLauncher {
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		String fileIn = ".\\resources\\input.file";

		System.out.println("Parsing con ANTLR\n");

		gcodeGrammarParser parser = new gcodeGrammarParser(fileIn);

		
		parser.gcode();

		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completato con successo\n");
			parser.h.printBlocks();

		} else {
			int i = 0;
			System.out.println("Errori rilevati");

			Collections.sort(parser.getErrorList());

			for (Error errore : parser.getErrorList())
				System.out.println(++i + " - " + errore.toString());
		}

		System.out.println("\nParsing Completato");
	}
}
