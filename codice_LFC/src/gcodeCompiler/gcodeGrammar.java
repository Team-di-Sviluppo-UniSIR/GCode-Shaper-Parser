// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2021-12-15 14:20:30

package gcodeCompiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gcodeGrammar extends Lexer {
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
	public static final int END_PROG = 13;
	public static final int FREE_MOVE = 14;
	public static final int FREE_MOVE_SPEED = 15;
	public static final int JOB_MOVE = 16;
	public static final int JOB_MOVE_SPEED = 17;
	public static final int LUBE_OFF = 18;
	public static final int LUBE_ON = 19;
	public static final int N_BLOCK = 20;
	public static final int ROT_TOOL_ACW = 21;
	public static final int ROT_TOOL_CW = 22;
	public static final int STOP_TOOL = 23;
	public static final int TOOL_CHANGE = 24;
	public static final int WS = 25;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public gcodeGrammar() {
	}

	public gcodeGrammar(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public gcodeGrammar(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public String getGrammarFileName() {
		return "C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g";
	}

	// $ANTLR start "N_BLOCK"
	public final void mN_BLOCK() throws RecognitionException {
		try {
			int _type = N_BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:16:2:
			// ( 'N' ( '1' .. '9' ) ( '0' .. '9' )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:16:4:
			// 'N' ( '1' .. '9' ) ( '0' .. '9' )*
			{
				match('N');
				if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:16:20:
				// ( '0' .. '9' )*
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop1;
					}
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N_BLOCK"

	// $ANTLR start "COORD_ABS"
	public final void mCOORD_ABS() throws RecognitionException {
		try {
			int _type = COORD_ABS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:20:2:
			// ( 'G90' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:20:4:
			// 'G90'
			{
				match("G90");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COORD_ABS"

	// $ANTLR start "COORD_REL"
	public final void mCOORD_REL() throws RecognitionException {
		try {
			int _type = COORD_REL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:24:2:
			// ( 'G91' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:24:4:
			// 'G91'
			{
				match("G91");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COORD_REL"

	// $ANTLR start "FREE_MOVE"
	public final void mFREE_MOVE() throws RecognitionException {
		try {
			int _type = FREE_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:28:2:
			// ( 'G00' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:28:4:
			// 'G00'
			{
				match("G00");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREE_MOVE"

	// $ANTLR start "JOB_MOVE"
	public final void mJOB_MOVE() throws RecognitionException {
		try {
			int _type = JOB_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:32:2:
			// ( 'G01' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:32:4:
			// 'G01'
			{
				match("G01");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOB_MOVE"

	// $ANTLR start "CIRCLE_CW"
	public final void mCIRCLE_CW() throws RecognitionException {
		try {
			int _type = CIRCLE_CW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:36:2:
			// ( 'G02' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:36:4:
			// 'G02'
			{
				match("G02");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE_CW"

	// $ANTLR start "CIRCLE_ACW"
	public final void mCIRCLE_ACW() throws RecognitionException {
		try {
			int _type = CIRCLE_ACW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:40:2:
			// ( 'G03' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:40:4:
			// 'G03'
			{
				match("G03");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE_ACW"

	// $ANTLR start "COMP_DIS"
	public final void mCOMP_DIS() throws RecognitionException {
		try {
			int _type = COMP_DIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:44:2:
			// ( 'G40' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:44:4:
			// 'G40'
			{
				match("G40");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP_DIS"

	// $ANTLR start "COMP_L"
	public final void mCOMP_L() throws RecognitionException {
		try {
			int _type = COMP_L;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:48:2:
			// ( 'G41' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:48:4:
			// 'G41'
			{
				match("G41");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP_L"

	// $ANTLR start "COMP_R"
	public final void mCOMP_R() throws RecognitionException {
		try {
			int _type = COMP_R;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:52:2:
			// ( 'G42' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:52:4:
			// 'G42'
			{
				match("G42");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP_R"

	// $ANTLR start "FREE_MOVE_SPEED"
	public final void mFREE_MOVE_SPEED() throws RecognitionException {
		try {
			int _type = FREE_MOVE_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:56:2:
			// ( 'F' ( '1' .. '9' ) ( '0' .. '9' )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:56:4:
			// 'F' ( '1' .. '9' ) ( '0' .. '9' )*
			{
				match('F');
				if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:56:20:
				// ( '0' .. '9' )*
				loop2: while (true) {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					if (((LA2_0 >= '0' && LA2_0 <= '9'))) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop2;
					}
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREE_MOVE_SPEED"

	// $ANTLR start "JOB_MOVE_SPEED"
	public final void mJOB_MOVE_SPEED() throws RecognitionException {
		try {
			int _type = JOB_MOVE_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:60:2:
			// ( 'S' ( '1' .. '9' ) ( '0' .. '9' )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:60:4:
			// 'S' ( '1' .. '9' ) ( '0' .. '9' )*
			{
				match('S');
				if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:60:20:
				// ( '0' .. '9' )*
				loop3: while (true) {
					int alt3 = 2;
					int LA3_0 = input.LA(1);
					if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop3;
					}
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOB_MOVE_SPEED"

	// $ANTLR start "TOOL_CHANGE"
	public final void mTOOL_CHANGE() throws RecognitionException {
		try {
			int _type = TOOL_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:2:
			// ( 'T0' ( '1' .. '9' ) '0' ( '1' .. '9' ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:4:
			// 'T0' ( '1' .. '9' ) '0' ( '1' .. '9' )
			{
				match("T0");

				if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				match('0');
				if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOOL_CHANGE"

	// $ANTLR start "ROT_TOOL_CW"
	public final void mROT_TOOL_CW() throws RecognitionException {
		try {
			int _type = ROT_TOOL_CW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:68:2:
			// ( 'M03' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:68:4:
			// 'M03'
			{
				match("M03");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROT_TOOL_CW"

	// $ANTLR start "ROT_TOOL_ACW"
	public final void mROT_TOOL_ACW() throws RecognitionException {
		try {
			int _type = ROT_TOOL_ACW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:72:2:
			// ( 'M04' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:72:4:
			// 'M04'
			{
				match("M04");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROT_TOOL_ACW"

	// $ANTLR start "STOP_TOOL"
	public final void mSTOP_TOOL() throws RecognitionException {
		try {
			int _type = STOP_TOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:2:
			// ( 'M05' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:4:
			// 'M05'
			{
				match("M05");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STOP_TOOL"

	// $ANTLR start "CHANGE_TOOL"
	public final void mCHANGE_TOOL() throws RecognitionException {
		try {
			int _type = CHANGE_TOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:80:2:
			// ( 'M06' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:80:4:
			// 'M06'
			{
				match("M06");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHANGE_TOOL"

	// $ANTLR start "LUBE_ON"
	public final void mLUBE_ON() throws RecognitionException {
		try {
			int _type = LUBE_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:84:2:
			// ( 'M08' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:84:4:
			// 'M08'
			{
				match("M08");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LUBE_ON"

	// $ANTLR start "LUBE_OFF"
	public final void mLUBE_OFF() throws RecognitionException {
		try {
			int _type = LUBE_OFF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:88:2:
			// ( 'M09' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:88:4:
			// 'M09'
			{
				match("M09");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LUBE_OFF"

	// $ANTLR start "END_PROG"
	public final void mEND_PROG() throws RecognitionException {
		try {
			int _type = END_PROG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:2:
			// ( 'M30' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:4:
			// 'M30'
			{
				match("M30");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_PROG"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:96:5:
			// ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options
			// {greedy=false; } : . )* '*/' )
			int alt7 = 2;
			int LA7_0 = input.LA(1);
			if ((LA7_0 == '/')) {
				int LA7_1 = input.LA(2);
				if ((LA7_1 == '/')) {
					alt7 = 1;
				} else if ((LA7_1 == '*')) {
					alt7 = 2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae = new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae = new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
			case 1:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:96:9:
			// '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
				match("//");

				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:96:14:
				// (~ ( '\\n' | '\\r' ) )*
				loop4: while (true) {
					int alt4 = 2;
					int LA4_0 = input.LA(1);
					if (((LA4_0 >= '\u0000' && LA4_0 <= '\t') || (LA4_0 >= '\u000B' && LA4_0 <= '\f')
							|| (LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF'))) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop4;
					}
				}

				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:96:28:
				// ( '\\r' )?
				int alt5 = 2;
				int LA5_0 = input.LA(1);
				if ((LA5_0 == '\r')) {
					alt5 = 1;
				}
				switch (alt5) {
				case 1:
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:96:28:
				// '\\r'
				{
					match('\r');
				}
					break;

				}

				match('\n');
				_channel = HIDDEN;
			}
				break;
			case 2:
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:97:9:
			// '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");

				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:97:14:
				// ( options {greedy=false; } : . )*
				loop6: while (true) {
					int alt6 = 2;
					int LA6_0 = input.LA(1);
					if ((LA6_0 == '*')) {
						int LA6_1 = input.LA(2);
						if ((LA6_1 == '/')) {
							alt6 = 2;
						} else if (((LA6_1 >= '\u0000' && LA6_1 <= '.') || (LA6_1 >= '0' && LA6_1 <= '\uFFFF'))) {
							alt6 = 1;
						}

					} else if (((LA6_0 >= '\u0000' && LA6_0 <= ')') || (LA6_0 >= '+' && LA6_0 <= '\uFFFF'))) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:97:42:
					// .
					{
						matchAny();
					}
						break;

					default:
						break loop6;
					}
				}

				match("*/");

				_channel = HIDDEN;
			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:5:
			// ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:9:
			// ( ' ' | '\\t' | '\\r' | '\\n' )
			{
				if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:8:
		// ( N_BLOCK | COORD_ABS | COORD_REL | FREE_MOVE | JOB_MOVE | CIRCLE_CW |
		// CIRCLE_ACW | COMP_DIS | COMP_L | COMP_R | FREE_MOVE_SPEED | JOB_MOVE_SPEED |
		// TOOL_CHANGE | ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON
		// | LUBE_OFF | END_PROG | COMMENT | WS )
		int alt8 = 22;
		switch (input.LA(1)) {
		case 'N': {
			alt8 = 1;
		}
			break;
		case 'G': {
			switch (input.LA(2)) {
			case '9': {
				int LA8_9 = input.LA(3);
				if ((LA8_9 == '0')) {
					alt8 = 2;
				} else if ((LA8_9 == '1')) {
					alt8 = 3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae = new NoViableAltException("", 8, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
				break;
			case '0': {
				switch (input.LA(3)) {
				case '0': {
					alt8 = 4;
				}
					break;
				case '1': {
					alt8 = 5;
				}
					break;
				case '2': {
					alt8 = 6;
				}
					break;
				case '3': {
					alt8 = 7;
				}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae = new NoViableAltException("", 8, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
				break;
			case '4': {
				switch (input.LA(3)) {
				case '0': {
					alt8 = 8;
				}
					break;
				case '1': {
					alt8 = 9;
				}
					break;
				case '2': {
					alt8 = 10;
				}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae = new NoViableAltException("", 8, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
				break;
			default:
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae = new NoViableAltException("", 8, 2, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
		}
			break;
		case 'F': {
			alt8 = 11;
		}
			break;
		case 'S': {
			alt8 = 12;
		}
			break;
		case 'T': {
			alt8 = 13;
		}
			break;
		case 'M': {
			int LA8_6 = input.LA(2);
			if ((LA8_6 == '0')) {
				switch (input.LA(3)) {
				case '3': {
					alt8 = 14;
				}
					break;
				case '4': {
					alt8 = 15;
				}
					break;
				case '5': {
					alt8 = 16;
				}
					break;
				case '6': {
					alt8 = 17;
				}
					break;
				case '8': {
					alt8 = 18;
				}
					break;
				case '9': {
					alt8 = 19;
				}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae = new NoViableAltException("", 8, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			} else if ((LA8_6 == '3')) {
				alt8 = 20;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae = new NoViableAltException("", 8, 6, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

		}
			break;
		case '/': {
			alt8 = 21;
		}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ': {
			alt8 = 22;
		}
			break;
		default:
			NoViableAltException nvae = new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
		case 1:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:10:
		// N_BLOCK
		{
			mN_BLOCK();

		}
			break;
		case 2:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:18:
		// COORD_ABS
		{
			mCOORD_ABS();

		}
			break;
		case 3:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:28:
		// COORD_REL
		{
			mCOORD_REL();

		}
			break;
		case 4:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:38:
		// FREE_MOVE
		{
			mFREE_MOVE();

		}
			break;
		case 5:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:48:
		// JOB_MOVE
		{
			mJOB_MOVE();

		}
			break;
		case 6:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:57:
		// CIRCLE_CW
		{
			mCIRCLE_CW();

		}
			break;
		case 7:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:67:
		// CIRCLE_ACW
		{
			mCIRCLE_ACW();

		}
			break;
		case 8:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:78:
		// COMP_DIS
		{
			mCOMP_DIS();

		}
			break;
		case 9:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:87:
		// COMP_L
		{
			mCOMP_L();

		}
			break;
		case 10:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:94:
		// COMP_R
		{
			mCOMP_R();

		}
			break;
		case 11:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:101:
		// FREE_MOVE_SPEED
		{
			mFREE_MOVE_SPEED();

		}
			break;
		case 12:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:117:
		// JOB_MOVE_SPEED
		{
			mJOB_MOVE_SPEED();

		}
			break;
		case 13:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:132:
		// TOOL_CHANGE
		{
			mTOOL_CHANGE();

		}
			break;
		case 14:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:144:
		// ROT_TOOL_CW
		{
			mROT_TOOL_CW();

		}
			break;
		case 15:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:156:
		// ROT_TOOL_ACW
		{
			mROT_TOOL_ACW();

		}
			break;
		case 16:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:169:
		// STOP_TOOL
		{
			mSTOP_TOOL();

		}
			break;
		case 17:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:179:
		// CHANGE_TOOL
		{
			mCHANGE_TOOL();

		}
			break;
		case 18:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:191:
		// LUBE_ON
		{
			mLUBE_ON();

		}
			break;
		case 19:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:199:
		// LUBE_OFF
		{
			mLUBE_OFF();

		}
			break;
		case 20:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:208:
		// END_PROG
		{
			mEND_PROG();

		}
			break;
		case 21:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:217:
		// COMMENT
		{
			mCOMMENT();

		}
			break;
		case 22:
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:225:
		// WS
		{
			mWS();

		}
			break;

		}
	}

}
