package shaperCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class Shape.
 */
public class Shape {
	
	/** The type. */
	char type;

	/** The move speed. */
	String moveSpeed;
	
	/** The job speed. */
	String jobSpeed;
	
	/** The lube. */
	String lube;

	/**
	 * Instantiates a new shape.
	 *
	 * @param type the type
	 * @param ms the ms
	 * @param js the js
	 * @param lb the lb
	 */
	public Shape(char type, Token ms, Token js, Token lb) {
		this.type = type;
		this.moveSpeed = "F" + ms.getText().substring(2);
		this.jobSpeed = "S" + js.getText().substring(2);

		if (lb.getText().equals("ON"))
			this.lube = "M08";
		else
			this.lube = "M09";
	}

	/**
	 * Instantiates a new shape.
	 *
	 * @param type the type
	 */
	public Shape(char type) {
		this.type = type;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "CONFIGURATION: " + moveSpeed + " " + jobSpeed + " " + lube;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public char getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(char type) {
		this.type = type;
	}

	/**
	 * Gets the move speed.
	 *
	 * @return the move speed
	 */
	public String getMoveSpeed() {
		return moveSpeed;
	}

	/**
	 * Sets the move speed.
	 *
	 * @param moveSpeed the new move speed
	 */
	public void setMoveSpeed(String moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	/**
	 * Gets the job speed.
	 *
	 * @return the job speed
	 */
	public String getJobSpeed() {
		return jobSpeed;
	}

	/**
	 * Sets the job speed.
	 *
	 * @param jobSpeed the new job speed
	 */
	public void setJobSpeed(String jobSpeed) {
		this.jobSpeed = jobSpeed;
	}

	/**
	 * Gets the lube.
	 *
	 * @return the lube
	 */
	public String getLube() {
		return lube;
	}

	/**
	 * Sets the lube.
	 *
	 * @param lube the new lube
	 */
	public void setLube(String lube) {
		this.lube = lube;
	}

}
