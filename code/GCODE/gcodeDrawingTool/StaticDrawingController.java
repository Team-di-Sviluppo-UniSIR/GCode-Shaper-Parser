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

// TODO: Auto-generated Javadoc
/**
 * The Class StaticDrawingController.
 */
@SuppressWarnings("serial")
class StaticDrawingController extends JPanel {
	
	/** The parser. */
	gcodeGrammarParser parser;

	/**
	 * Instantiates a new static drawing controller.
	 *
	 * @param parser the parser
	 */
	public StaticDrawingController(gcodeGrammarParser parser) {
		this.parser = parser;
	}

	/**
	 * Paint component.
	 *
	 * @param g the g
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLACK); // colore sfondo

		drawSpecs(parser, g);
		drawReferenceSystem(g); // print del sistema di riferimento
		staticDrawing(parser, g); // print della figura
	}

	/**
	 * Draw specs.
	 *
	 * @param parser the parser
	 * @param g the g
	 */
	private void drawSpecs(gcodeGrammarParser parser, Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("Monospaced", Font.PLAIN, 15));

		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean coordAbsolute = true;
		boolean toolRotCW = true;
		boolean lubeON = false;
		int compensazione = 0;

		String moveSpeed = null;
		String jobSpeed = null;

		for (BlockDescriptor bd : valuesCollection) {
			if (bd.getInfoGeo().getCoord_abs_rel() != null)
				if (bd.getInfoGeo().getCoord_abs_rel().equals("G90"))
					coordAbsolute = true;
				else
					coordAbsolute = false;

			if (bd.getInfoTecM() != null && bd.getInfoTecM().getRot_tool() != null)
				if (bd.getInfoTecM().getRot_tool().equals("M03"))
					toolRotCW = true;
				else
					toolRotCW = false;

			if (bd.getInfoTecM() != null && bd.getInfoTecM().getLube() != null)
				if (bd.getInfoTecM().getLube().equals("M08"))
					lubeON = true;

			if (bd.getInfotTec().getFree_move_speed() != null)
				moveSpeed = bd.getInfotTec().getFree_move_speed();

			if (bd.getInfotTec().getJob_move_speed() != null)
				jobSpeed = bd.getInfotTec().getJob_move_speed();

			if (bd.getInfoGeo().getCompensation() != null)
				if (bd.getInfoGeo().getCompensation().equals("G41"))
					compensazione = 1;
				else if (bd.getInfoGeo().getCompensation().equals("G42"))
					compensazione = 2;

		}

		if (toolRotCW)
			g.drawString("  Tool rotation: clockwise", 45, 45);
		else
			g.drawString("  Tool rotation: anticlockwise", 45, 45);

		g.drawString("     Move speed: " + moveSpeed.substring(1) + " mm/min", 45, 65);
		g.drawString("     Work speed: " + jobSpeed.substring(1) + " rpm", 45, 85);

		if (coordAbsolute)
			g.drawString("Coordinate type: absolute", 385, 45);
		else
			g.drawString("Coordinate type: relative", 385, 45);

		switch (compensazione) {
		case 0:
			g.drawString("   Compensation: OFF", 385, 65);
			break;

		case 1:
			g.drawString("   Compensation: left", 385, 65);
			break;

		case 2:
			g.drawString("   Compensation: right", 385, 65);
			break;
		}

