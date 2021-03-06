// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g 2022-03-16 18:50:38

package shaperCompiler;

import java.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class shaperGrammarLexer.
 */
@SuppressWarnings("all")
public class shaperGrammarLexer extends Lexer {
	
	/** The Constant EOF. */
	public static final int EOF=-1;
	
	/** The Constant CB. */
	public static final int CB=4;
	
	/** The Constant CIRCLE. */
	public static final int CIRCLE=5;
	
	/** The Constant CIRCLE_C. */
	public static final int CIRCLE_C=6;
	
	/** The Constant CIRCLE_R. */
	public static final int CIRCLE_R=7;
	
	/** The Constant COMMENT. */
	public static final int COMMENT=8;
	
	/** The Constant CONFIG. */
	public static final int CONFIG=9;
	
	/** The Constant DIGIT. */
	public static final int DIGIT=10;
	
	/** The Constant JOB_SPEED. */
	public static final int JOB_SPEED=11;
	
	/** The Constant LUBE_SET. */
	public static final int LUBE_SET=12;
	
	/** The Constant MOVE_SPEED. */
	public static final int MOVE_SPEED=13;
	
	/** The Constant OB. */
	public static final int OB=14;
	
	/** The Constant ON_OFF. */
	public static final int ON_OFF=15;
	
	/** The Constant P1. */
	public static final int P1=16;
	
	/** The Constant P2. */
	public static final int P2=17;
	
	/** The Constant P3. */
	public static final int P3=18;
	
	/** The Constant RECTANGLE. */
	public static final int RECTANGLE=19;
	
	/** The Constant RECTANGLE_B. */
	public static final int RECTANGLE_B=20;
	
	/** The Constant RECTANGLE_H. */
	public static final int RECTANGLE_H=21;
	
	/** The Constant RECTANGLE_P. */
	public static final int RECTANGLE_P=22;
	
	/** The Constant SCAN_ERROR. */
	public static final int SCAN_ERROR=23;
	
	/** The Constant SQUARE. */
	public static final int SQUARE=24;
	
	/** The Constant SQUARE_CONFIG. */
	public static final int SQUARE_CONFIG=25;
	
	/** The Constant SQUARE_L. */
	public static final int SQUARE_L=26;
	
	/** The Constant TRIANGLE. */
	public static final int TRIANGLE=27;
	
	/** The Constant WS. */
	public static final int WS=28;
	
	/** The Constant X_CORD. */
	public static final int X_CORD=29;
	
	/** The Constant Y_CORD. */
	public static final int Y_CORD=30;

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
	 * Instantiates a new shaper grammar lexer.
	 */
	public shaperGrammarLexer() {} 
	
	/**
	 * Instantiates a new shaper grammar lexer.
	 *
	 * @param input the input
	 */
	public shaperGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	
	/**
	 * Instantiates a new shaper grammar lexer.
	 *
	 * @param input the input
	 * @param state the state
	 */
	public shaperGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	
	/**
	 * Gets the grammar file name.
	 *
	 * @return the grammar file name
	 */
	@Override public String getGrammarFileName() { return "C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g"; }

