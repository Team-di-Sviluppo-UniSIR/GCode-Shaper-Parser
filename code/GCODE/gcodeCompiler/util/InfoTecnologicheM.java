package gcodeCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class InfoTecnologicheM.
 */
public class InfoTecnologicheM {
	
	/** The rot tool. */
	private String rot_tool;
	
	/** The stop tool. */
	private String stop_tool;
	
	/** The change tool. */
	private String change_tool;
	
	/** The lube. */
	private String lube;
	
	/** The end program. */
	private String end_program;

	/**
	 * Instantiates a new info tecnologiche M.
	 *
	 * @param commmand the commmand
	 * @param type the type
	 */
	public InfoTecnologicheM(Token commmand, char type) {
		if (type == 'x')
			this.rot_tool = commmand.getText();
		else if (type == 's')
			this.stop_tool = commmand.getText();
		else if (type == 'f')
			this.change_tool = commmand.getText();
		else if (type == 'g')
			this.lube = commmand.getText();
		else
			this.end_program = commmand.getText();
	}

	/**
	 * Instantiates a new info tecnologiche M.
	 */
	public InfoTecnologicheM() {
	}

	/**
	 * Gets the rot tool.
	 *
	 * @return the rot tool
	 */
	public String getRot_tool() {
		return rot_tool;
	}

	/**
	 * Sets the rot tool.
	 *
	 * @param rot_tool the new rot tool
	 */
	public void setRot_tool(String rot_tool) {
		this.rot_tool = rot_tool;
	}

	/**
	 * Gets the stop tool.
	 *
	 * @return the stop tool
	 */
	public String getStop_tool() {
		return stop_tool;
	}

	/**
	 * Sets the stop tool.
	 *
	 * @param stop_tool the new stop tool
	 */
	public void setStop_tool(String stop_tool) {
		this.stop_tool = stop_tool;
	}

	/**
	 * Gets the change tool.
	 *
	 * @return the change tool
	 */
	public String getChange_tool() {
		return change_tool;
	}

	/**
	 * Sets the change tool.
	 *
	 * @param change_tool the new change tool
	 */
	public void setChange_tool(String change_tool) {
		this.change_tool = change_tool;
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

	/**
	 * Gets the end program.
	 *
	 * @return the end program
	 */
	public String getEnd_program() {
		return end_program;
	}

	/**
	 * Sets the end program.
	 *
	 * @param end_program the new end program
	 */
	public void setEnd_program(String end_program) {
		this.end_program = end_program;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String s = "";

		if (this.rot_tool != null)
			s = s.concat(this.rot_tool) + " ";

		if (this.stop_tool != null)
			s = s.concat(this.stop_tool) + " ";

		if (this.change_tool != null)
			s = s.concat(this.change_tool) + " ";

		if (this.lube != null)
			s = s.concat(this.lube) + " ";

		if (this.end_program != null)
			s = s.concat(this.end_program);

		return s;

	}

}
