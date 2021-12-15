// $ANTLR 3.5.1 C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g 2021-12-15 14:00:06

package javaCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gcodeGrammar extends Lexer {
	public static final int EOF=-1;
	public static final int CIRCLE_ACW=4;
	public static final int CIRCLE_CW=5;
	public static final int COMMENT=6;
	public static final int COMP_DIS=7;
	public static final int COMP_L=8;
	public static final int COMP_R=9;
	public static final int COORD_ABS=10;
	public static final int COORD_REL=11;
	public static final int FREE_MOVE=12;
	public static final int FREE_MOVE_SPEED=13;
	public static final int JOB_MOVE=14;
	public static final int JOB_MOVE_SPEED=15;
	public static final int N_BLOCK=16;
	public static final int WS=17;




	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public gcodeGrammar() {} 
	public gcodeGrammar(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public gcodeGrammar(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g"; }

	// $ANTLR start "N_BLOCK"
	public final void mN_BLOCK() throws RecognitionException {
		try {
			int _type = N_BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:17:2: ( 'N' ( '1' .. '9' ) ( '0' .. '9' )* )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:17:4: 'N' ( '1' .. '9' ) ( '0' .. '9' )*
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:17:20: ( '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:
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
					break loop1;
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:21:2: ( 'G90' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:21:4: 'G90'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:25:2: ( 'G91' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:25:4: 'G91'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:29:2: ( 'G00' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:29:4: 'G00'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:33:2: ( 'G01' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:33:4: 'G01'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:37:2: ( 'G02' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:37:4: 'G02'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:41:2: ( 'G03' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:41:4: 'G03'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:45:2: ( 'G40' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:45:4: 'G40'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:49:2: ( 'G41' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:49:4: 'G41'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:53:2: ( 'G42' )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:53:4: 'G42'
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:57:2: ( 'F' ( '1' .. '9' ) ( '0' .. '9' )* )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:57:4: 'F' ( '1' .. '9' ) ( '0' .. '9' )*
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:57:20: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:
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
					break loop2;
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:61:2: ( 'S' ( '1' .. '9' ) ( '0' .. '9' )* )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:61:4: 'S' ( '1' .. '9' ) ( '0' .. '9' )*
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
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:61:20: ( '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:
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
	// $ANTLR end "JOB_MOVE_SPEED"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:65:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='/') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='/') ) {
					alt7=1;
				}
				else if ( (LA7_1=='*') ) {
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
					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:65:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:65:14: (~ ( '\\n' | '\\r' ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:
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
							break loop4;
						}
					}

					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:65:28: ( '\\r' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\r') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:65:28: '\\r'
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
					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:66:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:66:14: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='*') ) {
							int LA6_1 = input.LA(2);
							if ( (LA6_1=='/') ) {
								alt6=2;
							}
							else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
								alt6=1;
							}

						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:66:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:69:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:69:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:8: ( N_BLOCK | COORD_ABS | COORD_REL | FREE_MOVE | JOB_MOVE | CIRCLE_CW | CIRCLE_ACW | COMP_DIS | COMP_L | COMP_R | FREE_MOVE_SPEED | JOB_MOVE_SPEED | COMMENT | WS )
		int alt8=14;
		switch ( input.LA(1) ) {
		case 'N':
			{
			alt8=1;
			}
			break;
		case 'G':
			{
			switch ( input.LA(2) ) {
			case '9':
				{
				int LA8_7 = input.LA(3);
				if ( (LA8_7=='0') ) {
					alt8=2;
				}
				else if ( (LA8_7=='1') ) {
					alt8=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 7, input);
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
					alt8=4;
					}
					break;
				case '1':
					{
					alt8=5;
					}
					break;
				case '2':
					{
					alt8=6;
					}
					break;
				case '3':
					{
					alt8=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 8, input);
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
					alt8=8;
					}
					break;
				case '1':
					{
					alt8=9;
					}
					break;
				case '2':
					{
					alt8=10;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 9, input);
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
					NoViableAltException nvae =
						new NoViableAltException("", 8, 2, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
			}
			break;
		case 'F':
			{
			alt8=11;
			}
			break;
		case 'S':
			{
			alt8=12;
			}
			break;
		case '/':
			{
			alt8=13;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt8=14;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:10: N_BLOCK
				{
				mN_BLOCK(); 

				}
				break;
			case 2 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:18: COORD_ABS
				{
				mCOORD_ABS(); 

				}
				break;
			case 3 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:28: COORD_REL
				{
				mCOORD_REL(); 

				}
				break;
			case 4 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:38: FREE_MOVE
				{
				mFREE_MOVE(); 

				}
				break;
			case 5 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:48: JOB_MOVE
				{
				mJOB_MOVE(); 

				}
				break;
			case 6 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:57: CIRCLE_CW
				{
				mCIRCLE_CW(); 

				}
				break;
			case 7 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:67: CIRCLE_ACW
				{
				mCIRCLE_ACW(); 

				}
				break;
			case 8 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:78: COMP_DIS
				{
				mCOMP_DIS(); 

				}
				break;
			case 9 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:87: COMP_L
				{
				mCOMP_L(); 

				}
				break;
			case 10 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:94: COMP_R
				{
				mCOMP_R(); 

				}
				break;
			case 11 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:101: FREE_MOVE_SPEED
				{
				mFREE_MOVE_SPEED(); 

				}
				break;
			case 12 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:117: JOB_MOVE_SPEED
				{
				mJOB_MOVE_SPEED(); 

				}
				break;
			case 13 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:132: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 14 :
				// C:\\Users\\ghisl\\Desktop\\gcodeGrammar.g:1:140: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
