package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.runtime.*;
import javaCompiler.*;

public class ParserTester {
	static simpleJavaParser parser;

	public static void main(String[] args) {
		CommonTokenStream tokens;
		String fileIn = ".\\resources\\input.file";
		String fileOut1 = ".\\resources\\parser.ANTLR.out.txt";
		String fileErr1 = ".\\resources\\parser.ANTLR.err.txt";
		try {
			System.out.println("Parsing con ANTLR lexer");
			System.out.println("-----------------------");
			simpleJavaLexer lexer = new simpleJavaLexer(
					new ANTLRReaderStream(new FileReader(fileIn)));
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
		parser = new simpleJavaParser(tokens);
		parser.java();
	}
}
