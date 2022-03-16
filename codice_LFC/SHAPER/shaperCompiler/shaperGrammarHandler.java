package shaperCompiler;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import shaperCompiler.util.*;

public class shaperGrammarHandler {
	// codici degli errori lessicali e sintattici
	public static final int TOKEN_ERROR = 0; // errore lessicale
	public static final int ERR_ON_SYNTAX = 1; // errore sintattico

	// codici di supporto
	public static final int UNDEFINED = -1;
	public static final int LAST_SYNTAX_ERROR = 10;

	List<ShaperError> errorList; // lista degli errori
	TokenStream lexerStream; // stream token lexer
	Shape s;

	public shaperGrammarHandler(TokenStream ls) {
		errorList = new ArrayList<ShaperError>(); // lista degli errori è una lista di stringhe
		lexerStream = ls; // istanzio stream token lexer
	}

	public void createShape(Shape in, Shape f) {
		s = f;

		s.setJobSpeed(in.getJobSpeed());
		s.setMoveSpeed(in.getMoveSpeed());
		s.setLube(in.getLube());

	}

	// metodo che mi fornisce lista degli errori
	public List<ShaperError> getErrorList() {
		return errorList;
	}

	public void printShape() {
		System.out.println(s.toString());
	}

	// h contiene le coordinate, m il messaggio d'errore standard
	void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		ShaperError errore = new ShaperError();

		if (e.token.getType() == shaperGrammarLexer.SCAN_ERROR) {
			errore.setType((short) TOKEN_ERROR);
			errore.setMessage("Found " + tokenNames[e.token.getType()] + " ('" + e.token.getText() + "')" + m);
		} else {
			errore.setType((short) ERR_ON_SYNTAX);
			errore.setMessage("Found " + tokenNames[e.token.getType()] + " ('" + e.token.getText() + "')" + m);
		}

		errore.setRow((short) e.token.getLine());
		errore.setColumn((short) e.token.getCharPositionInLine());

