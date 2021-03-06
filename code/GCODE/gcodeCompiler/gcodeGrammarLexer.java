// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2022-03-09 19:22:25

package gcodeCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class gcodeGrammarLexer.
 */
@SuppressWarnings("all")
public class gcodeGrammarLexer extends Lexer {
	
	/** The Constant EOF. */
	public static final int EOF=-1;
	
	/** The Constant CHANGE_TOOL. */
	public static final int CHANGE_TOOL=4;
	
	/** The Constant CIRCLE_ACW. */
	public static final int CIRCLE_ACW=5;
	
	/** The Constant CIRCLE_CW. */
	public static final int CIRCLE_CW=6;
	
	/** The Constant COMMENT. */
	public static final int COMMENT=7;
	
	/** The Constant COMP_DIS. */
	public static final int COMP_DIS=8;
	
	/** The Constant COMP_L. */
	public static final int COMP_L=9;
	
	/** The Constant COMP_R. */
	public static final int COMP_R=10;
	
	/** The Constant COORD_ABS. */
	public static final int COORD_ABS=11;
	
	/** The Constant COORD_REL. */
	public static final int COORD_REL=12;
	
	/** The Constant CORD_DIGIT. */
	public static final int CORD_DIGIT=13;
	
	/** The Constant DIGIT. */
	public static final int DIGIT=14;
	
	/** The Constant END_PROG. */
	public static final int END_PROG=15;
	
	/** The Constant FREE_MOVE. */
	public static final int FREE_MOVE=16;
	
	/** The Constant FREE_MOVE_SPEED. */
	public static final int FREE_MOVE_SPEED=17;
	
	/** The Constant I_CORD. */
	public static final int I_CORD=18;
	
	/** The Constant JOB_MOVE. */
	public static final int JOB_MOVE=19;
	
	/** The Constant JOB_MOVE_SPEED. */
	public static final int JOB_MOVE_SPEED=20;
	
	/** The Constant J_CORD. */
	public static final int J_CORD=21;
	
	/** The Constant K_CORD. */
	public static final int K_CORD=22;
	
	/** The Constant LUBE_OFF. */
	public static final int LUBE_OFF=23;
	
	/** The Constant LUBE_ON. */
	public static final int LUBE_ON=24;
	
	/** The Constant N_BLOCK. */
	public static final int N_BLOCK=25;
	
	/** The Constant ROT_TOOL_ACW. */
	public static final int ROT_TOOL_ACW=26;
	
	/** The Constant ROT_TOOL_CW. */
	public static final int ROT_TOOL_CW=27;
	
	/** The Constant SCAN_ERROR. */
	public static final int SCAN_ERROR=28;
	
	/** The Constant STOP_TOOL. */
	public static final int STOP_TOOL=29;
	
	/** The Constant TOOL_CHANGE. */
	public static final int TOOL_CHANGE=30;
	
	/** The Constant WS. */
	public static final int WS=31;
	
	/** The Constant X_CORD. */
	public static final int X_CORD=32;
	
	/** The Constant Y_CORD. */
	public static final int Y_CORD=33;
	
	/** The Constant Z_CORD. */
	public static final int Z_CORD=34;

	/**
	 * Emit error message.
	 *
	 * @param msg the msg
	 */
	@Override
	public void emitErrorMessage(String msg) {}


	// delegates
	/**
	 * Gets the delegates.
	 *
	 * @return the delegates
	 */
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	/**
	 * Instantiates a new gcode grammar lexer.
	 */
	public gcodeGrammarLexer() {} 
	
	/**
	 * Instantiates a new gcode grammar lexer.
	 *
	 * @param input the input
	 */
	public gcodeGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	
	/**
	 * Instantiates a new gcode grammar lexer.
	 *
	 * @param input the input
	 * @param state the state
	 */
	public gcodeGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	
	/**
	 * Gets the grammar file name.
	 *
	 * @return the grammar file name
	 */
	@Override public String getGrammarFileName() { return "C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g"; }

