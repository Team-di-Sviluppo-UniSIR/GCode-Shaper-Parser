grammar gcodeGrammar;

options {
	language = Java;
	k=1;
}

@lexer::header {
package gcodeCompiler;
}

@header {
package gcodeCompiler;

import gcodeCompiler.*;
import gcodeCompiler.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
}

@members {
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

}

/*
specifica gcode
insieme di blocchi aventi tutti la medesima struttura, 
riportata di seguito
*/ 
gcode 
	@init { setup(); }
	:
	block+
	;
	
/*
singolo blocco
contiene al massimo 3 info_tecnologiche_M
l'ordine deve essere necessariamente [info_geometriche] [info_tecnologiche] [info_3M]
*/
block
@init{ 
				ArrayList<InfoGeometriche> info_g_list = new ArrayList<InfoGeometriche>();
				ArrayList<InfoTecnologiche> info_t_list = new ArrayList<InfoTecnologiche>();
		 }
	:
		n = N_BLOCK (
								( info_g = info_geometriche { info_g_list.add(info_g); } )+ (		
																				( info_t_M_list = info_3M )?
		 																	| ( info_t = info_tecnologiche { info_t_list.add(info_t); } )+ ( info_t_M_list = info_3M )?
		 															)
		 																	
							|	( info_t = info_tecnologiche { info_t_list.add(info_t); } )+ ( info_t_M_list = info_3M  )?
							| info_t_M_list = info_3M
						){ h.createNewBlock($n, info_g_list, info_t_list, info_t_M_list); }
	;
	
/*
informazioni tecnologiche di tipo M per impostazione macchina utensile
al massimo 3 istruzioni di tipo M nello stesso blocco
*/
info_3M returns [ArrayList<InfoTecnologicheM> info_t_M_list] // restituisco lista info_g intercettata sul block
@init{
				info_t_M_list = new ArrayList<InfoTecnologicheM>();
		 }
	:
		info_t_M = info_tecnologiche_M { info_t_M_list.add(info_t_M); } ( info_t_M = info_tecnologiche_M { info_t_M_list.add(info_t_M); })? (info_t_M = info_tecnologiche_M { info_t_M_list.add(info_t_M); })?
	;

/*
informazioni geometriche legate allo spostamento del mandrino 
della macchina utensile
*/
info_geometriche returns [InfoGeometriche info_g] // restituisco oggetto info_g intercettato sul block
	:	
		x = COORD_ABS { info_g = new InfoGeometriche($x, 'x'); }
	|	x = COORD_REL { info_g = new InfoGeometriche($x, 'x'); }
	| l = FREE_MOVE c_xyz = coordinate_XYZ { info_g = new InfoGeometriche(new LinearMove($l, c_xyz)); }
	| l = JOB_MOVE c_xyz = coordinate_XYZ { info_g = new InfoGeometriche(new LinearMove($l, c_xyz)); } 
	| c = CIRCLE_CW c_xyz = coordinate_XYZ c_ijk = coordinate_IJK { info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); }
	| c = CIRCLE_ACW c_xyz = coordinate_XYZ c_ijk = coordinate_IJK { info_g = new InfoGeometriche(new CircularMove(c, c_xyz, c_ijk)); }
	| d = COMP_DIS { info_g = new InfoGeometriche($d, 'd'); }
	| d = COMP_L { info_g = new InfoGeometriche($d, 'd'); }
	| d = COMP_R { info_g = new InfoGeometriche($d, 'd'); }
	;
	
/*
definizione coordinate spaziali (X,Y,Z)
*/
coordinate_XYZ returns [Coordinate c_xyz] // restituisco oggetto di tipo Coordinate
	: 
	(	x = X_CORD (y = Y_CORD)? (z = Z_CORD)? 
	| y = Y_CORD (z = Z_CORD)?
	| z = Z_CORD )
	{ c_xyz = new Coordinate($x, $y, $z); }
	;
	
/*
coordinate (I,J,K) definizione centro circonferenza
per interpolazione circolare oraria e antioraria
*/
coordinate_IJK returns [Coordinate c_ijk] // restituisco oggetto di tipo Coordinate
	:	
	(	i = I_CORD (j = J_CORD)? (k = K_CORD)?
	| j = J_CORD (k = K_CORD)?
	| k = K_CORD )
	{ c_ijk = new Coordinate($i, $j, $k); }
	;

