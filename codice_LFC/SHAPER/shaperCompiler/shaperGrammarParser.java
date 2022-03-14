// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g 2022-03-14 20:20:13

package shaperCompiler;

import shaperCompiler.shaperGrammarHandler;
import shaperCompiler.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class shaperGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CB", "CIRCLE", "CIRCLE_C", "CIRCLE_R", 
		"COMMENT", "CONFIG", "DIGIT", "JOB_SPEED", "LUBE_SET", "MOVE_SPEED", "OB", 
		"ON_OFF", "P1", "P2", "P3", "RECTANGLE", "RECTANGLE_B", "RECTANGLE_H", 
		"RECTANGLE_P", "SCAN_ERROR", "SQUARE", "SQUARE_CONFIG", "SQUARE_L", "TRIANGLE", 
		"WS", "X_CORD", "Y_CORD"
	};
	public static final int EOF=-1;
	public static final int CB=4;
	public static final int CIRCLE=5;
	public static final int CIRCLE_C=6;
	public static final int CIRCLE_R=7;
	public static final int COMMENT=8;
	public static final int CONFIG=9;
	public static final int DIGIT=10;
	public static final int JOB_SPEED=11;
	public static final int LUBE_SET=12;
	public static final int MOVE_SPEED=13;
	public static final int OB=14;
	public static final int ON_OFF=15;
	public static final int P1=16;
	public static final int P2=17;
	public static final int P3=18;
	public static final int RECTANGLE=19;
	public static final int RECTANGLE_B=20;
	public static final int RECTANGLE_H=21;
	public static final int RECTANGLE_P=22;
	public static final int SCAN_ERROR=23;
	public static final int SQUARE=24;
	public static final int SQUARE_CONFIG=25;
	public static final int SQUARE_L=26;
	public static final int TRIANGLE=27;
	public static final int WS=28;
	public static final int X_CORD=29;
	public static final int Y_CORD=30;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public shaperGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public shaperGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return shaperGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g"; }


	shaperGrammarHandler h;

	 public shaperGrammarParser(String fileIn) throws FileNotFoundException, IOException {		
		this(new CommonTokenStream(
			new shaperGrammarLexer(
				new ANTLRReaderStream(
					new FileReader(fileIn)))));
	}

	void setup () {
		h = new shaperGrammarHandler(input);
	}

	public shaperGrammarHandler getHandler() {
		return h;
	}

	public List<ShaperError> getErrorList () {
	  return h.getErrorList();
	}

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		
		// gestione degli errori sintattici
		h.handleError(tokenNames, e, hdr, msg);
	}



	// $ANTLR start "shaper"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:56:1: shaper : ( circle | square | rectangle | triangle ) configuration EOF ;
	public final void shaper() throws RecognitionException {
		 setup(); 
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:58:2: ( ( circle | square | rectangle | triangle ) configuration EOF )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:3: ( circle | square | rectangle | triangle ) configuration EOF
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:3: ( circle | square | rectangle | triangle )
			int alt1=4;
			switch ( input.LA(1) ) {
			case CIRCLE:
				{
				alt1=1;
				}
				break;
			case SQUARE:
				{
				alt1=2;
				}
				break;
			case RECTANGLE:
				{
				alt1=3;
				}
				break;
			case TRIANGLE:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:4: circle
					{
					pushFollow(FOLLOW_circle_in_shaper61);
					circle();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:13: square
					{
					pushFollow(FOLLOW_square_in_shaper65);
					square();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:22: rectangle
					{
					pushFollow(FOLLOW_rectangle_in_shaper69);
					rectangle();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:34: triangle
					{
					pushFollow(FOLLOW_triangle_in_shaper73);
					triangle();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_configuration_in_shaper78);
			configuration();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_shaper82); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shaper"



	// $ANTLR start "circle"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:64:1: circle : CIRCLE CIRCLE_C OB X_CORD CB OB Y_CORD CB CIRCLE_R ;
	public final void circle() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:65:2: ( CIRCLE CIRCLE_C OB X_CORD CB OB Y_CORD CB CIRCLE_R )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:66:3: CIRCLE CIRCLE_C OB X_CORD CB OB Y_CORD CB CIRCLE_R
			{
			match(input,CIRCLE,FOLLOW_CIRCLE_in_circle97); 
			match(input,CIRCLE_C,FOLLOW_CIRCLE_C_in_circle99); 
			match(input,OB,FOLLOW_OB_in_circle101); 
			match(input,X_CORD,FOLLOW_X_CORD_in_circle103); 
			match(input,CB,FOLLOW_CB_in_circle105); 
			match(input,OB,FOLLOW_OB_in_circle107); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_circle109); 
			match(input,CB,FOLLOW_CB_in_circle111); 
			match(input,CIRCLE_R,FOLLOW_CIRCLE_R_in_circle114); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "circle"



	// $ANTLR start "square"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:69:1: square : SQUARE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB SQUARE_CONFIG ;
	public final void square() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:70:2: ( SQUARE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB SQUARE_CONFIG )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:71:3: SQUARE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB SQUARE_CONFIG
			{
			match(input,SQUARE,FOLLOW_SQUARE_in_square129); 
			match(input,P1,FOLLOW_P1_in_square131); 
			match(input,OB,FOLLOW_OB_in_square133); 
			match(input,X_CORD,FOLLOW_X_CORD_in_square135); 
			match(input,CB,FOLLOW_CB_in_square137); 
			match(input,OB,FOLLOW_OB_in_square139); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_square141); 
			match(input,CB,FOLLOW_CB_in_square143); 
			match(input,P2,FOLLOW_P2_in_square145); 
			match(input,OB,FOLLOW_OB_in_square147); 
			match(input,X_CORD,FOLLOW_X_CORD_in_square149); 
			match(input,CB,FOLLOW_CB_in_square151); 
			match(input,OB,FOLLOW_OB_in_square153); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_square155); 
			match(input,CB,FOLLOW_CB_in_square157); 
			match(input,SQUARE_CONFIG,FOLLOW_SQUARE_CONFIG_in_square159); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "square"



	// $ANTLR start "rectangle"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:74:1: rectangle : RECTANGLE P1 OB X_CORD CB OB Y_CORD CB ( P2 | RECTANGLE_B ) OB X_CORD CB OB Y_CORD CB ( P3 | RECTANGLE_H ) OB X_CORD CB OB Y_CORD CB ;
	public final void rectangle() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:75:2: ( RECTANGLE P1 OB X_CORD CB OB Y_CORD CB ( P2 | RECTANGLE_B ) OB X_CORD CB OB Y_CORD CB ( P3 | RECTANGLE_H ) OB X_CORD CB OB Y_CORD CB )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:76:3: RECTANGLE P1 OB X_CORD CB OB Y_CORD CB ( P2 | RECTANGLE_B ) OB X_CORD CB OB Y_CORD CB ( P3 | RECTANGLE_H ) OB X_CORD CB OB Y_CORD CB
			{
			match(input,RECTANGLE,FOLLOW_RECTANGLE_in_rectangle174); 
			match(input,P1,FOLLOW_P1_in_rectangle176); 
			match(input,OB,FOLLOW_OB_in_rectangle178); 
			match(input,X_CORD,FOLLOW_X_CORD_in_rectangle180); 
			match(input,CB,FOLLOW_CB_in_rectangle182); 
			match(input,OB,FOLLOW_OB_in_rectangle184); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_rectangle186); 
			match(input,CB,FOLLOW_CB_in_rectangle188); 
			if ( input.LA(1)==P2||input.LA(1)==RECTANGLE_B ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,OB,FOLLOW_OB_in_rectangle198); 
			match(input,X_CORD,FOLLOW_X_CORD_in_rectangle200); 
			match(input,CB,FOLLOW_CB_in_rectangle202); 
			match(input,OB,FOLLOW_OB_in_rectangle204); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_rectangle206); 
			match(input,CB,FOLLOW_CB_in_rectangle208); 
			if ( input.LA(1)==P3||input.LA(1)==RECTANGLE_H ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,OB,FOLLOW_OB_in_rectangle218); 
			match(input,X_CORD,FOLLOW_X_CORD_in_rectangle220); 
			match(input,CB,FOLLOW_CB_in_rectangle222); 
			match(input,OB,FOLLOW_OB_in_rectangle224); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_rectangle226); 
			match(input,CB,FOLLOW_CB_in_rectangle228); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rectangle"



	// $ANTLR start "triangle"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:79:1: triangle : TRIANGLE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB P3 OB X_CORD CB OB Y_CORD CB ;
	public final void triangle() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:80:2: ( TRIANGLE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB P3 OB X_CORD CB OB Y_CORD CB )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:81:3: TRIANGLE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB P3 OB X_CORD CB OB Y_CORD CB
			{
			match(input,TRIANGLE,FOLLOW_TRIANGLE_in_triangle244); 
			match(input,P1,FOLLOW_P1_in_triangle246); 
			match(input,OB,FOLLOW_OB_in_triangle248); 
			match(input,X_CORD,FOLLOW_X_CORD_in_triangle250); 
			match(input,CB,FOLLOW_CB_in_triangle252); 
			match(input,OB,FOLLOW_OB_in_triangle254); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_triangle256); 
			match(input,CB,FOLLOW_CB_in_triangle258); 
			match(input,P2,FOLLOW_P2_in_triangle260); 
			match(input,OB,FOLLOW_OB_in_triangle262); 
			match(input,X_CORD,FOLLOW_X_CORD_in_triangle264); 
			match(input,CB,FOLLOW_CB_in_triangle266); 
			match(input,OB,FOLLOW_OB_in_triangle268); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_triangle270); 
			match(input,CB,FOLLOW_CB_in_triangle272); 
			match(input,P3,FOLLOW_P3_in_triangle274); 
			match(input,OB,FOLLOW_OB_in_triangle276); 
			match(input,X_CORD,FOLLOW_X_CORD_in_triangle278); 
			match(input,CB,FOLLOW_CB_in_triangle280); 
			match(input,OB,FOLLOW_OB_in_triangle282); 
			match(input,Y_CORD,FOLLOW_Y_CORD_in_triangle284); 
			match(input,CB,FOLLOW_CB_in_triangle286); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "triangle"



	// $ANTLR start "configuration"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:84:1: configuration : CONFIG ( ( MOVE_SPEED ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED ) ) | ( JOB_SPEED ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED ) ) | ( LUBE_SET ON_OFF ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED ) ) ) ;
	public final void configuration() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:85:2: ( CONFIG ( ( MOVE_SPEED ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED ) ) | ( JOB_SPEED ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED ) ) | ( LUBE_SET ON_OFF ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED ) ) ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:86:3: CONFIG ( ( MOVE_SPEED ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED ) ) | ( JOB_SPEED ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED ) ) | ( LUBE_SET ON_OFF ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED ) ) )
			{
			match(input,CONFIG,FOLLOW_CONFIG_in_configuration302); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:86:10: ( ( MOVE_SPEED ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED ) ) | ( JOB_SPEED ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED ) ) | ( LUBE_SET ON_OFF ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED ) ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case MOVE_SPEED:
				{
				alt5=1;
				}
				break;
			case JOB_SPEED:
				{
				alt5=2;
				}
				break;
			case LUBE_SET:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:87:9: ( MOVE_SPEED ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED ) )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:87:9: ( MOVE_SPEED ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED ) )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:87:12: MOVE_SPEED ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED )
					{
					match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration317); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:87:23: ( JOB_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF JOB_SPEED )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==JOB_SPEED) ) {
						alt2=1;
					}
					else if ( (LA2_0==LUBE_SET) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:88:18: JOB_SPEED LUBE_SET ON_OFF
							{
							match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration338); 
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration340); 
							match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration342); 
							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:89:19: LUBE_SET ON_OFF JOB_SPEED
							{
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration362); 
							match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration364); 
							match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration366); 
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:10: ( JOB_SPEED ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED ) )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:10: ( JOB_SPEED ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED ) )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:13: JOB_SPEED ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED )
					{
					match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration408); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:23: ( MOVE_SPEED LUBE_SET ON_OFF | LUBE_SET ON_OFF MOVE_SPEED )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==MOVE_SPEED) ) {
						alt3=1;
					}
					else if ( (LA3_0==LUBE_SET) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:93:18: MOVE_SPEED LUBE_SET ON_OFF
							{
							match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration429); 
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration431); 
							match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration433); 
							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:94:19: LUBE_SET ON_OFF MOVE_SPEED
							{
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration453); 
							match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration455); 
							match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration457); 
							}
							break;

					}

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:97:10: ( LUBE_SET ON_OFF ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED ) )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:97:10: ( LUBE_SET ON_OFF ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED ) )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:97:13: LUBE_SET ON_OFF ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED )
					{
					match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration499); 
					match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration501); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:97:29: ( JOB_SPEED MOVE_SPEED | MOVE_SPEED JOB_SPEED )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==JOB_SPEED) ) {
						alt4=1;
					}
					else if ( (LA4_0==MOVE_SPEED) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:98:20: JOB_SPEED MOVE_SPEED
							{
							match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration524); 
							match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration526); 
							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:99:21: MOVE_SPEED JOB_SPEED
							{
							match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration548); 
							match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration550); 
							}
							break;

					}

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "configuration"

	// Delegated rules



	public static final BitSet FOLLOW_circle_in_shaper61 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_square_in_shaper65 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rectangle_in_shaper69 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_triangle_in_shaper73 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_configuration_in_shaper78 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_shaper82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_in_circle97 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CIRCLE_C_in_circle99 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_circle101 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_circle103 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_circle105 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_circle107 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_circle109 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_circle111 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CIRCLE_R_in_circle114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQUARE_in_square129 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_P1_in_square131 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square133 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_square135 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square137 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square139 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_square141 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square143 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_P2_in_square145 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square147 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_square149 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square151 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square153 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_square155 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square157 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_SQUARE_CONFIG_in_square159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECTANGLE_in_rectangle174 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_P1_in_rectangle176 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle178 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_rectangle180 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle182 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle184 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_rectangle186 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle188 = new BitSet(new long[]{0x0000000000120000L});
	public static final BitSet FOLLOW_set_in_rectangle190 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle198 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_rectangle200 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle202 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle204 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_rectangle206 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle208 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_set_in_rectangle210 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle218 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_rectangle220 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle222 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle224 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_rectangle226 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIANGLE_in_triangle244 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_P1_in_triangle246 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle248 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_triangle250 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle252 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle254 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_triangle256 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle258 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_P2_in_triangle260 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle262 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_triangle264 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle266 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle268 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_triangle270 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle272 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_P3_in_triangle274 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle276 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_triangle278 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle280 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle282 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_triangle284 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONFIG_in_configuration302 = new BitSet(new long[]{0x0000000000003800L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration317 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration338 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration340 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration362 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration364 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration408 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration429 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration431 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration453 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration455 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration499 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration501 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration524 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration548 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration550 = new BitSet(new long[]{0x0000000000000002L});
}
