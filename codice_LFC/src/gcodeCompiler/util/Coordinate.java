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

		if (this.first != null) {
			if (this.second != null)
				s = s.concat(first + " ");
			else
				s = s.concat(first);
		}

		if (this.second != null) {

			if (this.third != null)
				s = s.concat(second + " ");
			else
				s = s.concat(second);
		}

		if (this.third != null)
			s = s.concat(third);

		return s;
	}
}
