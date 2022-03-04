package gcodeCompiler;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.antlr.runtime.*;
import gcodeCompiler.util.*;

public class gcodeGrammarHandler {

	// codici degli errori
	public static final int UNDEFINED = -1;
	public static final int TOKEN_ERROR = 0;
	public static final int ERR_ON_SYNTAX = 1;
	public static final int LAST_SYNTAX_ERROR = 10;

	// struttura dati contenente i blocchi gcode
	public SortedMap<String, blockDescriptor> blocks;

	List<String> errorList; // gestione errori
	TokenStream lexerStream; // stream token lexer

	// classe base per la gestione di parser e lexer
	public gcodeGrammarHandler(TokenStream ls) {
		blocks = new TreeMap<String, blockDescriptor>(); // istanzio struttura dati per blocchi
		errorList = new ArrayList<String>(); // lista degli errori è una lista di stringhe
		lexerStream = ls; // istanzio stream token lexer

	}

	// TODO
	// da modificare con le info tecnologiche e di tipo M (dove è null)
	// creazione del blocco
	public void createNewBlock(Token n, InfoGeometriche info_g) {
		blocks.put(n.getText(), new blockDescriptor(n.getText(), info_g.getCoord_abs_rel(), info_g.getCompensation(),
				info_g.getLm(), info_g.getCm(), null, null, null, null)); // da valorizzare i null
	}

	// metodo che mi fornisce lista degli errori
	public List<String> getErrorList() {
		return errorList;
	}

	// h contiene le coordinate, m il messaggio d'errore standard
	void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		String type = "";
		String st;
		if (e.token.getType() >= 0)
			type = tokenNames[e.token.getType()];
		if (e.token.getType() == gcodeGrammarLexer.SCAN_ERROR)
			st = "Lexical Error " + TOKEN_ERROR + " at ";
		else
			st = "Syntax Error " + ERR_ON_SYNTAX + " at ";
		st += "[" + e.token.getLine() + ", " + (e.token.getCharPositionInLine() + 1) + "]: " + "Found ";
		st += type;
		st += " ('" + e.token.getText() + "')" + m;

		if (e instanceof MissingTokenException)
			st = st + m;

		errorList.add(st);
	}

	// gestione degli errori semantici
	void myErrorHandler(int code, Token tk) {
		String st;

		/*
		 * non dovrebbe mai accadere, dato che chi chiama questo metodo lo fa per
		 * gestire un errore semantico
		 */
		if (code == TOKEN_ERROR)
			st = "Lexical Error " + code;
		else if (code < LAST_SYNTAX_ERROR)
			st = "Syntax Error " + code;
		else
			st = "Semantic Error " + code;

		// errore semantico è avvenuto in una certa posizione (riga, colonna)
		if (tk != null)
			st += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]";
		st += ": ";

		if (code == TOKEN_ERROR)
			st += "Unrecognized token '" + tk.getText() + "'";

		// errori vanno ordinati
		errorList.add(st);
	}

}