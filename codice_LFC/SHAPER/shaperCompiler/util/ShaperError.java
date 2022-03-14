package shaperCompiler.util;

import shaperCompiler.shaperGrammarHandler;

public class ShaperError {
	private short type;
	private short row;
	private short column;
	private String message;

	public ShaperError(short type, short row, short column, String message) {
		this.type = type;
		this.row = row;
		this.column = column;
		this.message = message;
	}

	public ShaperError() {
	}

	@Override
	public String toString() {
		String s = "";

		switch (type) {
		case shaperGrammarHandler.TOKEN_ERROR:
			s += "Lexical Error (" + shaperGrammarHandler.TOKEN_ERROR + ") ";
			break;

		case shaperGrammarHandler.ERR_ON_SYNTAX:
			s += "Syntax Error (" + shaperGrammarHandler.ERR_ON_SYNTAX + ") ";
			break;

		}

		s += "at [" + row + ", " + column + "]: " + message;

		return s;
	}

	public void setType(short type) {
		this.type = type;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setRow(short row) {
		this.row = row;
	}

	public void setColumn(short column) {
		this.column = column;
	}

}
