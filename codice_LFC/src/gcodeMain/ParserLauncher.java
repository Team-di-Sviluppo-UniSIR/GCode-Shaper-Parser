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

		// istanziamento parser
		gcodeGrammarParser parser = new gcodeGrammarParser(fileIn);

		// avvio parser
		parser.gcode();

		// check e print degli errori
		GcodeErrorManager.gcodeErrorMgmt(parser);

	}
}
