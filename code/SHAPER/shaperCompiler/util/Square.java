package shaperCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class Square.
 */
public class Square extends Shape {

	/** The xp 1. */
	String xp1;
	
	/** The yp 1. */
	String yp1;

	/** The xp 2. */
	String xp2;
	
	/** The yp 2. */
	String yp2;

	/** The orientation. */
	String orientation;

	/**
	 * Instantiates a new square.
	 *
	 * @param xp1 the xp 1
	 * @param yp1 the yp 1
	 * @param xp2 the xp 2
	 * @param yp2 the yp 2
	 * @param orientation the orientation
	 */
	public Square(Token xp1, Token yp1, Token xp2, Token yp2, Token orientation) {

		super('s');
		this.xp1 = xp1.getText();
		this.yp1 = yp1.getText();
		this.xp2 = xp2.getText();
		this.yp2 = yp2.getText();
		this.orientation = orientation.getText();
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "       SQUARE: P1(" + xp1 + ", " + yp1 + ") P2(" + xp2 + ", " + yp2 + ") " + orientation + "\n"
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
	 * Gets the orientation.
	 *
	 * @return the orientation
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * Sets the orientation.
	 *
	 * @param orientation the new orientation
	 */
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

}
