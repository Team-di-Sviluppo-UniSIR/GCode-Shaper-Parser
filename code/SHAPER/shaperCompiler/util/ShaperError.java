package shaperCompiler.util;

import gcodeCompiler.util.GCodeError;
import shaperCompiler.shaperGrammarHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class ShaperError.
 */
public class ShaperError implements Comparable<ShaperError> {
	
	/** The type. */
	private short type;
	
	/** The row. */
	private short row;
	
	/** The column. */
	private short column;
	
	/** The message. */
	private String message;

	/**
	 * Instantiates a new shaper error.
	 *
	 * @param type the type
	 * @param row the row
	 * @param column the column
	 * @param message the message
	 */
	public ShaperError(short type, short row, short column, String message) {
		this.type = type;
		this.row = row;
		this.column = column;
		this.message = message;
	}

	/**
	 * Instantiates a new shaper error.
	 */
	public ShaperError() {
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
		case shaperGrammarHandler.TOKEN_ERROR:
			s += "Lexical Error (" + shaperGrammarHandler.TOKEN_ERROR + ") ";
			break;

		case shaperGrammarHandler.ERR_ON_SYNTAX:
			s += "Syntax Error (" + shaperGrammarHandler.ERR_ON_SYNTAX + ") ";
			break;

		case shaperGrammarHandler.SEM_TRIANG_INEQ:
			s += "Semantic Error (" + shaperGrammarHandler.SEM_TRIANG_INEQ + ") ";
			break;

		case shaperGrammarHandler.SEM_MAX_COORD:
			s += "Semantic Error (" + shaperGrammarHandler.SEM_MAX_COORD + ") ";
			break;
			
		case shaperGrammarHandler.SEM_RECT_PERPEN:
			s += "Semantic Error (" + shaperGrammarHandler.SEM_RECT_PERPEN + ") ";
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