	/**
	 * M CIRCLE.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CIRCLE"
	public final void mCIRCLE() throws RecognitionException {
		try {
			int _type = CIRCLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:113:2: ( 'CIRCLE' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:114:3: 'CIRCLE'
			{
			match("CIRCLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE"

	/**
	 * M SQUARE.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "SQUARE"
	public final void mSQUARE() throws RecognitionException {
		try {
			int _type = SQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:118:2: ( 'SQUARE' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:119:3: 'SQUARE'
			{
			match("SQUARE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUARE"

	/**
	 * M RECTANGLE.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "RECTANGLE"
	public final void mRECTANGLE() throws RecognitionException {
		try {
			int _type = RECTANGLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:123:2: ( 'RECTANGLE' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:124:3: 'RECTANGLE'
			{
			match("RECTANGLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECTANGLE"

	/**
	 * M TRIANGLE.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "TRIANGLE"
	public final void mTRIANGLE() throws RecognitionException {
		try {
			int _type = TRIANGLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:128:2: ( 'TRIANGLE' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:129:3: 'TRIANGLE'
			{
			match("TRIANGLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRIANGLE"

	/**
	 * M CIRCL E C.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CIRCLE_C"
	public final void mCIRCLE_C() throws RecognitionException {
		try {
			int _type = CIRCLE_C;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:134:2: ( 'C' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:135:3: 'C'
			{
			match('C'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE_C"

	/**
	 * M CIRCL E R.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CIRCLE_R"
	public final void mCIRCLE_R() throws RecognitionException {
		try {
			int _type = CIRCLE_R;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:139:2: ( 'R' ( DIGIT )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:140:3: 'R' ( DIGIT )+
			{
			match('R'); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:140:7: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE_R"

	/**
	 * M SQUAR E L.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "SQUARE_L"
	public final void mSQUARE_L() throws RecognitionException {
		try {
			int _type = SQUARE_L;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:144:2: ( 'L' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:145:3: 'L'
			{
			match('L'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUARE_L"

	/**
	 * M RECTANGL E P.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "RECTANGLE_P"
	public final void mRECTANGLE_P() throws RecognitionException {
		try {
			int _type = RECTANGLE_P;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:149:2: ( 'P' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:150:3: 'P'
			{
			match('P'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECTANGLE_P"

	/**
	 * M RECTANGL E B.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "RECTANGLE_B"
	public final void mRECTANGLE_B() throws RecognitionException {
		try {
			int _type = RECTANGLE_B;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:154:2: ( 'B' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:155:3: 'B'
			{
			match('B'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECTANGLE_B"

	/**
	 * M RECTANGL E H.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "RECTANGLE_H"
	public final void mRECTANGLE_H() throws RecognitionException {
		try {
			int _type = RECTANGLE_H;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:159:2: ( 'H' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:160:3: 'H'
			{
			match('H'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECTANGLE_H"

	/**
	 * M P 1.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "P1"
	public final void mP1() throws RecognitionException {
		try {
			int _type = P1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:164:2: ( 'P1' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:165:3: 'P1'
			{
			match("P1"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P1"

	/**
	 * M P 2.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "P2"
	public final void mP2() throws RecognitionException {
		try {
			int _type = P2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:169:2: ( 'P2' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:170:3: 'P2'
			{
			match("P2"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P2"

	/**
	 * M P 3.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "P3"
	public final void mP3() throws RecognitionException {
		try {
			int _type = P3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:174:2: ( 'P3' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:175:3: 'P3'
			{
			match("P3"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P3"

	/**
	 * M SQUAR E CONFIG.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "SQUARE_CONFIG"
	public final void mSQUARE_CONFIG() throws RecognitionException {
		try {
			int _type = SQUARE_CONFIG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:179:2: ( 'UP' | 'DOWN' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='U') ) {
				alt2=1;
			}
			else if ( (LA2_0=='D') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:180:3: 'UP'
					{
					match("UP"); 

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:181:4: 'DOWN'
					{
					match("DOWN"); 

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
	// $ANTLR end "SQUARE_CONFIG"

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
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:186:2: ( 'X' ( DIGIT )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:187:3: 'X' ( DIGIT )+
			{
			match('X'); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:187:7: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

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
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:192:2: ( 'Y' ( DIGIT )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:193:3: 'Y' ( DIGIT )+
			{
			match('Y'); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:193:7: ( DIGIT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

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
	 * M CONFIG.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CONFIG"
	public final void mCONFIG() throws RecognitionException {
		try {
			int _type = CONFIG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:198:2: ( 'CONFIGURATION' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:199:3: 'CONFIGURATION'
			{
			match("CONFIGURATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONFIG"

	/**
	 * M MOV E SPEED.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "MOVE_SPEED"
	public final void mMOVE_SPEED() throws RecognitionException {
		try {
			int _type = MOVE_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:203:2: ( 'MS' ( DIGIT )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:204:3: 'MS' ( DIGIT )+
			{
			match("MS"); 

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:204:8: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOVE_SPEED"

	/**
	 * M JO B SPEED.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "JOB_SPEED"
	public final void mJOB_SPEED() throws RecognitionException {
		try {
			int _type = JOB_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:208:2: ( 'JS' ( DIGIT )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:209:3: 'JS' ( DIGIT )+
			{
			match("JS"); 

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:209:8: ( DIGIT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOB_SPEED"

	/**
	 * M LUB E SET.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "LUBE_SET"
	public final void mLUBE_SET() throws RecognitionException {
		try {
			int _type = LUBE_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:213:2: ( 'LB' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:214:3: 'LB'
			{
			match("LB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LUBE_SET"

	/**
	 * M O N OFF.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "ON_OFF"
	public final void mON_OFF() throws RecognitionException {
		try {
			int _type = ON_OFF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:218:2: ( 'ON' | 'OFF' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='O') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='N') ) {
					alt7=1;
				}
				else if ( (LA7_1=='F') ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:219:3: 'ON'
					{
					match("ON"); 

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:220:4: 'OFF'
					{
					match("OFF"); 

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
	// $ANTLR end "ON_OFF"

	/**
	 * M OB.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "OB"
	public final void mOB() throws RecognitionException {
		try {
			int _type = OB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:224:2: ( '(' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:225:3: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OB"

	/**
	 * M CB.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "CB"
	public final void mCB() throws RecognitionException {
		try {
			int _type = CB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:229:2: ( ')' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:230:3: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CB"

	/**
	 * M DIGIT.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:236:2: ( '0' .. '9' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:
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
	 * M COMMENT.
	 *
	 * @throws RecognitionException the recognition exception
	 */
	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:242:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='/') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='/') ) {
					alt11=1;
				}
				else if ( (LA11_1=='*') ) {
					alt11=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:242:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:242:14: (~ ( '\\n' | '\\r' ) )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:
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
							break loop8;
						}
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:242:28: ( '\\r' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='\r') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:242:28: '\\r'
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:243:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:243:14: ( options {greedy=false; } : . )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0=='*') ) {
							int LA10_1 = input.LA(2);
							if ( (LA10_1=='/') ) {
								alt10=2;
							}
							else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
								alt10=1;
							}

						}
						else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:243:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop10;
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
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:247:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:247:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:255:2: ( . )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:256:3: .
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
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:8: ( CIRCLE | SQUARE | RECTANGLE | TRIANGLE | CIRCLE_C | CIRCLE_R | SQUARE_L | RECTANGLE_P | RECTANGLE_B | RECTANGLE_H | P1 | P2 | P3 | SQUARE_CONFIG | X_CORD | Y_CORD | CONFIG | MOVE_SPEED | JOB_SPEED | LUBE_SET | ON_OFF | OB | CB | COMMENT | WS | SCAN_ERROR )
		int alt12=26;
		int LA12_0 = input.LA(1);
		if ( (LA12_0=='C') ) {
			switch ( input.LA(2) ) {
			case 'I':
				{
				alt12=1;
				}
				break;
			case 'O':
				{
				alt12=17;
				}
				break;
			default:
				alt12=5;
			}
		}
		else if ( (LA12_0=='S') ) {
			int LA12_2 = input.LA(2);
			if ( (LA12_2=='Q') ) {
				alt12=2;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='R') ) {
			switch ( input.LA(2) ) {
			case 'E':
				{
				alt12=3;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt12=6;
				}
				break;
			default:
				alt12=26;
			}
		}
		else if ( (LA12_0=='T') ) {
			int LA12_4 = input.LA(2);
			if ( (LA12_4=='R') ) {
				alt12=4;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='L') ) {
			int LA12_5 = input.LA(2);
			if ( (LA12_5=='B') ) {
				alt12=20;
			}

			else {
				alt12=7;
			}

		}
		else if ( (LA12_0=='P') ) {
			switch ( input.LA(2) ) {
			case '1':
				{
				alt12=11;
				}
				break;
			case '2':
				{
				alt12=12;
				}
				break;
			case '3':
				{
				alt12=13;
				}
				break;
			default:
				alt12=8;
			}
		}
		else if ( (LA12_0=='B') ) {
			alt12=9;
		}
		else if ( (LA12_0=='H') ) {
			alt12=10;
		}
		else if ( (LA12_0=='U') ) {
			int LA12_9 = input.LA(2);
			if ( (LA12_9=='P') ) {
				alt12=14;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='D') ) {
			int LA12_10 = input.LA(2);
			if ( (LA12_10=='O') ) {
				alt12=14;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='X') ) {
			int LA12_11 = input.LA(2);
			if ( ((LA12_11 >= '0' && LA12_11 <= '9')) ) {
				alt12=15;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='Y') ) {
			int LA12_12 = input.LA(2);
			if ( ((LA12_12 >= '0' && LA12_12 <= '9')) ) {
				alt12=16;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='M') ) {
			int LA12_13 = input.LA(2);
			if ( (LA12_13=='S') ) {
				alt12=18;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='J') ) {
			int LA12_14 = input.LA(2);
			if ( (LA12_14=='S') ) {
				alt12=19;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='O') ) {
			int LA12_15 = input.LA(2);
			if ( (LA12_15=='F'||LA12_15=='N') ) {
				alt12=21;
			}

			else {
				alt12=26;
			}

		}
		else if ( (LA12_0=='(') ) {
			alt12=22;
		}
		else if ( (LA12_0==')') ) {
			alt12=23;
		}
		else if ( (LA12_0=='/') ) {
			int LA12_18 = input.LA(2);
			if ( (LA12_18=='*'||LA12_18=='/') ) {
				alt12=24;
			}

			else {
				alt12=26;
			}

		}
		else if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
			alt12=25;
		}
		else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\b')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\u001F')||(LA12_0 >= '!' && LA12_0 <= '\'')||(LA12_0 >= '*' && LA12_0 <= '.')||(LA12_0 >= '0' && LA12_0 <= 'A')||(LA12_0 >= 'E' && LA12_0 <= 'G')||LA12_0=='I'||LA12_0=='K'||LA12_0=='N'||LA12_0=='Q'||(LA12_0 >= 'V' && LA12_0 <= 'W')||(LA12_0 >= 'Z' && LA12_0 <= '\uFFFF')) ) {
			alt12=26;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 12, 0, input);
			throw nvae;
		}

		switch (alt12) {
			case 1 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:10: CIRCLE
				{
				mCIRCLE(); 

				}
				break;
			case 2 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:17: SQUARE
				{
				mSQUARE(); 

				}
				break;
			case 3 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:24: RECTANGLE
				{
				mRECTANGLE(); 

				}
				break;
			case 4 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:34: TRIANGLE
				{
				mTRIANGLE(); 

				}
				break;
			case 5 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:43: CIRCLE_C
				{
				mCIRCLE_C(); 

				}
				break;
			case 6 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:52: CIRCLE_R
				{
				mCIRCLE_R(); 

				}
				break;
			case 7 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:61: SQUARE_L
				{
				mSQUARE_L(); 

				}
				break;
			case 8 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:70: RECTANGLE_P
				{
				mRECTANGLE_P(); 

				}
				break;
			case 9 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:82: RECTANGLE_B
				{
				mRECTANGLE_B(); 

				}
				break;
			case 10 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:94: RECTANGLE_H
				{
				mRECTANGLE_H(); 

				}
				break;
			case 11 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:106: P1
				{
				mP1(); 

				}
				break;
			case 12 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:109: P2
				{
				mP2(); 

				}
				break;
			case 13 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:112: P3
				{
				mP3(); 

				}
				break;
			case 14 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:115: SQUARE_CONFIG
				{
				mSQUARE_CONFIG(); 

				}
				break;
			case 15 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:129: X_CORD
				{
				mX_CORD(); 

				}
				break;
			case 16 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:136: Y_CORD
				{
				mY_CORD(); 

				}
				break;
			case 17 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:143: CONFIG
				{
				mCONFIG(); 

				}
				break;
			case 18 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:150: MOVE_SPEED
				{
				mMOVE_SPEED(); 

				}
				break;
			case 19 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:161: JOB_SPEED
				{
				mJOB_SPEED(); 

				}
				break;
			case 20 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:171: LUBE_SET
				{
				mLUBE_SET(); 

				}
				break;
			case 21 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:180: ON_OFF
				{
				mON_OFF(); 

				}
				break;
			case 22 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:187: OB
				{
				mOB(); 

				}
				break;
			case 23 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:190: CB
				{
				mCB(); 

				}
				break;
			case 24 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:193: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 25 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:201: WS
				{
				mWS(); 

				}
				break;
			case 26 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:1:204: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
