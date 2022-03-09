package gcodeCompiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import org.antlr.runtime.*;
import gcodeCompiler.util.*;
import gcodeCompiler.util.Error;

public class gcodeGrammarHandler {
	// codici degli errori lessicali e sintattici
	public static final int TOKEN_ERROR = 0; // errore lessicale
	public static final int ERR_ON_SYNTAX = 1; // errore sintattico

	// codici degli errori semantici
	public static final int SEM_BLOCK_ORDER = 2; // errore numero blocco
	public static final int SEM_NO_END_PROG = 3; // errore mancato token M30 fine programma
	public static final int SEM_TOOL_ERR = 4; // errore M06 senza T[][] e viceversa
	public static final int SEM_NO_COORDINATE_TYPE = 5; // errore G00, G01, G02, G03 senza G90, G91
	public static final int SEM_NO_SPINDLE_ROTATION = 6; // errore G01, G02, G03 senza M03, M04
	public static final int SEM_DUPLICATE_ERR = 7; // comando duplicato nel medesimo blocco
	public static final int SEM_END_ROT_ERR = 8; // disattivazione mandrino prima di averlo attivato
	public static final int SEM_MOVE_SPEED_ERR = 9; // velocità spostamento F non definita prima di G00
	public static final int SEM_JOB_SPEED_ERR = 11; // velocità lavorazione S non definita prima di G01, G02, G03

	// codici di supporto
	public static final int UNDEFINED = -1;
	public static final int LAST_SYNTAX_ERROR = 10;

	// struttura dati contenente i blocchi gcode
	public SortedMap<Integer, BlockDescriptor> blocks;
	private int last_n; // ultimo numero di blocco

	List<Error> errorList; // lista degli errori
	TokenStream lexerStream; // stream token lexer
	Token last_token;

	// classe base per la gestione di parser e lexer
	public gcodeGrammarHandler(TokenStream ls) {
		blocks = new TreeMap<Integer, BlockDescriptor>(); // istanzio struttura dati per blocchi
		errorList = new ArrayList<Error>(); // lista degli errori è una lista di stringhe
		lexerStream = ls; // istanzio stream token lexer
		last_n = -1;
	}

	// creazione del blocco
	public void createNewBlock(Token n, List<InfoGeometriche> info_g_list, List<InfoTecnologiche> info_t_list,
			List<InfoTecnologicheM> info_t_M_list) {

		BlockDescriptor bd = BlockInit(n, info_g_list, info_t_list, info_t_M_list);

		int num = Integer.parseInt(n.getText().substring(1));

		if (num > last_n) {
			blocks.put(num, bd);
			last_n = num;
		} else {
			this.semanticErrorHandler(SEM_BLOCK_ORDER, n, bd);
		}

		last_token = n;
	}

