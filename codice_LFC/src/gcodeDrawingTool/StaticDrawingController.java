package gcodeDrawingTool;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Collection;

import javax.swing.JPanel;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import gcodeCompiler.gcodeGrammarHandler;
import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.BlockDescriptor;
import gcodeCompiler.util.CircularMove;
import gcodeCompiler.util.Coordinate;

/*
 * sarà necessario creare una funzione per la stampa in coordinate assolute ed
 * una per la stampa in coordinate relative
 */
@SuppressWarnings("serial")
class StaticDrawingController extends JPanel {
	gcodeGrammarParser parser;

	public StaticDrawingController(gcodeGrammarParser parser) {
		this.parser = parser;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLACK); // colore sfondo

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

		staticDrawing(parser, g);
	}

	// versione definitiva dell'interpolazione circolare
	private void circularInterpolation(CircularMove cm, Graphics g, int compensazione_assi) {
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
		int yTopLeft = GCodeDrawingViewer.CANVAS_HEIGHT - cm.getC_ijk().getSecond() - raggio;

		// alla fine disegno usando il metodo della libreria
		g.drawArc(xTopLeft + compensazione_assi, yTopLeft - compensazione_assi, width, height, startAngle, arcAngle);

	}

	// static drawing (coordinate assolute e relative)
	private void staticDrawing(gcodeGrammarParser parser, Graphics g) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		int i = 1;
		int compensazione_assi = 200;

		// coordinate iniziali (origine degli assi)
		int xp = 0;
		int yp = 0;
		int zp = 0;

		// coordinate attuali
		int x = 0;
		int y = 0;
		int z = 0;

		// coordinate assolute o relative
		boolean coordAbsolute = true;

		for (BlockDescriptor bd : valuesCollection) {

			if (bd.getInfoGeo().getCoord_abs_rel() != null) {
				if (bd.getInfoGeo().getCoord_abs_rel().equals("G90"))
					coordAbsolute = true;
				else
					coordAbsolute = false;
			}

			if (bd.getInfoGeo().getLm() != null) {
				if (bd.getInfoGeo().getLm().getC_xyz().isFirstNotNull())
					if (coordAbsolute)
						x = bd.getInfoGeo().getLm().getC_xyz().getFirst();
					else
						x = xp + bd.getInfoGeo().getLm().getC_xyz().getFirst();
				else
					x = xp;

				if (bd.getInfoGeo().getLm().getC_xyz().isSecondNotNull())
					if (coordAbsolute)
						y = bd.getInfoGeo().getLm().getC_xyz().getSecond();
					else
						y = yp + bd.getInfoGeo().getLm().getC_xyz().getSecond();
				else
					y = yp;

				if (bd.getInfoGeo().getLm().getC_xyz().isThirdNotNull())
					if (coordAbsolute)
						z = bd.getInfoGeo().getLm().getC_xyz().getThird();
					else
						z = zp + bd.getInfoGeo().getLm().getC_xyz().getThird();
				else
					z = zp;

				// caso G00 non disegno ma salvo coordinate
				// caso G01 disegno
				if (bd.getInfoGeo().getLm().getMoveType().equals("G01")) {
					g.drawLine(xp + compensazione_assi, GCodeDrawingViewer.CANVAS_HEIGHT - (yp + compensazione_assi),
							x + compensazione_assi, GCodeDrawingViewer.CANVAS_HEIGHT - (y + compensazione_assi));
				}

				xp = x;
				yp = y;
				zp = z;
			}

			if (bd.getInfoGeo().getCm() != null) {
				int xp_temp = bd.getInfoGeo().getCm().getC_xyz().getFirst();
				int yp_temp = bd.getInfoGeo().getCm().getC_xyz().getSecond();
				int zp_temp = bd.getInfoGeo().getCm().getC_xyz().getThird();

				if (!coordAbsolute) {
					Coordinate finale = new Coordinate("X" + String.valueOf(xp + xp_temp),
							"Y" + String.valueOf(yp + yp_temp), "Z" + String.valueOf(zp + zp_temp));

					Coordinate centro = new Coordinate(
							"I" + String.valueOf(xp + bd.getInfoGeo().getCm().getC_ijk().getFirst()),
							"J" + String.valueOf(yp + bd.getInfoGeo().getCm().getC_ijk().getSecond()),
							"K" + String.valueOf(zp + bd.getInfoGeo().getCm().getC_ijk().getThird()));

					Token t = new CommonToken(0);
					t.setText(bd.getInfoGeo().getCm().getMoveType());

					CircularMove cm = new CircularMove(t, finale, centro);
					circularInterpolation(cm, g, compensazione_assi);

					xp = cm.getC_xyz().getFirst();
					yp = cm.getC_xyz().getSecond();
					zp = cm.getC_xyz().getThird();

				} else {
					xp = xp_temp;
					yp = yp_temp;
					zp = zp_temp;

					circularInterpolation(bd.getInfoGeo().getCm(), g, compensazione_assi);
				}

				parser.h.printBlocks();
				System.out.println("\n\n");
			}

		}
	}
}