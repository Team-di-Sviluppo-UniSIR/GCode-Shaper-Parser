package gcodeMain;

import java.util.Collection;
import java.util.Collections;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import gcodeCompiler.gcodeGrammarParser;
import gcodeCompiler.util.BlockDescriptor;
import gcodeCompiler.util.CircularMove;
import gcodeCompiler.util.GCodeError;
import gcodeCompiler.util.InfoGeometriche;
import gcodeDrawingTool.GCodeDrawingViewer;
import gcodeCompiler.gcodeGrammarHandler;

public class GcodeErrorManager {
	public static boolean gcodeErrorMgmt(gcodeGrammarParser parser) {

		/*
		 * nel caso non ci siano errori lessicali o sintattici, effettua verifica
		 * presenza errori semantici
		 */
		boolean check = false;
		for (GCodeError e : parser.getErrorList()) {
			if (e.getType() != gcodeGrammarHandler.TOKEN_ERROR || e.getType() != gcodeGrammarHandler.ERR_ON_SYNTAX)
				check = true;
		}

		// gestione degli errori semantici
		if (parser.getErrorList().size() == 0 || !check) {
			GcodeErrorManager.checkM30(parser);
			GcodeErrorManager.checkToolError(parser);
			GcodeErrorManager.checkCoordinateType(parser);
			GcodeErrorManager.checkSpindleRotation(parser);
			GcodeErrorManager.checkM05(parser);
			GcodeErrorManager.checkSF_move(parser);
			GcodeErrorManager.checkSF_job(parser);
			GcodeErrorManager.checkSpeedCoordType(parser);
			GcodeErrorManager.checkAbsBeforeRel(parser);
			GcodeErrorManager.check90degrees(parser);

			check = false;
		}

		/*
		 * nel caso in cui la lista degli errori sia vuota, il parsing ha avuto successo
		 * senza errori lessicali, sintattici o semantici
		 */
		if (parser.getErrorList().size() == 0) {
			System.out.println("Parsing completed successfully with 0 errors\n");
			System.out.println("** Block list **");
			parser.h.printBlocks();
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

			for (GCodeError errore : parser.getErrorList())
				System.out.println(++i + " - " + errore.toString());
		}

		return false;
	}

