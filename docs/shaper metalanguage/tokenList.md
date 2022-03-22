# List of tokens of the Shaper Language

| Token | Definition |
| ----- | ---------- | 
| **Macro** | |
| LETTER | \['A'..'Z' \| 'a'..'z'\] |
| DIGIT  | \['0'..'9'\] |
| WS |   \[ ' '  \|  '\t'  \|  '\r'  \|  '\n'  \]+  |
| COMMENT | \['//' ~('\n'\|'\r')* '\r'? '\n' \| '/*' ( options {greedy=false;} : . )* '*/'\] |
| OB  | '(' |
| CB | ')' |
| ON_OFF | 'ON' \| 'OFF' |
| LUBE_SET | 'LB' |
| JOB_SPEED | 'JS' DIGIT+ |
| MOVE_SPEED | 'MS' DIGIT+ |
| CONFIG | 'CONFIGURATION' |
| Y_CORD				| 'Y' DIGIT+ |
| X_CORD   			| 'X' DIGIT+ |
| SQUARE_CONFIG     | 'UP' \|	'DOWN' |
| P1           | 'P1' |
| P2           | 'P2' |
| P3           | 'P3' |
| RECTANGLE_H			|	'H' |
| RECTANGLE_B          | 'B' |
| RECTANGLE_P         | 'P' |
| SQUARE_L            | 'L' |
| CIRCLE_R					|	'R' DIGIT+ | 
| CIRCLE_C       | 'C' |
| TRIANGLE            | 'TRIANGLE' |
| RECTANGLE          | 'RECTANGLE' |
| SQUARE     | 'SQUARE' |
| CIRCLE    | 'CIRCLE' |
