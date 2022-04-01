package gcodeCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class InfoTecnologiche.
 */
public class InfoTecnologiche {
	
	/** The free move speed. */
	private String free_move_speed;
	
	/** The job move speed. */
	private String job_move_speed;
	
	/** The t. */
	private Tool t;

	/**
	 * Instantiates a new info tecnologiche.
	 *
	 * @param command the command
	 * @param type the type
	 */
	public InfoTecnologiche(Token command, char type) {
		if (type == 'f')
			this.free_move_speed = command.getText();
		else if (type == 'j')
			this.job_move_speed = command.getText();
		else if (type == 't') {
			this.t = new Tool(command.getText().substring(1, 3), command.getText().substring(3, 5));
		}
	}

	/**
	 * Instantiates a new info tecnologiche.
	 *
	 * @param t the t
	 */
	public InfoTecnologiche(Tool t) {
		this.t = t;
	}

	/**
	 * Instantiates a new info tecnologiche.
	 */
	public InfoTecnologiche() {
	}

	/**
	 * Gets the free move speed.
	 *
	 * @return the free move speed
	 */
	public String getFree_move_speed() {
		return free_move_speed;
	}

	/**
	 * Sets the free move speed.
	 *
	 * @param free_move_speed the new free move speed
	 */
	public void setFree_move_speed(String free_move_speed) {
		this.free_move_speed = free_move_speed;
	}

	/**
	 * Gets the job move speed.
	 *
	 * @return the job move speed
	 */
	public String getJob_move_speed() {
		return job_move_speed;
	}

	/**
	 * Sets the job move speed.
	 *
	 * @param job_move_speed the new job move speed
	 */
	public void setJob_move_speed(String job_move_speed) {
		this.job_move_speed = job_move_speed;
	}

	/**
	 * Gets the t.
	 *
	 * @return the t
	 */
	public Tool getT() {
		return t;
	}

	/**
	 * Sets the t.
	 *
	 * @param t the new t
	 */
	public void setT(Tool t) {
		this.t = t;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String s = "";

		if (this.free_move_speed != null)
			s = s.concat(free_move_speed) + " ";

		if (this.job_move_speed != null)
			s = s.concat(job_move_speed) + " ";

		if (t != null)
			s = s.concat(t.toString()) + " ";

		return s;
	}
}
