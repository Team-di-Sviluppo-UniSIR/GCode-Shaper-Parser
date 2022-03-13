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

		GCodeIDEWindow.gCodeIDEWindow();

	}
}
