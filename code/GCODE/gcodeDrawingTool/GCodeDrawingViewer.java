package gcodeDrawingTool;

import java.awt.*;
import javax.swing.*;
import gcodeCompiler.gcodeGrammarParser;

// TODO: Auto-generated Javadoc
/**
 * The Class GCodeDrawingViewer.
 */
@SuppressWarnings("serial")
public class GCodeDrawingViewer extends JFrame {

	/** The Constant CANVAS_WIDTH. */
	// dimensioni della finestra
	public static final int CANVAS_WIDTH = 700;
	
	/** The Constant CANVAS_HEIGHT. */
	public static final int CANVAS_HEIGHT = 750;
	
	/** The Constant AXIS_COMP. */
	public static final int AXIS_COMP = 100;
	
	/** The canvas. */
	private StaticDrawingController canvas;

	/**
	 * Instantiates a new g code drawing viewer.
	 *
	 * @param parser the parser
	 */
	// metodo di display della finestra
	public GCodeDrawingViewer(gcodeGrammarParser parser) {

		canvas = new StaticDrawingController(parser);
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
		Container cp = getContentPane();
		cp.add(canvas);
		setResizable(false);
		pack();
		setTitle("G-Code Drawing Tool v1.0");
		setVisible(true);
	}
}