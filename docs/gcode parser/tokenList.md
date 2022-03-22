# List of tokens of the G-CODE Language

| Token | Definition |
| ----- | ---------- | 
| **Macro** | |
| LETTER | \['A'..'Z' \| 'a'..'z'\] |
| DIGIT  | \['0'..'9'\] |
| WS |   \[ ' '  \|  '\t'  \|  '\r'  \|  '\n'  \]+  |
| COMMENT | \['//' ~('\n'\|'\r')* '\r'? '\n' \| '/*' ( options {greedy=false;} : . )* '*/'\] |
| END_PROG  | 'M30' |
| LUBE_OFF | 'M09' |
| LUBE_ON | 'M08' |
| CHANGE_TOOL | 'M06' |
| STOP_TOOL | 'M05' |
| ROT_TOOL_ACW | 'M04' |
| ROT_TOOL_CW | 'M03' |
| TOOL_CHANGE				| 'T0' ('1' .. '9') '0' ('1' .. '9') |
| JOB_MOVE_SPEED   			| 'S' ('1' .. '9')(DIGIT)* |
| FREE_MOVE_SPEED     | 'F' ('1' .. '9')(DIGIT)* |
| COMP_R           | 'G42' |
| COMP_L           | 'G41' |
| COMP_DIS           | 'G40' |
| CIRCLE_ACW			|	'G03' |
| CIRCLE_CW          | 'G02' |
| JOB_MOVE         | 'G01' |
| FREE_MOVE            | 'G00' |
| COORD_REL					|	'G91' | 
| COORD_ABS       | 'G90' |
| N_BLOCK	            | 'N' ('0' .. '9')(DIGIT)* |
| K_CORD          | 'K'CORD_DIGIT |
| J_CORD     | 'J'CORD_DIGIT	 |
| I_CORD    | 'I'CORD_DIGIT	 |
| Z_CORD    | 'Z'CORD_DIGIT		 |
| Y_CORD    | 'Y'CORD_DIGIT	 |
| X_CORD    | 'X'CORD_DIGIT	 |
| CORD_DIGIT    | ('-')?(DIGIT)+	 |
| I_CORD    | 'I'CORD_DIGIT	 |
| I_CORD    | 'I'CORD_DIGIT	 |
| I_CORD    | 'I'CORD_DIGIT	 |
