package shaperMain;

import java.io.FileNotFoundException;
import java.util.Collections;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import gcodeCompiler.gcodeGrammarHandler;
import gcodeCompiler.gcodeGrammarParser;
import shaperCompiler.*;
import shaperCompiler.util.*;

public class ShaperErrorManager {

	public static final int MAX_COORDINATE = 500;
	public static final int MIN_COORDINATE = 0;

	public static boolean shaperErrorMgmt(shaperGrammarParser parser) {
		/*
		 * nel caso non ci siano errori lessicali o sintattici, effettua verifica
		 * presenza errori semantici
		 */
		boolean check = false;

		for (ShaperError e : parser.getErrorList()) {
			if (e.getType() != shaperGrammarHandler.TOKEN_ERROR || e.getType() != shaperGrammarHandler.ERR_ON_SYNTAX)
				check = true;
		}

		// gestione degli errori semantici
		if (parser.getErrorList().size() == 0 || !check) {

			// errori semantici
			ShaperErrorManager.checkTriangleInequality(parser);
			boolean perpendicular = ShaperErrorManager.checkRectangularPerpendicular(parser);

			if (perpendicular)
				ShaperErrorManager.checkMaxCoordinateValue(parser);

			check = false;
		}

		/*
		 * nel caso in cui la lista degli errori sia vuota, il parsing ha avuto successo
		 * senza errori lessicali, sintattici o semantici
		 */
		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completed successfully with 0 errors\n");
			System.out.println("** Shape Infos **");

			// print delle informazioni struttura dati shaper
			parser.h.printShape();
			return true;

		} else {
			/*
			 * altrimenti stampa la lista degli errori, ordinata in base al valore [riga,
			 * colonna] in cui compaiono
			 */

			int i = 0;

			if (parser.getErrorList().size() == 1)
				System.out.println("Parsing failed (1 error)\n");
			else
				System.out.println("Parsing failed (" + parser.getErrorList().size() + " errors)\n");

			System.out.println("** Error list **");

			Collections.sort(parser.getErrorList());

			for (ShaperError errore : parser.getErrorList())
				System.out.println(++i + " - " + errore.toString());
		}

