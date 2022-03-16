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

	@Override
	public String toString() {
		return "    RECTANGLE: P1(" + xp1 + ", " + yp1 + ") P2(" + xp2 + ", " + yp2 + ") P3(" + xp3 + ", " + yp3 + ")\n"
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

	public String getXp3() {
		return xp3;
	}

	public void setXp3(String xp3) {
		this.xp3 = xp3;
	}

	public String getYp3() {
		return yp3;
	}

	public void setYp3(String yp3) {
		this.yp3 = yp3;
	}

}
