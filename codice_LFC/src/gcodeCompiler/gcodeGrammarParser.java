// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2022-03-03 17:59:52

package gcodeCompiler;

import gcodeCompiler.gcodeGrammarHandler;
import gcodeCompiler.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.IOException;
import java.io.StringReader;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gcodeGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHANGE_TOOL", "CIRCLE_ACW", "CIRCLE_CW", 
		"COMMENT", "COMP_DIS", "COMP_L", "COMP_R", "COORD_ABS", "COORD_REL", "CORD_DIGIT", 
		"DIGIT", "END_PROG", "FREE_MOVE", "FREE_MOVE_SPEED", "I_CORD", "JOB_MOVE", 
		"JOB_MOVE_SPEED", "J_CORD", "K_CORD", "LUBE_OFF", "LUBE_ON", "N_BLOCK", 
		"ROT_TOOL_ACW", "ROT_TOOL_CW", "SCAN_ERROR", "STOP_TOOL", "TOOL_CHANGE", 
		"WS", "X_CORD", "Y_CORD", "Z_CORD"
	};
	public static final int EOF=-1;
	public static final int CHANGE_TOOL=4;
	public static final int CIRCLE_ACW=5;
	public static final int CIRCLE_CW=6;
	public static final int COMMENT=7;
	public static final int COMP_DIS=8;
	public static final int COMP_L=9;
	public static final int COMP_R=10;
	public static final int COORD_ABS=11;
	public static final int COORD_REL=12;
	public static final int CORD_DIGIT=13;
	public static final int DIGIT=14;
	public static final int END_PROG=15;
	public static final int FREE_MOVE=16;
	public static final int FREE_MOVE_SPEED=17;
	public static final int I_CORD=18;
	public static final int JOB_MOVE=19;
	public static final int JOB_MOVE_SPEED=20;
	public static final int J_CORD=21;
	public static final int K_CORD=22;
	public static final int LUBE_OFF=23;
	public static final int LUBE_ON=24;
	public static final int N_BLOCK=25;
	public static final int ROT_TOOL_ACW=26;
	public static final int ROT_TOOL_CW=27;
	public static final int SCAN_ERROR=28;
	public static final int STOP_TOOL=29;
	public static final int TOOL_CHANGE=30;
	public static final int WS=31;
	public static final int X_CORD=32;
	public static final int Y_CORD=33;
	public static final int Z_CORD=34;

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

	@Override public String[] getTokenNames() { return gcodeGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g"; }


	private gcodeGrammarHandler h;

	public gcodeGrammarParser(String fileIn) throws IOException {		
		this(new CommonTokenStream(
			new gcodeGrammarLexer(
				new ANTLRReaderStream(
					new FileReader(fileIn)))));
	}

	void setup () {
		h = new gcodeGrammarHandler(input);
	}

	public gcodeGrammarHandler getHandler() {
		return h;
	}

	public List<String> getErrorList () {
	  return h.getErrorList();
	}

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		
		// gestione degli errori sintattici
		h.handleError(tokenNames, e, hdr, msg);
	}




	// $ANTLR start "gcode"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:62:1: gcode : ( block )+ ;
	public final void gcode() throws RecognitionException {
		 setup(); 
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:64:2: ( ( block )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:65:2: ( block )+
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:65:2: ( block )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==N_BLOCK) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:65:2: block
					{
					pushFollow(FOLLOW_block_in_gcode62);
					block();
					state._fsp--;

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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gcode"



	// $ANTLR start "block"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:73:1: block : n= N_BLOCK ( ( info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M ) ;
	public final void block() throws RecognitionException {
		Token n=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:74:2: (n= N_BLOCK ( ( info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:75:3: n= N_BLOCK ( ( info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M )
			{
			n=(Token)match(input,N_BLOCK,FOLLOW_N_BLOCK_in_block81); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:75:13: ( ( info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M )
			int alt9=3;
			switch ( input.LA(1) ) {
			case CIRCLE_ACW:
			case CIRCLE_CW:
			case COMP_DIS:
			case COMP_L:
			case COMP_R:
			case COORD_ABS:
			case COORD_REL:
			case FREE_MOVE:
			case JOB_MOVE:
				{
				alt9=1;
				}
				break;
			case FREE_MOVE_SPEED:
			case JOB_MOVE_SPEED:
			case TOOL_CHANGE:
				{
				alt9=2;
				}
				break;
			case CHANGE_TOOL:
			case END_PROG:
			case LUBE_OFF:
			case LUBE_ON:
			case ROT_TOOL_ACW:
			case ROT_TOOL_CW:
			case STOP_TOOL:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:8: ( info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:8: ( info_geometriche )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= CIRCLE_ACW && LA2_0 <= CIRCLE_CW)||(LA2_0 >= COMP_DIS && LA2_0 <= COORD_REL)||LA2_0==FREE_MOVE||LA2_0==JOB_MOVE) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:9: info_geometriche
							{
							pushFollow(FOLLOW_info_geometriche_in_block93);
							info_geometriche();
							state._fsp--;

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:28: ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EOF||LA6_0==CHANGE_TOOL||LA6_0==END_PROG||(LA6_0 >= LUBE_OFF && LA6_0 <= ROT_TOOL_CW)||LA6_0==STOP_TOOL) ) {
						alt6=1;
					}
					else if ( (LA6_0==FREE_MOVE_SPEED||LA6_0==JOB_MOVE_SPEED||LA6_0==TOOL_CHANGE) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:77:21: ( info_3M )?
							{
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:77:21: ( info_3M )?
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==CHANGE_TOOL||LA3_0==END_PROG||(LA3_0 >= LUBE_OFF && LA3_0 <= LUBE_ON)||(LA3_0 >= ROT_TOOL_ACW && LA3_0 <= ROT_TOOL_CW)||LA3_0==STOP_TOOL) ) {
								alt3=1;
							}
							switch (alt3) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:77:22: info_3M
									{
									pushFollow(FOLLOW_info_3M_in_block122);
									info_3M();
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:78:23: ( info_tecnologiche )+ ( info_3M )?
							{
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:78:23: ( info_tecnologiche )+
							int cnt4=0;
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==FREE_MOVE_SPEED||LA4_0==JOB_MOVE_SPEED||LA4_0==TOOL_CHANGE) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:78:24: info_tecnologiche
									{
									pushFollow(FOLLOW_info_tecnologiche_in_block149);
									info_tecnologiche();
									state._fsp--;

									}
									break;

								default :
									if ( cnt4 >= 1 ) break loop4;
									EarlyExitException eee = new EarlyExitException(4, input);
									throw eee;
								}
								cnt4++;
							}

							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:78:44: ( info_3M )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==CHANGE_TOOL||LA5_0==END_PROG||(LA5_0 >= LUBE_OFF && LA5_0 <= LUBE_ON)||(LA5_0 >= ROT_TOOL_ACW && LA5_0 <= ROT_TOOL_CW)||LA5_0==STOP_TOOL) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:78:45: info_3M
									{
									pushFollow(FOLLOW_info_3M_in_block154);
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
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:81:10: ( info_tecnologiche )+ ( info_3M )?
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:81:10: ( info_tecnologiche )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==FREE_MOVE_SPEED||LA7_0==JOB_MOVE_SPEED||LA7_0==TOOL_CHANGE) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:81:11: info_tecnologiche
							{
							pushFollow(FOLLOW_info_tecnologiche_in_block209);
							info_tecnologiche();
							state._fsp--;

							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:81:31: ( info_3M )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==CHANGE_TOOL||LA8_0==END_PROG||(LA8_0 >= LUBE_OFF && LA8_0 <= LUBE_ON)||(LA8_0 >= ROT_TOOL_ACW && LA8_0 <= ROT_TOOL_CW)||LA8_0==STOP_TOOL) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:81:32: info_3M
							{
							pushFollow(FOLLOW_info_3M_in_block214);
							info_3M();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:82:10: info_3M
					{
					pushFollow(FOLLOW_info_3M_in_block227);
					info_3M();
					state._fsp--;

					}
					break;

			}

			h.createNewBlock(n);
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
	// $ANTLR end "block"



	// $ANTLR start "info_3M"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:90:1: info_3M : info_tecnologiche_M ( info_tecnologiche_M )? ( info_tecnologiche_M )? ;
	public final void info_3M() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:91:2: ( info_tecnologiche_M ( info_tecnologiche_M )? ( info_tecnologiche_M )? )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:3: info_tecnologiche_M ( info_tecnologiche_M )? ( info_tecnologiche_M )?
			{
			pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M253);
			info_tecnologiche_M();
			state._fsp--;

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:23: ( info_tecnologiche_M )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CHANGE_TOOL||LA10_0==END_PROG||(LA10_0 >= LUBE_OFF && LA10_0 <= LUBE_ON)||(LA10_0 >= ROT_TOOL_ACW && LA10_0 <= ROT_TOOL_CW)||LA10_0==STOP_TOOL) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:24: info_tecnologiche_M
					{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M256);
					info_tecnologiche_M();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:46: ( info_tecnologiche_M )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CHANGE_TOOL||LA11_0==END_PROG||(LA11_0 >= LUBE_OFF && LA11_0 <= LUBE_ON)||(LA11_0 >= ROT_TOOL_ACW && LA11_0 <= ROT_TOOL_CW)||LA11_0==STOP_TOOL) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:47: info_tecnologiche_M
					{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M261);
					info_tecnologiche_M();
					state._fsp--;

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
	// $ANTLR end "info_3M"



	// $ANTLR start "info_geometriche"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:99:1: info_geometriche : ( COORD_ABS | COORD_REL | FREE_MOVE coordinate_XYZ | JOB_MOVE coordinate_XYZ | CIRCLE_CW coordinate_XYZ coordinate_IJK | CIRCLE_ACW coordinate_XYZ coordinate_IJK | COMP_DIS | COMP_L | COMP_R );
	public final void info_geometriche() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:2: ( COORD_ABS | COORD_REL | FREE_MOVE coordinate_XYZ | JOB_MOVE coordinate_XYZ | CIRCLE_CW coordinate_XYZ coordinate_IJK | CIRCLE_ACW coordinate_XYZ coordinate_IJK | COMP_DIS | COMP_L | COMP_R )
			int alt12=9;
			switch ( input.LA(1) ) {
			case COORD_ABS:
				{
				alt12=1;
				}
				break;
			case COORD_REL:
				{
				alt12=2;
				}
				break;
			case FREE_MOVE:
				{
				alt12=3;
				}
				break;
			case JOB_MOVE:
				{
				alt12=4;
				}
				break;
			case CIRCLE_CW:
				{
				alt12=5;
				}
				break;
			case CIRCLE_ACW:
				{
				alt12=6;
				}
				break;
			case COMP_DIS:
				{
				alt12=7;
				}
				break;
			case COMP_L:
				{
				alt12=8;
				}
				break;
			case COMP_R:
				{
				alt12=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:101:3: COORD_ABS
					{
					match(input,COORD_ABS,FOLLOW_COORD_ABS_in_info_geometriche279); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:102:4: COORD_REL
					{
					match(input,COORD_REL,FOLLOW_COORD_REL_in_info_geometriche284); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:103:4: FREE_MOVE coordinate_XYZ
					{
					match(input,FREE_MOVE,FOLLOW_FREE_MOVE_in_info_geometriche289); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche291);
					coordinate_XYZ();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:4: JOB_MOVE coordinate_XYZ
					{
					match(input,JOB_MOVE,FOLLOW_JOB_MOVE_in_info_geometriche296); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche298);
					coordinate_XYZ();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:4: CIRCLE_CW coordinate_XYZ coordinate_IJK
					{
					match(input,CIRCLE_CW,FOLLOW_CIRCLE_CW_in_info_geometriche303); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche305);
					coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche307);
					coordinate_IJK();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:106:4: CIRCLE_ACW coordinate_XYZ coordinate_IJK
					{
					match(input,CIRCLE_ACW,FOLLOW_CIRCLE_ACW_in_info_geometriche312); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche314);
					coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche316);
					coordinate_IJK();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:107:4: COMP_DIS
					{
					match(input,COMP_DIS,FOLLOW_COMP_DIS_in_info_geometriche321); 
					}
					break;
				case 8 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:108:4: COMP_L
					{
					match(input,COMP_L,FOLLOW_COMP_L_in_info_geometriche326); 
					}
					break;
				case 9 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:109:4: COMP_R
					{
					match(input,COMP_R,FOLLOW_COMP_R_in_info_geometriche331); 
					}
					break;

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
	// $ANTLR end "info_geometriche"



	// $ANTLR start "coordinate_XYZ"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:115:1: coordinate_XYZ : ( X_CORD ( Y_CORD )? ( Z_CORD )? | Y_CORD ( Z_CORD )? | Z_CORD );
	public final void coordinate_XYZ() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:116:2: ( X_CORD ( Y_CORD )? ( Z_CORD )? | Y_CORD ( Z_CORD )? | Z_CORD )
			int alt16=3;
			switch ( input.LA(1) ) {
			case X_CORD:
				{
				alt16=1;
				}
				break;
			case Y_CORD:
				{
				alt16=2;
				}
				break;
			case Z_CORD:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:3: X_CORD ( Y_CORD )? ( Z_CORD )?
					{
					match(input,X_CORD,FOLLOW_X_CORD_in_coordinate_XYZ347); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:10: ( Y_CORD )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Y_CORD) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:11: Y_CORD
							{
							match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ350); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:20: ( Z_CORD )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==Z_CORD) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:21: Z_CORD
							{
							match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ355); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:4: Y_CORD ( Z_CORD )?
					{
					match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ362); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:11: ( Z_CORD )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==Z_CORD) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:12: Z_CORD
							{
							match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ365); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:119:4: Z_CORD
					{
					match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ372); 
					}
					break;

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
	// $ANTLR end "coordinate_XYZ"



	// $ANTLR start "coordinate_IJK"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:126:1: coordinate_IJK : ( I_CORD ( J_CORD )? ( K_CORD )? | J_CORD ( K_CORD )? | K_CORD );
	public final void coordinate_IJK() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:127:2: ( I_CORD ( J_CORD )? ( K_CORD )? | J_CORD ( K_CORD )? | K_CORD )
			int alt20=3;
			switch ( input.LA(1) ) {
			case I_CORD:
				{
				alt20=1;
				}
				break;
			case J_CORD:
				{
				alt20=2;
				}
				break;
			case K_CORD:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:3: I_CORD ( J_CORD )? ( K_CORD )?
					{
					match(input,I_CORD,FOLLOW_I_CORD_in_coordinate_IJK389); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:10: ( J_CORD )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==J_CORD) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:11: J_CORD
							{
							match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK392); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:20: ( K_CORD )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==K_CORD) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:21: K_CORD
							{
							match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK397); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:4: J_CORD ( K_CORD )?
					{
					match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK404); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:11: ( K_CORD )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==K_CORD) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:12: K_CORD
							{
							match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK407); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:4: K_CORD
					{
					match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK414); 
					}
					break;

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
	// $ANTLR end "coordinate_IJK"



	// $ANTLR start "info_tecnologiche"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:137:1: info_tecnologiche : ( FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE );
	public final void info_tecnologiche() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:138:2: ( FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
			{
			if ( input.LA(1)==FREE_MOVE_SPEED||input.LA(1)==JOB_MOVE_SPEED||input.LA(1)==TOOL_CHANGE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "info_tecnologiche"



	// $ANTLR start "info_tecnologiche_M"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:147:1: info_tecnologiche_M : ( ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON | LUBE_OFF | END_PROG );
	public final void info_tecnologiche_M() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:148:2: ( ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON | LUBE_OFF | END_PROG )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:
			{
			if ( input.LA(1)==CHANGE_TOOL||input.LA(1)==END_PROG||(input.LA(1) >= LUBE_OFF && input.LA(1) <= LUBE_ON)||(input.LA(1) >= ROT_TOOL_ACW && input.LA(1) <= ROT_TOOL_CW)||input.LA(1)==STOP_TOOL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "info_tecnologiche_M"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_gcode62 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_N_BLOCK_in_block81 = new BitSet(new long[]{0x000000006D9B9F70L});
	public static final BitSet FOLLOW_info_geometriche_in_block93 = new BitSet(new long[]{0x000000006D9B9F72L});
	public static final BitSet FOLLOW_info_3M_in_block122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block149 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_3M_in_block154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block209 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_3M_in_block214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_3M_in_block227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M253 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M256 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_ABS_in_info_geometriche279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_REL_in_info_geometriche284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREE_MOVE_in_info_geometriche289 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_MOVE_in_info_geometriche296 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_CW_in_info_geometriche303 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche305 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_ACW_in_info_geometriche312 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche314 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_DIS_in_info_geometriche321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_L_in_info_geometriche326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_R_in_info_geometriche331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_X_CORD_in_coordinate_XYZ347 = new BitSet(new long[]{0x0000000600000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ350 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ362 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_I_CORD_in_coordinate_IJK389 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK392 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK404 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK414 = new BitSet(new long[]{0x0000000000000002L});
}
