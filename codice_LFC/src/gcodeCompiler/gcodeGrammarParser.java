// $ANTLR 3.5.1 C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g 2022-03-08 22:42:25

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



	// $ANTLR start "block_corretto"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:97:1: block_corretto : N_BLOCK ( ( info_geometriche )+ ( ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* ) | ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* ) ;
	public final void block_corretto() throws RecognitionException {
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:98:2: ( N_BLOCK ( ( info_geometriche )+ ( ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* ) | ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:99:3: N_BLOCK ( ( info_geometriche )+ ( ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* ) | ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* )
			{
			match(input,N_BLOCK,FOLLOW_N_BLOCK_in_block_corretto321); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:99:11: ( ( info_geometriche )+ ( ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* ) | ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* )
			int alt20=3;
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
				alt20=1;
				}
				break;
			case FREE_MOVE_SPEED:
			case JOB_MOVE_SPEED:
			case TOOL_CHANGE:
				{
				alt20=2;
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
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:9: ( info_geometriche )+ ( ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* )
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:9: ( info_geometriche )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= CIRCLE_ACW && LA10_0 <= CIRCLE_CW)||(LA10_0 >= COMP_DIS && LA10_0 <= COORD_REL)||LA10_0==FREE_MOVE||LA10_0==JOB_MOVE) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:10: info_geometriche
							{
							pushFollow(FOLLOW_info_geometriche_in_block_corretto334);
							info_geometriche();
							state._fsp--;

							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:100:29: ( ( info_tecnologiche )+ ( info_tecnologiche_M )* | ( info_tecnologiche_M )+ ( info_tecnologiche )* )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==FREE_MOVE_SPEED||LA15_0==JOB_MOVE_SPEED||LA15_0==TOOL_CHANGE) ) {
						alt15=1;
					}
					else if ( (LA15_0==CHANGE_TOOL||LA15_0==END_PROG||(LA15_0 >= LUBE_OFF && LA15_0 <= LUBE_ON)||(LA15_0 >= ROT_TOOL_ACW && LA15_0 <= ROT_TOOL_CW)||LA15_0==STOP_TOOL) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:101:21: ( info_tecnologiche )+ ( info_tecnologiche_M )*
							{
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:101:21: ( info_tecnologiche )+
							int cnt11=0;
							loop11:
							while (true) {
								int alt11=2;
								int LA11_0 = input.LA(1);
								if ( (LA11_0==FREE_MOVE_SPEED||LA11_0==JOB_MOVE_SPEED||LA11_0==TOOL_CHANGE) ) {
									alt11=1;
								}

								switch (alt11) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:101:22: info_tecnologiche
									{
									pushFollow(FOLLOW_info_tecnologiche_in_block_corretto361);
									info_tecnologiche();
									state._fsp--;

									}
									break;

								default :
									if ( cnt11 >= 1 ) break loop11;
									EarlyExitException eee = new EarlyExitException(11, input);
									throw eee;
								}
								cnt11++;
							}

							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:101:42: ( info_tecnologiche_M )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==CHANGE_TOOL||LA12_0==END_PROG||(LA12_0 >= LUBE_OFF && LA12_0 <= LUBE_ON)||(LA12_0 >= ROT_TOOL_ACW && LA12_0 <= ROT_TOOL_CW)||LA12_0==STOP_TOOL) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:101:43: info_tecnologiche_M
									{
									pushFollow(FOLLOW_info_tecnologiche_M_in_block_corretto366);
									info_tecnologiche_M();
									state._fsp--;

									}
									break;

								default :
									break loop12;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:102:22: ( info_tecnologiche_M )+ ( info_tecnologiche )*
							{
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:102:22: ( info_tecnologiche_M )+
							int cnt13=0;
							loop13:
							while (true) {
								int alt13=2;
								int LA13_0 = input.LA(1);
								if ( (LA13_0==CHANGE_TOOL||LA13_0==END_PROG||(LA13_0 >= LUBE_OFF && LA13_0 <= LUBE_ON)||(LA13_0 >= ROT_TOOL_ACW && LA13_0 <= ROT_TOOL_CW)||LA13_0==STOP_TOOL) ) {
									alt13=1;
								}

								switch (alt13) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:102:23: info_tecnologiche_M
									{
									pushFollow(FOLLOW_info_tecnologiche_M_in_block_corretto392);
									info_tecnologiche_M();
									state._fsp--;

									}
									break;

								default :
									if ( cnt13 >= 1 ) break loop13;
									EarlyExitException eee = new EarlyExitException(13, input);
									throw eee;
								}
								cnt13++;
							}

							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:102:45: ( info_tecnologiche )*
							loop14:
							while (true) {
								int alt14=2;
								int LA14_0 = input.LA(1);
								if ( (LA14_0==FREE_MOVE_SPEED||LA14_0==JOB_MOVE_SPEED||LA14_0==TOOL_CHANGE) ) {
									alt14=1;
								}

								switch (alt14) {
								case 1 :
									// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:102:46: info_tecnologiche
									{
									pushFollow(FOLLOW_info_tecnologiche_in_block_corretto397);
									info_tecnologiche();
									state._fsp--;

									}
									break;

								default :
									break loop14;
								}
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:10: ( info_tecnologiche )+ ( info_tecnologiche_M )*
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:10: ( info_tecnologiche )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==FREE_MOVE_SPEED||LA16_0==JOB_MOVE_SPEED||LA16_0==TOOL_CHANGE) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:11: info_tecnologiche
							{
							pushFollow(FOLLOW_info_tecnologiche_in_block_corretto432);
							info_tecnologiche();
							state._fsp--;

							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:31: ( info_tecnologiche_M )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==CHANGE_TOOL||LA17_0==END_PROG||(LA17_0 >= LUBE_OFF && LA17_0 <= LUBE_ON)||(LA17_0 >= ROT_TOOL_ACW && LA17_0 <= ROT_TOOL_CW)||LA17_0==STOP_TOOL) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:104:32: info_tecnologiche_M
							{
							pushFollow(FOLLOW_info_tecnologiche_M_in_block_corretto437);
							info_tecnologiche_M();
							state._fsp--;

							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:10: ( info_tecnologiche_M )+ ( info_tecnologiche )*
					{
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:10: ( info_tecnologiche_M )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==CHANGE_TOOL||LA18_0==END_PROG||(LA18_0 >= LUBE_OFF && LA18_0 <= LUBE_ON)||(LA18_0 >= ROT_TOOL_ACW && LA18_0 <= ROT_TOOL_CW)||LA18_0==STOP_TOOL) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:11: info_tecnologiche_M
							{
							pushFollow(FOLLOW_info_tecnologiche_M_in_block_corretto451);
							info_tecnologiche_M();
							state._fsp--;

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:33: ( info_tecnologiche )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==FREE_MOVE_SPEED||LA19_0==JOB_MOVE_SPEED||LA19_0==TOOL_CHANGE) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:105:34: info_tecnologiche
							{
							pushFollow(FOLLOW_info_tecnologiche_in_block_corretto456);
							info_tecnologiche();
							state._fsp--;

							}
							break;

						default :
							break loop19;
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
	// $ANTLR end "block_corretto"



	// $ANTLR start "info_3M"
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:113:1: info_3M returns [ArrayList<InfoTecnologicheM> info_t_M_list] : info_t_M= info_tecnologiche_M (info_t_M= info_tecnologiche_M )? (info_t_M= info_tecnologiche_M )? ;
	public final ArrayList<InfoTecnologicheM> info_3M() throws RecognitionException {
		ArrayList<InfoTecnologicheM> info_t_M_list = null;


		InfoTecnologicheM info_t_M =null;


						info_t_M_list = new ArrayList<InfoTecnologicheM>();
				 
		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:117:2: (info_t_M= info_tecnologiche_M (info_t_M= info_tecnologiche_M )? (info_t_M= info_tecnologiche_M )? )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:3: info_t_M= info_tecnologiche_M (info_t_M= info_tecnologiche_M )? (info_t_M= info_tecnologiche_M )?
			{
			pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M496);
			info_t_M=info_tecnologiche_M();
			state._fsp--;

			 info_t_M_list.add(info_t_M); 
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:67: (info_t_M= info_tecnologiche_M )?
			int alt21=2;
			switch ( input.LA(1) ) {
				case ROT_TOOL_CW:
					{
					alt21=1;
					}
					break;
				case ROT_TOOL_ACW:
					{
					alt21=1;
					}
					break;
				case STOP_TOOL:
					{
					alt21=1;
					}
					break;
				case CHANGE_TOOL:
					{
					alt21=1;
					}
					break;
				case LUBE_ON:
					{
					alt21=1;
					}
					break;
				case LUBE_OFF:
					{
					alt21=1;
					}
					break;
				case END_PROG:
					{
					alt21=1;
					}
					break;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:69: info_t_M= info_tecnologiche_M
					{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M506);
					info_t_M=info_tecnologiche_M();
					state._fsp--;

					 info_t_M_list.add(info_t_M); 
					}
					break;

			}

			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:135: (info_t_M= info_tecnologiche_M )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==CHANGE_TOOL||LA22_0==END_PROG||(LA22_0 >= LUBE_OFF && LA22_0 <= LUBE_ON)||(LA22_0 >= ROT_TOOL_ACW && LA22_0 <= ROT_TOOL_CW)||LA22_0==STOP_TOOL) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:118:136: info_t_M= info_tecnologiche_M
					{
					pushFollow(FOLLOW_info_tecnologiche_M_in_info_3M517);
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:125:1: info_geometriche returns [InfoGeometriche info_g] : (x= COORD_ABS |x= COORD_REL |l= FREE_MOVE c_xyz= coordinate_XYZ |l= JOB_MOVE c_xyz= coordinate_XYZ |c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |d= COMP_DIS |d= COMP_L |d= COMP_R );
	public final InfoGeometriche info_geometriche() throws RecognitionException {
		InfoGeometriche info_g = null;


		Token x=null;
		Token l=null;
		Token c=null;
		Token d=null;
		Coordinate c_xyz =null;
		Coordinate c_ijk =null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:126:2: (x= COORD_ABS |x= COORD_REL |l= FREE_MOVE c_xyz= coordinate_XYZ |l= JOB_MOVE c_xyz= coordinate_XYZ |c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK |d= COMP_DIS |d= COMP_L |d= COMP_R )
			int alt23=9;
			switch ( input.LA(1) ) {
			case COORD_ABS:
				{
				alt23=1;
				}
				break;
			case COORD_REL:
				{
				alt23=2;
				}
				break;
			case FREE_MOVE:
				{
				alt23=3;
				}
				break;
			case JOB_MOVE:
				{
				alt23=4;
				}
				break;
			case CIRCLE_CW:
				{
				alt23=5;
				}
				break;
			case CIRCLE_ACW:
				{
				alt23=6;
				}
				break;
			case COMP_DIS:
				{
				alt23=7;
				}
				break;
			case COMP_L:
				{
				alt23=8;
				}
				break;
			case COMP_R:
				{
				alt23=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:127:3: x= COORD_ABS
					{
					x=(Token)match(input,COORD_ABS,FOLLOW_COORD_ABS_in_info_geometriche546); 
					 info_g = new InfoGeometriche(x, 'x'); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:128:4: x= COORD_REL
					{
					x=(Token)match(input,COORD_REL,FOLLOW_COORD_REL_in_info_geometriche557); 
					 info_g = new InfoGeometriche(x, 'x'); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:129:4: l= FREE_MOVE c_xyz= coordinate_XYZ
					{
					l=(Token)match(input,FREE_MOVE,FOLLOW_FREE_MOVE_in_info_geometriche568); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche574);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					 info_g = new InfoGeometriche(new LinearMove(l, c_xyz)); 
					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:130:4: l= JOB_MOVE c_xyz= coordinate_XYZ
					{
					l=(Token)match(input,JOB_MOVE,FOLLOW_JOB_MOVE_in_info_geometriche585); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche591);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					 info_g = new InfoGeometriche(new LinearMove(l, c_xyz)); 
					}
					break;
				case 5 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:131:4: c= CIRCLE_CW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK
					{
					c=(Token)match(input,CIRCLE_CW,FOLLOW_CIRCLE_CW_in_info_geometriche603); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche609);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche615);
					c_ijk=coordinate_IJK();
					state._fsp--;

					 info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); 
					}
					break;
				case 6 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:132:4: c= CIRCLE_ACW c_xyz= coordinate_XYZ c_ijk= coordinate_IJK
					{
					c=(Token)match(input,CIRCLE_ACW,FOLLOW_CIRCLE_ACW_in_info_geometriche626); 
					pushFollow(FOLLOW_coordinate_XYZ_in_info_geometriche632);
					c_xyz=coordinate_XYZ();
					state._fsp--;

					pushFollow(FOLLOW_coordinate_IJK_in_info_geometriche638);
					c_ijk=coordinate_IJK();
					state._fsp--;

					 info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); 
					}
					break;
				case 7 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:133:4: d= COMP_DIS
					{
					d=(Token)match(input,COMP_DIS,FOLLOW_COMP_DIS_in_info_geometriche649); 
					 info_g = new InfoGeometriche(d, 'd'); 
					}
					break;
				case 8 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:134:4: d= COMP_L
					{
					d=(Token)match(input,COMP_L,FOLLOW_COMP_L_in_info_geometriche660); 
					 info_g = new InfoGeometriche(d, 'd'); 
					}
					break;
				case 9 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:135:4: d= COMP_R
					{
					d=(Token)match(input,COMP_R,FOLLOW_COMP_R_in_info_geometriche671); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:141:1: coordinate_XYZ returns [Coordinate c_xyz] : (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD ) ;
	public final Coordinate coordinate_XYZ() throws RecognitionException {
		Coordinate c_xyz = null;


		Token x=null;
		Token y=null;
		Token z=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:142:2: ( (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:2: (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:2: (x= X_CORD (y= Y_CORD )? (z= Z_CORD )? |y= Y_CORD (z= Z_CORD )? |z= Z_CORD )
			int alt27=3;
			switch ( input.LA(1) ) {
			case X_CORD:
				{
				alt27=1;
				}
				break;
			case Y_CORD:
				{
				alt27=2;
				}
				break;
			case Z_CORD:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:4: x= X_CORD (y= Y_CORD )? (z= Z_CORD )?
					{
					x=(Token)match(input,X_CORD,FOLLOW_X_CORD_in_coordinate_XYZ700); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:15: (y= Y_CORD )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==Y_CORD) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:16: y= Y_CORD
							{
							y=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ707); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:29: (z= Z_CORD )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==Z_CORD) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:143:30: z= Z_CORD
							{
							z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ716); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:144:4: y= Y_CORD (z= Z_CORD )?
					{
					y=(Token)match(input,Y_CORD,FOLLOW_Y_CORD_in_coordinate_XYZ728); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:144:15: (z= Z_CORD )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==Z_CORD) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:144:16: z= Z_CORD
							{
							z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ735); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:145:4: z= Z_CORD
					{
					z=(Token)match(input,Z_CORD,FOLLOW_Z_CORD_in_coordinate_XYZ746); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:153:1: coordinate_IJK returns [Coordinate c_ijk] : (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD ) ;
	public final Coordinate coordinate_IJK() throws RecognitionException {
		Coordinate c_ijk = null;


		Token i=null;
		Token j=null;
		Token k=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:154:2: ( (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD ) )
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:2: (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD )
			{
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:2: (i= I_CORD (j= J_CORD )? (k= K_CORD )? |j= J_CORD (k= K_CORD )? |k= K_CORD )
			int alt31=3;
			switch ( input.LA(1) ) {
			case I_CORD:
				{
				alt31=1;
				}
				break;
			case J_CORD:
				{
				alt31=2;
				}
				break;
			case K_CORD:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:4: i= I_CORD (j= J_CORD )? (k= K_CORD )?
					{
					i=(Token)match(input,I_CORD,FOLLOW_I_CORD_in_coordinate_IJK778); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:15: (j= J_CORD )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==J_CORD) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:16: j= J_CORD
							{
							j=(Token)match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK785); 
							}
							break;

					}

					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:29: (k= K_CORD )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==K_CORD) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:155:30: k= K_CORD
							{
							k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK794); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:156:4: j= J_CORD (k= K_CORD )?
					{
					j=(Token)match(input,J_CORD,FOLLOW_J_CORD_in_coordinate_IJK805); 
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:156:15: (k= K_CORD )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==K_CORD) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:156:16: k= K_CORD
							{
							k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK812); 
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:157:4: k= K_CORD
					{
					k=(Token)match(input,K_CORD,FOLLOW_K_CORD_in_coordinate_IJK823); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:165:1: info_tecnologiche returns [InfoTecnologiche info_t] : (x= FREE_MOVE_SPEED |x= JOB_MOVE_SPEED |x= TOOL_CHANGE );
	public final InfoTecnologiche info_tecnologiche() throws RecognitionException {
		InfoTecnologiche info_t = null;


		Token x=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:166:2: (x= FREE_MOVE_SPEED |x= JOB_MOVE_SPEED |x= TOOL_CHANGE )
			int alt32=3;
			switch ( input.LA(1) ) {
			case FREE_MOVE_SPEED:
				{
				alt32=1;
				}
				break;
			case JOB_MOVE_SPEED:
				{
				alt32=2;
				}
				break;
			case TOOL_CHANGE:
				{
				alt32=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:167:3: x= FREE_MOVE_SPEED
					{
					x=(Token)match(input,FREE_MOVE_SPEED,FOLLOW_FREE_MOVE_SPEED_in_info_tecnologiche853); 
					 info_t = new InfoTecnologiche(x, 'f'); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:168:4: x= JOB_MOVE_SPEED
					{
					x=(Token)match(input,JOB_MOVE_SPEED,FOLLOW_JOB_MOVE_SPEED_in_info_tecnologiche864); 
					 info_t = new InfoTecnologiche(x, 'j'); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:169:4: x= TOOL_CHANGE
					{
					x=(Token)match(input,TOOL_CHANGE,FOLLOW_TOOL_CHANGE_in_info_tecnologiche875); 
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
	// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:175:1: info_tecnologiche_M returns [InfoTecnologicheM info_t_M] : (x= ROT_TOOL_CW |x= ROT_TOOL_ACW |s= STOP_TOOL |f= CHANGE_TOOL |g= LUBE_ON |g= LUBE_OFF |h= END_PROG );
	public final InfoTecnologicheM info_tecnologiche_M() throws RecognitionException {
		InfoTecnologicheM info_t_M = null;


		Token x=null;
		Token s=null;
		Token f=null;
		Token g=null;
		Token h=null;

		try {
			// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:176:2: (x= ROT_TOOL_CW |x= ROT_TOOL_ACW |s= STOP_TOOL |f= CHANGE_TOOL |g= LUBE_ON |g= LUBE_OFF |h= END_PROG )
			int alt33=7;
			switch ( input.LA(1) ) {
			case ROT_TOOL_CW:
				{
				alt33=1;
				}
				break;
			case ROT_TOOL_ACW:
				{
				alt33=2;
				}
				break;
			case STOP_TOOL:
				{
				alt33=3;
				}
				break;
			case CHANGE_TOOL:
				{
				alt33=4;
				}
				break;
			case LUBE_ON:
				{
				alt33=5;
				}
				break;
			case LUBE_OFF:
				{
				alt33=6;
				}
				break;
			case END_PROG:
				{
				alt33=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:177:2: x= ROT_TOOL_CW
					{
					x=(Token)match(input,ROT_TOOL_CW,FOLLOW_ROT_TOOL_CW_in_info_tecnologiche_M901); 
					 info_t_M = new InfoTecnologicheM(x, 'x'); 
					}
					break;
				case 2 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:178:3: x= ROT_TOOL_ACW
					{
					x=(Token)match(input,ROT_TOOL_ACW,FOLLOW_ROT_TOOL_ACW_in_info_tecnologiche_M911); 
					 info_t_M = new InfoTecnologicheM(x, 'x'); 
					}
					break;
				case 3 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:179:3: s= STOP_TOOL
					{
					s=(Token)match(input,STOP_TOOL,FOLLOW_STOP_TOOL_in_info_tecnologiche_M921); 
					 info_t_M = new InfoTecnologicheM(s, 's'); 
					}
					break;
				case 4 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:180:3: f= CHANGE_TOOL
					{
					f=(Token)match(input,CHANGE_TOOL,FOLLOW_CHANGE_TOOL_in_info_tecnologiche_M931); 
					 info_t_M = new InfoTecnologicheM(f, 'f'); 
					}
					break;
				case 5 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:181:3: g= LUBE_ON
					{
					g=(Token)match(input,LUBE_ON,FOLLOW_LUBE_ON_in_info_tecnologiche_M941); 
					 info_t_M = new InfoTecnologicheM(g, 'g'); 
					}
					break;
				case 6 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:182:3: g= LUBE_OFF
					{
					g=(Token)match(input,LUBE_OFF,FOLLOW_LUBE_OFF_in_info_tecnologiche_M951); 
					 info_t_M = new InfoTecnologicheM(g, 'g'); 
					}
					break;
				case 7 :
					// C:\\Users\\ghisl\\Documents\\GitHub\\progetto_LFC\\codice_LFC\\src\\gcodeCompiler\\gcodeGrammar.g:183:3: h= END_PROG
					{
					h=(Token)match(input,END_PROG,FOLLOW_END_PROG_in_info_tecnologiche_M961); 
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
	public static final BitSet FOLLOW_N_BLOCK_in_block_corretto321 = new BitSet(new long[]{0x000000006D9B9F70L});
	public static final BitSet FOLLOW_info_geometriche_in_block_corretto334 = new BitSet(new long[]{0x000000006D9B9F70L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block_corretto361 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_block_corretto366 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_block_corretto392 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block_corretto397 = new BitSet(new long[]{0x0000000040120002L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block_corretto432 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_block_corretto437 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_block_corretto451 = new BitSet(new long[]{0x000000006D928012L});
	public static final BitSet FOLLOW_info_tecnologiche_in_block_corretto456 = new BitSet(new long[]{0x0000000040120002L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M496 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M506 = new BitSet(new long[]{0x000000002D808012L});
	public static final BitSet FOLLOW_info_tecnologiche_M_in_info_3M517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_ABS_in_info_geometriche546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORD_REL_in_info_geometriche557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREE_MOVE_in_info_geometriche568 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_MOVE_in_info_geometriche585 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_CW_in_info_geometriche603 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche609 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_ACW_in_info_geometriche626 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinate_XYZ_in_info_geometriche632 = new BitSet(new long[]{0x0000000000640000L});
	public static final BitSet FOLLOW_coordinate_IJK_in_info_geometriche638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_DIS_in_info_geometriche649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_L_in_info_geometriche660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMP_R_in_info_geometriche671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_X_CORD_in_coordinate_XYZ700 = new BitSet(new long[]{0x0000000600000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ707 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_CORD_in_coordinate_XYZ728 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_CORD_in_coordinate_XYZ746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_I_CORD_in_coordinate_IJK778 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK785 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_CORD_in_coordinate_IJK805 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CORD_in_coordinate_IJK823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREE_MOVE_SPEED_in_info_tecnologiche853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOB_MOVE_SPEED_in_info_tecnologiche864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOOL_CHANGE_in_info_tecnologiche875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROT_TOOL_CW_in_info_tecnologiche_M901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROT_TOOL_ACW_in_info_tecnologiche_M911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STOP_TOOL_in_info_tecnologiche_M921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHANGE_TOOL_in_info_tecnologiche_M931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_ON_in_info_tecnologiche_M941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUBE_OFF_in_info_tecnologiche_M951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_PROG_in_info_tecnologiche_M961 = new BitSet(new long[]{0x0000000000000002L});
}
