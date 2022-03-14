grammar shaperGrammar;

options {
	language = Java;
	k=1;
}

@lexer::header {
package shaperCompiler;

import java.util.*;
}

@header {
package shaperCompiler;

import shaperCompiler.shaperGrammarHandler;
import shaperCompiler.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
}

// inserito il costruttore
@members {
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
}

shaper
@init { setup(); }
	:	
		(circle | square | rectangle | triangle)
		configuration
		EOF
	;
	
circle
	:	
		CIRCLE CIRCLE_C OB X_CORD CB OB Y_CORD CB  CIRCLE_R
	;
	
square
	:	
		SQUARE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB SQUARE_CONFIG
	;
	
rectangle
	:	
		RECTANGLE P1 OB X_CORD CB OB Y_CORD CB (P2 | RECTANGLE_B) OB X_CORD CB OB Y_CORD CB (P3 | RECTANGLE_H) OB X_CORD CB OB Y_CORD CB 
	;
	
triangle
	:	
		TRIANGLE P1 OB X_CORD CB OB Y_CORD CB P2 OB X_CORD CB OB Y_CORD CB P3 OB X_CORD CB OB Y_CORD CB 
	;
	
configuration
	:	
		CONFIG (
								(		MOVE_SPEED (
																	JOB_SPEED LUBE_SET ON_OFF
																|	LUBE_SET ON_OFF JOB_SPEED
												 			)
								)
							| (		JOB_SPEED (
																	MOVE_SPEED LUBE_SET ON_OFF
																|	LUBE_SET ON_OFF MOVE_SPEED
												 			)
								)
							| (		LUBE_SET ON_OFF (
																			JOB_SPEED MOVE_SPEED
																		|	MOVE_SPEED JOB_SPEED
												 						)
								)
					 )
	;
	
CIRCLE
	:
		'CIRCLE'	
	;
	
SQUARE
	:
		'SQUARE'	
	;
	
RECTANGLE
	:
		'RECTANGLE'	
	;
	
TRIANGLE
	:
		'TRIANGLE'	
	;
	
// centro cerchio
CIRCLE_C
	:
		'C'
	;
	
CIRCLE_R
	:
		'R' DIGIT+	
	;
	
SQUARE_L
	:
		'L'	
	;
	
RECTANGLE_P
	:
		'P'	
	;
	
RECTANGLE_B
	:
		'B'	
	;
	
RECTANGLE_H
	:
		'H'	
	;
	
P1
	:
		'P1'	
	;
	
P2
	:
		'P2'	
	;
	
P3
	:
		'P3'	
	;
	
SQUARE_CONFIG
	:
		'UP'
	|	'DOWN'	
	;
	
// coordinata X
X_CORD
	:
		'X' DIGIT+
	;
	
// coordinata Y
Y_CORD
	:
		'Y' DIGIT+
	;
	
// token di configurazione
CONFIG
	:
		'CONFIGURATION'	
	;
	
MOVE_SPEED
	:
		'MS' DIGIT+	
	;
	
JOB_SPEED
	:
		'JS' DIGIT+	
	;
	
LUBE_SET
	:
		'LB'
	;
	
ON_OFF
	:
		'ON'
	|	'OFF'	
	;
	
OB
	:	
		'('
	;	
	
CB
	:
		')'
	;	
	
		
// intero da 0 a 9
fragment DIGIT
	:	
		'0'..'9'
	;

// commento
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// white space
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

SCAN_ERROR
	:	
		.
	;