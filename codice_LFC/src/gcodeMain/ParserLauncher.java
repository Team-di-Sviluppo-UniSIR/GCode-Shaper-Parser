package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import javaCompiler.simpleJavaLexer;
import javaCompiler.simpleJavaParser;

public class ParserLauncher {
	public static void main (String[] args) throws FileNotFoundException, IOException, RecognitionException {		
	  	String fileIn = ".\\resources\\input.file";

		System.out.println ("Parsing con ANTLR");

		simpleJavaParser parser = new simpleJavaParser(fileIn);
		parser.java();
		System.out.println ("Parsing Completato con successo");
		
	}
}
