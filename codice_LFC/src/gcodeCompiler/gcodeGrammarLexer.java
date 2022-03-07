// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2022-03-07 20:48:02

package gcodeCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gcodeGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CHANGE_TOOL=4;
	public static final int CIRCLE_ACW=5;
	public static final int CIRCLE_CW=6;
	public static final int COMP_DIS=7;
	public static final int COMP_L=8;
	public static final int COMP_R=9;
	public static final int COORD_ABS=10;
	public static final int COORD_REL=11;
	public static final int CORD_DIGIT=12;
	public static final int DIGIT=13;
	public static final int END_PROG=14;
	public static final int FREE_MOVE=15;
	public static final int FREE_MOVE_SPEED=16;
	public static final int I_CORD=17;
	public static final int JOB_MOVE=18;
	public static final int JOB_MOVE_SPEED=19;
	public static final int J_CORD=20;
	public static final int K_CORD=21;
	public static final int LUBE_OFF=22;
	public static final int LUBE_ON=23;
	public static final int N_BLOCK=24;
	public static final int ROT_TOOL_ACW=25;
	public static final int ROT_TOOL_CW=26;
	public static final int SCAN_ERROR=27;
	public static final int STOP_TOOL=28;
	public static final int TOOL_CHANGE=29;
	public static final int WS=30;
	public static final int X_CORD=31;
	public static final int Y_CORD=32;
	public static final int Z_CORD=33;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public gcodeGrammarLexer() {} 
	public gcodeGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public gcodeGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g"; }

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:170:2: ( '0' .. '9' )
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

	// $ANTLR start "CORD_DIGIT"
	public final void mCORD_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:175:2: ( ( '-' )? ( DIGIT )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:175:4: ( '-' )? ( DIGIT )+
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:175:4: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:175:5: '-'
					{
					match('-'); 
					}
					break;

			}

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:175:10: ( DIGIT )+
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

	// $ANTLR start "X_CORD"
	public final void mX_CORD() throws RecognitionException {
		try {
			int _type = X_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:180:2: ( 'X' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:180:4: 'X' CORD_DIGIT
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

	// $ANTLR start "Y_CORD"
	public final void mY_CORD() throws RecognitionException {
		try {
			int _type = Y_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:185:2: ( 'Y' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:185:4: 'Y' CORD_DIGIT
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

	// $ANTLR start "Z_CORD"
	public final void mZ_CORD() throws RecognitionException {
		try {
			int _type = Z_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:190:2: ( 'Z' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:190:4: 'Z' CORD_DIGIT
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

	// $ANTLR start "I_CORD"
	public final void mI_CORD() throws RecognitionException {
		try {
			int _type = I_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:195:2: ( 'I' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:195:4: 'I' CORD_DIGIT
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

	// $ANTLR start "J_CORD"
	public final void mJ_CORD() throws RecognitionException {
		try {
			int _type = J_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:200:2: ( 'J' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:200:4: 'J' CORD_DIGIT
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

	// $ANTLR start "K_CORD"
	public final void mK_CORD() throws RecognitionException {
		try {
			int _type = K_CORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:205:2: ( 'K' CORD_DIGIT )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:205:4: 'K' CORD_DIGIT
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

	// $ANTLR start "N_BLOCK"
	public final void mN_BLOCK() throws RecognitionException {
		try {
			int _type = N_BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:210:2: ( 'N' ( '1' .. '9' ) ( DIGIT )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:210:4: 'N' ( '1' .. '9' ) ( DIGIT )*
			{
			match('N'); 
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:210:20: ( DIGIT )*
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

	// $ANTLR start "COORD_ABS"
	public final void mCOORD_ABS() throws RecognitionException {
		try {
			int _type = COORD_ABS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:215:2: ( 'G90' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:215:4: 'G90'
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

	// $ANTLR start "COORD_REL"
	public final void mCOORD_REL() throws RecognitionException {
		try {
			int _type = COORD_REL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:220:2: ( 'G91' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:220:4: 'G91'
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

	// $ANTLR start "FREE_MOVE"
	public final void mFREE_MOVE() throws RecognitionException {
		try {
			int _type = FREE_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:225:2: ( 'G00' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:225:4: 'G00'
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

	// $ANTLR start "JOB_MOVE"
	public final void mJOB_MOVE() throws RecognitionException {
		try {
			int _type = JOB_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:230:2: ( 'G01' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:230:4: 'G01'
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

	// $ANTLR start "CIRCLE_CW"
	public final void mCIRCLE_CW() throws RecognitionException {
		try {
			int _type = CIRCLE_CW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:235:2: ( 'G02' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:235:4: 'G02'
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

	// $ANTLR start "CIRCLE_ACW"
	public final void mCIRCLE_ACW() throws RecognitionException {
		try {
			int _type = CIRCLE_ACW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:241:2: ( 'G03' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:241:4: 'G03'
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

	// $ANTLR start "COMP_DIS"
	public final void mCOMP_DIS() throws RecognitionException {
		try {
			int _type = COMP_DIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:247:2: ( 'G40' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:247:4: 'G40'
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

	// $ANTLR start "COMP_L"
	public final void mCOMP_L() throws RecognitionException {
		try {
			int _type = COMP_L;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:252:2: ( 'G41' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:252:4: 'G41'
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

	// $ANTLR start "COMP_R"
	public final void mCOMP_R() throws RecognitionException {
		try {
			int _type = COMP_R;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:257:2: ( 'G42' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:257:4: 'G42'
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

	// $ANTLR start "FREE_MOVE_SPEED"
	public final void mFREE_MOVE_SPEED() throws RecognitionException {
		try {
			int _type = FREE_MOVE_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:262:2: ( 'F' ( '1' .. '9' ) ( DIGIT )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:262:4: 'F' ( '1' .. '9' ) ( DIGIT )*
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
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:262:20: ( DIGIT )*
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

	// $ANTLR start "JOB_MOVE_SPEED"
	public final void mJOB_MOVE_SPEED() throws RecognitionException {
		try {
			int _type = JOB_MOVE_SPEED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:267:2: ( 'S' ( '1' .. '9' ) ( DIGIT )* )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:267:4: 'S' ( '1' .. '9' ) ( DIGIT )*
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
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:267:20: ( DIGIT )*
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

	// $ANTLR start "TOOL_CHANGE"
	public final void mTOOL_CHANGE() throws RecognitionException {
		try {
			int _type = TOOL_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:272:2: ( 'T0' ( '1' .. '9' ) '0' ( '1' .. '9' ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:272:4: 'T0' ( '1' .. '9' ) '0' ( '1' .. '9' )
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

	// $ANTLR start "ROT_TOOL_CW"
	public final void mROT_TOOL_CW() throws RecognitionException {
		try {
			int _type = ROT_TOOL_CW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:277:2: ( 'M03' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:277:4: 'M03'
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

	// $ANTLR start "ROT_TOOL_ACW"
	public final void mROT_TOOL_ACW() throws RecognitionException {
		try {
			int _type = ROT_TOOL_ACW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:282:2: ( 'M04' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:282:4: 'M04'
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

	// $ANTLR start "STOP_TOOL"
	public final void mSTOP_TOOL() throws RecognitionException {
		try {
			int _type = STOP_TOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:287:2: ( 'M05' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:287:4: 'M05'
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

	// $ANTLR start "CHANGE_TOOL"
	public final void mCHANGE_TOOL() throws RecognitionException {
		try {
			int _type = CHANGE_TOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:292:2: ( 'M06' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:292:4: 'M06'
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

	// $ANTLR start "LUBE_ON"
	public final void mLUBE_ON() throws RecognitionException {
		try {
			int _type = LUBE_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:297:2: ( 'M08' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:297:4: 'M08'
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

	// $ANTLR start "LUBE_OFF"
	public final void mLUBE_OFF() throws RecognitionException {
		try {
			int _type = LUBE_OFF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:302:2: ( 'M09' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:302:4: 'M09'
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

	// $ANTLR start "END_PROG"
	public final void mEND_PROG() throws RecognitionException {
		try {
			int _type = END_PROG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:307:2: ( 'M30' )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:307:4: 'M30'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:313:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:313:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:320:12: ( . )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:320:14: .
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

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:8: ( X_CORD | Y_CORD | Z_CORD | I_CORD | J_CORD | K_CORD | N_BLOCK | COORD_ABS | COORD_REL | FREE_MOVE | JOB_MOVE | CIRCLE_CW | CIRCLE_ACW | COMP_DIS | COMP_L | COMP_R | FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE | ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON | LUBE_OFF | END_PROG | WS | SCAN_ERROR )
		int alt6=28;
		int LA6_0 = input.LA(1);
		if ( (LA6_0=='X') ) {
			int LA6_1 = input.LA(2);
			if ( (LA6_1=='-'||(LA6_1 >= '0' && LA6_1 <= '9')) ) {
				alt6=1;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='Y') ) {
			int LA6_2 = input.LA(2);
			if ( (LA6_2=='-'||(LA6_2 >= '0' && LA6_2 <= '9')) ) {
				alt6=2;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='Z') ) {
			int LA6_3 = input.LA(2);
			if ( (LA6_3=='-'||(LA6_3 >= '0' && LA6_3 <= '9')) ) {
				alt6=3;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='I') ) {
			int LA6_4 = input.LA(2);
			if ( (LA6_4=='-'||(LA6_4 >= '0' && LA6_4 <= '9')) ) {
				alt6=4;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='J') ) {
			int LA6_5 = input.LA(2);
			if ( (LA6_5=='-'||(LA6_5 >= '0' && LA6_5 <= '9')) ) {
				alt6=5;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='K') ) {
			int LA6_6 = input.LA(2);
			if ( (LA6_6=='-'||(LA6_6 >= '0' && LA6_6 <= '9')) ) {
				alt6=6;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='N') ) {
			int LA6_7 = input.LA(2);
			if ( ((LA6_7 >= '1' && LA6_7 <= '9')) ) {
				alt6=7;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='G') ) {
			switch ( input.LA(2) ) {
			case '9':
				{
				int LA6_22 = input.LA(3);
				if ( (LA6_22=='0') ) {
					alt6=8;
				}
				else if ( (LA6_22=='1') ) {
					alt6=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 22, input);
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
					alt6=10;
					}
					break;
				case '1':
					{
					alt6=11;
					}
					break;
				case '2':
					{
					alt6=12;
					}
					break;
				case '3':
					{
					alt6=13;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 23, input);
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
					alt6=14;
					}
					break;
				case '1':
					{
					alt6=15;
					}
					break;
				case '2':
					{
					alt6=16;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 24, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				alt6=28;
			}
		}
		else if ( (LA6_0=='F') ) {
			int LA6_9 = input.LA(2);
			if ( ((LA6_9 >= '1' && LA6_9 <= '9')) ) {
				alt6=17;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='S') ) {
			int LA6_10 = input.LA(2);
			if ( ((LA6_10 >= '1' && LA6_10 <= '9')) ) {
				alt6=18;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='T') ) {
			int LA6_11 = input.LA(2);
			if ( (LA6_11=='0') ) {
				alt6=19;
			}

			else {
				alt6=28;
			}

		}
		else if ( (LA6_0=='M') ) {
			switch ( input.LA(2) ) {
			case '0':
				{
				switch ( input.LA(3) ) {
				case '3':
					{
					alt6=20;
					}
					break;
				case '4':
					{
					alt6=21;
					}
					break;
				case '5':
					{
					alt6=22;
					}
					break;
				case '6':
					{
					alt6=23;
					}
					break;
				case '8':
					{
					alt6=24;
					}
					break;
				case '9':
					{
					alt6=25;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 28, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '3':
				{
				alt6=26;
				}
				break;
			default:
				alt6=28;
			}
		}
		else if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
			alt6=27;
		}
		else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\b')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\u001F')||(LA6_0 >= '!' && LA6_0 <= 'E')||LA6_0=='H'||LA6_0=='L'||(LA6_0 >= 'O' && LA6_0 <= 'R')||(LA6_0 >= 'U' && LA6_0 <= 'W')||(LA6_0 >= '[' && LA6_0 <= '\uFFFF')) ) {
			alt6=28;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}

		switch (alt6) {
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
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:259: WS
				{
				mWS(); 

				}
				break;
			case 28 :
				// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:1:262: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
