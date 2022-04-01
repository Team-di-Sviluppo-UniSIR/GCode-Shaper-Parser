package shaperCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle extends Shape {

	/** The xp 1. */
	String xp1;
	
	/** The yp 1. */
	String yp1;

	/** The xp 2. */
	String xp2;
	
	/** The yp 2. */
	String yp2;

	/** The xp 3. */
	String xp3;
	
	/** The yp 3. */
	String yp3;

	/**
	 * Instantiates a new rectangle.
	 *
	 * @param xp1 the xp 1
	 * @param yp1 the yp 1
	 * @param xp2 the xp 2
	 * @param yp2 the yp 2
	 * @param xp3 the xp 3
	 * @param yp3 the yp 3
	 */
	public Rectangle(Token xp1, Token yp1, Token xp2, Token yp2, Token xp3, Token yp3) {

		super('r');
		this.xp1 = xp1.getText();
		this.yp1 = yp1.getText();
		this.xp2 = xp2.getText();
		this.yp2 = yp2.getText();
		this.xp3 = xp3.getText();
		this.yp3 = yp3.getText();

	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "    RECTANGLE: P1(" + xp1 + ", " + yp1 + ") P2(" + xp2 + ", " + yp2 + ") P3(" + xp3 + ", " + yp3 + ")\n"
				+ super.toString();
	}

	/**
	 * Gets the xp 1.
	 *
	 * @return the xp 1
	 */
	public String getXp1() {
		return xp1;
	}

	/**
	 * Sets the xp 1.
	 *
	 * @param xp1 the new xp 1
	 */
	public void setXp1(String xp1) {
		this.xp1 = xp1;
	}

	/**
	 * Gets the yp 1.
	 *
	 * @return the yp 1
	 */
	public String getYp1() {
		return yp1;
	}

	/**
	 * Sets the yp 1.
	 *
	 * @param yp1 the new yp 1
	 */
	public void setYp1(String yp1) {
		this.yp1 = yp1;
	}

	/**
	 * Gets the xp 2.
	 *
	 * @return the xp 2
	 */
	public String getXp2() {
		return xp2;
	}

	/**
	 * Sets the xp 2.
	 *
	 * @param xp2 the new xp 2
	 */
	public void setXp2(String xp2) {
		this.xp2 = xp2;
	}

	/**
	 * Gets the yp 2.
	 *
	 * @return the yp 2
	 */
	public String getYp2() {
		return yp2;
	}

	/**
	 * Sets the yp 2.
	 *
	 * @param yp2 the new yp 2
	 */
	public void setYp2(String yp2) {
		this.yp2 = yp2;
	}

	/**
	 * Gets the xp 3.
	 *
	 * @return the xp 3
	 */
	public String getXp3() {
		return xp3;
	}

	/**
	 * Sets the xp 3.
	 *
	 * @param xp3 the new xp 3
	 */
	public void setXp3(String xp3) {
		this.xp3 = xp3;
	}

	/**
	 * Gets the yp 3.
	 *
	 * @return the yp 3
	 */
	public String getYp3() {
		return yp3;
	}

	/**
	 * Sets the yp 3.
	 *
	 * @param yp3 the new yp 3
	 */
	public void setYp3(String yp3) {
		this.yp3 = yp3;
	}

}