		return false;
	}

	private static void checkTriangleInequality(shaperGrammarParser parser) {

		if (parser.h.getS().getType() == 't') {
			Triangle t = (Triangle) parser.h.getS();

			int xp1 = Integer.parseInt(t.getXp1().substring(1));
			int yp1 = Integer.parseInt(t.getYp1().substring(1));

			int xp2 = Integer.parseInt(t.getXp2().substring(1));
			int yp2 = Integer.parseInt(t.getYp2().substring(1));

			int xp3 = Integer.parseInt(t.getXp3().substring(1));
			int yp3 = Integer.parseInt(t.getYp3().substring(1));

			double l12 = Math.sqrt(Math.pow((xp1 - xp2), 2) + Math.pow((yp1 - yp2), 2));
			double l23 = Math.sqrt(Math.pow((xp2 - xp3), 2) + Math.pow((yp2 - yp3), 2));
			double l13 = Math.sqrt(Math.pow((xp1 - xp3), 2) + Math.pow((yp1 - yp3), 2));

			if (!(l12 <= (l23 + l13) && l23 <= (l12 + l13) && l13 <= (l12 + l23))) {
				Token tk = new CommonToken(0);
				tk.setLine(0);
				tk.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(shaperGrammarHandler.SEM_TRIANG_INEQ, tk);
			}
		}
	}

	public static void checkMaxCoordinateValue(shaperGrammarParser parser) {
		Shape s = parser.h.getS();
		boolean error = false;

		switch (s.getType()) {
		case 'c':
			Circle c = (Circle) s;

			int x_center = Integer.parseInt(c.getX_center().substring(1));
			int y_center = Integer.parseInt(c.getY_center().substring(1));
			int radius = Integer.parseInt(c.getRadius().substring(1));

			if (!((x_center + radius) < MAX_COORDINATE && (x_center - radius) > MIN_COORDINATE
					&& (y_center + radius) < MAX_COORDINATE && (y_center - radius) > MIN_COORDINATE)) {
				error = true;
			}

			break;

		case 't':
			Triangle t = (Triangle) s;

			int xp1 = Integer.parseInt(t.getXp1().substring(1));
			int yp1 = Integer.parseInt(t.getYp1().substring(1));

			int xp2 = Integer.parseInt(t.getXp2().substring(1));
			int yp2 = Integer.parseInt(t.getYp2().substring(1));

			int xp3 = Integer.parseInt(t.getXp3().substring(1));
			int yp3 = Integer.parseInt(t.getYp3().substring(1));

			if (!(xp1 < MAX_COORDINATE && xp1 > MIN_COORDINATE && xp2 < MAX_COORDINATE && xp2 > MIN_COORDINATE
					&& xp3 < MAX_COORDINATE && xp3 > MIN_COORDINATE && yp1 < MAX_COORDINATE && yp1 > MIN_COORDINATE
					&& yp2 < MAX_COORDINATE && yp2 > MIN_COORDINATE && yp3 < MAX_COORDINATE && yp3 > MIN_COORDINATE)) {
				error = true;
			}

			break;

		case 'r':
			Rectangle r = (Rectangle) s;

			int xp1r = Integer.parseInt(r.getXp1().substring(1));
			int yp1r = Integer.parseInt(r.getYp1().substring(1));
			int xp2r = Integer.parseInt(r.getXp2().substring(1));
			int yp2r = Integer.parseInt(r.getYp2().substring(1));
			int xp3r = Integer.parseInt(r.getXp3().substring(1));
			int yp3r = Integer.parseInt(r.getYp3().substring(1));

			if (!(xp1r < MAX_COORDINATE && xp1r > MIN_COORDINATE && xp2r < MAX_COORDINATE && xp2r > MIN_COORDINATE
					&& xp3r < MAX_COORDINATE && xp3r > MIN_COORDINATE && yp1r < MAX_COORDINATE && yp1r > MIN_COORDINATE
					&& yp2r < MAX_COORDINATE && yp2r > MIN_COORDINATE && yp3r < MAX_COORDINATE
					&& yp3r > MIN_COORDINATE)) {
				error = true;
			}

			if (yp1r - yp2r != 0 && xp2r - xp1r != 0) {
				// risoluzione geometrica
				double mAB = (yp2r - yp1r) / (xp2r - xp1r);
				double mCA = -1 / mAB;

				/*
				 * METODO DI CRAMER ax + by = e kx + dy = f
				 */
				double a = -mAB;
				double b = 1;
				double e = -mAB * xp3r + yp3r;

				double k = -mCA;
				double d = 1;
				double f = -mCA * xp2r + yp2r;

				double x = ((e * d) - (b * f)) / ((a * d) - (b * k));
				double y = ((a * f) - (e * k)) / ((a * d) - (b * k));

				int xp4 = (int) Math.round(x);
				int yp4 = (int) Math.round(y);

				if (!(xp4 < MAX_COORDINATE && xp4 > MIN_COORDINATE)) {
					error = true;
				}

			}

			break;

		case 's':
			Square q = (Square) s;

			int xp1s = Integer.parseInt(q.getXp1().substring(1));
			int yp1s = Integer.parseInt(q.getYp1().substring(1));
			int xp2s = Integer.parseInt(q.getXp2().substring(1));
			int yp2s = Integer.parseInt(q.getYp2().substring(1));

			int xp3s;
			int yp3s;

			int xp4s;
			int yp4s;

			int delta_x = xp2s - xp1s;
			int delta_y = yp2s - yp1s;

			// UP
			if (q.getOrientation().equals("UP")) {
				xp3s = xp2s - delta_y;
				yp3s = yp2s + delta_x;
				xp4s = xp1s - delta_y;
				yp4s = yp1s + delta_x;
			} else {
				// DOWN
				xp3s = xp2s + delta_y;
				yp3s = yp2s - delta_x;
				xp4s = xp1s + delta_y;
				yp4s = yp1s - delta_x;
			}

			if (!(xp1s < MAX_COORDINATE && xp1s > MIN_COORDINATE && xp2s < MAX_COORDINATE && xp2s > MIN_COORDINATE
					&& xp3s < MAX_COORDINATE && xp3s > MIN_COORDINATE && yp1s < MAX_COORDINATE && yp1s > MIN_COORDINATE
					&& yp2s < MAX_COORDINATE && yp2s > MIN_COORDINATE && yp3s < MAX_COORDINATE && yp3s > MIN_COORDINATE
					&& yp4s < MAX_COORDINATE && yp4s > MIN_COORDINATE)) {
				error = true;
			}

			break;
		}

		if (error) {
			Token tk = new CommonToken(0);
			tk.setLine(0);
			tk.setCharPositionInLine(0);
			parser.h.semanticErrorHandler(shaperGrammarHandler.SEM_MAX_COORD, tk);
		}
	}

	private static boolean checkRectangularPerpendicular(shaperGrammarParser parser) {

		if (parser.h.getS().getType() == 'r') {

			Rectangle r = (Rectangle) parser.h.getS();

			int xp1r = Integer.parseInt(r.getXp1().substring(1));
			int yp1r = Integer.parseInt(r.getYp1().substring(1));
			int xp2r = Integer.parseInt(r.getXp2().substring(1));
			int yp2r = Integer.parseInt(r.getYp2().substring(1));
			int xp3r = Integer.parseInt(r.getXp3().substring(1));
			int yp3r = Integer.parseInt(r.getYp3().substring(1));

			if ((xp2r - xp1r) != 0 && (xp3r - xp1r) != 0) {
				double mAB = (yp2r - yp1r) / (xp2r - xp1r);
				double mCA = (yp3r - yp1r) / (xp3r - xp1r);

				if (!(mAB == (-1 / mCA))) {
					Token tk = new CommonToken(0);
					tk.setLine(0);
					tk.setCharPositionInLine(0);
					parser.h.semanticErrorHandler(shaperGrammarHandler.SEM_RECT_PERPEN, tk);
					return false;
				}
			}
		}

		return true;
	}

}
