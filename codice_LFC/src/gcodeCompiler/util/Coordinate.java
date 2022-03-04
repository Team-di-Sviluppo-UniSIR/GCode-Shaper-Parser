package gcodeCompiler.util;

import org.antlr.runtime.Token;

public class Coordinate {
	private String first;
	private String second;
	private String third;

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
}
