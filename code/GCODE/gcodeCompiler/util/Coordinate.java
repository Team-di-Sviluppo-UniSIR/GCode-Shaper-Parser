package gcodeCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * Coordinate class.
 */
// classe che descrive la struttura delle coordinate (X,Y,Z) e (I,J,K)
public class Coordinate {
	
	/** The first. */
	private String first; // X o I
	
	/** The second. */
	private String second; // Y o J
	
	/** The third. */
	private String third; // Z o K
	
	/** The first not null. */
	private boolean firstNotNull = false;
	
	/** The second not null. */
	private boolean secondNotNull = false;
	
	/** The third not null. */
	private boolean thirdNotNull = false;

	/**
	 * Instantiates a new coordinate.
	 *
	 * @param first the first
	 * @param second the second
	 * @param third the third
	 */
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

	/**
	 * Instantiates a new coordinate.
	 *
	 * @param first the first
	 * @param second the second
	 * @param third the third
	 */
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

	/**
	 * To string.
	 *
	 * @return the string
	 */
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

	/**
	 * Gets the first.
	 *
	 * @return the first
	 */
	public int getFirst() {
		if (firstNotNull)
			return Integer.parseInt(first.substring(1));
		return 0;
	}

	/**
	 * Gets the second.
	 *
	 * @return the second
	 */
	public int getSecond() {
		if (secondNotNull)
			return Integer.parseInt(second.substring(1));
		return 0;
	}

	/**
	 * Gets the third.
	 *
	 * @return the third
	 */
	public int getThird() {
		if (thirdNotNull)
			return Integer.parseInt(third.substring(1));
		return 0;
	}

	/**
	 * Checks if is first not null.
	 *
	 * @return true, if is first not null
	 */
	public boolean isFirstNotNull() {
		return firstNotNull;
	}

	/**
	 * Checks if is second not null.
	 *
	 * @return true, if is second not null
	 */
	public boolean isSecondNotNull() {
		return secondNotNull;
	}

	/**
	 * Checks if is third not null.
	 *
	 * @return true, if is third not null
	 */
	public boolean isThirdNotNull() {
		return thirdNotNull;
	}

	/**
	 * Sets the first.
	 *
	 * @param first the new first
	 */
	public void setFirst(String first) {
		this.first = first;
	}

	/**
	 * Sets the second.
	 *
	 * @param second the new second
	 */
	public void setSecond(String second) {
		this.second = second;
	}

	/**
	 * Sets the third.
	 *
	 * @param third the new third
	 */
	public void setThird(String third) {
		this.third = third;
	}

}
