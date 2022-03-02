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
	public static void main (String[] args) throws FileNotFoundException, IOException, RecognitionException {		
	  	String fileIn = ".\\resources\\input.file";

		System.out.println ("Parsing con ANTLR");

		gcodeGrammarParser parser = new gcodeGrammarParser(fileIn);
		parser.gcode();
		
		parser.getH().printBlocks();

		System.out.println ("Parsing Completato");
		

		
	}
}
