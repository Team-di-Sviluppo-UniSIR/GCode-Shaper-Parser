package shaperCompiler;

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
	
	public shaperGrammarHandler(TokenStream ls) {
		errorList = new ArrayList<ShaperError>(); // lista degli errori è una lista di stringhe
		lexerStream = ls; // istanzio stream token lexer
	}
	
	// metodo che mi fornisce lista degli errori
	public List<ShaperError> getErrorList() {
		return errorList;
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
}
