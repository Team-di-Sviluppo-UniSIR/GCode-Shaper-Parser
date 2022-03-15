package gcodeMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.runtime.RecognitionException;

import gcodeIDE.GCodeIDEWindow;
import shaperCompiler.*;
import shaperCompiler.util.*;

public class ParserLauncher {

	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {

		/*
		 * String fileIn = ".\\resources\\shaperInput.shaper";
		 * 
		 * System.out.println ("Parsing con ANTLR");
		 * 
		 * shaperGrammarParser parser = new shaperGrammarParser(fileIn);
		 * parser.shaper();
		 * 
		 * if (parser.getErrorList().size() == 0)
		 * System.out.println("Parsing completato con successo"); else { int i = 0;
		 * System.out.println("Errori rilevati"); for (ShaperError msg :
		 * parser.getErrorList()) System.out.println(++i + " - " + msg); }
		 */

		GCodeIDEWindow.gCodeIDEWindow();

	}
}
