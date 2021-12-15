lexer grammar gcodeGrammar;

options {
	language = Java;
}

@lexer::header {
package javaCompiler;
}

@lexer::members {

}

N_BLOCK	
	:	'N' ('1' .. '9')('0' .. '9')*
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
	:	'F' ('1' .. '9')('0' .. '9')*
	;

JOB_MOVE_SPEED
	:	'S' ('1' .. '9')('0' .. '9')*
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