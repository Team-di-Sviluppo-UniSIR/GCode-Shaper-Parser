package gcodeMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import org.antlr.runtime.RecognitionException;
import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.Error;
import gcodeDrawingTool.GCodeDrawingViewer;
import gcodeIDE.*;

public class ParserLauncher {

	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		String fileIn = ".\\resources\\sampleInputDrawing.gcode";

		System.out.println("GCODE PARSING WITH ANTLR3\n");

		// istanziamento parser
		gcodeGrammarParser parser = new gcodeGrammarParser(fileIn);

		// avvio parser
		parser.gcode();

		// check e print degli errori
		boolean draw = GcodeErrorManager.gcodeErrorMgmt(parser);

		// TODO
		// qui innestiamo la funzione di stampa grafica
		if (draw) {
			System.out.println("\nE' possibile effettuare la stampa del disegno");
			new GCodeDrawingViewer(parser);
			GCodeIDEWindow.gCodeIDEWindow();
		} else
			System.out.println("\nNon è possibile effettuare la stampa del disegno");

	}
}