	// errore SEM_NO_END_PROG
	private static void checkM30(gcodeGrammarParser parser) {
		BlockDescriptor bd = parser.h.blocks.get(parser.h.blocks.lastKey());
		Token last = parser.h.getLast_token();
		last.setCharPositionInLine(bd.toString().length() + bd.getNum_block().toString().length() + 2);

		// verifico che nell'ultim blocco sia presente il terminatore di programma (M30)
		boolean check = false;
		if (bd.getInfoTecM() == null)
			check = true;
		else if (bd.getInfoTecM().getEnd_program() == null)
			check = true;

		if (check)
			parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_END_PROG, last, bd);
	}

	// errore SEM_TOOL_ERR
	private static void checkToolError(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();

		/*
		 * verifico che quando dichiaro T[][] sia presente anche il comando di cambio
		 * tool (M06)
		 */
		int i = 1;
		for (BlockDescriptor bd : valuesCollection) {
			boolean check = false;
			if (bd.getInfotTec().getT() != null) {
				if (bd.getInfoTecM() == null)
					check = true;
				else if (bd.getInfoTecM().getChange_tool() == null)
					check = true;
			} else if (bd.getInfoTecM() != null) {
				if (bd.getInfoTecM().getChange_tool() != null)
					check = true;
			}

			if (check) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_TOOL_ERR, t, bd);
			}

			++i;
		}
	}

	// errore SEM_NO_COORDINATE_TYPE
	private static void checkCoordinateType(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean presence = false;
		boolean error = false;
		int i = 1;

		/*
		 * verifico che prima di aver dichiarato un movimento, sia stato definito il
		 * tipo di coordinate (assolute o relative)
		 */
		for (BlockDescriptor bd : valuesCollection) {
			error = false;

			if (bd.getInfoGeo().getCoord_abs_rel() != null)
				presence = true;

			if ((bd.getInfoGeo().getLm() != null || bd.getInfoGeo().getCm() != null) && !presence)
				error = true;

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_COORDINATE_TYPE, t, bd);
			}

			i++;

		}
	}

	// errore SEM_NO_SPINDLE_ROTATION
	private static void checkSpindleRotation(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean presence = false;
		boolean error = false;
		boolean first = false;
		int i = 1;

		/*
		 * verifico che prima di aver dichiarato una lavorazione di qualsiasi tipo
		 * (qualsiasi movimento purchè non di spostamento G00, in cui non si ha contatto
		 * del tool con il materiale di lavoro) sia stata attivata la rotazione del tool
		 */
		for (BlockDescriptor bd : valuesCollection) {
			error = false;

			if (bd.getInfoTecM() != null)
				if (bd.getInfoTecM().getRot_tool() != null)
					presence = true;

			if (((bd.getInfoGeo().getLm() != null && !bd.getInfoGeo().getLm().getMoveType().toString().equals("G00"))
					|| bd.getInfoGeo().getCm() != null) && !presence)
				error = true;

			if (error && !first) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_SPINDLE_ROTATION, t, bd);
				first = true;
			}
			i++;

		}
	}

	// errore SEM_END_ROT_ERR
	private static void checkM05(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean presence = false;
		boolean error = false;
		int i = 1;

		// controllo di aver chiamato M03/M04 quando chiamo M05
		for (BlockDescriptor bd : valuesCollection) {
			error = false;
			if (bd.getInfoTecM() != null && bd.getInfoTecM().getRot_tool() != null)
				presence = true;

			if (bd.getInfoTecM() != null)
				if (bd.getInfoTecM().getStop_tool() != null && !presence)
					error = true;

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_END_ROT_ERR, t, bd);
			}

			i++;

		}
	}

	// errore SEM_MOVE_SPEED_ERR
	private static void checkSF_move(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean define_F = false;
		boolean error = false;
		int i = 1;

		// controllo di aver definito le velocità prima di effettuare un movimento
		for (BlockDescriptor bd : valuesCollection) {
			error = false;

			if (bd.getInfotTec().getFree_move_speed() != null)
				define_F = true;

			if (bd.getInfoGeo().getLm() != null)
				if (bd.getInfoGeo().getLm().getMoveType().compareTo("G00") == 0 && !define_F)
					error = true;

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_MOVE_SPEED_ERR, t, bd);
			}
			i++;
		}
	}

	// errore SEM_JOB_SPEED_ERR
	private static void checkSF_job(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean define_F = false;
		boolean define_S = false;
		boolean error = false;
		int i = 1;

		// controllo di aver definito le velocità prima di effettuare una lavorazione
		for (BlockDescriptor bd : valuesCollection) {
			error = false;

			if (bd.getInfotTec().getJob_move_speed() != null)
				define_F = true;

			if (bd.getInfotTec().getJob_move_speed() != null)
				define_S = true;

			if (bd.getInfoGeo().getLm() != null)
				if (bd.getInfoGeo().getLm().getMoveType().compareTo("G01") == 0 && !define_F)
					error = true;

			if (bd.getInfoGeo().getCm() != null) {
				if ((bd.getInfoGeo().getCm().getMoveType().compareTo("G02") == 0
						|| bd.getInfoGeo().getCm().getMoveType().compareTo("G03") == 0) && !define_F)
					error = true;
			}

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_JOB_SPEED_ERR, t, bd);
			}
			i++;
		}
	}

	// errore SEM_NO_SPEED_COORD_TYPE
	private static void checkSpeedCoordType(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean presence = false;
		boolean error = false;
		int i = 1;

		/*
		 * controllo che prima di aver definito la velocità F o S, ho definito il tipo
		 * di coordinate (G90, G91)
		 */

		for (BlockDescriptor bd : valuesCollection) {
			error = false;

			if (bd.getInfoGeo().getCoord_abs_rel() != null)
				presence = true;

			if ((bd.getInfotTec().getFree_move_speed() != null || bd.getInfotTec().getJob_move_speed() != null)
					&& !presence)
				error = true;

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_SPEED_COORD_TYPE, t, bd);
			}

			i++;

		}
	}

	// errore SEM_NO_ABS_BEFORE_REL
	private static void checkAbsBeforeRel(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean presence = false;
		boolean move = false;
		boolean error = false;
		int i = 1;

		/*
		 * verifico che prima di avere movimento relativo G91 abbia riferimento assoluto
		 * in G90 con coordinate espresse in G00
		 */
		for (BlockDescriptor bd : valuesCollection) {
			error = false;

			if (bd.getInfoGeo().getCoord_abs_rel() != null
					&& bd.getInfoGeo().getCoord_abs_rel().toString().equals("G90"))
				presence = true;

			if (bd.getInfoGeo().getLm() != null && presence
					&& bd.getInfoGeo().getLm().getMoveType().toString().equals("G00")) {
				move = true;
			}

			if ((bd.getInfoGeo().getCoord_abs_rel() != null
					&& bd.getInfoGeo().getCoord_abs_rel().toString().equals("G91"))
					&& (!presence || (presence && !move)))
				error = true;

			if (error) {
				Token t = new CommonToken(0);
				t.setLine(i);
				t.setCharPositionInLine(0);
				parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NO_ABS_BEFORE_REL, t, bd);
			}

			i++;

		}
	}

	// errore SEM_NOT_90_DEGREE
	private static void check90degrees(gcodeGrammarParser parser) {
		Collection<BlockDescriptor> valuesCollection = parser.h.blocks.values();
		boolean notError = false;
		int i = 1;

		int xp = 0; // coordinate iniziali
		int yp = 0;

		boolean cordAbsolute = true; // tipologia di coordinata

		// verifica che interpolazione circolare sia esattamente di 90 gradi
		for (BlockDescriptor bd : valuesCollection) {
			notError = false;

			// discrimino la tipologia di coordinata (assoluta o relativa)
			if (bd.getInfoGeo().getCoord_abs_rel() != null) {
				if (bd.getInfoGeo().getCoord_abs_rel().equals("G90"))
					cordAbsolute = true;
				else
					cordAbsolute = false;
			}

			/*
			 * caso di movimento lineare: mi serve solo per calcolare il prossimo punto di
			 * partenza
			 */
			if (bd.getInfoGeo() != null && bd.getInfoGeo().getLm() != null) {

				// acquisizione x
				if (bd.getInfoGeo().getLm().getC_xyz().isFirstNotNull())
					if (cordAbsolute)
						xp = bd.getInfoGeo().getLm().getC_xyz().getFirst();
					else
						/*
						 * se coordinate sono relative, calcolo il punto assoluto sulla base dello
						 * scostamento relativo
						 */
						xp = xp + bd.getInfoGeo().getLm().getC_xyz().getFirst();

				// discorso analogo per la Y
				if (bd.getInfoGeo().getLm().getC_xyz().isSecondNotNull())
					if (cordAbsolute)
						yp = bd.getInfoGeo().getLm().getC_xyz().getSecond();
					else
						yp = yp + bd.getInfoGeo().getLm().getC_xyz().getSecond();
			}

			// caso di interpolazione circolare: verifico
			if (bd.getInfoGeo() != null && bd.getInfoGeo().getCm() != null) {
				CircularMove cm = bd.getInfoGeo().getCm(); // oggetto CircularMove
				String tipo = cm.getMoveType(); // tipologia (G02 o G03)
				boolean orario = tipo.equals("G02"); // interpolazione circolare oraria o antioraria

				// coordinate punto finale
				int xd = cm.getC_xyz().getFirst();
				int yd = cm.getC_xyz().getSecond();

				// coordiante centro
				int xc = cm.getC_ijk().getFirst();
				int yc = cm.getC_ijk().getSecond();

				/*
				 * se coordinate relative, calcolo punto assoluto sulla base dello scostamento
				 * relativo
				 */
				if (!cordAbsolute) {
					xd = xp + xd;
					yd = yp + yd;
					xc = xp + xc;
					yc = yp + yc;
				}

				// verifico gli 8 casi di interpolazione circolare
				if (orario && yd >= yc && xc >= xp && xc == xd && yp == yc) // 1
					notError = true;

				if (!orario && xd >= xc && yc >= yp && xp == xc && yd == yc) // 2
					notError = true;

				if (orario && xd >= xc && yp >= yc && xp == xc && yc == yd) // 3
					notError = true;

				if (!orario && xc >= xp && yc >= yd && yp == yc && xc == xd) // 4
					notError = true;

				if (orario && xp >= xc && yc >= yd && xc == xd && yc == yp) // 5
					notError = true;

				if (!orario && xc >= xd && yp >= yc && yd == yc && xc == xp) // 6
					notError = true;

				if (orario && xc >= xd && yc >= yp && yd == yc && xp == xc) // 7
					notError = true;

				if (!orario && xp >= xc && yd >= yc && xd == xc && yc == yp) // 8
					notError = true;

				/*
				 * il punto finale dell'interpolazione circolare diventa il punto di partenza
				 * del prossimo movimento
				 */
				xp = xd;
				yp = yd;

				// nel caso sia presente errore, lo inserisco nella lista
				if (!notError) {
					Token t = new CommonToken(0);
					t.setLine(i);
					t.setCharPositionInLine(0);
					parser.h.semanticErrorHandler(gcodeGrammarHandler.SEM_NOT_90_DEGREE, t, bd);
				}

			}

			i++;

		}
	}

}
