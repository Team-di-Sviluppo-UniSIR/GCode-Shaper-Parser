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

	@Override
	public String toString() {
		return "       SQUARE: P1(" + xp1 + ", " + yp1 + ") P2(" + xp2 + ", " + yp2 + ") " + orientation + "\n"
				+ super.toString();
	}

	public String getXp1() {
		return xp1;
	}

	public void setXp1(String xp1) {
		this.xp1 = xp1;
	}

	public String getYp1() {
		return yp1;
	}

	public void setYp1(String yp1) {
		this.yp1 = yp1;
	}

	public String getXp2() {
		return xp2;
	}

	public void setXp2(String xp2) {
		this.xp2 = xp2;
	}

	public String getYp2() {
		return yp2;
	}

	public void setYp2(String yp2) {
		this.yp2 = yp2;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

}
