package gcodeIDE;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.runtime.RecognitionException;

import shaperCompiler.*;
import shaperCompiler.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class GCodeIDEMain.
 */
public class GCodeIDEMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws RecognitionException the recognition exception
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {

		GCodeIDEWindow.gCodeIDEWindow();

	}
}
