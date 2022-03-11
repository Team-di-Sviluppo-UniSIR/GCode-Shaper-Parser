package gcodeDrawingTool;

import java.awt.*;
import javax.swing.*;
import gcodeCompiler.gcodeGrammarParser;

@SuppressWarnings("serial")
public class GCodeDrawingViewer extends JFrame {

	// dimensioni della finestra
	public static final int CANVAS_WIDTH = 700;
	public static final int CANVAS_HEIGHT = 700;
	private StaticDrawingController canvas;

	// metodo di display della finestra
	public GCodeDrawingViewer(gcodeGrammarParser parser) {
		canvas = new StaticDrawingController(parser);
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
		Container cp = getContentPane();
		cp.add(canvas);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setTitle("G-Code Drawing Tool v1.0");
		setVisible(true);
	}
}