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

	@Override
	public String toString() {
		return "       CIRCLE: C(" + x_center + ", " + y_center + ") " + radius + "\n" + super.toString();
	}

	public String getX_center() {
		return x_center;
	}

	public void setX_center(String x_center) {
		this.x_center = x_center;
	}

	public String getY_center() {
		return y_center;
	}

	public void setY_center(String y_center) {
		this.y_center = y_center;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

}
