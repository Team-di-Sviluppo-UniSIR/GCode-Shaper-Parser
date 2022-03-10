package gcodeDrawingTool;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.*;

@SuppressWarnings("serial")
public class StaticDrawing extends JFrame {

	/*
	 * dobbiamo decidere con che valori settare le dimensioni della finestra:
	 * ricordiamoci che coordinate GCODE potrebbero variare da X10 Y10 a X1000
	 * Y1000, quindi dobbiamo cercare un modo di parametrizzare le coordinate in un
	 * range standard, che possa starci nella finestra
	 */
	public static final int CANVAS_WIDTH = 700;
	public static final int CANVAS_HEIGHT = 700;
	private DrawCanvas canvas;

	public StaticDrawing(gcodeGrammarParser parser) {
		canvas = new DrawCanvas();
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
		Container cp = getContentPane();
		cp.add(canvas);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setTitle("G-Code Drawing Tool v1.0");
		setVisible(true);
	}

	private class DrawCanvas extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(Color.BLACK); // colore sfondo
			g.setColor(Color.YELLOW); // colore disegno

			/*
			 * DEFINIZIONE COORDINATE: attenzione che il riferimento non è in basso a
			 * sinistra ma in alto a sinistra, quindi è necessaria traslazione delle Y di un
			 * fattore pari all'altezza del canvas
			 */
			int x1 = 10;
			int y1 = CANVAS_HEIGHT - 10;
			int x2 = 70;
			int y2 = CANVAS_HEIGHT - 70;

			// disegno una linea di prova
			// g.drawLine(x1, y1, x2, y2);

			/*
			 * disegno una casella di testo: la casella di testo fa parte dell'area
			 * disegnabile, quindi dovremo limitare le coordinate in Y per evitare che
			 * entrino nell'area della casella di testo
			 */
			g.setColor(Color.WHITE);
			g.setFont(new Font("Monospaced", Font.PLAIN, 15));
			g.drawString("  Tool rotation: clockwise", 10, 20);
			g.drawString("     Move speed: 100", 10, 35);
			g.drawString("     Work speed: 100", 10, 50);
			g.drawString("Coordinate type: absolute", 10, 65);

			int prova[] = { 100, 100, 100, 300, 400, 300, 400, 250, 450, 250, 450, 100, 100, 100 };
			int prova2[] = { 100, 300, 300, 300, 300 - 100, 300, 100 + 100, 100 + 100, 90, 90 };

			// possiamo leggere le coordinate e stamparle di seguito

			for (int i = 2; i <= prova.length - 2; i += 2) {
				g.drawLine(prova[i - 2], CANVAS_HEIGHT + 50 - prova[i - 1], prova[i],
						CANVAS_HEIGHT + 50 - prova[i + 1]);
			}

			g.drawLine(100, 300, 300, 300);

			Token trecento = new CommonToken(0);
			trecento.setText("300");

			Token duecento = new CommonToken(0);
			duecento.setText("200");

			Token moveType = new CommonToken(0);
			moveType.setText("G02");

			Coordinate puntoFinale = new Coordinate(trecento, duecento, null);
			Coordinate puntoCentrale = new Coordinate(duecento, duecento, null);
			CircularMove cm = new CircularMove(moveType, puntoFinale, puntoCentrale);

			// g.drawArc(300 - 100, 300, 100 + 100, 100 + 100, 90, 90);

			/*
			 * TODO funzione per disegnare l'arco in GCODE che usi però la struttura del
			 * drawArc()
			 */
			circularInterpolation(cm, g);

		}

		// TODO
		/*
		 * Da sistemare: deve implementare tutti gli archi sia G02 che G03 possiamo
		 * implementarla mantenendo il sistma di riferimento con origine in altro a
		 * sinistra per semplificare le cose
		 */
		private void circularInterpolation(CircularMove cm, Graphics g) {
			int raggio = cm.getC_xyz().getFirst() - cm.getC_ijk().getFirst();

			int xTopLeft = cm.getC_ijk().getFirst();
			int yTopLeft = cm.getC_ijk().getSecond() + raggio;

			int width = raggio * 2;
			int height = raggio * 2;

			int startAngle = 90;
			int arcAngle = 0;

			if (cm.getC_xyz().getSecond() == cm.getC_ijk().getSecond())
				arcAngle = -90;
			else if (cm.getC_xyz().getFirst() == cm.getC_ijk().getFirst())
				arcAngle = -180;

			System.out.println("\nraggio: " + raggio);
			System.out.println("xTopLeft: " + xTopLeft);
			System.out.println("yTopLeft: " + yTopLeft);
			System.out.println("width = height: " + width);
			System.out.println("startAngle: " + startAngle);
			System.out.println("arcAngle: " + arcAngle);

			// alla fine disegno usando il metodo della libreria
			g.drawArc(xTopLeft, yTopLeft, width, height, startAngle, arcAngle);
		}
	}
}