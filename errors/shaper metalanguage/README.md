# List of errors of Shaper Metalanguage
Here are listed all the errors that Shaper parser is designed to throw. For more info check [docs section](https://github.com/Team-di-Sviluppo-UniSIR/GCode-Shaper-Parser/tree/main/docs/shaper%20metalanguage).
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
