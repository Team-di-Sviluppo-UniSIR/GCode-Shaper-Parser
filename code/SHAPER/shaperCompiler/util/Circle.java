package shaperCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class Circle.
 */
public class Circle extends Shape {
	
	/** The x center. */
	String x_center;
	
	/** The y center. */
	String y_center;
	
	/** The radius. */
	String radius;

	/**
	 * Instantiates a new circle.
	 *
	 * @param x_center the x center
	 * @param y_center the y center
	 * @param radius the radius
	 */
	public Circle(Token x_center, Token y_center, Token radius) {

		super('c');
		this.x_center = x_center.getText();
		this.y_center = y_center.getText();
		this.radius = radius.getText();
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "       CIRCLE: C(" + x_center + ", " + y_center + ") " + radius + "\n" + super.toString();
	}

	/**
	 * Gets the x center.
	 *
	 * @return the x center
	 */
	public String getX_center() {
		return x_center;
	}

	/**
	 * Sets the x center.
	 *
	 * @param x_center the new x center
	 */
	public void setX_center(String x_center) {
		this.x_center = x_center;
	}

	/**
	 * Gets the y center.
	 *
	 * @return the y center
	 */
	public String getY_center() {
		return y_center;
	}

	/**
	 * Sets the y center.
	 *
	 * @param y_center the new y center
	 */
	public void setY_center(String y_center) {
		this.y_center = y_center;
	}

	/**
	 * Gets the radius.
	 *
	 * @return the radius
	 */
	public String getRadius() {
		return radius;
	}

	/**
	 * Sets the radius.
	 *
	 * @param radius the new radius
	 */
	public void setRadius(String radius) {
		this.radius = radius;
	}

}
