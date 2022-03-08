package gcodeCompiler.util;

public class Error implements Comparable<Error> {
	private short type;
	private short row;
	private short column;
	private String message;

	public static final int TOKEN_ERROR = 0;
	public static final int ERR_ON_SYNTAX = 1;
	public static final int SEM_BLOCK_ORDER = 2;

	public Error(short type, short row, short column, String message) {
		this.type = type;
		this.row = row;
		this.column = column;
		this.message = message;
	}

	public Error() {
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
		case TOKEN_ERROR:
			s += "Lexical Error (" + TOKEN_ERROR + ") ";
			break;

		case ERR_ON_SYNTAX:
			s += "Syntax Error (" + ERR_ON_SYNTAX + ") ";
			break;

		default:
			s += "Semantic Error (" + SEM_BLOCK_ORDER + ") ";
			break;
		}

		s += "at [" + row + ", " + column + "]: " + message;

		return s;
	}

	@Override
	public int compareTo(Error o) {
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
