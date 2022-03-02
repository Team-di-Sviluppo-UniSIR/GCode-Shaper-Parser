// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2022-03-01 20:33:46

package gcodeCompiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gcodeGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHANGE_TOOL",
			"CIRCLE_ACW", "CIRCLE_CW", "COMMENT", "COMP_DIS", "COMP_L", "COMP_R", "COORD_ABS", "COORD_REL",
			"CORD_DIGIT", "DIGIT", "END_PROG", "FREE_MOVE", "FREE_MOVE_SPEED", "I_CORD", "JOB_MOVE", "JOB_MOVE_SPEED",
			"J_CORD", "K_CORD", "LUBE_OFF", "LUBE_ON", "N_BLOCK", "ROT_TOOL_ACW", "ROT_TOOL_CW", "STOP_TOOL",
			"TOOL_CHANGE", "WS", "X_CORD", "Y_CORD", "Z_CORD" };
	public static final int EOF = -1;
	public static final int CHANGE_TOOL = 4;
	public static final int CIRCLE_ACW = 5;
	public static final int CIRCLE_CW = 6;
	public static final int COMMENT = 7;
	public static final int COMP_DIS = 8;
	public static final int COMP_L = 9;
	public static final int COMP_R = 10;
	public static final int COORD_ABS = 11;
	public static final int COORD_REL = 12;
	public static final int CORD_DIGIT = 13;
	public static final int DIGIT = 14;
	public static final int END_PROG = 15;
	public static final int FREE_MOVE = 16;
	public static final int FREE_MOVE_SPEED = 17;
	public static final int I_CORD = 18;
	public static final int JOB_MOVE = 19;
	public static final int JOB_MOVE_SPEED = 20;
	public static final int J_CORD = 21;
	public static final int K_CORD = 22;
	public static final int LUBE_OFF = 23;
	public static final int LUBE_ON = 24;
	public static final int N_BLOCK = 25;
	public static final int ROT_TOOL_ACW = 26;
	public static final int ROT_TOOL_CW = 27;
	public static final int STOP_TOOL = 28;
	public static final int TOOL_CHANGE = 29;
	public static final int WS = 30;
	public static final int X_CORD = 31;
	public static final int Y_CORD = 32;
	public static final int Z_CORD = 33;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

	public gcodeGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public gcodeGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public String[] getTokenNames() {
		return gcodeGrammarParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g";
	}

	// $ANTLR start "gcode"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:17:1:
	// gcode : ( block )+ ;
	public final void gcode() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:18:2:
			// ( ( block )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:19:2:
			// ( block )+
			{
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:19:2:
				// ( block )+
				int cnt1 = 0;
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if ((LA1_0 == N_BLOCK)) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:19:2:
					// block
					{
						pushFollow(FOLLOW_block_in_gcode48);
						block();
						state._fsp--;

					}
						break;

					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1, input);
						throw eee;
					}
					cnt1++;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gcode"

	// $ANTLR start "block"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:25:1:
	// block : N_BLOCK ( ( info_geometriche )+ (| ( info_tecnologiche )+ ( info_3M
	// )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M ) ;
	public final void block() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:26:2:
			// ( N_BLOCK ( ( info_geometriche )+ (| ( info_tecnologiche )+ ( info_3M )? ) |
			// ( info_tecnologiche )+ ( info_3M )? | info_3M ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:27:3:
			// N_BLOCK ( ( info_geometriche )+ (| ( info_tecnologiche )+ ( info_3M )? ) | (
			// info_tecnologiche )+ ( info_3M )? | info_3M )
			{
				match(input, N_BLOCK, FOLLOW_N_BLOCK_in_block66);
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:27:11:
				// ( ( info_geometriche )+ (| ( info_tecnologiche )+ ( info_3M )? ) | (
				// info_tecnologiche )+ ( info_3M )? | info_3M )
				int alt8 = 3;
				switch (input.LA(1)) {
				case CIRCLE_ACW:
				case CIRCLE_CW:
				case COMP_DIS:
				case COMP_L:
				case COMP_R:
				case COORD_ABS:
				case COORD_REL:
				case FREE_MOVE:
				case JOB_MOVE: {
					alt8 = 1;
				}
					break;
				case FREE_MOVE_SPEED:
				case JOB_MOVE_SPEED:
				case TOOL_CHANGE: {
					alt8 = 2;
				}
					break;
				case CHANGE_TOOL:
				case END_PROG:
				case LUBE_OFF:
				case LUBE_ON:
				case ROT_TOOL_ACW:
				case ROT_TOOL_CW:
				case STOP_TOOL: {
					alt8 = 3;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 8, 0, input);
					throw nvae;
				}
				switch (alt8) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:28:8:
				// ( info_geometriche )+ (| ( info_tecnologiche )+ ( info_3M )? )
				{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:28:8:
					// ( info_geometriche )+
					int cnt2 = 0;
					loop2: while (true) {
						int alt2 = 2;
						int LA2_0 = input.LA(1);
						if (((LA2_0 >= CIRCLE_ACW && LA2_0 <= CIRCLE_CW) || (LA2_0 >= COMP_DIS && LA2_0 <= COORD_REL)
								|| LA2_0 == FREE_MOVE || LA2_0 == JOB_MOVE)) {
							alt2 = 1;
						}

						switch (alt2) {
						case 1:
						// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:28:9:
						// info_geometriche
						{
							pushFollow(FOLLOW_info_geometriche_in_block78);
							info_geometriche();
							state._fsp--;

						}
							break;

						default:
							if (cnt2 >= 1)
								break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:28:28:
					// (| ( info_tecnologiche )+ ( info_3M )? )
					int alt5 = 2;
					int LA5_0 = input.LA(1);
					if ((LA5_0 == EOF || LA5_0 == N_BLOCK)) {
						alt5 = 1;
					} else if ((LA5_0 == FREE_MOVE_SPEED || LA5_0 == JOB_MOVE_SPEED || LA5_0 == TOOL_CHANGE)) {
						alt5 = 2;
					}

					else {
						NoViableAltException nvae = new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:29:21:
					{
					}
						break;
					case 2:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:29:23:
					// ( info_tecnologiche )+ ( info_3M )?
					{
						// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:29:23:
						// ( info_tecnologiche )+
						int cnt3 = 0;
						loop3: while (true) {
							int alt3 = 2;
							int LA3_0 = input.LA(1);
							if ((LA3_0 == FREE_MOVE_SPEED || LA3_0 == JOB_MOVE_SPEED || LA3_0 == TOOL_CHANGE)) {
								alt3 = 1;
							}

							switch (alt3) {
							case 1:
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:29:24:
							// info_tecnologiche
							{
								pushFollow(FOLLOW_info_tecnologiche_in_block107);
								info_tecnologiche();
								state._fsp--;

							}
								break;

							default:
								if (cnt3 >= 1)
									break loop3;
								EarlyExitException eee = new EarlyExitException(3, input);
								throw eee;
							}
							cnt3++;
						}

						// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:29:44:
						// ( info_3M )?
						int alt4 = 2;
						int LA4_0 = input.LA(1);
						if ((LA4_0 == CHANGE_TOOL || LA4_0 == END_PROG || (LA4_0 >= LUBE_OFF && LA4_0 <= LUBE_ON)
								|| (LA4_0 >= ROT_TOOL_ACW && LA4_0 <= STOP_TOOL))) {
							alt4 = 1;
						}
						switch (alt4) {
						case 1:
						// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:29:45:
						// info_3M
						{
							pushFollow(FOLLOW_info_3M_in_block112);
							info_3M();
							state._fsp--;

						}
							break;

						}

					}
						break;

					}

				}
					break;
				case 2:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:32:10:
				// ( info_tecnologiche )+ ( info_3M )?
				{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:32:10:
					// ( info_tecnologiche )+
					int cnt6 = 0;
					loop6: while (true) {
						int alt6 = 2;
						int LA6_0 = input.LA(1);
						if ((LA6_0 == FREE_MOVE_SPEED || LA6_0 == JOB_MOVE_SPEED || LA6_0 == TOOL_CHANGE)) {
							alt6 = 1;
						}

						switch (alt6) {
						case 1:
						// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:32:11:
						// info_tecnologiche
						{
							pushFollow(FOLLOW_info_tecnologiche_in_block167);
							info_tecnologiche();
							state._fsp--;

						}
							break;

						default:
							if (cnt6 >= 1)
								break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:32:31:
					// ( info_3M )?
					int alt7 = 2;
					int LA7_0 = input.LA(1);
					if ((LA7_0 == CHANGE_TOOL || LA7_0 == END_PROG || (LA7_0 >= LUBE_OFF && LA7_0 <= LUBE_ON)
							|| (LA7_0 >= ROT_TOOL_ACW && LA7_0 <= STOP_TOOL))) {
						alt7 = 1;
					}
					switch (alt7) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:32:32:
					// info_3M
					{
						pushFollow(FOLLOW_info_3M_in_block172);
						info_3M();
						state._fsp--;

					}
						break;

					}

				}
					break;
				case 3:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:33:10:
				// info_3M
				{
					pushFollow(FOLLOW_info_3M_in_block185);
					info_3M();
					state._fsp--;

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"

	// $ANTLR start "info_3M"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:37:1:
	// info_3M : info_tecnologiche_M ( info_tecnologiche_M )? ( info_tecnologiche_M
	// )? ;
	public final void info_3M() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:38:2:
			// ( info_tecnologiche_M ( info_tecnologiche_M )? ( info_tecnologiche_M )? )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:39:3:
			// info_tecnologiche_M ( info_tecnologiche_M )? ( info_tecnologiche_M )?
			{
				pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M208);
				info_tecnologiche_M();
				state._fsp--;

				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:39:23:
				// ( info_tecnologiche_M )?
				int alt9 = 2;
				int LA9_0 = input.LA(1);
				if ((LA9_0 == CHANGE_TOOL || LA9_0 == END_PROG || (LA9_0 >= LUBE_OFF && LA9_0 <= LUBE_ON)
						|| (LA9_0 >= ROT_TOOL_ACW && LA9_0 <= STOP_TOOL))) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:39:24:
				// info_tecnologiche_M
				{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M211);
					info_tecnologiche_M();
					state._fsp--;

				}
					break;

				}

				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:39:46:
				// ( info_tecnologiche_M )?
				int alt10 = 2;
				int LA10_0 = input.LA(1);
				if ((LA10_0 == CHANGE_TOOL || LA10_0 == END_PROG || (LA10_0 >= LUBE_OFF && LA10_0 <= LUBE_ON)
						|| (LA10_0 >= ROT_TOOL_ACW && LA10_0 <= STOP_TOOL))) {
					alt10 = 1;
				}
				switch (alt10) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:39:47:
				// info_tecnologiche_M
				{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M216);
					info_tecnologiche_M();
					state._fsp--;

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "info_3M"

	// $ANTLR start "info_geometriche"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:42:1:
	// info_geometriche : ( COORD_ABS | COORD_REL | FREE_MOVE coordinate_XYZ |
	// JOB_MOVE coordinate_XYZ | CIRCLE_CW coordinate_XYZ coordinate_IJK |
	// CIRCLE_ACW coordinate_XYZ coordinate_IJK | COMP_DIS | COMP_L | COMP_R );
	public final void info_geometriche() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:43:2:
			// ( COORD_ABS | COORD_REL | FREE_MOVE coordinate_XYZ | JOB_MOVE coordinate_XYZ
			// | CIRCLE_CW coordinate_XYZ coordinate_IJK | CIRCLE_ACW coordinate_XYZ
			// coordinate_IJK | COMP_DIS | COMP_L | COMP_R )
			int alt11 = 9;
			switch (input.LA(1)) {
			case COORD_ABS: {
				alt11 = 1;
			}
				break;
			case COORD_REL: {
				alt11 = 2;
			}
				break;
			case FREE_MOVE: {
				alt11 = 3;
			}
				break;
			case JOB_MOVE: {
				alt11 = 4;
			}
				break;
			case CIRCLE_CW: {
				alt11 = 5;
			}
				break;
			case CIRCLE_ACW: {
				alt11 = 6;
			}
				break;
			case COMP_DIS: {
				alt11 = 7;
			}
				break;
			case COMP_L: {
				alt11 = 8;
			}
				break;
			case COMP_R: {
				alt11 = 9;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
			case 1:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:44:3:
			// COORD_ABS
			{
				match(input, COORD_ABS, FOLLOW_COORD_ABS_in_info_geometriche232);
			}
				break;
			case 2:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:45:4:
			// COORD_REL
			{
				match(input, COORD_REL, FOLLOW_COORD_REL_in_info_geometriche237);
			}
				break;
			case 3:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:46:4:
			// FREE_MOVE coordinate_XYZ
			{
				match(input, FREE_MOVE, FOLLOW_FREE_MOVE_in_info_geometriche242);
				pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche244);
				coordinate_XYZ();
				state._fsp--;

			}
				break;
			case 4:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:47:4:
			// JOB_MOVE coordinate_XYZ
			{
				match(input, JOB_MOVE, FOLLOW_JOB_MOVE_in_info_geometriche249);
				pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche251);
				coordinate_XYZ();
				state._fsp--;

			}
				break;
			case 5:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:48:4:
			// CIRCLE_CW coordinate_XYZ coordinate_IJK
			{
				match(input, CIRCLE_CW, FOLLOW_CIRCLE_CW_in_info_geometriche256);
				pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche258);
				coordinate_XYZ();
				state._fsp--;

				pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche260);
				coordinate_IJK();
				state._fsp--;

			}
				break;
			case 6:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:49:4:
			// CIRCLE_ACW coordinate_XYZ coordinate_IJK
			{
				match(input, CIRCLE_ACW, FOLLOW_CIRCLE_ACW_in_info_geometriche265);
				pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche267);
				coordinate_XYZ();
				state._fsp--;

				pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche269);
				coordinate_IJK();
				state._fsp--;

			}
				break;
			case 7:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:50:4:
			// COMP_DIS
			{
				match(input, COMP_DIS, FOLLOW_COMP_DIS_in_info_geometriche274);
			}
				break;
			case 8:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:51:4:
			// COMP_L
			{
				match(input, COMP_L, FOLLOW_COMP_L_in_info_geometriche279);
			}
				break;
			case 9:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:52:4:
			// COMP_R
			{
				match(input, COMP_R, FOLLOW_COMP_R_in_info_geometriche284);
			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "info_geometriche"

	// $ANTLR start "coordinate_XYZ"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:55:1:
	// coordinate_XYZ : ( X_CORD ( Y_CORD )? ( Z_CORD )? | Y_CORD ( Z_CORD )? |
	// Z_CORD );
	public final void coordinate_XYZ() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:56:2:
			// ( X_CORD ( Y_CORD )? ( Z_CORD )? | Y_CORD ( Z_CORD )? | Z_CORD )
			int alt15 = 3;
			switch (input.LA(1)) {
			case X_CORD: {
				alt15 = 1;
			}
				break;
			case Y_CORD: {
				alt15 = 2;
			}
				break;
			case Z_CORD: {
				alt15 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
			case 1:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:57:3:
			// X_CORD ( Y_CORD )? ( Z_CORD )?
			{
				match(input, X_CORD, FOLLOW_X_CORD_in_coordinate_XYZ298);
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:57:10:
				// ( Y_CORD )?
				int alt12 = 2;
				int LA12_0 = input.LA(1);
				if ((LA12_0 == Y_CORD)) {
					alt12 = 1;
				}
				switch (alt12) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:57:11:
				// Y_CORD
				{
					match(input, Y_CORD, FOLLOW_Y_CORD_in_coordinate_XYZ301);
				}
					break;

				}

				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:57:20:
				// ( Z_CORD )?
				int alt13 = 2;
				int LA13_0 = input.LA(1);
				if ((LA13_0 == Z_CORD)) {
					alt13 = 1;
				}
				switch (alt13) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:57:21:
				// Z_CORD
				{
					match(input, Z_CORD, FOLLOW_Z_CORD_in_coordinate_XYZ306);
				}
					break;

				}

			}
				break;
			case 2:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:58:4:
			// Y_CORD ( Z_CORD )?
			{
				match(input, Y_CORD, FOLLOW_Y_CORD_in_coordinate_XYZ313);
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:58:11:
				// ( Z_CORD )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);
				if ((LA14_0 == Z_CORD)) {
					alt14 = 1;
				}
				switch (alt14) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:58:12:
				// Z_CORD
				{
					match(input, Z_CORD, FOLLOW_Z_CORD_in_coordinate_XYZ316);
				}
					break;

				}

			}
				break;
			case 3:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:59:4:
			// Z_CORD
			{
				match(input, Z_CORD, FOLLOW_Z_CORD_in_coordinate_XYZ323);
			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "coordinate_XYZ"

	// $ANTLR start "coordinate_IJK"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:62:1:
	// coordinate_IJK : ( I_CORD ( J_CORD )? ( K_CORD )? | J_CORD ( K_CORD )? |
	// K_CORD );
	public final void coordinate_IJK() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:63:2:
			// ( I_CORD ( J_CORD )? ( K_CORD )? | J_CORD ( K_CORD )? | K_CORD )
			int alt19 = 3;
			switch (input.LA(1)) {
			case I_CORD: {
				alt19 = 1;
			}
				break;
			case J_CORD: {
				alt19 = 2;
			}
				break;
			case K_CORD: {
				alt19 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
			case 1:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:3:
			// I_CORD ( J_CORD )? ( K_CORD )?
			{
				match(input, I_CORD, FOLLOW_I_CORD_in_coordinate_IJK338);
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:10:
				// ( J_CORD )?
				int alt16 = 2;
				int LA16_0 = input.LA(1);
				if ((LA16_0 == J_CORD)) {
					alt16 = 1;
				}
				switch (alt16) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:11:
				// J_CORD
				{
					match(input, J_CORD, FOLLOW_J_CORD_in_coordinate_IJK341);
				}
					break;

				}

				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:20:
				// ( K_CORD )?
				int alt17 = 2;
				int LA17_0 = input.LA(1);
				if ((LA17_0 == K_CORD)) {
					alt17 = 1;
				}
				switch (alt17) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:21:
				// K_CORD
				{
					match(input, K_CORD, FOLLOW_K_CORD_in_coordinate_IJK346);
				}
					break;

				}

			}
				break;
			case 2:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:65:4:
			// J_CORD ( K_CORD )?
			{
				match(input, J_CORD, FOLLOW_J_CORD_in_coordinate_IJK353);
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:65:11:
				// ( K_CORD )?
				int alt18 = 2;
				int LA18_0 = input.LA(1);
				if ((LA18_0 == K_CORD)) {
					alt18 = 1;
				}
				switch (alt18) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:65:12:
				// K_CORD
				{
					match(input, K_CORD, FOLLOW_K_CORD_in_coordinate_IJK356);
				}
					break;

				}

			}
				break;
			case 3:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:66:4:
			// K_CORD
			{
				match(input, K_CORD, FOLLOW_K_CORD_in_coordinate_IJK363);
			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "coordinate_IJK"

	// $ANTLR start "info_tecnologiche"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:69:1:
	// info_tecnologiche : ( FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE );
	public final void info_tecnologiche() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:70:2:
			// ( FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
			{
				if (input.LA(1) == FREE_MOVE_SPEED || input.LA(1) == JOB_MOVE_SPEED || input.LA(1) == TOOL_CHANGE) {
					input.consume();
					state.errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "info_tecnologiche"

	// $ANTLR start "info_tecnologiche_M"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:1:
	// info_tecnologiche_M : ( ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL
	// | LUBE_ON | LUBE_OFF | END_PROG );
	public final void info_tecnologiche_M() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:77:2:
			// ( ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON | LUBE_OFF |
			// END_PROG )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
			{
				if (input.LA(1) == CHANGE_TOOL || input.LA(1) == END_PROG
						|| (input.LA(1) >= LUBE_OFF && input.LA(1) <= LUBE_ON)
						|| (input.LA(1) >= ROT_TOOL_ACW && input.LA(1) <= STOP_TOOL)) {
					input.consume();
					state.errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "info_tecnologiche_M"

	// Delegated rules

	public static final BitSet FOLLOW_block_in_gcode48 = new BitSet(new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_N_BLOCK_in_block66 = new BitSet(new long[] { 0x000000003D9B9F70L });
	public static final BitSet FOLLOW_info_geometriche_in_block78 = new BitSet(new long[] { 0x00000000201B1F62L });
	public static final BitSet FOLLOW_info_tecnologiche_in_block107 = new BitSet(new long[] { 0x000000003D928012L });
	public static final BitSet FOLLOW_info_3M_in_block112 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_info_tecnologiche_in_block167 = new BitSet(new long[] { 0x000000003D928012L });
	public static final BitSet FOLLOW_info_3M_in_block172 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_info_3M_in_block185 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M208 = new BitSet(
			new long[] { 0x000000001D808012L });
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M211 = new BitSet(
			new long[] { 0x000000001D808012L });
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M216 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COORD_ABS_in_info_geometriche232 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COORD_REL_in_info_geometriche237 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FREE_MOVE_in_info_geometriche242 = new BitSet(new long[] { 0x0000000380000000L });
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche244 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_JOB_MOVE_in_info_geometriche249 = new BitSet(new long[] { 0x0000000380000000L });
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche251 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CIRCLE_CW_in_info_geometriche256 = new BitSet(new long[] { 0x0000000380000000L });
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche258 = new BitSet(
			new long[] { 0x0000000000640000L });
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche260 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CIRCLE_ACW_in_info_geometriche265 = new BitSet(
			new long[] { 0x0000000380000000L });
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche267 = new BitSet(
			new long[] { 0x0000000000640000L });
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche269 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COMP_DIS_in_info_geometriche274 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COMP_L_in_info_geometriche279 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COMP_R_in_info_geometriche284 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_X_CORD_in_coordinate_XYZ298 = new BitSet(new long[] { 0x0000000300000002L });
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ301 = new BitSet(new long[] { 0x0000000200000002L });
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ306 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ313 = new BitSet(new long[] { 0x0000000200000002L });
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ316 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ323 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_I_CORD_in_coordinate_IJK338 = new BitSet(new long[] { 0x0000000000600002L });
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK341 = new BitSet(new long[] { 0x0000000000400002L });
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK346 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK353 = new BitSet(new long[] { 0x0000000000400002L });
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK356 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK363 = new BitSet(new long[] { 0x0000000000000002L });
}
