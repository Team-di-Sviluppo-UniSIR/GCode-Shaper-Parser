package shaperCompiler.util;

import org.antlr.runtime.Token;

public class Rectangle extends Shape {

	String xp1;
	String yp1;

	String xp2;
	String yp2;

	String xp3;
	String yp3;

	public Rectangle(Token xp1, Token yp1, Token xp2, Token yp2, Token xp3, Token yp3) {

		super('r');
		this.xp1 = xp1.getText();
		this.yp1 = yp1.getText();
		this.xp2 = xp2.getText();
		this.yp2 = yp2.getText();
		this.xp3 = xp3.getText();
		this.yp3 = yp3.getText();
	}

}
