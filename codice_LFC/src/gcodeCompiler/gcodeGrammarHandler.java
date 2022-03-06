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
	public SortedMap<String, BlockDescriptor> blocks;

	List<String> errorList; // gestione errori
	TokenStream lexerStream; // stream token lexer

	// classe base per la gestione di parser e lexer
	public gcodeGrammarHandler(TokenStream ls) {
		blocks = new TreeMap<String, BlockDescriptor>(); // istanzio struttura dati per blocchi
		errorList = new ArrayList<String>(); // lista degli errori è una lista di stringhe
		lexerStream = ls; // istanzio stream token lexer

	}

	// TODO
	// da modificare con le info tecnologiche e di tipo M (dove è null)
	// creazione del blocco
	public void createNewBlock(Token n, List<InfoGeometriche> info_g_list, List<InfoTecnologiche> info_t_list,
			List<InfoTecnologicheM> info_t_M_list) {
		BlockDescriptor bd = BlockInit(n.getText(), info_g_list, info_t_list, info_t_M_list);
		blocks.put(n.getText(), bd);
	}

	// inizializzazione del blocco con le sole info geometriche (per ora)
	private BlockDescriptor BlockInit(String n, List<InfoGeometriche> info_g_list, List<InfoTecnologiche> info_t_list,
			List<InfoTecnologicheM> info_t_M_list) {

		BlockDescriptor bd = new BlockDescriptor(n);

		InfoGeometriche geoConf = new InfoGeometriche();

		for (InfoGeometriche i : info_g_list) {
			if (i.getCm() != null)
				geoConf.setCm(i.getCm());

			if (i.getLm() != null)
				geoConf.setLm(i.getLm());

			if (i.getCompensation() != null)
				geoConf.setCompensation(i.getCompensation());

			if (i.getCoord_abs_rel() != null)
				geoConf.setCoord_abs_rel(i.getCoord_abs_rel());
		}

		bd.setInfoGeo(geoConf);

		InfoTecnologiche tecConf = new InfoTecnologiche();

		for (InfoTecnologiche j : info_t_list) {
			if (j.getFree_move_speed() != null)
				tecConf.setFree_move_speed(j.getFree_move_speed());

			if (j.getJob_move_speed() != null)
				tecConf.setJob_move_speed(j.getJob_move_speed());

			if (j.getT() != null)
				tecConf.setT(j.getT());
		}

		bd.setInfotTec(tecConf);

		if (info_t_M_list != null) {
			InfoTecnologicheM tecMConf = new InfoTecnologicheM();

			for (InfoTecnologicheM k : info_t_M_list) {
				if (k.getChange_tool() != null)
					tecMConf.setChange_tool(k.getChange_tool());

				if (k.getEnd_program() != null) {
					tecMConf.setEnd_program(k.getEnd_program());
				}

				if (k.getLube() != null)
					tecMConf.setLube(k.getLube());

				if (k.getRot_tool() != null) {
					tecMConf.setRot_tool(k.getRot_tool());
				}

				if (k.getStop_tool() != null)
					tecMConf.setStop_tool(k.getStop_tool());
			}

			bd.setInfoTecM(tecMConf);
		}

		return bd;
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