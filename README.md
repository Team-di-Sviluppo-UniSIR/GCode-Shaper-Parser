# What are GCODE Parser and Shaper
***GCode-Shaper-Parser*** aims to provide students a useful tool for understanding and practicing with G-code, a programming language for CNC (*Computer Numerical Control*) machines. This project is composed by two main parts that are integrated each other and work together to provide to the final user the best approach to the industrial automation duties. 
As specifed below, the GCode programming language used by this software is a simplifed version of the real GCode used on the industrial machines and, in particular, is composed by: 
- ***GCODE Parser*** is the main compiler developed for parsing G-code language and provide a graphical representation of the written code.
- ***Shaper*** is a metalanguage built upon G-code in order to simplify the definition of CNC commands and help the users understand the rules of G-code language.

For further information on GCode programming language plese refere to this [link](https://en.wikipedia.org/wiki/G-code).

We want to underline that the GCode Shaper works with a new metalanguage created from scratch by the developers of this tool while the GCode Parser works with the "ligth GCode", that is a simplified version of the GCode which already exist and is widespread in the industrial sector.

Both GCODE Parser and Shaper are written in Java using ANTLR package.</br>
[GCode-Shaper-IDE](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/releases/tag/v1.0) is a GUI developed for helping users in the usage of *GCode-Shaper-Parser*.
</br><br>

<p align="center">
<img src="https://user-images.githubusercontent.com/36960844/159366726-d1435940-8992-414c-9498-cfcd8bc91229.png" width=90% />
</p>

# Repository structure
### Repository tree diagram
```
GCode-Shaper-Parser
├── code
├── docs
├── errors
├── jars
├── libraries
├── UML
├── LICENSE
└── README.md
```

This repository is basically organized as follows:

### code
It contains all the code related to this project. It is further organized into packages, each of which refers to a specific feature or features subset. Please refer below for subfolder organization details.

### docs
It contains the documentation both for the G-Code parser and the Shaper metalanguage. You can navigate it using links to the errors subfolder.
```
docs
├── gcode parser
│   ├── GCode Parser Syntax Grammar.pdf
│   ├── README.md
│   └── tokenList.md
├── pdf_readme.pdf
├── pptx_presentation.pdf
└── shaper metalanguage
    ├── README.md
    ├── Shaper Parser Syntax Grammar.pdf
    └── tokenList.md
```

### errors
In this folder are located the specification for the errors, both for G-Code and Shaper.
```
errors
├── gcode parser
│   └── README.md
└── shaper metalanguage
    └── README.md
```

### jars
This folder containts the `antlrworks-1.5.2-complete.jar`. If you'd like to develop further, please refer to this jar in order to update and modify the language specification (both for G-Code and Shaper).
```
jars
└── antlrworks-1.5.2-complete.jar
```

### libraries
This project uses `antlr-3.4-complete.jar`. When importing the Java code, please use this library version to build the project.
```
├── antlr-3.4-complete.jar
├── antlr-4.8-complete.jar
└── antlr-runtime-4.8.jar
```

### UML
This folder contains all UML diagrams, namely class diagrams for all classes and the package diagram for the entire project.
```
UML
├── gcodeCompiler_package.png
├── gcodeCompilerUtil_package.png
├── gcodeDrawingTool_package.png
├── gcodeIDE.png
├── gcodeMain_package.png
├── package_diagram.png
├── shaperCompiler_package.png
├── shaperCompilerUtil_package.png
├── shaperMain_package.png
└── README.md
```

# Code management and organization
### Code tree diagram
```
code
├── GCODE
├── IDE
├── SHAPER
├── resources
└── temp_files
```

The code folder is organized as follows:

### GCODE 
This source folder contains all the code related to the G-Code specification language. `gcodeGrammarHandler.java` is responsible for managing all G-Code main functions, mainly responsible for language-related data acquisition, data structures manipulation and population. In the `util` package are located all support classes that allow to build all the language associated objects. The `gcodeDrawingTool` package contains the classes that manage the graphical interface for the G-Code drawing tool, while `gcodeMain` contains the error manager class for G-Code.

```
GCODE
├── gcodeCompiler
│   ├── gcodeGrammar.g
│   ├── gcodeGrammarHandler.java
│   ├── gcodeGrammarLexer.java
│   ├── gcodeGrammarParser.java
│   ├── gcodeGrammar.tokens
│   └── util
│       ├── BlockDescriptor.java
│       ├── CircularMove.java
│       ├── Coordinate.java
│       ├── GCodeError.java
│       ├── InfoGeometriche.java
│       ├── InfoTecnologiche.java
│       ├── InfoTecnologicheM.java
│       ├── LinearMove.java
│       └── Tool.java
├── gcodeDrawingTool
│   ├── GCodeDrawingViewer.java
│   └── StaticDrawingController.java
└── gcodeMain
    └── GcodeErrorManager.java
```

### IDE
In this source folder are located the viewer and controller classes for the IDE.
```
IDE
└── gcodeIDE
    ├── GCodeIDEMain.java
    └── GCodeIDEWindow.java
```

### SHAPER
This source folder has the exact same structure as `GCODE` but refers to the Shaper Metalanguage.
```
SHAPER
├── shaperCompiler
│   ├── shaperGrammar.g
│   ├── shaperGrammarHandler.java
│   ├── shaperGrammarLexer.java
│   ├── shaperGrammarParser.java
│   ├── shaperGrammar.tokens
│   └── util
│       ├── Circle.java
│       ├── Rectangle.java
│       ├── Shape.java
│       ├── ShaperError.java
│       ├── Square.java
│       └── Triangle.java
└── shaperMain
    └── ShaperErrorManager.java
```

### resources
This folder contains some debugging file useful for future developments, mainly involving the possibilty of direct parsing of *.gcode* files, manually written or automatically generated by CAM (*Computer Aided Manufacturing*) software.
```
resources
├── input.gcode
├── sampleInputDrawing.gcode
└── shaperInput.shaper
```

### temp_files
In this folder are located the temporari swap files used by the IDE for to store the user input (both Shaper and G-Code) or mid-processing data, namely the G-Code specification generated by parsing the Shaper user input.
```
temp_files
├── gcode_temp.txt
└── shaper_temp.txt
```

# Javadoc
Please refer to [this link](https://team-di-sviluppo-unisir.github.io/GCode-Shaper-Parser/) in order to browse the javadoc for all the packages, classes, methods and fields.

# Installation
*GCode-Shaper-IDE* v1.0 executable program can be downloaded from the [Releases](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/releases/tag/v1.0) section of this repo ("GCodeShaperIDE.exe").

# Docs
Helpful docs with syntax, examples and errors for understanding both *GCODE Parser* and *Shaper* are here provided:
1. [G-code Parser docs](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/gcode%20parser)
2. [Shaper docs](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/shaper%20metalanguage)

# UML diagrams
Please refer to [this page](/UML/README.md) in order to browse all package and class diagrams available for this project. 

# Semantic analysis
## GCode parser
###### Block structure
Following the GCode definition, each block of the source code can contain one or more instruction and, each of them, has further informations about the movement, the speed, the tecnology and other possibile details of the CNC machine tool.<br>
###### Block build
An important difference between the GCode and our "light GCode" is that in the reality all the instruction informations can be listed randomly while in our solution a specified a fix order to be followed is specified. The GCode grammar implemented in this software is based on this assumption and it is built via a bottom-up approach that combine two main methods: the first one is used to create the instruction informations while the other one is used to assembly them in several blocks.
###### Block ordering check
During the costruction is also verified that the identificator of each block (N###) follows an increasing order (not necessarily sequential) and, after this check, all the components are finally merged in the main object called "Blocks" and built as a SortedMap. It represent the top-chain object which is passed and processed by the GCode parser.  

## GCode shaper
###### Shape structure
As done for the GCode specification, a bottom-up approach is applied. All the shape informations are collected (`shape` and `configuration`) and the shape object is created via the `createShape()` method. In this case no lists are used beacuse only one shape is built.

# Errors
All errors in G-code Parser and Shaper are here listed:
1. [G-code Parser error list](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/errors/gcode%20parser)
2. [Shaper error list](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/errors/shaper%20metalanguage)

# Contributors
- Luca Ghislotti
- Luca Parimbelli
- Andrea Marinò
- Alessandro Mazzola
