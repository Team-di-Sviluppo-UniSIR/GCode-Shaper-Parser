package gcodeCompiler.util;

import gcodeCompiler.gcodeGrammarHandler;

public class Error implements Comparable<Error> {
	private short type;
	private short row;
	private short column;
	private String message;

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
		case gcodeGrammarHandler.TOKEN_ERROR:
			s += "Lexical Error (" + gcodeGrammarHandler.TOKEN_ERROR + ") ";
			break;

		case gcodeGrammarHandler.ERR_ON_SYNTAX:
			s += "Syntax Error (" + gcodeGrammarHandler.ERR_ON_SYNTAX + ") ";
			break;

		case gcodeGrammarHandler.SEM_BLOCK_ORDER:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_BLOCK_ORDER + ") ";
			break;

		case gcodeGrammarHandler.SEM_NO_END_PROG:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_NO_END_PROG + ") ";
			break;

		case gcodeGrammarHandler.SEM_TOOL_ERR:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_TOOL_ERR + ") ";
			break;

		case gcodeGrammarHandler.SEM_NO_COORDINATE_TYPE:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_NO_COORDINATE_TYPE + ") ";
			break;

		case gcodeGrammarHandler.SEM_NO_SPINDLE_ROTATION:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_NO_SPINDLE_ROTATION + ") ";
			break;

		case gcodeGrammarHandler.SEM_DUPLICATE_ERR:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_DUPLICATE_ERR + ") ";
			break;

		case gcodeGrammarHandler.SEM_END_ROT_ERR:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_END_ROT_ERR + ") ";
			break;

		case gcodeGrammarHandler.SEM_MOVE_SPEED_ERR:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_MOVE_SPEED_ERR + ") ";
			break;

		case gcodeGrammarHandler.SEM_JOB_SPEED_ERR:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_JOB_SPEED_ERR + ") ";
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
