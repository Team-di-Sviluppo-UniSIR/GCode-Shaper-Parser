package gcodeMain;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.runtime.*;
import gcodeCompiler.*;

public class ParserTester {
	static gcodeGrammarParser parser;

	public static void main(String[] args) {
		CommonTokenStream tokens;
		String fileIn = ".\\resources\\input.file";
		String fileOut1 = ".\\resources\\parser.ANTLR.out.txt";
		String fileErr1 = ".\\resources\\parser.ANTLR.err.txt";
		try {
			System.out.println("Parsing con ANTLR lexer");
			System.out.println("-----------------------");
			gcodeGrammarLexer lexer = new gcodeGrammarLexer(new ANTLRReaderStream(new FileReader(fileIn)));
			tokens = new CommonTokenStream(lexer);
			parse(tokens, fileOut1, fileErr1);
		} catch (Exception e) {
			System.out.println("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
	}

	static void parse(CommonTokenStream tokens, String fileOut, String fileErr)
			throws IOException, RecognitionException {
		FileWriter fOut;
		parser = new gcodeGrammarParser(tokens);
		parser.gcode();
	}
}
