// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2022-03-08 08:21:04

package gcodeCompiler;

import gcodeCompiler.*;
import gcodeCompiler.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import gcodeCompiler.util.Error;


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


	public gcodeGrammarHandler h;

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

	public List<Error> getErrorList () {
	  return h.getErrorList();
	}

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		
		// gestione degli errori sintattici
		h.handleError(tokenNames, e, hdr, msg);
	}




	// $ANTLR start "gcode"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:68:1: gcode : ( block )+ ;
	public final void gcode() throws RecognitionException {
		 setup(); 
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:70:2: ( ( block )+ )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:71:2: ( block )+
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:71:2: ( block )+
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:71:2: block
					{
					pushFollow(FOLLOW_block_in_gcode72);
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:79:1: block : n= N_BLOCK ( (info_g= info_geometriche )+ ( (info_t_M_list= info_3M )? | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? ) | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? |info_t_M_list= info_3M ) ;
	public final void block() throws RecognitionException {
		Token n=null;
		InfoGeometriche info_g =null;
		ArrayList<InfoTecnologicheM> info_t_M_list =null;
		InfoTecnologiche info_t =null;

		 
						ArrayList<InfoGeometriche> info_g_list = new ArrayList<InfoGeometriche>();
						ArrayList<InfoTecnologiche> info_t_list = new ArrayList<InfoTecnologiche>();
				 
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:84:2: (n= N_BLOCK ( (info_g= info_geometriche )+ ( (info_t_M_list= info_3M )? | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? ) | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? |info_t_M_list= info_3M ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:85:3: n= N_BLOCK ( (info_g= info_geometriche )+ ( (info_t_M_list= info_3M )? | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? ) | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? |info_t_M_list= info_3M )
			{
			n=(Token)match(input,N_BLOCK,FOLLOW_N_BLOCK_in_block97); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:85:15: ( (info_g= info_geometriche )+ ( (info_t_M_list= info_3M )? | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? ) | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? |info_t_M_list= info_3M )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:86:9: (info_g= info_geometriche )+ ( (info_t_M_list= info_3M )? | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:86:9: (info_g= info_geometriche )+
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
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:86:11: info_g= info_geometriche
							{
							pushFollow(FOLLOW_info_geometriche_in_block115);
							info_g=info_geometriche();
							state._fsp--;

							 info_g_list.add(info_g); 
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:86:69: ( (info_t_M_list= info_3M )? | (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )? )
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
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:87:21: (info_t_M_list= info_3M )?
							{
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:87:21: (info_t_M_list= info_3M )?
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==CHANGE_TOOL||LA3_0==END_PROG||(LA3_0 >= LUBE_OFF && LA3_0 <= LUBE_ON)||(LA3_0 >= ROT_TOOL_ACW && LA3_0 <= ROT_TOOL_CW)||LA3_0==STOP_TOOL) ) {
								alt3=1;
							}
							switch (alt3) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:87:23: info_t_M_list= info_3M
									{
									pushFollow(FOLLOW_info_3M_in_block152);
									info_t_M_list=info_3M();
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:88:23: (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )?
							{
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:88:23: (info_t= info_tecnologiche )+
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
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:88:25: info_t= info_tecnologiche
									{
									pushFollow(FOLLOW_info_tecnologiche_in_block185);
									info_t=info_tecnologiche();
									state._fsp--;

									 info_t_list.add(info_t); 
									}
									break;

								default :
									if ( cnt4 >= 1 ) break loop4;
									EarlyExitException eee = new EarlyExitException(4, input);
									throw eee;
								}
								cnt4++;
							}

							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:88:84: (info_t_M_list= info_3M )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==CHANGE_TOOL||LA5_0==END_PROG||(LA5_0 >= LUBE_OFF && LA5_0 <= LUBE_ON)||(LA5_0 >= ROT_TOOL_ACW && LA5_0 <= ROT_TOOL_CW)||LA5_0==STOP_TOOL) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:88:86: info_t_M_list= info_3M
									{
									pushFollow(FOLLOW_info_3M_in_block198);
									info_t_M_list=info_3M();
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:91:10: (info_t= info_tecnologiche )+ (info_t_M_list= info_3M )?
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:91:10: (info_t= info_tecnologiche )+
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
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:91:12: info_t= info_tecnologiche
							{
							pushFollow(FOLLOW_info_tecnologiche_in_block259);
							info_t=info_tecnologiche();
							state._fsp--;

							 info_t_list.add(info_t); 
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:91:71: (info_t_M_list= info_3M )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==CHANGE_TOOL||LA8_0==END_PROG||(LA8_0 >= LUBE_OFF && LA8_0 <= LUBE_ON)||(LA8_0 >= ROT_TOOL_ACW && LA8_0 <= ROT_TOOL_CW)||LA8_0==STOP_TOOL) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:91:73: info_t_M_list= info_3M
							{
							pushFollow(FOLLOW_info_3M_in_block272);
							info_t_M_list=info_3M();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:92:10: info_t_M_list= info_3M
					{
					pushFollow(FOLLOW_info_3M_in_block291);
					info_t_M_list=info_3M();
					state._fsp--;

					}
					break;

			}

			 h.createNewBlock(n, info_g_list, info_t_list, info_t_M_list); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:1: info_3M returns [ArrayList<InfoTecnologicheM> info_t_M_list] : info_t_M= info_tecnologiche_M (info_t_M= info_tecnologiche_M )? (info_t_M= info_tecnologiche_M )? ;
	public final ArrayList<InfoTecnologicheM> info_3M() throws RecognitionException {
		ArrayList<InfoTecnologicheM> info_t_M_list = null;


		InfoTecnologicheM info_t_M =null;


						info_t_M_list = new ArrayList<InfoTecnologicheM>();
				 
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:2: (info_t_M= info_tecnologiche_M (info_t_M= info_tecnologiche_M )? (info_t_M= info_tecnologiche_M )? )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:3: info_t_M= info_tecnologiche_M (info_t_M= info_tecnologiche_M )? (info_t_M= info_tecnologiche_M )?
			{
			pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M329);
			info_t_M=info_tecnologiche_M();
			state._fsp--;

			 info_t_M_list.add(info_t_M); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:67: (info_t_M= info_tecnologiche_M )?
			int alt10=2;
			switch ( input.LA(1) ) {
				case ROT_TOOL_CW:
					{
					alt10=1;
					}
					break;
				case ROT_TOOL_ACW:
					{
					alt10=1;
					}
					break;
				case STOP_TOOL:
					{
					alt10=1;
					}
					break;
				case CHANGE_TOOL:
					{
					alt10=1;
					}
					break;
				case LUBE_ON:
					{
					alt10=1;
					}
					break;
				case LUBE_OFF:
					{
					alt10=1;
					}
					break;
				case END_PROG:
					{
					alt10=1;
					}
					break;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:69: info_t_M= info_tecnologiche_M
					{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M339);
					info_t_M=info_tecnologiche_M();
					state._fsp--;

					 info_t_M_list.add(info_t_M); 
					}
					break;

			}

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:135: (info_t_M= info_tecnologiche_M )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CHANGE_TOOL||LA11_0==END_PROG||(LA11_0 >= LUBE_OFF && LA11_0 <= LUBE_ON)||(LA11_0 >= ROT_TOOL_ACW && LA11_0 <= ROT_TOOL_CW)||LA11_0==STOP_TOOL) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:136: info_t_M= info_tecnologiche_M
					{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M350);
					info_t_M=info_tecnologiche_M();
					state._fsp--;

					 info_t_M_list.add(info_t_M); 
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
		return info_t_M_list;
	}
	// $ANTLR end "info_3M"



	// $ANTLR start "info_geometriche"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:112:1: info_geometriche returns [InfoGeometriche info_g] : (x= COORD_ABS |x= COORD_REL |l= FREE_MOVE c_xyz= coordinate_XYZ |l= JOB_MOVE c_xyz= coordinate_XYZ |c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |d= COMP_DIS |d= COMP_L |d= COMP_R );
	public final InfoGeometriche info_geometriche() throws RecognitionException {
		InfoGeometriche info_g = null;


		Token x=null;
		Token l=null;
		Token c=null;
		Token d=null;
		Coordinate c_xyz =null;
		Coordinate c_ijk =null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:113:2: (x= COORD_ABS |x= COORD_REL |l= FREE_MOVE c_xyz= coordinate_XYZ |l= JOB_MOVE c_xyz= coordinate_XYZ |c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |d= COMP_DIS |d= COMP_L |d= COMP_R )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:114:3: x= COORD_ABS
					{
					x=(Token)match(input,COORD_ABS,FOLLOW_COORD_ABS_in_info_geometriche379); 
					 info_g = new InfoGeometriche(x, 'x'); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:115:4: x= COORD_REL
					{
					x=(Token)match(input,COORD_REL,FOLLOW_COORD_REL_in_info_geometriche390); 
					 info_g = new InfoGeometriche(x, 'x'); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:116:4: l= FREE_MOVE c_xyz= coordinate_XYZ
					{
					l=(Token)match(input,FREE_MOVE,FOLLOW_FREE_MOVE_in_info_geometriche401); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche407);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					 info_g = new InfoGeometriche(new LinearMove(l, c_xyz)); 
					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:4: l= JOB_MOVE c_xyz= coordinate_XYZ
					{
					l=(Token)match(input,JOB_MOVE,FOLLOW_JOB_MOVE_in_info_geometriche418); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche424);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					 info_g = new InfoGeometriche(new LinearMove(l, c_xyz)); 
					}
					break;
				case 5 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:4: c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK
					{
					c=(Token)match(input,CIRCLE_CW,FOLLOW_CIRCLE_CW_in_info_geometriche436); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche442);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche448);
					c_ijk=coordinate_IJK();
					state._fsp--;

					 info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); 
					}
					break;
				case 6 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:119:4: c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK
					{
					c=(Token)match(input,CIRCLE_ACW,FOLLOW_CIRCLE_ACW_in_info_geometriche459); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche465);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche471);
					c_ijk=coordinate_IJK();
					state._fsp--;

					 info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); 
					}
					break;
				case 7 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:120:4: d= COMP_DIS
					{
					d=(Token)match(input,COMP_DIS,FOLLOW_COMP_DIS_in_info_geometriche482); 
					 info_g = new InfoGeometriche(d, 'd'); 
					}
					break;
				case 8 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:121:4: d= COMP_L
					{
					d=(Token)match(input,COMP_L,FOLLOW_COMP_L_in_info_geometriche493); 
					 info_g = new InfoGeometriche(d, 'd'); 
					}
					break;
				case 9 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:122:4: d= COMP_R
					{
					d=(Token)match(input,COMP_R,FOLLOW_COMP_R_in_info_geometriche504); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:1: coordinate_XYZ returns [Coordinate c_xyz] : (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD ) ;
	public final Coordinate coordinate_XYZ() throws RecognitionException {
		Coordinate c_xyz = null;


		Token x=null;
		Token y=null;
		Token z=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:2: ( (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:2: (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:2: (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:4: x= X_CORD (y= Y_CORD )? (z= Z_CORD )?
					{
					x=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_coordinate_XYZ533); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:15: (y= Y_CORD )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Y_CORD) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:16: y= Y_CORD
							{
							y=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ540); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:29: (z= Z_CORD )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==Z_CORD) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:30: z= Z_CORD
							{
							z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ549); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:131:4: y= Y_CORD (z= Z_CORD )?
					{
					y=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ561); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:131:15: (z= Z_CORD )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==Z_CORD) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:131:16: z= Z_CORD
							{
							z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ568); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:132:4: z= Z_CORD
					{
					z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ579); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:140:1: coordinate_IJK returns [Coordinate c_ijk] : (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD ) ;
	public final Coordinate coordinate_IJK() throws RecognitionException {
		Coordinate c_ijk = null;


		Token i=null;
		Token j=null;
		Token k=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:141:2: ( (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:2: (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:2: (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD )
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:4: i= I_CORD (j= J_CORD )? (k= K_CORD )?
					{
					i=(Token)match(input,I_CORD,FOLLOW_I_CORD_in_coordinate_IJK611); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:15: (j= J_CORD )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==J_CORD) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:16: j= J_CORD
							{
							j=(Token)match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK618); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:29: (k= K_CORD )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==K_CORD) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:30: k= K_CORD
							{
							k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK627); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:4: j= J_CORD (k= K_CORD )?
					{
					j=(Token)match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK638); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:15: (k= K_CORD )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==K_CORD) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:16: k= K_CORD
							{
							k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK645); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:144:4: k= K_CORD
					{
					k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK656); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:152:1: info_tecnologiche returns [InfoTecnologiche info_t] : (x= FREE_MOVE_SPEED |x= JOB_MOVE_SPEED |x= TOOL_CHANGE );
	public final InfoTecnologiche info_tecnologiche() throws RecognitionException {
		InfoTecnologiche info_t = null;


		Token x=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:153:2: (x= FREE_MOVE_SPEED |x= JOB_MOVE_SPEED |x= TOOL_CHANGE )
			int alt21=3;
			switch ( input.LA(1) ) {
			case FREE_MOVE_SPEED:
				{
				alt21=1;
				}
				break;
			case JOB_MOVE_SPEED:
				{
				alt21=2;
				}
				break;
			case TOOL_CHANGE:
				{
				alt21=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:154:3: x= FREE_MOVE_SPEED
					{
					x=(Token)match(input,FREE_MOVE_SPEED,FOLLOW_FREE_MOVE_SPEED_in_info_tecnologiche686); 
					 info_t = new InfoTecnologiche(x, 'f'); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:4: x= JOB_MOVE_SPEED
					{
					x=(Token)match(input,JOB_MOVE_SPEED,FOLLOW_JOB_MOVE_SPEED_in_info_tecnologiche697); 
					 info_t = new InfoTecnologiche(x, 'j'); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:156:4: x= TOOL_CHANGE
					{
					x=(Token)match(input,TOOL_CHANGE,FOLLOW_TOOL_CHANGE_in_info_tecnologiche708); 
					 info_t = new InfoTecnologiche(x, 't'); 
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
		return info_t;
	}
	// $ANTLR end "info_tecnologiche"



	// $ANTLR start "info_tecnologiche_M"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:162:1: info_tecnologiche_M returns [InfoTecnologicheM info_t_M] : (x= ROT_TOOL_CW |x= ROT_TOOL_ACW |s= STOP_TOOL |f= CHANGE_TOOL |g= LUBE_ON |g= LUBE_OFF |h= END_PROG );
	public final InfoTecnologicheM info_tecnologiche_M() throws RecognitionException {
		InfoTecnologicheM info_t_M = null;


		Token x=null;
		Token s=null;
		Token f=null;
		Token g=null;
		Token h=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:163:2: (x= ROT_TOOL_CW |x= ROT_TOOL_ACW |s= STOP_TOOL |f= CHANGE_TOOL |g= LUBE_ON |g= LUBE_OFF |h= END_PROG )
			int alt22=7;
			switch ( input.LA(1) ) {
			case ROT_TOOL_CW:
				{
				alt22=1;
				}
				break;
			case ROT_TOOL_ACW:
				{
				alt22=2;
				}
				break;
			case STOP_TOOL:
				{
				alt22=3;
				}
				break;
			case CHANGE_TOOL:
				{
				alt22=4;
				}
				break;
			case LUBE_ON:
				{
				alt22=5;
				}
				break;
			case LUBE_OFF:
				{
				alt22=6;
				}
				break;
			case END_PROG:
				{
				alt22=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:164:2: x= ROT_TOOL_CW
					{
					x=(Token)match(input,ROT_TOOL_CW,FOLLOW_ROT_TOOL_CW_in_info_tecnologiche_M734); 
					 info_t_M = new InfoTecnologicheM(x, 'x'); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:165:3: x= ROT_TOOL_ACW
					{
					x=(Token)match(input,ROT_TOOL_ACW,FOLLOW_ROT_TOOL_ACW_in_info_tecnologiche_M744); 
					 info_t_M = new InfoTecnologicheM(x, 'x'); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:166:3: s= STOP_TOOL
					{
					s=(Token)match(input,STOP_TOOL,FOLLOW_STOP_TOOL_in_info_tecnologiche_M754); 
					 info_t_M = new InfoTecnologicheM(s, 's'); 
					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:167:3: f= CHANGE_TOOL
					{
					f=(Token)match(input,CHANGE_TOOL,FOLLOW_CHANGE_TOOL_in_info_tecnologiche_M764); 
					 info_t_M = new InfoTecnologicheM(f, 'f'); 
					}
					break;
				case 5 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:168:3: g= LUBE_ON
					{
					g=(Token)match(input,LUBE_ON,FOLLOW_LUBE_ON_in_info_tecnologiche_M774); 
					 info_t_M = new InfoTecnologicheM(g, 'g'); 
					}
					break;
				case 6 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:169:3: g= LUBE_OFF
					{
					g=(Token)match(input,LUBE_OFF,FOLLOW_LUBE_OFF_in_info_tecnologiche_M784); 
					 info_t_M = new InfoTecnologicheM(g, 'g'); 
					}
					break;
				case 7 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:170:3: h= END_PROG
					{
					h=(Token)match(input,END_PROG,FOLLOW_END_PROG_in_info_tecnologiche_M794); 
					 info_t_M = new InfoTecnologicheM(h, 'h'); 
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
		return info_t_M;
	}
	// $ANTLR end "info_tecnologiche_M"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_gcode72 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_N_BLOCK_in_block97 = new BitSet(new long[]{0x000000006D9B9F70L});
	public static final BitSet FOLLOW_info_geometriche_in_block115 = new BitSet(new long[]{0x000000006D9B9F72L});
	public static final BitSet FOLLOW_info_3M_in_block152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block185 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_3M_in_block198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block259 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_3M_in_block272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_3M_in_block291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M329 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M339 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_ABS_in_info_geometriche379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_REL_in_info_geometriche390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREE_MOVE_in_info_geometriche401 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_MOVE_in_info_geometriche418 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_CW_in_info_geometriche436 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche442 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_ACW_in_info_geometriche459 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche465 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_DIS_in_info_geometriche482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_L_in_info_geometriche493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_R_in_info_geometriche504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_X_CORD_in_coordinate_XYZ533 = new BitSet(new long[]{0x0000000600000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ540 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ561 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_I_CORD_in_coordinate_IJK611 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK618 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK638 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREE_MOVE_SPEED_in_info_tecnologiche686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_MOVE_SPEED_in_info_tecnologiche697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOOL_CHANGE_in_info_tecnologiche708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROT_TOOL_CW_in_info_tecnologiche_M734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROT_TOOL_ACW_in_info_tecnologiche_M744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STOP_TOOL_in_info_tecnologiche_M754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHANGE_TOOL_in_info_tecnologiche_M764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_ON_in_info_tecnologiche_M774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_OFF_in_info_tecnologiche_M784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_PROG_in_info_tecnologiche_M794 = new BitSet(new long[]{0x0000000000000002L});
}
