# Overview
G-code Parser is built with the idea of being able to parse a simplified version of the original [G-code programming language](https://en.wikipedia.org/wiki/G-code) used to program CNC machines. The are some differences between the real G-code and the G-code which is parsed by this compiler, like:
- G-code Parser requires a stricter order for the directives defined inside the N-blocks (*info_geometriche*-*info_tecnologiche*-*info_3M*)
- G-code Parser is not parsing any rules concerning unit of measurement (like G94, G95, G96, G97). The parser is built considering G94 and G97 as default and they can't be changed
- GCode Shaper can't deal with arcs which are not exactly equal to 90 degrees

A G-code specification is composed by an infinite number of N-blocks, each of them with same structure. Each block must begin with an **increasing** N-block number and the last block must containt the **M30** directive. The structure of a block is composed by 3 main structures that, if defined, must follow the following order:
1. *info_geometriche*
2. *info_tecnologiche*
3. *info_3M*

### EBNF Notation
```
block ::= N_BLOCK (
                    ( info_geometriche )+  (
                                               ( info_3M )?  
                                             | ( info_tecnologiche )+ ( info_3M )? 
                                           )
                    | ( info_tecnologiche )+ ( info_3M  )? 
                    | info_3M	 
                  )  
```
### Syntax Diagram
![block_rail](https://user-images.githubusercontent.com/36998696/159574128-d7a2bc33-2044-4549-9893-c9790bfbfd37.png)
</br></br>

# info_geometriche

### EBNF Notation
```
info_geometriche ::= (  COORD_ABS
                      | COORD_REL
                      | FREE_MOVE coordinate_XYZ
                      | JOB_MOVE coordinate_XYZ
                      | CIRCLE_CW coordinate_XYZ coordinate_IJK
                      | CIRCLE_ACW coordinate_XYZ coordinate_IJK
                      | COMP_DIS
                      | COMP_L
                      | COMP_R
                     )
```
### Syntax Diagram
![info_geometriche](https://user-images.githubusercontent.com/36998696/159574833-58a51ecd-809a-477f-b565-c47fbade1039.png)
</br></br>

# info_tecnologiche

### EBNF Notation
```
info_tecnologiche ::= FREE_MOVE_SPEED
                    | JOB_MOVE_SPEED
                    | TOOL_CHANGE
```
### Syntax Diagram
![info_tecnologiche](https://user-images.githubusercontent.com/36998696/159575620-45e1c984-ef92-4cd9-9ff3-bd5005e40998.png)
</br></br>

# info_3M

### EBNF Notation
```
info_3M ::= info_tecnologiche_M ( info_tecnologiche_M )? ( info_tecnologiche_M )?
```
### Syntax Diagram
![info_3M](https://user-images.githubusercontent.com/36998696/159576293-edcb4641-9d63-4422-8c3b-f39e283dcd25.png)
</br></br>

# info_tecnologiche_M

### EBNF Notation
```
info_tecnologiche_M ::= ROT_TOOL_CW 
                      | ROT_TOOL_ACW
                      | STOP_TOOL
                      | CHANGE_TOOL
                      | LUBE_ON
                      | LUBE_OFF
                      | END_PROG
```
### Syntax Diagram
![info_tecnologiche_M](https://user-images.githubusercontent.com/36998696/159575838-9efbf27f-d50f-4622-a316-279bcdfff1c0.png)
</br></br>

# Examples
```
Testare diverse forme di rettangolo (magari mettere commenti come "equilatero", "rettangolo" etc)
```

# References
For the *token list specification* see description [tokenList.md](/docs/gcode%20parser/tokenList.md) file.
