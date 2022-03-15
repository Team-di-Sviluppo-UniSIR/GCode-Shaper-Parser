// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g 2022-03-15 20:56:35

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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:56:1: shaper : ( (c= circle s= configuration ) | (t= triangle s= configuration ) | (r= rectangle s= configuration ) | (q= square s= configuration ) ) EOF ;
	public final void shaper() throws RecognitionException {
		Circle c =null;
		Shape s =null;
		Triangle t =null;
		Rectangle r =null;
		Square q =null;

		 setup(); 
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:58:2: ( ( (c= circle s= configuration ) | (t= triangle s= configuration ) | (r= rectangle s= configuration ) | (q= square s= configuration ) ) EOF )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:58:4: ( (c= circle s= configuration ) | (t= triangle s= configuration ) | (r= rectangle s= configuration ) | (q= square s= configuration ) ) EOF
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:58:4: ( (c= circle s= configuration ) | (t= triangle s= configuration ) | (r= rectangle s= configuration ) | (q= square s= configuration ) )
			int alt1=4;
			switch ( input.LA(1) ) {
			case CIRCLE:
				{
				alt1=1;
				}
				break;
			case TRIANGLE:
				{
				alt1=2;
				}
				break;
			case RECTANGLE:
				{
				alt1=3;
				}
				break;
			case SQUARE:
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:4: (c= circle s= configuration )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:4: (c= circle s= configuration )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:59:6: c= circle s= configuration
					{
					pushFollow(FOLLOW_circle_in_shaper68);
					c=circle();
					state._fsp--;

					pushFollow(FOLLOW_configuration_in_shaper74);
					s=configuration();
					state._fsp--;

					}

					 h.createShape(s, c); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:60:5: (t= triangle s= configuration )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:60:5: (t= triangle s= configuration )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:60:7: t= triangle s= configuration
					{
					pushFollow(FOLLOW_triangle_in_shaper90);
					t=triangle();
					state._fsp--;

					pushFollow(FOLLOW_configuration_in_shaper96);
					s=configuration();
					state._fsp--;

					}

					 h.createShape(s, t); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:61:5: (r= rectangle s= configuration )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:61:5: (r= rectangle s= configuration )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:61:7: r= rectangle s= configuration
					{
					pushFollow(FOLLOW_rectangle_in_shaper112);
					r=rectangle();
					state._fsp--;

					pushFollow(FOLLOW_configuration_in_shaper118);
					s=configuration();
					state._fsp--;

					}

					 h.createShape(s, r); 
					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:62:5: (q= square s= configuration )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:62:5: (q= square s= configuration )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:62:7: q= square s= configuration
					{
					pushFollow(FOLLOW_square_in_shaper134);
					q=square();
					state._fsp--;

					pushFollow(FOLLOW_configuration_in_shaper140);
					s=configuration();
					state._fsp--;

					}

					 h.createShape(s, q); 
					}
					break;

			}

			match(input,EOF,FOLLOW_EOF_in_shaper149); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:66:1: circle returns [Circle c] : ( CIRCLE CIRCLE_C OB x= X_CORD CB OB y= Y_CORD CB r= CIRCLE_R ) ;
	public final Circle circle() throws RecognitionException {
		Circle c = null;


		Token x=null;
		Token y=null;
		Token r=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:67:2: ( ( CIRCLE CIRCLE_C OB x= X_CORD CB OB y= Y_CORD CB r= CIRCLE_R ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:68:3: ( CIRCLE CIRCLE_C OB x= X_CORD CB OB y= Y_CORD CB r= CIRCLE_R )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:68:3: ( CIRCLE CIRCLE_C OB x= X_CORD CB OB y= Y_CORD CB r= CIRCLE_R )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:68:4: CIRCLE CIRCLE_C OB x= X_CORD CB OB y= Y_CORD CB r= CIRCLE_R
			{
			match(input,CIRCLE,FOLLOW_CIRCLE_in_circle169); 
			match(input,CIRCLE_C,FOLLOW_CIRCLE_C_in_circle171); 
			match(input,OB,FOLLOW_OB_in_circle173); 
			x=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_circle179); 
			match(input,CB,FOLLOW_CB_in_circle181); 
			match(input,OB,FOLLOW_OB_in_circle183); 
			y=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_circle189); 
			match(input,CB,FOLLOW_CB_in_circle191); 
			r=(Token)match(input,CIRCLE_R,FOLLOW_CIRCLE_R_in_circle198); 
			}

			 c = new Circle(x, y, r); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "circle"



	// $ANTLR start "square"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:72:1: square returns [Square s] : ( SQUARE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 x2= OB X_CORD CB OB y2= Y_CORD CB conf= SQUARE_CONFIG ) ;
	public final Square square() throws RecognitionException {
		Square s = null;


		Token x1=null;
		Token y1=null;
		Token x2=null;
		Token y2=null;
		Token conf=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:73:2: ( ( SQUARE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 x2= OB X_CORD CB OB y2= Y_CORD CB conf= SQUARE_CONFIG ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:74:3: ( SQUARE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 x2= OB X_CORD CB OB y2= Y_CORD CB conf= SQUARE_CONFIG )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:74:3: ( SQUARE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 x2= OB X_CORD CB OB y2= Y_CORD CB conf= SQUARE_CONFIG )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:74:4: SQUARE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 x2= OB X_CORD CB OB y2= Y_CORD CB conf= SQUARE_CONFIG
			{
			match(input,SQUARE,FOLLOW_SQUARE_in_square223); 
			match(input,P1,FOLLOW_P1_in_square225); 
			match(input,OB,FOLLOW_OB_in_square227); 
			x1=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_square233); 
			match(input,CB,FOLLOW_CB_in_square235); 
			match(input,OB,FOLLOW_OB_in_square237); 
			y1=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_square243); 
			match(input,CB,FOLLOW_CB_in_square245); 
			match(input,P2,FOLLOW_P2_in_square247); 
			x2=(Token)match(input,OB,FOLLOW_OB_in_square253); 
			match(input,X_CORD,FOLLOW_X_CORD_in_square255); 
			match(input,CB,FOLLOW_CB_in_square257); 
			match(input,OB,FOLLOW_OB_in_square259); 
			y2=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_square265); 
			match(input,CB,FOLLOW_CB_in_square267); 
			conf=(Token)match(input,SQUARE_CONFIG,FOLLOW_SQUARE_CONFIG_in_square273); 
			}

			 s = new Square(x1, y1, x2, y2, conf); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "square"



	// $ANTLR start "rectangle"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:78:1: rectangle returns [Rectangle r] : ( RECTANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB ( P2 | RECTANGLE_B ) OB x2= X_CORD CB OB y2= Y_CORD CB ( P3 | RECTANGLE_H ) OB x3= X_CORD CB OB y3= Y_CORD CB ) ;
	public final Rectangle rectangle() throws RecognitionException {
		Rectangle r = null;


		Token x1=null;
		Token y1=null;
		Token x2=null;
		Token y2=null;
		Token x3=null;
		Token y3=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:79:2: ( ( RECTANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB ( P2 | RECTANGLE_B ) OB x2= X_CORD CB OB y2= Y_CORD CB ( P3 | RECTANGLE_H ) OB x3= X_CORD CB OB y3= Y_CORD CB ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:80:3: ( RECTANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB ( P2 | RECTANGLE_B ) OB x2= X_CORD CB OB y2= Y_CORD CB ( P3 | RECTANGLE_H ) OB x3= X_CORD CB OB y3= Y_CORD CB )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:80:3: ( RECTANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB ( P2 | RECTANGLE_B ) OB x2= X_CORD CB OB y2= Y_CORD CB ( P3 | RECTANGLE_H ) OB x3= X_CORD CB OB y3= Y_CORD CB )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:80:4: RECTANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB ( P2 | RECTANGLE_B ) OB x2= X_CORD CB OB y2= Y_CORD CB ( P3 | RECTANGLE_H ) OB x3= X_CORD CB OB y3= Y_CORD CB
			{
			match(input,RECTANGLE,FOLLOW_RECTANGLE_in_rectangle298); 
			match(input,P1,FOLLOW_P1_in_rectangle300); 
			match(input,OB,FOLLOW_OB_in_rectangle302); 
			x1=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_rectangle308); 
			match(input,CB,FOLLOW_CB_in_rectangle310); 
			match(input,OB,FOLLOW_OB_in_rectangle312); 
			y1=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_rectangle318); 
			match(input,CB,FOLLOW_CB_in_rectangle320); 
			if ( input.LA(1)==P2||input.LA(1)==RECTANGLE_B ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,OB,FOLLOW_OB_in_rectangle330); 
			x2=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_rectangle336); 
			match(input,CB,FOLLOW_CB_in_rectangle338); 
			match(input,OB,FOLLOW_OB_in_rectangle340); 
			y2=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_rectangle346); 
			match(input,CB,FOLLOW_CB_in_rectangle348); 
			if ( input.LA(1)==P3||input.LA(1)==RECTANGLE_H ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,OB,FOLLOW_OB_in_rectangle358); 
			x3=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_rectangle364); 
			match(input,CB,FOLLOW_CB_in_rectangle366); 
			match(input,OB,FOLLOW_OB_in_rectangle368); 
			y3=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_rectangle374); 
			match(input,CB,FOLLOW_CB_in_rectangle376); 
			}

			 r = new Rectangle(x1, y1, x2, y2, x3, y3); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "rectangle"



	// $ANTLR start "triangle"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:84:1: triangle returns [Triangle t] : ( TRIANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 OB x2= X_CORD CB OB y2= Y_CORD CB P3 OB x3= X_CORD CB OB y3= Y_CORD CB ) ;
	public final Triangle triangle() throws RecognitionException {
		Triangle t = null;


		Token x1=null;
		Token y1=null;
		Token x2=null;
		Token y2=null;
		Token x3=null;
		Token y3=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:85:2: ( ( TRIANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 OB x2= X_CORD CB OB y2= Y_CORD CB P3 OB x3= X_CORD CB OB y3= Y_CORD CB ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:86:3: ( TRIANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 OB x2= X_CORD CB OB y2= Y_CORD CB P3 OB x3= X_CORD CB OB y3= Y_CORD CB )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:86:3: ( TRIANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 OB x2= X_CORD CB OB y2= Y_CORD CB P3 OB x3= X_CORD CB OB y3= Y_CORD CB )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:86:4: TRIANGLE P1 OB x1= X_CORD CB OB y1= Y_CORD CB P2 OB x2= X_CORD CB OB y2= Y_CORD CB P3 OB x3= X_CORD CB OB y3= Y_CORD CB
			{
			match(input,TRIANGLE,FOLLOW_TRIANGLE_in_triangle402); 
			match(input,P1,FOLLOW_P1_in_triangle404); 
			match(input,OB,FOLLOW_OB_in_triangle406); 
			x1=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_triangle412); 
			match(input,CB,FOLLOW_CB_in_triangle414); 
			match(input,OB,FOLLOW_OB_in_triangle416); 
			y1=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_triangle422); 
			match(input,CB,FOLLOW_CB_in_triangle424); 
			match(input,P2,FOLLOW_P2_in_triangle426); 
			match(input,OB,FOLLOW_OB_in_triangle428); 
			x2=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_triangle434); 
			match(input,CB,FOLLOW_CB_in_triangle436); 
			match(input,OB,FOLLOW_OB_in_triangle438); 
			y2=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_triangle444); 
			match(input,CB,FOLLOW_CB_in_triangle446); 
			match(input,P3,FOLLOW_P3_in_triangle448); 
			match(input,OB,FOLLOW_OB_in_triangle450); 
			x3=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_triangle456); 
			match(input,CB,FOLLOW_CB_in_triangle458); 
			match(input,OB,FOLLOW_OB_in_triangle460); 
			y3=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_triangle466); 
			match(input,CB,FOLLOW_CB_in_triangle468); 
			}

			 t = new Triangle(x1, y1, x2, y2, x3, y3); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "triangle"



	// $ANTLR start "configuration"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:90:1: configuration returns [Shape s] : ( CONFIG ( (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) ) | (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) ) | ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) ) ) ) ;
	public final Shape configuration() throws RecognitionException {
		Shape s = null;


		Token ms=null;
		Token js=null;
		Token lb=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:91:2: ( ( CONFIG ( (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) ) | (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) ) | ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) ) ) ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:4: ( CONFIG ( (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) ) | (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) ) | ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) ) ) )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:4: ( CONFIG ( (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) ) | (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) ) | ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) ) ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:6: CONFIG ( (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) ) | (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) ) | ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) ) )
			{
			match(input,CONFIG,FOLLOW_CONFIG_in_configuration495); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:92:13: ( (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) ) | (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) ) | ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) ) )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:93:9: (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:93:9: (ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED ) )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:93:12: ms= MOVE_SPEED (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED )
					{
					ms=(Token)match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration514); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:93:28: (js= JOB_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF js= JOB_SPEED )
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
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:94:18: js= JOB_SPEED LUBE_SET lb= ON_OFF
							{
							js=(Token)match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration539); 
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration541); 
							lb=(Token)match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration547); 
							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:95:19: LUBE_SET lb= ON_OFF js= JOB_SPEED
							{
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration567); 
							lb=(Token)match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration573); 
							js=(Token)match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration579); 
							}
							break;

					}

					}

					 s = new Shape(' ', ms, js, lb); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:98:10: (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:98:10: (js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED ) )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:98:13: js= JOB_SPEED (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED )
					{
					js=(Token)match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration628); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:98:28: (ms= MOVE_SPEED LUBE_SET lb= ON_OFF | LUBE_SET lb= ON_OFF ms= MOVE_SPEED )
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
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:99:18: ms= MOVE_SPEED LUBE_SET lb= ON_OFF
							{
							ms=(Token)match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration653); 
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration655); 
							lb=(Token)match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration661); 
							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:100:19: LUBE_SET lb= ON_OFF ms= MOVE_SPEED
							{
							match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration681); 
							lb=(Token)match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration687); 
							ms=(Token)match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration693); 
							}
							break;

					}

					}

					 s = new Shape(' ', ms, js, lb); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:103:10: ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:103:10: ( LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED ) )
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:103:13: LUBE_SET lb= ON_OFF (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED )
					{
					match(input,LUBE_SET,FOLLOW_LUBE_SET_in_configuration738); 
					lb=(Token)match(input,ON_OFF,FOLLOW_ON_OFF_in_configuration744); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:103:34: (js= JOB_SPEED ms= MOVE_SPEED |ms= MOVE_SPEED js= JOB_SPEED )
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
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:104:20: js= JOB_SPEED ms= MOVE_SPEED
							{
							js=(Token)match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration771); 
							ms=(Token)match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration777); 
							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\SHAPER\\shaperCompiler\\shaperGrammar.g:105:21: ms= MOVE_SPEED js= JOB_SPEED
							{
							ms=(Token)match(input,MOVE_SPEED,FOLLOW_MOVE_SPEED_in_configuration803); 
							js=(Token)match(input,JOB_SPEED,FOLLOW_JOB_SPEED_in_configuration809); 
							}
							break;

					}

					}

					 s = new Shape(' ', ms, js, lb); 
					}
					break;

			}

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
		return s;
	}
	// $ANTLR end "configuration"

	// Delegated rules



	public static final BitSet FOLLOW_circle_in_shaper68 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_configuration_in_shaper74 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_triangle_in_shaper90 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_configuration_in_shaper96 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_rectangle_in_shaper112 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_configuration_in_shaper118 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_square_in_shaper134 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_configuration_in_shaper140 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_shaper149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_in_circle169 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CIRCLE_C_in_circle171 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_circle173 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_circle179 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_circle181 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_circle183 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_circle189 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_circle191 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CIRCLE_R_in_circle198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQUARE_in_square223 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_P1_in_square225 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square227 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_square233 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square235 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square237 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_square243 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square245 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_P2_in_square247 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square253 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_square255 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square257 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_square259 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_square265 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_square267 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_SQUARE_CONFIG_in_square273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECTANGLE_in_rectangle298 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_P1_in_rectangle300 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle302 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_rectangle308 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle310 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle312 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_rectangle318 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle320 = new BitSet(new long[]{0x0000000000120000L});
	public static final BitSet FOLLOW_set_in_rectangle322 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle330 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_rectangle336 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle338 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle340 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_rectangle346 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle348 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_set_in_rectangle350 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle358 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_rectangle364 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle366 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_rectangle368 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_rectangle374 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_rectangle376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIANGLE_in_triangle402 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_P1_in_triangle404 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle406 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_triangle412 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle414 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle416 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_triangle422 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle424 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_P2_in_triangle426 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle428 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_triangle434 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle436 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle438 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_triangle444 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle446 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_P3_in_triangle448 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle450 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_X_CORD_in_triangle456 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle458 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OB_in_triangle460 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Y_CORD_in_triangle466 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CB_in_triangle468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONFIG_in_configuration495 = new BitSet(new long[]{0x0000000000003800L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration514 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration539 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration541 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration567 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration573 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration628 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration653 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration655 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration681 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration687 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_SET_in_configuration738 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ON_OFF_in_configuration744 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration771 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_SPEED_in_configuration803 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOB_SPEED_in_configuration809 = new BitSet(new long[]{0x0000000000000002L});
}
