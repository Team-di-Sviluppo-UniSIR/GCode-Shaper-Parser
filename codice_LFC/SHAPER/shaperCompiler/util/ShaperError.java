package shaperCompiler.util;

import gcodeCompiler.util.Error;
import shaperCompiler.shaperGrammarHandler;

public class ShaperError implements Comparable<ShaperError> {
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

	public short getType() {
		return type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public short getRow() {
		return row;
	}

	public void setRow(short row) {
		this.row = row;
	}

	public short getColumn() {
		return column;
	}

	public void setColumn(short column) {
		this.column = column;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	@Override
	public int compareTo(ShaperError o) {
		if (this.row > o.getRow())
			return 1;
		else if (this.row < o.getRow()) {
			return -1;
		} else {
			if (this.column > o.getColumn())
				return 1;
			else if (this.column < o.getColumn())
				return -1;
			else
				return 0;
		}
	}
}
