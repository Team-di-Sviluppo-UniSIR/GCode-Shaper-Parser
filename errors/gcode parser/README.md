# List of errors of G-code Parser
Here are listed all the errors that G-code parser is designed to throw. For more info check [docs section](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/gcode%20parser). 
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
      <td>NO_SPINDLE_ROTATION_ERROR</td>
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
      <td>Movement speed 'F' not defined before command 'G00'</td>
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

<br><br>
# Semantic errors: examples
Here's a list of all semantic errors with an example for each one and the corresponding console printout.


## BLOCK_NUMBERING_ERROR
### G-Code
```
N10 G90 G42 F300 S1000 T0101 M06  M03 M08
N20 G00 X0 Y-10
N15 G01 Y250
N40 G00 X0 Y-10 M05 M09 M30
```
### Console
```
1 - Semantic Error (2) at [3, 0]: Found BLOCK_NUMBERING_ERROR (N15 G01 Y250) - block number 'N15' must be greater than the previous one 'N20'
```

## NO_M30_ERROR
### G-Code
```
N10 G90 G42 F300 S1000 T0101 M06  M03 M08
N20 G00 X0 Y-10
N30 G01 Y250
N40 G00 X0 Y-10 M05 M09	
```
### Console
```
1 - Semantic Error (3) at [4, 24]: Found NO_M30_ERROR (N40 G00 X0 Y-10 M05 M09) - the last block (N40) must contain 'M30' (end program)
```

## CHANGE_TOOL_ERROR
### G-Code
```
N10 G90 G42 F300 S1000 T0101 M03 M08
N20 G00 X0 Y-10
N30 G01 Y250
N40 G00 X0 Y-10 M05 M09 M30
```
### Console
```
1 - Semantic Error (4) at [1, 0]: Found CHANGE_TOOL_ERROR (N10 G90 G42 F300 S1000 T0101 M03 M08) - 'M06' and T must always be together
```

## NO_COORDINATE_TYPE_ERROR
### G-Code
```
N10 G42 F300 S1000 T0101 M06 M03 M08
N20 G00 X0 Y-10
N30  M05 M09 M30
```
### Console
```
1 - Semantic Error (5) at [2, 0]: Found NO_COORDINATE_TYPE_ERROR (N20 G00 X0 Y-10 M30) - movement declared (G00 X0 Y-10) but no coordinate type specified
```

## NO_SPINDLE_ROTATION_ERORR
### G-Code
```
N10 G90 G42 F300 S1000 T0101 M06 M08
N20 G00 X0 Y-10
N30 G01 Y250
N40 G00 X0 Y-10 M09 M30
```
### Console
```
1 - Semantic Error (6) at [3, 0]: Found NO_SPINDLE_ROTATION_ERORR (N30 G01 Y250) - processing movement declared (G01 Y250) but spindle not in rotation
```

## DUPLICATED_COMMAND_ERROR
### G-Code
```
N10 G90 G42 F300 S1000 T0101 M03 M06 M08
N20 G00 X0 Y-10 G00 X0 Y-10
N30 G01 Y250
N40 G00 X0 Y-10 M05 M09 M30
```
### Console
```
1 - Semantic Error (7) at [2, 0]: Found DUPLICATED_COMMAND_ERROR at block 'N20' - command 'G00 X0 Y-10' (linear movement) already defined
```

## END_ROTATION_ERROR
### G-Code
```
N10 G90 G42 F300 S1000 T0101 M06 M08 M05
N20 G00 X0 Y-10 M03
N30 G01 Y250
N40 G00 X0 Y-10 M09 
N50 M30
```
### Console
```
1 - Semantic Error (8) at [1, 0]: Found END_ROTATION_ERROR (N10 G90 G42 F300 S1000 T0101 M05 M06 M08) - spindle must be ON before being turned OFF
```

## NO_MOVE_SPEED_ERROR
### G-Code
```
N10 G90 G42 S1000 T0101 M06 M03 M08
N20 G00 X0 Y-10
N30  M05 M09 M30
```
### Console
```
1 - Semantic Error (9) at [2, 0]: Found NO_MOVE_SPEED_ERROR (N20 G00 X0 Y-10) - movement declared (G00 X0 Y-10) but movement speed 'F' non defined
```

## NO_JOB_SPEED_ERROR
### G-Code
```
N10 G90 G42 F300 T0101 M06 M03 M08
N20 G01 X0 Y-10
N30  M05 M09 M30
```
### Console
```
1 - Semantic Error (11) at [2, 0]: Found NO_JOB_SPEED_ERROR (N20 G01 X0 Y-10) - linear processing movement declared (G01 X0 Y-10) but working movement speed 'S' non defined
```

## NO_COORD_TYPE_SPEED_ERROR
### G-Code
```
N10 G42 F300 T0101 S1000 M06 M03 M08
N20 G90 G01 X0 Y-10
N30  M05 M09 M30
```
### Console
```
1 - Semantic Error (12) at [1, 0]: Found NO_COORD_TYPE_SPEED_ERROR (N10 G42 F300 S1000 T0101 M03 M06 M08) - working movement speed declared (F300) but no coordinate type (G90, G91) defined
```

## NO_ABS_BEFORE_REL_ERROR
### G-Code
```
N10 G91 G42 F300 T0101 S1000 M06 M03 M08
N20 G01 X0 Y-10
N30  M05 M09 M30
```
### Console
```
1 - Semantic Error (13) at [1, 0]: Found NO_ABS_BEFORE_REL_ERROR (N10 G91 G42 F300 S1000 T0101 M03 M06 M08) - G90 reference needed before G91 command
```

## NO_ABS_BEFORE_REL_ERROR
### G-Code
```
N10 G90 G42 T0101 F300 S1000 M06 M03 M08
N20 G00 X0 Y-10
N30 G01 Y50
N40 G01 X175
N50 G03 X375 Y50 I275 J50
N60 G01 X50
N70 G01 X0 Y0
N80 G00 X0 Y-10 M05 M09 M30
```
### Console
```
1 - Semantic Error (14) at [5, 0]: Found NOT_90_DEGREE_ERROR (N50 G03 X375 Y50 I275 J50) - circular interpolation must be exacty 90 degrees
```
