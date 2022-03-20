package gcodeIDE;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.runtime.RecognitionException;

import shaperCompiler.*;
import shaperCompiler.util.*;

public class GCodeIDEMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {

		GCodeIDEWindow.gCodeIDEWindow();

	}
}
