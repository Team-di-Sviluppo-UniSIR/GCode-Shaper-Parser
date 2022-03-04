// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2022-03-04 21:20:50

package gcodeCompiler;

import gcodeCompiler.*;
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:73:1: block : n= N_BLOCK ( (info_g= info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M ) ;
	public final void block() throws RecognitionException {
		Token n=null;
		InfoGeometriche info_g =null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:74:2: (n= N_BLOCK ( (info_g= info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:75:3: n= N_BLOCK ( (info_g= info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M )
			{
			n=(Token)match(input,N_BLOCK,FOLLOW_N_BLOCK_in_block83); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:75:15: ( (info_g= info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? ) | ( info_tecnologiche )+ ( info_3M )? | info_3M )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:8: (info_g= info_geometriche )+ ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:8: (info_g= info_geometriche )+
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
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:9: info_g= info_geometriche
							{
							pushFollow(FOLLOW_info_geometriche_in_block99);
							info_g=info_geometriche();
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

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:76:37: ( ( info_3M )? | ( info_tecnologiche )+ ( info_3M )? )
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
									pushFollow(FOLLOW_info_3M_in_block128);
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
									pushFollow(FOLLOW_info_tecnologiche_in_block155);
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
									pushFollow(FOLLOW_info_3M_in_block160);
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
							pushFollow(FOLLOW_info_tecnologiche_in_block215);
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
							pushFollow(FOLLOW_info_3M_in_block220);
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
					pushFollow(FOLLOW_info_3M_in_block233);
					info_3M();
					state._fsp--;

					}
					break;

			}

			h.createNewBlock(n, info_g);
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
			pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M259);
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
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M262);
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
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M267);
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:99:1: info_geometriche returns [InfoGeometriche info_g] : (x= COORD_ABS |x= COORD_REL |l= FREE_MOVE c_xyz= coordinate_XYZ |l= JOB_MOVE c_xyz= coordinate_XYZ |c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |d= COMP_DIS |d= COMP_L |d= COMP_R );
	public final InfoGeometriche info_geometriche() throws RecognitionException {
		InfoGeometriche info_g = null;


		Token x=null;
		Token l=null;
		Token c=null;
		Token d=null;
		Coordinate c_xyz =null;
		Coordinate c_ijk =null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:2: (x= COORD_ABS |x= COORD_REL |l= FREE_MOVE c_xyz= coordinate_XYZ |l= JOB_MOVE c_xyz= coordinate_XYZ |c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |d= COMP_DIS |d= COMP_L |d= COMP_R )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:101:3: x= COORD_ABS
					{
					x=(Token)match(input,COORD_ABS,FOLLOW_COORD_ABS_in_info_geometriche293); 
					 info_g = new InfoGeometriche(x, 'x'); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:102:4: x= COORD_REL
					{
					x=(Token)match(input,COORD_REL,FOLLOW_COORD_REL_in_info_geometriche304); 
					 info_g = new InfoGeometriche(x, 'x'); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:103:4: l= FREE_MOVE c_xyz= coordinate_XYZ
					{
					l=(Token)match(input,FREE_MOVE,FOLLOW_FREE_MOVE_in_info_geometriche315); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche321);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					 info_g = new InfoGeometriche(new LinearMove(l, c_xyz)); 
					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:4: l= JOB_MOVE c_xyz= coordinate_XYZ
					{
					l=(Token)match(input,JOB_MOVE,FOLLOW_JOB_MOVE_in_info_geometriche332); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche338);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					 info_g = new InfoGeometriche(new LinearMove(l, c_xyz)); 
					}
					break;
				case 5 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:4: c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK
					{
					c=(Token)match(input,CIRCLE_CW,FOLLOW_CIRCLE_CW_in_info_geometriche350); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche356);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche362);
					c_ijk=coordinate_IJK();
					state._fsp--;

					 info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); 
					}
					break;
				case 6 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:106:4: c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK
					{
					c=(Token)match(input,CIRCLE_ACW,FOLLOW_CIRCLE_ACW_in_info_geometriche373); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche379);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche385);
					c_ijk=coordinate_IJK();
					state._fsp--;

					 info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); 
					}
					break;
				case 7 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:107:4: d= COMP_DIS
					{
					d=(Token)match(input,COMP_DIS,FOLLOW_COMP_DIS_in_info_geometriche396); 
					 info_g = new InfoGeometriche(d, 'd'); 
					}
					break;
				case 8 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:108:4: d= COMP_L
					{
					d=(Token)match(input,COMP_L,FOLLOW_COMP_L_in_info_geometriche407); 
					 info_g = new InfoGeometriche(d, 'd'); 
					}
					break;
				case 9 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:109:4: d= COMP_R
					{
					d=(Token)match(input,COMP_R,FOLLOW_COMP_R_in_info_geometriche418); 
					 info_g = new InfoGeometriche(d, 'd'); 
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
		return info_g;
	}
	// $ANTLR end "info_geometriche"



	// $ANTLR start "coordinate_XYZ"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:115:1: coordinate_XYZ returns [Coordinate c_xyz] : (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD ) ;
	public final Coordinate coordinate_XYZ() throws RecognitionException {
		Coordinate c_xyz = null;


		Token x=null;
		Token y=null;
		Token z=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:116:2: ( (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:2: (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:2: (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:4: x= X_CORD (y= Y_CORD )? (z= Z_CORD )?
					{
					x=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_coordinate_XYZ446); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:15: (y= Y_CORD )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Y_CORD) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:16: y= Y_CORD
							{
							y=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ453); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:29: (z= Z_CORD )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==Z_CORD) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:30: z= Z_CORD
							{
							z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ462); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:4: y= Y_CORD (z= Z_CORD )?
					{
					y=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ474); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:15: (z= Z_CORD )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==Z_CORD) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:16: z= Z_CORD
							{
							z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ481); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:119:4: z= Z_CORD
					{
					z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ492); 
					}
					break;

			}

			 c_xyz = new Coordinate(x, y, z); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c_xyz;
	}
	// $ANTLR end "coordinate_XYZ"



	// $ANTLR start "coordinate_IJK"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:127:1: coordinate_IJK returns [Coordinate c_ijk] : (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD ) ;
	public final Coordinate coordinate_IJK() throws RecognitionException {
		Coordinate c_ijk = null;


		Token i=null;
		Token j=null;
		Token k=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:2: ( (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:2: (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:2: (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:4: i= I_CORD (j= J_CORD )? (k= K_CORD )?
					{
					i=(Token)match(input,I_CORD,FOLLOW_I_CORD_in_coordinate_IJK523); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:15: (j= J_CORD )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==J_CORD) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:16: j= J_CORD
							{
							j=(Token)match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK530); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:29: (k= K_CORD )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==K_CORD) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:30: k= K_CORD
							{
							k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK539); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:4: j= J_CORD (k= K_CORD )?
					{
					j=(Token)match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK550); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:15: (k= K_CORD )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==K_CORD) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:16: k= K_CORD
							{
							k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK557); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:131:4: k= K_CORD
					{
					k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK568); 
					}
					break;

			}

			 c_ijk = new Coordinate(i, j, k); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c_ijk;
	}
	// $ANTLR end "coordinate_IJK"



	// $ANTLR start "info_tecnologiche"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:139:1: info_tecnologiche : ( FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE );
	public final void info_tecnologiche() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:140:2: ( FREE_MOVE_SPEED | JOB_MOVE_SPEED | TOOL_CHANGE )
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:149:1: info_tecnologiche_M : ( ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON | LUBE_OFF | END_PROG );
	public final void info_tecnologiche_M() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:150:2: ( ROT_TOOL_CW | ROT_TOOL_ACW | STOP_TOOL | CHANGE_TOOL | LUBE_ON | LUBE_OFF | END_PROG )
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
	public static final BitSet FOLLOW_N_BLOCK_in_block83 = new BitSet(new long[]{0x000000006D9B9F70L});
	public static final BitSet FOLLOW_info_geometriche_in_block99 = new BitSet(new long[]{0x000000006D9B9F72L});
	public static final BitSet FOLLOW_info_3M_in_block128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block155 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_3M_in_block160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block215 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_3M_in_block220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_3M_in_block233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M259 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M262 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_ABS_in_info_geometriche293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_REL_in_info_geometriche304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREE_MOVE_in_info_geometriche315 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_MOVE_in_info_geometriche332 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_CW_in_info_geometriche350 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche356 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_ACW_in_info_geometriche373 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche379 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_DIS_in_info_geometriche396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_L_in_info_geometriche407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_R_in_info_geometriche418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_X_CORD_in_coordinate_XYZ446 = new BitSet(new long[]{0x0000000600000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ453 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ474 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_I_CORD_in_coordinate_IJK523 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK530 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK550 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK568 = new BitSet(new long[]{0x0000000000000002L});
}