	/**
	 * M DIGIT.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:177:2: ( '0' .. '9' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	/**
	 * M COR D DIGIT.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CORD_DIGIT"
	public final void mCORD_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:182:2: ( ( '-' )? ( DIGIT )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:182:4: ( '-' )? ( DIGIT )+
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:182:4: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:182:5: '-'
					{
					match('-'); 
					}
					break;

			}

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:182:10: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CORD_DIGIT"

	/**
	 * M X CORD.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "X_CORD"
	public final void mX_CORD() throws RecognitionException {
		try {
			int _type = X_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:187:2: ( 'X' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:187:4: 'X' CORD_DIGIT
			{
			match('X'); 
			mCORD_DIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X_CORD"

	/**
	 * M Y CORD.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "Y_CORD"
	public final void mY_CORD() throws RecognitionException {
		try {
			int _type = Y_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:192:2: ( 'Y' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:192:4: 'Y' CORD_DIGIT
			{
			match('Y'); 
			mCORD_DIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y_CORD"

	/**
	 * M Z CORD.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "Z_CORD"
	public final void mZ_CORD() throws RecognitionException {
		try {
			int _type = Z_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:197:2: ( 'Z' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:197:4: 'Z' CORD_DIGIT
			{
			match('Z'); 
			mCORD_DIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z_CORD"

	/**
	 * M I CORD.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "I_CORD"
	public final void mI_CORD() throws RecognitionException {
		try {
			int _type = I_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:202:2: ( 'I' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:202:4: 'I' CORD_DIGIT
			{
			match('I'); 
			mCORD_DIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I_CORD"

	/**
	 * M J CORD.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "J_CORD"
	public final void mJ_CORD() throws RecognitionException {
		try {
			int _type = J_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:207:2: ( 'J' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:207:4: 'J' CORD_DIGIT
			{
			match('J'); 
			mCORD_DIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J_CORD"

	/**
	 * M K CORD.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "K_CORD"
	public final void mK_CORD() throws RecognitionException {
		try {
			int _type = K_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:212:2: ( 'K' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:212:4: 'K' CORD_DIGIT
			{
			match('K'); 
			mCORD_DIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CORD"

	/**
	 * M N BLOCK.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "N_BLOCK"
	public final void mN_BLOCK() throws RecognitionException {
		try {
			int _type = N_BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:217:2: ( 'N' ( '0' .. '9' ) ( DIGIT )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:217:4: 'N' ( '0' .. '9' ) ( DIGIT )*
			{
			match('N'); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:217:20: ( DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N_BLOCK"

	/**
	 * M COOR D ABS.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "COORD_ABS"
	public final void mCOORD_ABS() throws RecognitionException {
		try {
			int _type = COORD_ABS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:222:2: ( 'G90' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:222:4: 'G90'
			{
			match("G90"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COORD_ABS"

	/**
	 * M COOR D REL.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "COORD_REL"
	public final void mCOORD_REL() throws RecognitionException {
		try {
			int _type = COORD_REL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:227:2: ( 'G91' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:227:4: 'G91'
			{
			match("G91"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COORD_REL"

	/**
	 * M FRE E MOVE.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "FREE_MOVE"
	public final void mFREE_MOVE() throws RecognitionException {
		try {
			int _type = FREE_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:232:2: ( 'G00' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:232:4: 'G00'
			{
			match("G00"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREE_MOVE"

	/**
	 * M JO B MOVE.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "JOB_MOVE"
	public final void mJOB_MOVE() throws RecognitionException {
		try {
			int _type = JOB_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:237:2: ( 'G01' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:237:4: 'G01'
			{
			match("G01"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOB_MOVE"

	/**
	 * M CIRCL E CW.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CIRCLE_CW"
	public final void mCIRCLE_CW() throws RecognitionException {
		try {
			int _type = CIRCLE_CW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:242:2: ( 'G02' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:242:4: 'G02'
			{
			match("G02"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE_CW"

	/**
	 * M CIRCL E ACW.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CIRCLE_ACW"
	public final void mCIRCLE_ACW() throws RecognitionException {
		try {
			int _type = CIRCLE_ACW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:248:2: ( 'G03' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:248:4: 'G03'
			{
			match("G03"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE_ACW"

	/**
	 * M COM P DIS.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "COMP_DIS"
	public final void mCOMP_DIS() throws RecognitionException {
		try {
			int _type = COMP_DIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:254:2: ( 'G40' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:254:4: 'G40'
			{
			match("G40"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP_DIS"

	/**
	 * M COM P L.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "COMP_L"
	public final void mCOMP_L() throws RecognitionException {
		try {
			int _type = COMP_L;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:259:2: ( 'G41' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:259:4: 'G41'
			{
			match("G41"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP_L"

	/**
	 * M COM P R.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "COMP_R"
	public final void mCOMP_R() throws RecognitionException {
		try {
			int _type = COMP_R;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:264:2: ( 'G42' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:264:4: 'G42'
			{
			match("G42"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP_R"

	/**
	 * M FRE E MOV E SPEED.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "FREE_MOVE_SPEED"
	public final void mFREE_MOVE_SPEED() throws RecognitionException {
		try {
			int _type = FREE_MOVE_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:269:2: ( 'F' ( '1' .. '9' ) ( DIGIT )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:269:4: 'F' ( '1' .. '9' ) ( DIGIT )*
			{
			match('F'); 
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:269:20: ( DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREE_MOVE_SPEED"

	/**
	 * M JO B MOV E SPEED.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "JOB_MOVE_SPEED"
	public final void mJOB_MOVE_SPEED() throws RecognitionException {
		try {
			int _type = JOB_MOVE_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:274:2: ( 'S' ( '1' .. '9' ) ( DIGIT )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:274:4: 'S' ( '1' .. '9' ) ( DIGIT )*
			{
			match('S'); 
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:274:20: ( DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOB_MOVE_SPEED"

	/**
	 * M TOO L CHANGE.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "TOOL_CHANGE"
	public final void mTOOL_CHANGE() throws RecognitionException {
		try {
			int _type = TOOL_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:279:2: ( 'T0' ( '1' .. '9' ) '0' ( '1' .. '9' ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:279:4: 'T0' ( '1' .. '9' ) '0' ( '1' .. '9' )
			{
			match("T0"); 

			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('0'); 
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOOL_CHANGE"

	/**
	 * M RO T TOO L CW.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "ROT_TOOL_CW"
	public final void mROT_TOOL_CW() throws RecognitionException {
		try {
			int _type = ROT_TOOL_CW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:284:2: ( 'M03' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:284:4: 'M03'
			{
			match("M03"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROT_TOOL_CW"

	/**
	 * M RO T TOO L ACW.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "ROT_TOOL_ACW"
	public final void mROT_TOOL_ACW() throws RecognitionException {
		try {
			int _type = ROT_TOOL_ACW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:289:2: ( 'M04' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:289:4: 'M04'
			{
			match("M04"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROT_TOOL_ACW"

	/**
	 * M STO P TOOL.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "STOP_TOOL"
	public final void mSTOP_TOOL() throws RecognitionException {
		try {
			int _type = STOP_TOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:294:2: ( 'M05' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:294:4: 'M05'
			{
			match("M05"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STOP_TOOL"

	/**
	 * M CHANG E TOOL.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CHANGE_TOOL"
	public final void mCHANGE_TOOL() throws RecognitionException {
		try {
			int _type = CHANGE_TOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:299:2: ( 'M06' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:299:4: 'M06'
			{
			match("M06"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHANGE_TOOL"

	/**
	 * M LUB E ON.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "LUBE_ON"
	public final void mLUBE_ON() throws RecognitionException {
		try {
			int _type = LUBE_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:304:2: ( 'M08' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:304:4: 'M08'
			{
			match("M08"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LUBE_ON"

	/**
	 * M LUB E OFF.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "LUBE_OFF"
	public final void mLUBE_OFF() throws RecognitionException {
		try {
			int _type = LUBE_OFF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:309:2: ( 'M09' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:309:4: 'M09'
			{
			match("M09"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LUBE_OFF"

	/**
	 * M EN D PROG.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "END_PROG"
	public final void mEND_PROG() throws RecognitionException {
		try {
			int _type = END_PROG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:314:2: ( 'M30' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:314:4: 'M30'
			{
			match("M30"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_PROG"

	/**
	 * M COMMENT.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:319:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='/') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='/') ) {
					alt9=1;
				}
				else if ( (LA9_1=='*') ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:319:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:319:14: (~ ( '\\n' | '\\r' ) )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:319:28: ( '\\r' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='\r') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:319:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:320:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:320:14: ( options {greedy=false; } : . )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='*') ) {
							int LA8_1 = input.LA(2);
							if ( (LA8_1=='/') ) {
								alt8=2;
							}
							else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
								alt8=1;
							}

						}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:320:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop8;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	/**
	 * M WS.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:324:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:324:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	/**
	 * M SCA N ERROR.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:331:12: ( . )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:331:14: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	/**
	 * M tokens.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:8: ( X_CORD | Y_CORD | Z_CORD | I_CORD | J_CORD | K_CORD | N_BLOCK | COORD_ABS | COORD_REL | FREE_MOVE | JOB_MOVE | CIRCLE_CW | CIRCLE_ACW | COMP_DIS | COMP_L | COMP_R | FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE | ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON | LUBE_OFF | END_PROG | COMMENT | WS | SCAN_ERROR )
		int alt10=29;
		int LA10_0 = input.LA(1);
		if ( (LA10_0=='X') ) {
			int LA10_1 = input.LA(2);
			if ( (LA10_1=='-'||(LA10_1 >= '0' && LA10_1 <= '9')) ) {
				alt10=1;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='Y') ) {
			int LA10_2 = input.LA(2);
			if ( (LA10_2=='-'||(LA10_2 >= '0' && LA10_2 <= '9')) ) {
				alt10=2;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='Z') ) {
			int LA10_3 = input.LA(2);
			if ( (LA10_3=='-'||(LA10_3 >= '0' && LA10_3 <= '9')) ) {
				alt10=3;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='I') ) {
			int LA10_4 = input.LA(2);
			if ( (LA10_4=='-'||(LA10_4 >= '0' && LA10_4 <= '9')) ) {
				alt10=4;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='J') ) {
			int LA10_5 = input.LA(2);
			if ( (LA10_5=='-'||(LA10_5 >= '0' && LA10_5 <= '9')) ) {
				alt10=5;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='K') ) {
			int LA10_6 = input.LA(2);
			if ( (LA10_6=='-'||(LA10_6 >= '0' && LA10_6 <= '9')) ) {
				alt10=6;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='N') ) {
			int LA10_7 = input.LA(2);
			if ( ((LA10_7 >= '0' && LA10_7 <= '9')) ) {
				alt10=7;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='G') ) {
			switch ( input.LA(2) ) {
			case '9':
				{
				int LA10_23 = input.LA(3);
				if ( (LA10_23=='0') ) {
					alt10=8;
				}
				else if ( (LA10_23=='1') ) {
					alt10=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 23, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '0':
				{
				switch ( input.LA(3) ) {
				case '0':
					{
					alt10=10;
					}
					break;
				case '1':
					{
					alt10=11;
					}
					break;
				case '2':
					{
					alt10=12;
					}
					break;
				case '3':
					{
					alt10=13;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 24, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '4':
				{
				switch ( input.LA(3) ) {
				case '0':
					{
					alt10=14;
					}
					break;
				case '1':
					{
					alt10=15;
					}
					break;
				case '2':
					{
					alt10=16;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 25, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				alt10=29;
			}
		}
		else if ( (LA10_0=='F') ) {
			int LA10_9 = input.LA(2);
			if ( ((LA10_9 >= '1' && LA10_9 <= '9')) ) {
				alt10=17;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='S') ) {
			int LA10_10 = input.LA(2);
			if ( ((LA10_10 >= '1' && LA10_10 <= '9')) ) {
				alt10=18;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='T') ) {
			int LA10_11 = input.LA(2);
			if ( (LA10_11=='0') ) {
				alt10=19;
			}

			else {
				alt10=29;
			}

		}
		else if ( (LA10_0=='M') ) {
			switch ( input.LA(2) ) {
			case '0':
				{
				switch ( input.LA(3) ) {
				case '3':
					{
					alt10=20;
					}
					break;
				case '4':
					{
					alt10=21;
					}
					break;
				case '5':
					{
					alt10=22;
					}
					break;
				case '6':
					{
					alt10=23;
					}
					break;
				case '8':
					{
					alt10=24;
					}
					break;
				case '9':
					{
					alt10=25;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 29, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '3':
				{
				alt10=26;
				}
				break;
			default:
				alt10=29;
			}
		}
		else if ( (LA10_0=='/') ) {
			int LA10_13 = input.LA(2);
			if ( (LA10_13=='*'||LA10_13=='/') ) {
				alt10=27;
			}

			else {
				alt10=29;
			}

		}
		else if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
			alt10=28;
		}
		else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\b')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\u001F')||(LA10_0 >= '!' && LA10_0 <= '.')||(LA10_0 >= '0' && LA10_0 <= 'E')||LA10_0=='H'||LA10_0=='L'||(LA10_0 >= 'O' && LA10_0 <= 'R')||(LA10_0 >= 'U' && LA10_0 <= 'W')||(LA10_0 >= '[' && LA10_0 <= '\uFFFF')) ) {
			alt10=29;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 10, 0, input);
			throw nvae;
		}

		switch (alt10) {
			case 1 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:10: X_CORD
				{
				mX_CORD(); 

				}
				break;
			case 2 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:17: Y_CORD
				{
				mY_CORD(); 

				}
				break;
			case 3 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:24: Z_CORD
				{
				mZ_CORD(); 

				}
				break;
			case 4 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:31: I_CORD
				{
				mI_CORD(); 

				}
				break;
			case 5 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:38: J_CORD
				{
				mJ_CORD(); 

				}
				break;
			case 6 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:45: K_CORD
				{
				mK_CORD(); 

				}
				break;
			case 7 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:52: N_BLOCK
				{
				mN_BLOCK(); 

				}
				break;
			case 8 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:60: COORD_ABS
				{
				mCOORD_ABS(); 

				}
				break;
			case 9 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:70: COORD_REL
				{
				mCOORD_REL(); 

				}
				break;
			case 10 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:80: FREE_MOVE
				{
				mFREE_MOVE(); 

				}
				break;
			case 11 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:90: JOB_MOVE
				{
				mJOB_MOVE(); 

				}
				break;
			case 12 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:99: CIRCLE_CW
				{
				mCIRCLE_CW(); 

				}
				break;
			case 13 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:109: CIRCLE_ACW
				{
				mCIRCLE_ACW(); 

				}
				break;
			case 14 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:120: COMP_DIS
				{
				mCOMP_DIS(); 

				}
				break;
			case 15 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:129: COMP_L
				{
				mCOMP_L(); 

				}
				break;
			case 16 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:136: COMP_R
				{
				mCOMP_R(); 

				}
				break;
			case 17 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:143: FREE_MOVE_SPEED
				{
				mFREE_MOVE_SPEED(); 

				}
				break;
			case 18 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:159: JOB_MOVE_SPEED
				{
				mJOB_MOVE_SPEED(); 

				}
				break;
			case 19 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:174: TOOL_CHANGE
				{
				mTOOL_CHANGE(); 

				}
				break;
			case 20 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:186: ROT_TOOL_CW
				{
				mROT_TOOL_CW(); 

				}
				break;
			case 21 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:198: ROT_TOOL_ACW
				{
				mROT_TOOL_ACW(); 

				}
				break;
			case 22 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:211: STOP_TOOL
				{
				mSTOP_TOOL(); 

				}
				break;
			case 23 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:221: CHANGE_TOOL
				{
				mCHANGE_TOOL(); 

				}
				break;
			case 24 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:233: LUBE_ON
				{
				mLUBE_ON(); 

				}
				break;
			case 25 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:241: LUBE_OFF
				{
				mLUBE_OFF(); 

				}
				break;
			case 26 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:250: END_PROG
				{
				mEND_PROG(); 

				}
				break;
			case 27 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:259: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 28 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:267: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:270: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
