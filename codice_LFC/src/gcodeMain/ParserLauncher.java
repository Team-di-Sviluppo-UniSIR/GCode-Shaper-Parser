package gcodeMain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import gcodeCompiler.gcodeGrammarLexer;
import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.gcodeGrammarHandler;

public class ParserLauncher {
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		String fileIn = ".\\resources\\input.file";

		System.out.println("Parsing con ANTLR\n");

		gcodeGrammarParser parser = new gcodeGrammarParser(fileIn);
		parser.gcode();

		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completato con successo");

		} else {
			int i = 0;
			System.out.println("Errori rilevati");
			for (String msg : parser.getErrorList())
				System.out.println(++i + " - " + msg);
		}

		System.out.println("\nParsing Completato");
	}
}
