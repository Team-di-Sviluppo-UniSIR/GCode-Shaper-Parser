package shaperMain;

import java.io.FileNotFoundException;
import java.util.Collections;

import shaperCompiler.*;
import shaperCompiler.util.*;

public class ShaperErrorManager {

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
			// TODO
			// errori semantici

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

}
