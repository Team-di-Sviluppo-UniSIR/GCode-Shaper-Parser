package gcodeCompiler.util;

import org.antlr.runtime.Token;

// classe che descrive la struttura delle coordinate (X,Y,Z) e (I,J,K)
public class Coordinate {
	private String first; // X o I
	private String second; // Y o J
	private String third; // Z o K

	public Coordinate(Token first, Token second, Token third) {
		if (first != null) {
			this.first = first.getText();
		}

		if (second != null) {
			this.second = second.getText();
		}

		if (third != null) {
			this.third = third.getText();
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
		if (first != null)
			return Integer.parseInt(first);
		else
			return (Integer) null;
	}

	public int getSecond() {
		if (second != null)
			return Integer.parseInt(second);
		else
			return (Integer) null;
	}

	public int getThird() {
		if (third != null)
			return Integer.parseInt(third);
		else
			return (Integer) null;
	}
}
