package gcodeCompiler.util;

import org.antlr.runtime.Token;

// classe che descrive la struttura delle coordinate (X,Y,Z) e (I,J,K)
public class Coordinate {
	private String first; // X o I
	private String second; // Y o J
	private String third; // Z o K
	private boolean firstNotNull = false;
	private boolean secondNotNull = false;
	private boolean thirdNotNull = false;

	public Coordinate(Token first, Token second, Token third) {
		if (first != null) {
			this.first = first.getText();
			firstNotNull = true;
		}

		if (second != null) {
			this.second = second.getText();
			secondNotNull = true;
		}

		if (third != null) {
			this.third = third.getText();
			thirdNotNull = true;
		}
	}

	public Coordinate(String first, String second, String third) {
		if (first != null) {
			this.first = first;
			firstNotNull = true;
		}

		if (second != null) {
			this.second = second;
			secondNotNull = true;
		}

		if (third != null) {
			this.third = third;
			thirdNotNull = true;
		}
	}

	public String toString() {
		String s = "";

		if (this.first != null)
			s = s.concat(first + " ");

		if (this.second != null)
			s = s.concat(second + " ");

		if (this.third != null)
			s = s.concat(third);

		if (s.charAt(s.length() - 1) == ' ')
			return s.substring(0, s.length() - 1);
		else
			return s;
	}

	public int getFirst() {
		if (firstNotNull)
			return Integer.parseInt(first.substring(1));
		return 0;
	}

	public int getSecond() {
		if (secondNotNull)
			return Integer.parseInt(second.substring(1));
		return 0;
	}

	public int getThird() {
		if (thirdNotNull)
			return Integer.parseInt(third.substring(1));
		return 0;
	}

	public boolean isFirstNotNull() {
		return firstNotNull;
	}

	public boolean isSecondNotNull() {
		return secondNotNull;
	}

	public boolean isThirdNotNull() {
		return thirdNotNull;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public void setThird(String third) {
		this.third = third;
	}

}
