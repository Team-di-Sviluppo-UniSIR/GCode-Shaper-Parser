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
public shaperGrammarHandler h;

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
	:	(
			( c = circle s = configuration ) { h.createShape(s, c); }
		| ( t = triangle s = configuration ) { h.createShape(s, t); }
		| ( r = rectangle s = configuration ) { h.createShape(s, r); }
		| ( q = square s = configuration ) { h.createShape(s, q); }
		) EOF
	;
	
circle returns [Circle c]
	:	
		(CIRCLE CIRCLE_C OB x = X_CORD CB OB y = Y_CORD CB r = CIRCLE_R)
		{ c = new Circle($x, $y, $r); }
	;
	
square returns [Square s]
	:	
		(SQUARE P1 OB x1 = X_CORD CB OB y1 = Y_CORD CB P2 OB x2 = X_CORD CB OB y2 = Y_CORD CB conf = SQUARE_CONFIG)
		{ s = new Square($x1, $y1, $x2, $y2, $conf); }
	;
	
rectangle returns [Rectangle r]
	:	
		(RECTANGLE P1 OB x1 = X_CORD CB OB y1 = Y_CORD CB (P2 | RECTANGLE_B) OB x2 = X_CORD CB OB y2 = Y_CORD CB (P3 | RECTANGLE_H) OB x3 = X_CORD CB OB y3 = Y_CORD CB) 
		{ r = new Rectangle($x1, $y1, $x2, $y2, $x3, $y3); }
	;
	
triangle returns [Triangle t]
	:	
		(TRIANGLE P1 OB x1 = X_CORD CB OB y1 = Y_CORD CB P2 OB x2 = X_CORD CB OB y2 = Y_CORD CB P3 OB x3 = X_CORD CB OB y3 = Y_CORD CB)
		{ t = new Triangle($x1, $y1, $x2, $y2, $x3, $y3); }
	;
	
configuration returns [Shape s]
	:	
		 ( CONFIG (
								(		ms = MOVE_SPEED (
																	js = JOB_SPEED LUBE_SET lb = ON_OFF
																|	LUBE_SET lb = ON_OFF js = JOB_SPEED
												 			)
								) { s = new Shape(' ', $ms, $js, $lb); } 
							| (		js = JOB_SPEED (
																	ms = MOVE_SPEED LUBE_SET lb = ON_OFF
																|	LUBE_SET lb = ON_OFF ms = MOVE_SPEED
												 			)
								) { s = new Shape(' ', $ms, $js, $lb); } 
							| (		LUBE_SET lb = ON_OFF (
																			js = JOB_SPEED ms = MOVE_SPEED
																		|	ms = MOVE_SPEED js = JOB_SPEED
												 						)
								) { s = new Shape(' ', $ms, $js, $lb); } 
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