		errorList.add(errore);
	}

	public String conversion() {

		String preamble = "N10 G90 G40 F" + s.getMoveSpeed().substring(1) + " S" + s.getJobSpeed().substring(1)
				+ " M03 " + s.getLube();

		String body = "";

		String finish = "";

		switch (s.getType()) {
		case 'c':
			Circle c = (Circle) s;

			int x_center = Integer.parseInt(c.getX_center().substring(1));
			int y_center = Integer.parseInt(c.getY_center().substring(1));
			int radius = Integer.parseInt(c.getRadius().substring(1));

			body = "N20 G00 X" + c.getX_center().substring(1) + " Y" + (y_center + radius) + "\n";
			body += "N30 G02 X" + (x_center + radius) + " Y" + c.getY_center().substring(1) + " I"
					+ c.getX_center().substring(1) + " J" + c.getY_center().substring(1) + "\n";
			body += "N40 G02 X" + x_center + " Y" + (y_center - radius) + " I" + c.getX_center().substring(1) + " J"
					+ c.getY_center().substring(1) + "\n";
			body += "N50 G02 X" + (x_center - radius) + " Y" + y_center + " I" + c.getX_center().substring(1) + " J"
					+ c.getY_center().substring(1) + "\n";
			body += "N60 G02 X" + x_center + " Y" + (y_center + radius) + " I" + c.getX_center().substring(1) + " J"
					+ c.getY_center().substring(1);

			finish = "N70 M05 ";
			break;

		case 't':
			Triangle t = (Triangle) s;
			body = "N20 G00 " + t.getXp1() + " " + t.getYp1() + "\n";
			body += "N30 G01 " + t.getXp2() + " " + t.getYp2() + "\n";
			body += "N40 G01 " + t.getXp3() + " " + t.getYp3() + "\n";
			body += "N50 G01 " + t.getXp1() + " " + t.getYp1();

			finish = "N60 M05 ";
			break;

		case 'r':
			Rectangle r = (Rectangle) s;

			int xp1 = Integer.parseInt(r.getXp1().substring(1));
			int yp1 = Integer.parseInt(r.getYp1().substring(1));
			int xp2 = Integer.parseInt(r.getXp2().substring(1));
			int yp2 = Integer.parseInt(r.getYp2().substring(1));
			int xp3 = Integer.parseInt(r.getXp3().substring(1));
			int yp3 = Integer.parseInt(r.getYp3().substring(1));

			if (yp1 - yp2 != 0 && xp2 - xp1 != 0) {
				// risoluzione geometrica
				double mAB = (yp2 - yp1) / (xp2 - xp1);
				double mCA = -1 / mAB;

				/*
				 * METODO DI CRAMER ax + by = e kx + dy = f
				 */
				double a = -mAB;
				double b = 1;
				double e = -mAB * xp3 + yp3;

				double k = -mCA;
				double d = 1;
				double f = -mCA * xp2 + yp2;

				double x = ((e * d) - (b * f)) / ((a * d) - (b * k));
				double y = ((a * f) - (e * k)) / ((a * d) - (b * k));

				int xp4 = (int) Math.round(x);
				int yp4 = (int) Math.round(y);

				body = "N20 G00 X" + xp1 + " Y" + yp1 + "\n";
				body += "N30 G01 X" + xp2 + " Y" + yp2 + "\n";
				body += "N40 G01 X" + xp4 + " Y" + yp4 + "\n";
				body += "N50 G01 X" + xp3 + " Y" + yp3 + "\n";
				body += "N60 G01 X" + xp1 + " Y" + yp1;

			} else if (yp1 - yp2 == 0) {
				body = "N20 G00 " + r.getXp1() + " " + r.getYp1() + "\n";
				body += "N30 G01 " + r.getXp2() + " " + r.getYp2() + "\n";
				body += "N40 G01 " + r.getXp2() + " " + r.getYp3() + "\n";
				body += "N50 G01 " + r.getXp3() + " " + r.getYp3() + "\n";
				body += "N60 G01 " + r.getXp1() + " " + r.getYp1();

			} else {
				body = "N20 G00 " + r.getXp3() + " " + r.getYp3() + "\n";
				body += "N30 G01 " + r.getXp1() + " " + r.getYp1() + "\n";
				body += "N40 G01 " + r.getXp2() + " " + r.getYp2() + "\n";
				body += "N50 G01 " + r.getXp3() + " " + r.getYp2() + "\n";
				body += "N60 G01 " + r.getXp3() + " " + r.getYp3();
			}

			finish = "N70 M05 ";

			break;

		case 's':
			Square q = (Square) s;

			int xp11 = Integer.parseInt(q.getXp1().substring(1));
			int yp11 = Integer.parseInt(q.getYp1().substring(1));
			int xp21 = Integer.parseInt(q.getXp2().substring(1));
			int yp21 = Integer.parseInt(q.getYp2().substring(1));

			int xp31;
			int yp31;

			int xp41;
			int yp41;

			int delta_x = xp21 - xp11;
			int delta_y = yp21 - yp11;

			// UP
			if (q.getOrientation().equals("UP")) {
				xp31 = xp21 - delta_y;
				yp31 = yp21 + delta_x;
				xp41 = xp11 - delta_y;
				yp41 = yp11 + delta_x;
			} else {
				// DOWN
				xp31 = xp21 + delta_y;
				yp31 = yp21 - delta_x;
				xp41 = xp11 + delta_y;
				yp41 = yp11 - delta_x;
			}

			body = "N20 G00 X" + xp11 + " Y" + yp11 + "\n";
			body += "N30 G01 X" + xp21 + " Y" + yp21 + "\n";
			body += "N40 G01 X" + xp31 + " Y" + yp31 + "\n";
			body += "N50 G01 X" + xp41 + " Y" + yp41 + "\n";
			body += "N60 G01 X" + xp11 + " Y" + yp11;
			finish = "N70 M05 ";

			// TODO
			// calcolo lati

			finish = "N80 M05";

			break;
		}

		if (s.getLube().equals("M08"))
			finish = finish + " M09";

		finish += " M30";

		return preamble + "\n" + body + "\n" + finish;

	}
}
