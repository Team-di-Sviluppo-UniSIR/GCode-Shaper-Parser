# Overview
A Shaper specification is composed by a *shape* followed by the job *configuration* machine parameters. The *configuration* definition must always be defined in each Shaper directive and it must follow the *shape* definition.</br></br> Shaper currently provides support for 4 different type of *shape* figures:
- circle
- triangle
- rectangle
- square


With *configuration* the following parameters are specified:
- movement speed, ?? Ghislo ?? G00 parameter 
- job speed, ?? Ghislo ??
- lube power option, it is used to set the lube on or off (M08 or M09 G-code directive respectively)


### EBNF Notation
```
ebnf ::=  EBNF SISTEMATA

```
### Syntax Diagram
SINTAX DIAGRAM FOTO SISTEMATO (per parametri foto vedi readme della mainpage)


# Shapes

## Circle
Introduzione al cerchio e che cosa ga

### EBNF Notation
```
circle
	:	
		CIRCLE CIRCLE_C 
                  OB 
							              X_CORD 
					        	    CB 
						            OB 
							              Y_CORD 
						            CB 
			     CIRCLE_R

```
### Syntax Diagram
SINTAX DIAGRAM FOTO SISTEMATO (per parametri foto vedi readme della mainpage)


```
 code here
```
