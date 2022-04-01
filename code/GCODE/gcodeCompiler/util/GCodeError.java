package gcodeCompiler.util;

import gcodeCompiler.gcodeGrammarHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class GCodeError.
 */
public class GCodeError implements Comparable<GCodeError> {
	
	/** The type. */
	private short type;
	
	/** The row. */
	private short row;
	
	/** The column. */
	private short column;
	
	/** The message. */
	private String message;

	/**
	 * Instantiates a new g code error.
	 *
	 * @param type the type
	 * @param row the row
	 * @param column the column
	 * @param message the message
	 */
	public GCodeError(short type, short row, short column, String message) {
		this.type = type;
		this.row = row;
		this.column = column;
		this.message = message;
	}

	/**
	 * Instantiates a new g code error.
	 */
	public GCodeError() {
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public short getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(short type) {
		this.type = type;
	}

	/**
	 * Gets the row.
	 *
	 * @return the row
	 */
	public short getRow() {
		return row;
	}

	/**
	 * Sets the row.
	 *
	 * @param row the new row
	 */
	public void setRow(short row) {
		this.row = row;
	}

	/**
	 * Gets the column.
	 *
	 * @return the column
	 */
	public short getColumn() {
		return column;
	}

	/**
	 * Sets the column.
	 *
	 * @param column the new column
	 */
	public void setColumn(short column) {
		this.column = column;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
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

		case gcodeGrammarHandler.SEM_NO_SPEED_COORD_TYPE:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_NO_SPEED_COORD_TYPE + ") ";
			break;

		case gcodeGrammarHandler.SEM_NO_ABS_BEFORE_REL:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_NO_ABS_BEFORE_REL + ") ";
			break;

		case gcodeGrammarHandler.SEM_NOT_90_DEGREE:
			s += "Semantic Error (" + gcodeGrammarHandler.SEM_NOT_90_DEGREE + ") ";
			break;

		}

		s += "at [" + row + ", " + column + "]: " + message;

		return s;
	}

	/**
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	@Override
	public int compareTo(GCodeError o) {
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