/*
informazioni tecnologiche per la definzione delle velocità
di spostamento, lavorazione e cambio utensile
*/
info_tecnologiche returns [InfoTecnologiche info_t] // restituisco oggetto info_t intercettato sul block
	:	
		x = FREE_MOVE_SPEED { info_t = new InfoTecnologiche($x, 'f'); }
	|	x = JOB_MOVE_SPEED { info_t = new InfoTecnologiche($x, 'j'); }
	| x = TOOL_CHANGE { info_t = new InfoTecnologiche($x, 't'); }
	;
	
/*
comandi costituenti il blocco info_3M
*/	
info_tecnologiche_M returns [InfoTecnologicheM info_t_M] // restituisco oggetto info_t_M intercettata in info_3M
:
	x = ROT_TOOL_CW { info_t_M = new InfoTecnologicheM($x, 'x'); }
| x = ROT_TOOL_ACW { info_t_M = new InfoTecnologicheM($x, 'x'); }
| s = STOP_TOOL { info_t_M = new InfoTecnologicheM($s, 's'); }
| f = CHANGE_TOOL { info_t_M = new InfoTecnologicheM($f, 'f'); }
| g = LUBE_ON { info_t_M = new InfoTecnologicheM($g, 'g'); }
| g = LUBE_OFF { info_t_M = new InfoTecnologicheM($g, 'g'); }
| h = END_PROG { info_t_M = new InfoTecnologicheM($h, 'h'); }
;

// intero da 0 a 9
fragment DIGIT
	:	'0'..'9'
	;
	
// intero da 0 a 9 eventualmente negativo
fragment CORD_DIGIT
	:	('-')?(DIGIT)+
	;
	
// coordinata X
X_CORD
	: 'X'CORD_DIGIT	
	;
	
// coordinata Y
Y_CORD
	: 'Y'CORD_DIGIT	
	;
	
// coordinata Z
Z_CORD
	: 'Z'CORD_DIGIT	
	;
	
// coordinata I
I_CORD
	: 'I'CORD_DIGIT	
	;
	
// coordinata J
J_CORD
	: 'J'CORD_DIGIT	
	;
	
// coordinata K
K_CORD
	: 'K'CORD_DIGIT	
	;

// identificativo numerico del blocco
N_BLOCK	
	:	'N' ('1' .. '9')(DIGIT)*
	;
	
// coordinate assolute
COORD_ABS
	:	'G90'
	;

// coordinate relative
COORD_REL
	:	'G91'
	;

// comando di movimento rapido (spostamento)
FREE_MOVE
	:	'G00'
	;
	
// comando di movimentazione in lavoro
JOB_MOVE
	:	'G01'
	;
	
// interpolazione circolare oraria
CIRCLE_CW
	:	'G02'
	;


// interpolazione circolare antioraria
CIRCLE_ACW
	:	'G03'
	;


// compensazione utensile disattivata
COMP_DIS
	:	'G40'
	;

// compensazione utensile attivata a sinistra
COMP_L
	:	'G41'
	;

// compensazione utensile attivata a destra
COMP_R
	:	'G42'
	;

// definzione velocità di spostamento
FREE_MOVE_SPEED
	:	'F' ('1' .. '9')(DIGIT)*
	;

// definzione velocità di lavoro
JOB_MOVE_SPEED
	:	'S' ('1' .. '9')(DIGIT)*
	;
	
// configurazione utensile
TOOL_CHANGE
	:	'T0' ('1' .. '9') '0' ('1' .. '9')	
	;
	
// rotazione mandrino in senso orario
ROT_TOOL_CW
	: 'M03'	
	;
	
// rotazione mandrino in senso antiorario
ROT_TOOL_ACW
	: 'M04'	
	;
	
// interruzione rotazione mandrino
STOP_TOOL
	: 'M05'	
	;
	
// comando di cambio utensile 
CHANGE_TOOL
	: 'M06'	
	;
	
// attivazione lubrorefrigerante
LUBE_ON
	: 'M08'	
	;
	
// disattivazione lubrorefrigerante
LUBE_OFF
	: 'M09'	
	;
	
// terminazione programma
END_PROG
	: 'M30'	
	;
	
// commento
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// whitespace
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
SCAN_ERROR	: . ;