# List of tokens of the Shaper Language

| Token | Definition |
| ----- | ---------- | 
| **Macro** | |
| LETTER | \['A'..'Z' \| 'a'..'z'\] |
| DIGIT0 | \['1'..'9'\] |
| DIGIT  | \['0'..'9'\] |
| WS |   \[ ' '  \|  '\t'  \|  '\r'  \|  '\n'  \]+  |
| **Boolean Operators** | | 
| AND | 'AND' |
| OR  | 'OR' |
| NOT | 'NOT' |
| **Reserved Words** | |
| ADDING				| 'ADDING' |
| ADD_ST   			| 'ADD' |
| AGGREGATE     | 'AGGREGATE' |
| ALL           | 'ALL' |
| ALPHACUT			|	'ALPHA-CUT' |
| AREA          | 'AREA' |
| ARRAY         | 'ARRAY' |
| AS            | 'AS' |
| BODY					|	'BODY' | 
| BOOLEAN       | 'TRUE' \| 'FALSE' |
| BY            | 'BY' |
| CASE          | 'CASE' |
| CHECK_FOR     | 'CHECK' WS 'FOR' |
| COLLECTION    | 'COLLECTION' |
| COLLECTIONS   | 'COLLECTIONS' |
| CREATE_FO			|	'CREATE' WS 'FUZZY' WS 'OPERATOR' |
| CREATE_JF			| 'CREATE' WS 'JAVASCRIPT' WS 'FUNCTION' |
| COUNT					| 'COUNT' |
| DB            | 'DB' |
| DEFAULT       | 'DEFAULT' |
| DICTIONARY		|	'DICTIONARY' |
| DIRECTION			|	'DIRECTION' |
| DISTANCE			|	'DISTANCE' |
| DROP          | 'DROP' |
| DROPPING      | 'DROPPING' |
| DUPLICATES    | 'DUPLICATES' |
| END_BODY			|	'END' WS 'BODY' |
| EXPAND        | 'EXPAND' |
| EVALUATE			|	'EVALUATE' |
| FIELDS				| 'FIELDS' |
| FILTER        | 'FILTER' |
| FIRST	        | 'FIRST' |
| FROM					| 'FROM' |
| FUZZY					| 'FUZZY' |
| GENERATE			|	'GENERATE' |
| GEOMETRY      | 'GEOMETRY' |
| GET           | 'GET' |
| GROUP         | 'GROUP' |
| GROUPING      | 'GROUPING' |
| HOWMEET				|	'HOW-MEET' |
| IFFAILS				| 'IF-FAILS' |
| INCLUDED      | 'INCLUDED' |
| INPUT		      | 'INPUT' |
| INSIDE				|	'INSIDE' |
| INTERMEDIATE  | 'INTERMEDIATE' |
| INTERSECT     | 'INTERSECT' |
| INTERSECTION  | 'INTERSECTION' |
| INTO          | 'INTO' |
| JOIN          | 'JOIN' |
| KEEP          | 'KEEP' |
| KEEPING       | 'KEEPING' |
| KNOWN					|	'KNOWN' |
| LAST          | 'LAST' |
| LEFT          | 'LEFT' |
| MATCHING      | 'MATCHING' |
| MEET          | 'MEET' |
| MEMBERSHIP_OF |	'MEMBERSHIP_OF' |	
| MERGE         | 'MERGE' |
| MIN           |	'MIN' |
| NEW           |	'NEW' |
| OF            | 'OF' |
| ON            | 'ON' |
| ORIENTATION   | 'ORIENTATION' |
| OTHERS        | 'OTHERS' |
| ORDER		  		| \['ORDER' \| 'SORTED'\] |
| OVERLAP				|	'OVERLAP' |
| PARAMETERS		|	'PARAMETERS' |
| PARTITION     | 'PARTITION' |
| PERIMETER			|	'PERIMETER' |
| POINT         | 'POINT' |
| POLYLINE			|	'POLYLINE' |
| PRECONDITION	|	'PRECONDITION' |
| RESOLVING			|	'RESOLVING' |
| RIGHT         | 'RIGHT' |
| REMOVE        | 'REMOVE' |
| SAVE          | 'SAVE' |
| SERIALIZE			| 'SERIALIZE' |
| SERVER        | 'SERVER' |
| SET           | 'SET' |
| SETS          | 'SETS' |
| SETTING       | 'SETTING' |
| SIMILARITY    | 'SIMILARITY' |
| SOURCE        | 'SOURCE' |
| SPATIAL       | 'SPATIAL' |
| SUBTRACT              | 'SUBTRACT' |
| TO                    | 'TO' |
| TO_BOOL               | 'TO_BOOL' |
| TO_FLOAT		| 'TO_FLOAT' |
| TO_INT		| 'TO_INT' |
| TO_POLYLINE           | 'TO_POLYLINE' |
| TO_STRING		| 'TO_STRING' |
| TRAJECTORY            | 'TRAJECTORY' |
| TRANSLATE     | 'TRANSLATE' |
| THRESHOLD     | 'THRESHOLD' |
| TYPE         | TYPE' |
| UNKNOWN	|	'UNKNOWN' |
| UNPACK        | 'UNPACK' |
| USE           | 'USE' |
| USING         | 'USING' |
| VERSUS        | \[ 'DESC' \| 'ASC' \] |
| WEB	| 'WEB' |
| WHERE         | 'WHERE' |
| WITH          | 'WITH' |
| WITHIN        | 'WITHIN' |
| WITHOUT       | 'WITHOUT' |
| WRT           | 'WRT' |
|           |         |
| INT	| \[ '0' \| DIGIT0 DIGIT* ] |
| FLOAT     | \[DIGIT0 DIGIT* DOT DIGIT+ \| '0' DOT DIGIT+] | 
| ID	| LETTER \[ LETTER \| DIGIT \| '\_' \]* |
| FIELD_NAME		| \[ DOT \[LETTER \| DIGIT \| '\_']+ )  \| DOT QUOTE \[~QUOTE]* QUOTE \| DOT '~geometry'  \| DOT '~fuzzysets'  \| '~geometry'] |
| **Puntuaction** | |
| AT    | '@' |
| EQ    | '=' |
| NEQ   | '!=' |
| LE    | '<=' |
| GE    | '>=' |
| LT    | '<' |
| GT    | '>' |
| DOT   | '.' |
| ADD   | '+' |
| SUB   | '-' |
| MUL   | '\*' |
| DIV   | '\\' |
| COMMA | ',' |
| COLON | ':' |
| SC    | ';' |
| LP    | '(' |
| RP    |	')' |
| LB    | '\[' |
| RB    | ']' |
| LBR   | '{' |
| RBR   | '}' |
| APEX  | '\'' |
| QUOTE | '"' |
| SLASH | '/' |
| TILDE | '~' |
| WHITE_SPACES | WS | 
| APEX_VALUE |  APEX \[~APEX) \]* APEX |
| QUOTED_VALUE |  QUOTE \[~QUOTE \]* QUOTE |
| COMMENT  |   '//' _whatever in Java style_ |
| COMMENT  |   '/*' _whatever in Java style_ '\*/' |
