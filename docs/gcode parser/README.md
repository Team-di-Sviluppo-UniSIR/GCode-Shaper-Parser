# Overview
G-code Parser is built with the idea of being able to parse a simplified version of the original [G-code programming language](https://en.wikipedia.org/wiki/G-code) used to program CNC machines. The are some differences between the real G-code and the G-code which is parsed by this compiler, like:
- G-code Parser requires a stricter order for the directives defined inside the N-blocks (*info_geometriche*-*info_tecnologiche*-*info_3M*)
- G-code Parser is not parsing any rules concerning unit of measurement (like G94, G95, G96, G97). The parser is built considering G94 and G97 as default and they can't be changed.

A G-code specification is composed by an infinite number of N-blocks, each of them with same structure. Each block must begin with an **increasing** N-block number and the last block must containt the **M30** directive. The structure of a block is composed by 3 main structures that, if defined, must follow the following order:
1. *info_geometriche*
2. *info_tecnologiche*
3. *info_3M*

### EBNF Notation
```
shaper ::=  
```
### Syntax Diagram
![shaper_rail](https://user-images.githubusercontent.com/36998696/159554938-aa71c5c5-c419-4c64-8c83-ea2ef6b72f86.png)
</br></br>

# info_geometriche
The *configuration* directive is indipendent from the particular *shape* defined and it requires to specify the following parameters:
- *movement speed*, that is the speed associated to the tool while not in use;
- *job speed*, defined as the speed associated to the tool while in use;
- *lube power option*, it is used to set the lube on or off (M08 or M09 G-code directive respectively)

# info_tecnologiche

# info_3M

# info_3M

# Examples
```
Testare diverse forme di rettangolo (magari mettere commenti come "equilatero", "rettangolo" etc)
```

# References
For the *token list specification* see description [tokenList.md](/docs/gcode%20parser/tokenList.md) file.
