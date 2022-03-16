package shaperCompiler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
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

	public String conversion() throws FileNotFoundException {

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
			body = "N20 G00 " + r.getXp1() + " " + r.getYp1() + "\n";
			body += "N30 G01 " + r.getXp2() + " " + r.getYp2() + "\n";
			body += "N40 G01 " + r.getXp2() + " " + r.getYp3() + "\n";
			body += "N50 G01 " + r.getXp3() + " " + r.getYp3() + "\n";
			body += "N60 G01 " + r.getXp1() + " " + r.getYp1();
			finish = "N70 M05 ";
			break;
		}

		if (s.getLube().equals("M08"))
			finish = finish + "M09";

		finish += " M30";

		return preamble + "\n" + body + "\n" + finish;

	}
}
