package shaperCompiler.util;

import org.antlr.runtime.Token;

public class Circle extends Shape {
	String x_center;
	String y_center;
	String radius;

	public Circle(Token x_center, Token y_center, Token radius) {

		super('c');
		this.x_center = x_center.getText();
		this.y_center = y_center.getText();
		this.radius = radius.getText();
	}

}