		if (lubeON)
			g.drawString("   Cooling lube: ON", 385, 85);
		else
			g.drawString("   Cooling lube: OFF", 385, 85);
	}

	/**
	 * Circular interpolation.
	 *
	 * @param cm the cm
	 * @param g the g
	 * @param compensazione_assi the compensazione assi
	 */
	// versione definitiva dell'interpolazione circolare
	private void circularInterpolation(CircularMove cm, Graphics g, int compensazione_assi) {
		int raggio1 = Math.abs(cm.getC_xyz().getFirst() - cm.getC_ijk().getFirst());
		int raggio2 = Math.abs(cm.getC_xyz().getSecond() - cm.getC_ijk().getSecond());
		int raggio = 0;
		int startAngle = 0;
		int arcAngle = 0;

		// analisi degli 8 casi di interpolazione circolare da un punto
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

		// larghezza e altezza del rettangolo sono pari al doppio del raggio
		int width = raggio * 2;
		int height = raggio * 2;

		// calcolo coordinate punto estremo in alto a sinistra del rettangolo
		int xTopLeft = cm.getC_ijk().getFirst() - raggio;
		int yTopLeft = GCodeDrawingViewer.CANVAS_HEIGHT - cm.getC_ijk().getSecond() - raggio;

		// alla fine disegno usando il metodo della libreria
		g.drawArc(xTopLeft + compensazione_assi, yTopLeft - compensazione_assi, width, height, startAngle, arcAngle);

	}

	/**
	 * Static drawing.
	 *
	 * @param parser the parser
	 * @param g the g
	 */
	/*
	 * static drawing (coordinate assolute e relative). Effettua la stampa sia
	 * dell'interpolazione lineare che circolare (oraria ed antioraria).
	 */
	private void staticDrawing(gcodeGrammarParser parser, Graphics g) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		g.setColor(Color.GREEN);

		/*
		 * IMPORTANTE: per centrare il disegno nella finestra, viene adottata una
		 * compensazione delle coordinate fornite nel file. Altro aspetto importante è
		 * legato al fatto che il sistema di riferimento è ribaltato rispetto all'asse
		 * Y. Viene risolto sottraendo le coordinate all'altezza della finestra.
		 */
		int compensazione_assi = GCodeDrawingViewer.AXIS_COMP;

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

		// scorro i blocchi per disegnarli
		for (BlockDescriptor bd : valuesCollection) {

			// informazione legata al tipo di coordinate
			if (bd.getInfoGeo().getCoord_abs_rel() != null) {
				if (bd.getInfoGeo().getCoord_abs_rel().equals("G90"))
					coordAbsolute = true;
				else
					coordAbsolute = false;
			}

			// movimento lineare
			if (bd.getInfoGeo().getLm() != null) {
				if (bd.getInfoGeo().getLm().getC_xyz().isFirstNotNull())
					if (coordAbsolute)
						x = bd.getInfoGeo().getLm().getC_xyz().getFirst();
					else
						/*
						 * In caso di coordinate relative devo ottenere il punto assoluto sommando la
						 * variazione al punto precedente
						 */
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

			// interpolazione circolare
			if (bd.getInfoGeo().getCm() != null) {

				// coordinate del punto finale
				int xp_temp = bd.getInfoGeo().getCm().getC_xyz().getFirst();
				int yp_temp = bd.getInfoGeo().getCm().getC_xyz().getSecond();
				int zp_temp = bd.getInfoGeo().getCm().getC_xyz().getThird();

				// nel caso di coordinare relative, calcolo punto finale e centro come
				// variazione dal punto di riferimento precedente
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

					/*
					 * il nuovo punto di riferimento diventa il punto finale dell'interpolazione
					 * circolare calcolato in coordinate assolute
					 */
					xp = cm.getC_xyz().getFirst();
					yp = cm.getC_xyz().getSecond();
					zp = cm.getC_xyz().getThird();

				} else {
					/*
					 * calcolo nuovo punto di riferimento in caso di interpolazione circolare ma
					 * direttamente in coordinate assolute (G90)
					 */
					xp = xp_temp;
					yp = yp_temp;
					zp = zp_temp;

					circularInterpolation(bd.getInfoGeo().getCm(), g, compensazione_assi);
				}
			}

		}
	}

	/**
	 * Draw reference system.
	 *
	 * @param g the g
	 */
	private void drawReferenceSystem(Graphics g) {
		int height = GCodeDrawingViewer.CANVAS_HEIGHT;
		int comp = GCodeDrawingViewer.AXIS_COMP;
		int diff = 2;
		int axle = 600;

		g.setColor(Color.WHITE);

		// asse Y
		g.drawLine(comp - diff, height - comp + 30, comp - diff, height - axle);

		// asse X
		g.drawLine(comp - 30, height - comp + diff, axle, height - comp + diff);

		g.setFont(new Font("Monospaced", Font.PLAIN, 20));

		// freccia asse Y
		g.drawLine(comp - diff + 5, height - axle + 15, comp - diff, height - axle);
		g.drawLine(comp - diff - 5, height - axle + 15, comp - diff, height - axle);
		g.drawString("Y", comp - diff - 25, height - axle + 15);

		// freccia asse X
		g.drawLine(585, height - comp + diff + 5, axle, height - comp + diff);
		g.drawLine(585, height - comp + diff - 5, axle, height - comp + diff);
		g.drawString("X", 585, height - comp + diff + 25);

		g.setFont(new Font("Monospaced", Font.PLAIN, 10));

		// tacche asse Y
		for (int i = 25; i < 475; i += 25) {
			g.drawLine(comp - 8, height - comp - i, comp - diff, height - comp - i);
			g.drawString(String.valueOf(i), comp - 30, height - comp - i + 3);

			g.drawLine(comp + i, height - comp + diff + 8, comp + i, height - comp + diff);
			g.drawString(String.valueOf(i), comp + i - 8, height - comp + diff + 23);
		}
	}
}