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


# References
For the *token list specification* see description [tokenList.md](/docs/gcode%20parser/tokenList.md) file.
