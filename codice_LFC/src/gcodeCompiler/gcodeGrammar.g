lexer grammar gcodeGrammar;

options {
	language = Java;
}

@lexer::header {
package gcodeCompiler;
}

@lexer::members {

}

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