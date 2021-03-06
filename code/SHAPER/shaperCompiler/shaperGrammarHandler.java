package shaperCompiler;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import gcodeCompiler.util.BlockDescriptor;
import gcodeCompiler.util.GCodeError;
import shaperCompiler.util.*;
import shaperMain.ShaperErrorManager;

// TODO: Auto-generated Javadoc
/**
 * The Class shaperGrammarHandler.
 */
public class shaperGrammarHandler {
	
	/** The Constant TOKEN_ERROR. */
	// codici degli errori lessicali e sintattici
	public static final int TOKEN_ERROR = 0; // errore lessicale
	
	/** The Constant ERR_ON_SYNTAX. */
	public static final int ERR_ON_SYNTAX = 1; // errore sintattico

	/** The Constant SEM_TRIANG_INEQ. */
	// codici errori semantici
	public static final int SEM_TRIANG_INEQ = 2;
	
	/** The Constant SEM_MAX_COORD. */
	public static final int SEM_MAX_COORD = 3;
	
	/** The Constant SEM_RECT_PERPEN. */
	public static final int SEM_RECT_PERPEN = 4;

	/** The Constant UNDEFINED. */
	// codici di supporto
	public static final int UNDEFINED = -1;
	
	/** The Constant LAST_SYNTAX_ERROR. */
	public static final int LAST_SYNTAX_ERROR = 10;

	/** The error list. */
	List<ShaperError> errorList; // lista degli errori
	
	/** The lexer stream. */
	TokenStream lexerStream; // stream token lexer
	
	/** The s. */
	Shape s;

	/**
	 * Instantiates a new shaper grammar handler.
	 *
	 * @param ls the ls
	 */
	public shaperGrammarHandler(TokenStream ls) {
		errorList = new ArrayList<ShaperError>(); // lista degli errori ? una lista di stringhe
		lexerStream = ls; // istanzio stream token lexer
	}

	/**
	 * Creates the shape.
	 *
	 * @param in the in
	 * @param f the f
	 */
	public void createShape(Shape in, Shape f) {
		s = f;

		s.setJobSpeed(in.getJobSpeed());
		s.setMoveSpeed(in.getMoveSpeed());
		s.setLube(in.getLube());

	}

	/**
	 * Gets the error list.
	 *
	 * @return the error list
	 */
	// metodo che mi fornisce lista degli errori
	public List<ShaperError> getErrorList() {
		return errorList;
	}

	/**
	 * Prints the shape.
	 */
	public void printShape() {
		System.out.println(s.toString());
	}

	/**
	 * Handle error.
	 *
	 * @param tokenNames the token names
	 * @param e the e
	 * @param h the h
	 * @param m the m
	 */
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

	/**
	 * Conversion.
	 *
	 * @return the string
	 */
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

			break;
		}

		if (s.getLube().equals("M08"))
			finish = finish + " M09";

		finish += " M30";

		return preamble + "\n" + body + "\n" + finish;

	}

	/**
	 * Semantic error handler.
	 *
	 * @param code the code
	 * @param tk the tk
	 */
	public void semanticErrorHandler(int code, Token tk) {
		ShaperError errore = new ShaperError();
		errore.setType((short) code);

		// errore semantico ? avvenuto in una certa posizione (riga, colonna)
		if (tk != null) {
			errore.setRow((short) tk.getLine());
			errore.setColumn((short) tk.getCharPositionInLine());
		}

		switch (code) {
		case SEM_TRIANG_INEQ:
			errore.setMessage("Found TRIANG_INEQ_ERROR - triangle does not comply with triangular inequality");
			break;

		case SEM_MAX_COORD:
			errore.setMessage("Found MAX_COORD_ERROR - all coordinates must be positive and lower than "
					+ ShaperErrorManager.MAX_COORDINATE + " pixel to be displayed");
			break;

		case SEM_RECT_PERPEN:
			errore.setMessage("Found NOT_RECT_PERP_ERROR - sides of the rectangle must be perpendicular");
			break;
		}

		// inserimento errore generato all'interno della lista degli errori
		errorList.add(errore);
	}

	/**
	 * Gets the s.
	 *
	 * @return the s
	 */
	public Shape getS() {
		return s;
	}

}
