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

# Examples
Code examples that can help users in understanding both *GCODE Parser* and *Shaper* syntaxes are here provided: 
1. [G-code Parser code examples](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser)
2. [Shaper code examples](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser)

# Docs
Helpful docs (syntax and errors) for understanding both *GCODE Parser* and *Shaper* syntaxes are here provided:
1. [G-code Parser docs](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/gcode%20parser)
2. [Shaper docs](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/shaper%20metalanguage)

# Error list
All errors in Gcode and Shaper parsers.

**Gcode parser**
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
  <tr>
      <td>2</td>
      <td>BLOCK_NUMBERING_ERROR</td>
      <td>Invalid sequence of N<sub>i</sub> (N<sub>i</sub> must be greater than N<sub>i-1</sub>)</td>
  </tr>
  <tr>
      <td>3</td>
      <td>NO_M30_ERROR</td>
      <td>'M30' token (end program)</td>
  </tr>
  <tr>
      <td>4</td>
      <td>CHANGE_TOOL_ERROR</td>
      <td>'M06' and 'T[][]' are not used together</td>
  </tr>
  <tr>
      <td>5</td>
      <td>NO_COORDINATE_TYPE_ERROR</td>
      <td>'G90' or 'G91' is missing while using 'G00', 'G01', 'G02' or 'G03'</td>
  </tr>
  <tr>
      <td>6</td>
      <td>NO_SPINDLE_ROTATION_ERORR</td>
      <td>'M03' or 'M04' is missing while using 'G01', 'G02' or 'G03'</td>
  </tr>
  <tr>
      <td>7</td>
      <td>DUPLICATED_COMMAND_ERROR</td>
      <td>Duplicated command within a single block</td>
  </tr>
  <tr>
      <td>8</td>
      <td>END_ROTATION_ERROR</td>
      <td>Spindle turned off before being turned on</td>
  </tr>
  <tr>
      <td>9</td>
      <td>NO_MOVE_SPEED_ERROR</td>
      <td>Movement speed 'F0 not defined before command 'G00'</td>
  </tr>
  <tr>
      <td>11</td>
      <td>NO_JOB_SPEED_ERROR</td>
      <td>Working speed 'S' not defined before command 'G01'</td>
  </tr>
  <tr>
      <td>12</td>
      <td>NO_COORD_TYPE_SPEED_ERROR</td>
      <td>Speed 'F' or 'S' defined before setting the ordinate type 'G90' or 'G91'</td>
  </tr>
  <tr>
      <td>13</td>
      <td>NO_ABS_BEFORE_REL_ERROR</td>
      <td>'G91' defined before setting an absolute reference point using 'G90'</td>
  </tr>
  <tr>
      <td>14</td>
      <td>NOT_90_DEGREE_ERROR</td>
      <td>Circular interpolation is not equal to 90 degrees</td>
  </tr>
</table>

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
