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
![shaper_rail](https://user-images.githubusercontent.com/36998696/159554938-aa71c5c5-c419-4c64-8c83-ea2ef6b72f86.png)
</br></br>

# Configuration
The *configuration* directive is indipendent from the particular *shape* defined and it requires to specify the following parameters:
- *movement speed*, that is the speed associated to the tool while not in use;
- *job speed*, defined as the speed associated to the tool while in use;
- *lube power option*, it is used to set the lube on or off (M08 or M09 G-code directive respectively)

### EBNF Notation
```
configuration ::= CONFIG  (
			    ( MOVE_SPEED (
				             JOB_SPEED LUBE_SET ON_OFF
					   | LUBE_SET ON_OFF JOB_SPEED
					 )
			    )  
			   | ( JOB_SPEED (
					     MOVE_SPEED LUBE_SET ON_OFF
					   | LUBE_SET ON_OFF MOVE_SPEED
					 )
			     )
			   | ( LUBE_SET ON_OFF (
						   JOB_SPEED MOVE_SPEED
					         | MOVE_SPEED JOB_SPEED
					       )
			     )
			   ) 
```

### Syntax Diagram
![configuration_rail](https://user-images.githubusercontent.com/36998696/159557392-dc699722-621c-464e-b2a7-4275954c4027.png)

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
The *circle* command allows to draw a circle in the Cartesian plane with a given center and radius. It requires to specify the following parameters:
- *center coordinates*, that are the spatial coodinates of the circle's center
- *radius*, that is the distance between the center and any point belonging to the circle's circumference

### EBNF Notation
```
circle ::= CIRCLE CIRCLE_C 
                 	  OB 
			    X_CORD 
			  CB 
			  OB 
			    Y_CORD 
			  CB 
		  CIRCLE_R
```

### Syntax Diagram
![circle_rail](https://user-images.githubusercontent.com/36998696/159558288-7c07020e-026e-43f6-8267-3d56701df36d.png)

### Examples
```
 CIRCLE C(X250)(Y250) R100
 CONFIGURATION MS54 JS10 LB ON
```

### Errors
The *circle* command can raise the following *semantic errors*: 
- [*MAX_COORD_ERROR*](../../errors/shaper%20metalanguage/README.md): this error can be thrown due to huge radius lenght or due to center coordinates too close to the Cartesian plan limits

```
 CIRCLE C(X400)(Y400) R300
 CONFIGURATION MS54 JS10 LB ON
```
```
 ** Error list **
 1 - Semantic Error (3) at [0, 0]: Found MAX_COORD_ERROR - all coordinates must be positive and lower than 500 pixel to be displayed
```

## Triangle
The *triangle* command allows to draw a triangle in the Cartesian plane with three given points. It requires to specify the following parameters:
- *first vertex coordinates*, that are the spatial coodinates of the first triangle's vertex
- *second vertex coordinates*, that are the spatial coodinates of the second triangle's vertex
- *third vertex coordinates*, that are the spatial coodinates of the third triangle's vertex


### EBNF Notation
```
triangle ::= TRIANGLE P1 
                 	OB 
			  X_CORD 
			CB 
			OB 
			  Y_CORD 
			CB 
		      P2
			OB 
			  X_CORD 
			CB 
			OB 
			  Y_CORD 
			CB 
		      P3 
			OB 
			  X_CORD 
			CB 
			OB 
			  Y_CORD 
			CB  
```

### Syntax Diagram
![triangle_rail](https://user-images.githubusercontent.com/36998696/159559786-7ecbfd9e-263c-44ca-8d66-798b47cde7b0.png)

### Examples
```
 //isosceles triangle
 TRIANGLE P1(X100)(Y100)P2(X150)(Y250)P3(X200)(Y100)
 CONFIGURATION MS54 JS10 LB ON

 //scalene triangle
 TRIANGLE P1(X100)(Y100)P2(X150)(Y200)P3(X300)(Y100)
 CONFIGURATION MS54 JS10 LB ON

 //rectangle triangle
 TRIANGLE P1(X100)(Y100)P2(X100)(Y200)P3(X300)(Y100)
 CONFIGURATION MS54 JS10 LB ON
```

### Errors
The *triangle* command can raise the following *semantic errors*: 
- [*MAX_COORD_ERROR*](../../errors/shaper%20metalanguage/README.md): this error can be thrown due to point coordinates too close to the Cartesian plan limits

```
 TRIANGLE P1(X400)(Y400)P2(X650)(Y650)P3(X600)(Y400)
 CONFIGURATION MS54 JS10 LB ON
```
```
 ** Error list **
 1 - Semantic Error (3) at [0, 0]: Found MAX_COORD_ERROR - all coordinates must be positive and lower than 500 pixel to be displayed
```

## Rectangle
The *rectangle* command allows to draw a rectangle in the Cartesian plane with three given points. It requires to specify the following parameters:
- *first point coordinates*, that are the spatial coordinates of the first rectangle's point
- *second point coordinates*, that are the spatial coordinates of the second rectangle's point
- *third point coordinates*, that are the spatial coordinates of the third rectangle's point

### EBNF Notation
```
rectangle ::= RECTANGLE P1 
			  OB 
			    X_CORD 
			  CB 
			  OB 
		            Y_CORD 
			  CB 
			( P2 | RECTANGLE_B ) 
			  OB 
			    X_CORD 
		          CB 
			  OB 
			    Y_CORD 
		          CB 
			( P3 | RECTANGLE_H ) 
		          OB 
			    X_CORD 
		          CB 
			  OB 
			    Y_CORD 
			  CB
```

### Syntax Diagram
![rectangle_rail](https://user-images.githubusercontent.com/36998696/159561199-1addbc78-3466-4bd5-a66e-43221b3565a8.jpg)

### Examples
```
 //rectangle generated by bottom-left vertex 
 RECTANGLE P1(X100)(Y200) P2(X400)(Y200) P3(X100)(Y400)
 CONFIGURATION MS54 JS56 LB ON

 //rectangle generated by bottom-right vertex 
 RECTANGLE P1(X400)(Y200) P2(X400)(Y400) P3(X100)(Y200)
 CONFIGURATION MS54 JS56 LB ON

 //oblique rectangle generated by top vertex
 RECTANGLE P1(X300)(Y200) P2(X250)(Y250) P3(X200)(Y100)
 CONFIGURATION MS54 JS56 LB ON

 //oblique rectangle generated by bottom vertex
 RECTANGLE P1(X200)(Y100) P2(X300)(Y200) P3(X150)(Y150)
 CONFIGURATION MS54 JS56 LB ON
```

### Errors
The *rectangle* command can raise the following *semantic errors*: 
- [*MAX_COORD_ERROR*](../../errors/shaper%20metalanguage/README.md): this error can be thrown due to point coordinates too close to the Cartesian plan limits
- [*NOT_RECT_PERP_ERROR*](../../errors/shaper%20metalanguage/README.md): this error can be thrown due to non-perpendicular shape's sides
```
 RECTANGLE P1(X400)(Y200) P2(X500)(Y200) P3(X600)(Y500)
 CONFIGURATION MS54 JS56 LB ON
```
```
 ** Error list **
 1 - Semantic Error (3) at [0, 0]: Found MAX_COORD_ERROR - all coordinates must be positive and lower than 500 pixel to be displayed
 2 - Semantic Error (4) at [0, 0]: Found NOT_RECT_PERP_ERROR - sides of the rectangle must be perpendicular
```

## Square
The *square* command allows to draw a square in the Cartesian plane with three given points. It requires to specify the following parameters:
- *first point coordinates*, that are the spatial coordinates of the first rectangle's point
- *second point coordinates*, that are the spatial coordinates of the second rectangle's point
- *square orientation*, that is the spatial orientation of the shape (UP, DOWN)

### EBNF Notation
```
square ::= SQUARE P1 
		    OB 
		      X_CORD 
	            CB 
	            OB 
		      Y_CORD 
	            CB 
	          P2 
		    OB 
		      X_CORD 
		    CB 
		    OB 
		      Y_CORD 
		    CB 
	          SQUARE_CONFIG
```

### Syntax Diagram
![square_rail](https://user-images.githubusercontent.com/36998696/159562091-87a0c31c-1062-40e8-82d4-82acf5f493f8.png)

### Examples
```
 //up square
 SQUARE P1(X150)(Y150) P2(X350)(Y150) CONFIG UP
 CONFIGURATION MS54 JS56 LB ON
 
 //down square
 SQUARE P1(X150)(Y350) P2(X350)(Y350) CONFIG DOWN
 CONFIGURATION MS54 JS56 LB 
 
 //oblique suqare
 SQUARE P1(X150)(Y150) P2(X300)(Y200) CONFIG UP
 CONFIGURATION MS54 JS56 LB ON
```

### Errors
The *square* command can raise the following *semantic errors*: 
- [*MAX_COORD_ERROR*](../../errors/shaper%20metalanguage/README.md): this error can be thrown due to point coordinates too close to the Cartesian plan limits
```
 SQUARE P1(X150)(Y350) P2(X350)(Y350) CONFIG UP
 CONFIGURATION MS54 JS56 LB ON
```
```
 ** Error list **
 1 - Semantic Error (3) at [0, 0]: Found MAX_COORD_ERROR - all coordinates must be positive and lower than 500 pixel to be displayed
```
</br>

# References
For the *token list specification* see description [tokenList.md](/docs/shaper%20metalanguage/tokenList.md) file.
