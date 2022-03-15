package shaperCompiler.util;

import org.antlr.runtime.Token;

public class Square extends Shape {

	String xp1;
	String yp1;

	String xp2;
	String yp2;

	String orientation;

	public Square(Token xp1, Token yp1, Token xp2, Token yp2, Token orientation) {
		
		super('s');
		this.xp1 = xp1.getText();
		this.yp1 = yp1.getText();
		this.xp2 = xp2.getText();
		this.yp2 = yp2.getText();
		this.orientation = orientation.getText();
	}

}
