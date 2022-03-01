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
}

//specifica gcode
gcode 
	:
	block+
	;
	
//singolo blocco
//max 3 info_tecnologiche_M
//ordine necessariamente [info_geometriche] [info_tecnologiche] [info_3M]
block
	:
		N_BLOCK (
							(info_geometriche)+ (
		 																	| (info_tecnologiche)+ (info_3M)?
		 															)
		 																	
							|	(info_tecnologiche)+ (info_3M)?
							| info_3M 
						)
	;
	
info_3M
	:
		info_tecnologiche_M (info_tecnologiche_M)? (info_tecnologiche_M)?
	;

info_geometriche
	:	
		COORD_ABS
	|	COORD_REL
	| FREE_MOVE coordinate_XYZ
	| JOB_MOVE	coordinate_XYZ
	| CIRCLE_CW coordinate_XYZ coordinate_IJK
	| CIRCLE_ACW coordinate_XYZ coordinate_IJK
	| COMP_DIS
	| COMP_L
	| COMP_R
	;
	
coordinate_XYZ
	:
		X_CORD (Y_CORD)? (Z_CORD)?
	| Y_CORD (Z_CORD)?
	| Z_CORD
	;
	
coordinate_IJK
	:	
		I_CORD (J_CORD)? (K_CORD)?
	| J_CORD (K_CORD)?
	| K_CORD
	;

info_tecnologiche
	:	
		FREE_MOVE_SPEED
	|	JOB_MOVE_SPEED
	| TOOL_CHANGE
	;
	
info_tecnologiche_M
	:
		ROT_TOOL_CW
	|	ROT_TOOL_ACW
	| STOP_TOOL
	| CHANGE_TOOL
	| LUBE_ON
	| LUBE_OFF
	| END_PROG
	;

fragment DIGIT
	:	'0'..'9'
	;
	
fragment CORD_DIGIT
	:	('-')?(DIGIT)+
	;
	
X_CORD
	: 'X'CORD_DIGIT	
	;
	
Y_CORD
	: 'Y'CORD_DIGIT	
	;
	
Z_CORD
	: 'Z'CORD_DIGIT	
	;
	
I_CORD
	: 'I'CORD_DIGIT	
	;
	
J_CORD
	: 'J'CORD_DIGIT	
	;
	
K_CORD
	: 'K'CORD_DIGIT	
	;

N_BLOCK	
	:	'N' ('1' .. '9')(DIGIT)*
	;
	
COORD_ABS
	:	'G90'
	;

COORD_REL
	:	'G91'
	;

FREE_MOVE
	:	'G00'
	;
	
JOB_MOVE
	:	'G01'
	;
	
CIRCLE_CW
	:	'G02'
	;

CIRCLE_ACW
	:	'G03'
	;

COMP_DIS
	:	'G40'
	;

COMP_L
	:	'G41'
	;

COMP_R
	:	'G42'
	;

FREE_MOVE_SPEED
	:	'F' ('1' .. '9')(DIGIT)*
	;

JOB_MOVE_SPEED
	:	'S' ('1' .. '9')(DIGIT)*
	;
	
TOOL_CHANGE
	:	'T0' ('1' .. '9') '0' ('1' .. '9')	
	;
	
ROT_TOOL_CW
	: 'M03'	
	;
	
ROT_TOOL_ACW
	: 'M04'	
	;
	
STOP_TOOL
	: 'M05'	
	;
	
CHANGE_TOOL
	: 'M06'	
	;
	
LUBE_ON
	: 'M08'	
	;
	
LUBE_OFF
	: 'M09'	
	;
	
END_PROG
	: 'M30'	
	;
	
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;