	// inizializzazione del blocco con informazioni geometriche e tecnologiche
	private BlockDescriptor BlockInit(Token n, List<InfoGeometriche> info_g_list, List<InfoTecnologiche> info_t_list,
			List<InfoTecnologicheM> info_t_M_list) {

		BlockDescriptor bd = new BlockDescriptor(n.getText());

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
			if (j.getFree_move_speed() != null) {
				if (tecConf.getFree_move_speed() == null)
					tecConf.setFree_move_speed(j.getFree_move_speed());
				else {
					Token t = new CommonToken(0);
					t.setText(j.getFree_move_speed());
					t.setLine(n.getLine());
					t.setCharPositionInLine(0);
					this.semanticErrorHandler(gcodeGrammarHandler.SEM_DUPLICATE_ERR, t, bd);
				}
			}

			if (j.getJob_move_speed() != null) {
				if (tecConf.getJob_move_speed() == null)
					tecConf.setJob_move_speed(j.getJob_move_speed());
				else {
					Token t = new CommonToken(0);
					t.setText(j.getJob_move_speed());
					t.setLine(n.getLine());
					t.setCharPositionInLine(0);
					this.semanticErrorHandler(gcodeGrammarHandler.SEM_DUPLICATE_ERR, t, bd);
				}
			}

			if (j.getT() != null)
				if (tecConf.getT() == null)
					tecConf.setT(j.getT());
				else {
					Token t = new CommonToken(0);
					t.setText(j.getT().toString());
					t.setLine(n.getLine());
					t.setCharPositionInLine(0);
					this.semanticErrorHandler(gcodeGrammarHandler.SEM_DUPLICATE_ERR, t, bd);
				}
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

	// funzione di stampa della lista di blocchi
	public void printBlocks() {
		for (Entry<Integer, BlockDescriptor> entry : blocks.entrySet()) {
			System.out.println("N" + entry.getKey() + " " + entry.getValue().toString());
		}
	}

	// metodo che mi fornisce lista degli errori
	public List<Error> getErrorList() {
		return errorList;
	}

	// h contiene le coordinate, m il messaggio d'errore standard
	void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		Error errore = new Error();

		if (e.token.getType() == gcodeGrammarLexer.SCAN_ERROR) {
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

	// gestione degli errori semantici
	public void semanticErrorHandler(int code, Token tk, BlockDescriptor bd) {
		Error errore = new Error();
		errore.setType((short) code);

		// errore semantico è avvenuto in una certa posizione (riga, colonna)
		if (tk != null) {
			errore.setRow((short) tk.getLine());
			errore.setColumn((short) tk.getCharPositionInLine());
		}

		switch (code) {
		case SEM_BLOCK_ORDER:
			errore.setMessage(
					"Found BLOCK_NUMBERING_ERROR (" + bd.getNum_block() + " " + bd.toString() + ") - block number '"
							+ bd.getNum_block() + "' must be greater than the previous one 'N" + this.last_n + "'");
			break;

		case SEM_NO_END_PROG:
			errore.setMessage("Found NO_M30_ERROR (" + bd.getNum_block() + " " + bd.toString() + ") - the last block ("
					+ bd.getNum_block() + ") must contain 'M30' (end program)");
			break;

		case SEM_TOOL_ERR:
			errore.setMessage("Found CHANGE_TOOL_ERROR (" + bd.getNum_block() + " " + bd.toString()
					+ ") - 'M06' and T must always be together");
			break;

		case SEM_NO_COORDINATE_TYPE:
			if (bd.getInfoGeo().getCm() != null)
				errore.setMessage("Found NO_COORDINATE_TYPE_ERROR (" + bd.getNum_block() + " " + bd.toString()
						+ ") - movement declared (" + bd.getInfoGeo().getCm().getMoveType() + " "
						+ bd.getInfoGeo().getCm().getC_xyz().toString() + " "
						+ bd.getInfoGeo().getCm().getC_ijk().toString() + ") but no coordinate type specified");
			else
				errore.setMessage("Found NO_COORDINATE_TYPE_ERROR (" + bd.getNum_block() + " " + bd.toString()
						+ ") - movement declared (" + bd.getInfoGeo().getLm().getMoveType() + " "
						+ bd.getInfoGeo().getLm().getC_xyz().toString() + ") but no coordinate type specified");
			break;

		case SEM_NO_SPINDLE_ROTATION:
			if (bd.getInfoGeo().getCm() != null)
				errore.setMessage("Found NO_SPINDLE_ROTATION_ERORR (" + bd.getNum_block() + " " + bd.toString()
						+ ") - processing movement declared (" + bd.getInfoGeo().getCm().getMoveType() + " "
						+ bd.getInfoGeo().getCm().getC_xyz().toString() + " "
						+ bd.getInfoGeo().getCm().getC_ijk().toString() + ") but spindle not in rotation");
			else
				errore.setMessage("Found NO_SPINDLE_ROTATION_ERORR (" + bd.getNum_block() + " " + bd.toString()
						+ ") - processing movement declared (" + bd.getInfoGeo().getLm().getMoveType() + " "
						+ bd.getInfoGeo().getLm().getC_xyz().toString() + ") but spindle not in rotation");
			break;

		case SEM_DUPLICATE_ERR:
			errore.setMessage("Found DUPLICATED_COMMAND_ERROR at block '" + bd.getNum_block() + "' - command '"
					+ tk.getText() + "' already defined");
			break;

		case SEM_END_ROT_ERR:
			errore.setMessage("Found END_ROTATION_ERROR (" + bd.getNum_block() + " " + bd.toString()
					+ ") - spindle must be ON before being turned OFF");
			break;

		case SEM_MOVE_SPEED_ERR:
			errore.setMessage("Found NO_MOVE_SPEED_ERROR (" + bd.getNum_block() + " " + bd.toString()
					+ ") - movement declared (" + bd.getInfoGeo().getLm().getMoveType() + " \"\r\n"
					+ bd.getInfoGeo().getLm().getC_xyz().toString() + ") but movement speed non defined");
			break;

		case SEM_JOB_SPEED_ERR:
			if (bd.getInfoGeo().getCm() != null)
				errore.setMessage("Found NO_JOB_SPEED_ERROR (" + bd.getNum_block() + " " + bd.toString()
						+ ") - circular processing movement declared (" + bd.getInfoGeo().getCm().getMoveType() + " "
						+ bd.getInfoGeo().getCm().getC_xyz().toString() + " "
						+ bd.getInfoGeo().getCm().getC_ijk().toString() + ") but movement speed non defined");
			else
				errore.setMessage("Found NO_JOB_ROTATION_ERORR (" + bd.getNum_block() + " " + bd.toString()
						+ ") - linear processing movement declared (" + bd.getInfoGeo().getLm().getMoveType() + " "
						+ bd.getInfoGeo().getLm().getC_xyz().toString() + ") but movement speed non defined");
			break;

		}

		// errori vanno ordinati
		errorList.add(errore);
	}

	public Token getLast_token() {
		return last_token;
	}

}