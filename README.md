# What are GCODE Parser and Shaper
***GCode-Shaper-Parser*** aims to provide students an useful tool for understanding and practicing with G-code, a programming language for CNC machines:
- ***GCODE Parser*** is the main compiler developed for parsing G-code language and provide a graphical representation of the written code.
- ***Shaper*** is a metalanguage built upon G-code in order to simplify the definition of CNC commands and help the users understand the rules of G-code language.

Both GCODE Parser and Shaper are written in Java using ANTLR package.</br>
[GCode-Shaper-IDE](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/releases/tag/v1.0) is a GUI developed for helping users in the usage of *GCode-Shaper-Parser*.
</br><br>

<p align="center">
<img src="https://user-images.githubusercontent.com/36960844/159366726-d1435940-8992-414c-9498-cfcd8bc91229.png" width=90% />
</p>

# Installation
*GCode-Shaper-IDE* v1.0 executable program can be downloaded from the [Releases](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/releases/tag/v1.0) section of this repo ("GCodeShaperIDE.exe").

# Docs
Helpful docs with syntax, examples and errors for understanding both *GCODE Parser* and *Shaper* are here provided:
1. [G-code Parser docs](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/gcode%20parser)
2. [Shaper docs](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/shaper%20metalanguage)

# Errors
All errors in G-code Parser and Shaper are here listed:
1. [G-code Parser error list](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/errors/gcode%20parser)
2. [Shaper error list](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/errors/shaper%20metalanguage)

**Shaper parser**
<table>
  <tr>
    <td><b>Error number</b></td>
    <td><b>Error name</b></td>
    <td><b>Description</b></td>
  </tr>
  <tr>
     <td colspan="3"><i>Lexical errors</i></td>
  </tr>
  </tr>
  <tr>
      <td>0</td>
      <td>SCAN_ERROR</td>
      <td>Invalid token</td>
  </tr>
  <tr>
     <td colspan="3"><i>Syntax errors</i></td>
  </tr>
  <tr>
      <td>1</td>
      <td>ERR_ON_SYNTAX</td>
      <td>Invalid token order</td>
  </tr>
    <tr>
     <td colspan="3"><i>Semantic errors</i></td>
   </tr>
  </tr>
  <tr>
      <td>3</td>
      <td>MAX_COORD_ERROR</td>
      <td>Input coordinates does not respect X-Y axis limits</td>
  </tr>
  <tr>
      <td>4</td>
      <td>NOT_RECT_PERP_ERROR</td>
      <td>Rectangle sides are not perpendicular</td>
  </tr>
