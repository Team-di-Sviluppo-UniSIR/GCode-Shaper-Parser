package gcodeDrawingTool;

import java.awt.*;
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

	/*
	 * sarà necessario creare una funzione per la stampa in coordinate assolute ed
	 * una per la stampa in coordinate relative
	 */
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

			/*
			 * for (int i = 2; i <= prova.length - 2; i += 2) { g.drawLine(prova[i - 2],
			 * CANVAS_HEIGHT + 50 - prova[i - 1], prova[i], CANVAS_HEIGHT + 50 - prova[i +
			 * 1]); }
			 */
			g.drawLine(250, CANVAS_HEIGHT - 200, 250, CANVAS_HEIGHT - 50);

			Token moveType = new CommonToken(0);
			moveType.setText("G02");

			Token X = new CommonToken(0);
			X.setText("300");

			Token Y = new CommonToken(0);
			Y.setText("250");

			Token I = new CommonToken(0);
			I.setText("300");

			Token J = new CommonToken(0);
			J.setText("200");

			Coordinate puntoFinale = new Coordinate(X, Y, null);
			Coordinate puntoCentrale = new Coordinate(I, J, null);
			CircularMove cm = new CircularMove(moveType, puntoFinale, puntoCentrale);

			circularInterpolation(cm, g);
		}

		// versione definitiva dell'interpolazione circolare
		private void circularInterpolation(CircularMove cm, Graphics g) {
			int raggio1 = Math.abs(cm.getC_xyz().getFirst() - cm.getC_ijk().getFirst());
			int raggio2 = Math.abs(cm.getC_xyz().getSecond() - cm.getC_ijk().getSecond());
			int raggio = 0;
			int startAngle = 0;
			int arcAngle = 0;

			if (cm.getC_xyz().getFirst() == cm.getC_ijk().getFirst()) {
				raggio = raggio2;

				if (cm.getC_xyz().getSecond() > cm.getC_ijk().getSecond()) {
					if (cm.getMoveType().equals("G02")) { // 1
						startAngle = -180;
						arcAngle = -90;
					} else { // 8
						startAngle = 0;
						arcAngle = 90;
					}
				} else if (cm.getC_xyz().getSecond() < cm.getC_ijk().getSecond()) {
					if (cm.getMoveType().equals("G03")) { // 4
						startAngle = -180;
						arcAngle = 90;
					} else { // 5
						startAngle = 0;
						arcAngle = -90;
					}
				}
			}

			if (cm.getC_xyz().getSecond() == cm.getC_ijk().getSecond()) {
				raggio = raggio1;
				if (cm.getC_xyz().getFirst() > cm.getC_ijk().getFirst()) {
					if (cm.getMoveType().equals("G03")) { // 2
						startAngle = -90;
						arcAngle = 90;
					} else { // 3
						startAngle = 90;
						arcAngle = -90;
					}
				}

				if (cm.getC_ijk().getFirst() > cm.getC_xyz().getFirst()) {
					if (cm.getMoveType().equals("G03")) { // 6
						startAngle = 90;
						arcAngle = 90;
					} else { // 7
						startAngle = -180;
						arcAngle = 90;
					}
				}
			}

			int width = raggio * 2;
			int height = raggio * 2;

			int xTopLeft = cm.getC_ijk().getFirst() - raggio;
			int yTopLeft = CANVAS_HEIGHT - cm.getC_ijk().getSecond() - raggio;

			// alla fine disegno usando il metodo della libreria
			g.drawArc(xTopLeft, yTopLeft, width, height, startAngle, arcAngle);

		}
	}
}