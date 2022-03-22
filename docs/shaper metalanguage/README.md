# Overview
A Shaper specification is composed by a *shape* followed by the job *configuration* machine parameters. The *configuration* definition must always be defined in each Shaper directive and it must follow the *shape* definition.



### EBNF Notation
```
shaper ::=  (   circle
	      | triangle  
	      | rectangle  
	      | square 
     	    ) configuration
```
### Syntax Diagram
SINTAX DIAGRAM FOTO SISTEMATO (per parametri foto vedi readme della mainpage)
</br></br>

# Configuration
The *configuration* directive is indipendent from the particular *shape* defined and it requires to specify the following parameters:
- movement speed, ?? Ghislo ?? G00 parameter 
- job speed, ?? Ghislo ??
- lube power option, it is used to set the lube on or off (M08 or M09 G-code directive respectively)

### EBNF Notation
Da sistemare graficamente (si veda progetto JCO)
```
configuration
	:	
		CONFIG  (
					  ( MOVE_SPEED (
									  JOB_SPEED LUBE_SET ON_OFF
								   |  LUBE_SET ON_OFF JOB_SPEED
								 )
					  )  
					| (	JOB_SPEED (
									  MOVE_SPEED LUBE_SET ON_OFF
								   |  LUBE_SET ON_OFF MOVE_SPEED
								  )
					  )
					| (	LUBE_SET ON_OFF (
											JOB_SPEED MOVE_SPEED
										 |	MOVE_SPEED JOB_SPEED
										)
					  )
				) 
			
	;
```

### Syntax Diagram
Da inserire syntax diagram

SINTAX DIAGRAM FOTO SISTEMATO (per parametri foto vedi readme della mainpage)

### Examples
Examples of *configuration* definition are shown in the shapes paragraph.
</br></br>

# Shapes
Shaper currently provides support for 4 different type of *shape* figures:
- circle
- triangle
- rectangle
- square

## Circle
Introduzione al cerchio e che cosa fa (il comando cerchio mi permette di fare un cerchio con centro in XX di raggio BLABLA etc etc bello)

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

### Examples
```
CIRCLE C(X250)(Y250) R100
CONFIGURATION MS54 JS10 LB ON
```

### Errors
Qui mettiamo quali sono gli errori che il cerchio può sollevare. Facciamo un esempio di codice che solleva l'errore. Mettiamo un link alla pagina che contiene la tabella degli errori e specifichiamo il suo numero.

```
 code here
```

## Triangle
Introduzione al comando

### EBNF Notation
```
code here
```

### Syntax Diagram
Syntax photo

### Examples
```
Testare diverse forme di rettangolo (magari mettere commenti come "equilatero", "rettangolo" etc)
```

### Errors
Se ci sono errori, fare come cerchio
```
 code che solleva errore
```

## Rectangle
Introduzione al comando

### EBNF Notation
```
code here
```

### Syntax Diagram
Syntax photo

### Examples
```
Testare diverse forme di rettangolo (magari mettere commenti come "equilatero", "rettangolo" etc)
```

### Errors
Se ci sono errori, fare come cerchio
```
 code che solleva errore
```

## Square
Introduzione al comando

### EBNF Notation
```
code here
```

### Syntax Diagram
Syntax photo

### Examples
```
Testare diverse forme di rettangolo (magari mettere commenti come "equilatero", "rettangolo" etc)
```

### Errors
Se ci sono errori, fare come cerchio
```
 code che solleva errore
```
</br>

# References
For the *token list specification* see description [tokenList.md](/docs/shaper metalanguage/tokenList.md) file.
