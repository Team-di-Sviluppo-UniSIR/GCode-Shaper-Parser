package gcodeCompiler.util;

// TODO: Auto-generated Javadoc
/**
 * The Class Tool.
 */
/*
 *  classe per la descrizione della tipologia di tool e della sua configurazione 
 *  nella forma T[selezione][configurazione]
 */
public class Tool {
	
	/** The tool selection. */
	private String toolSelection; // selezione del tool
	
	/** The tool configuration. */
	private String toolConfiguration; // configurazione del tool

	/**
	 * Instantiates a new tool.
	 *
	 * @param toolSelection the tool selection
	 * @param toolConfiguration the tool configuration
	 */
	public Tool(String toolSelection, String toolConfiguration) {
		this.toolSelection = toolSelection;
		this.toolConfiguration = toolConfiguration;
	}

	/**
	 * Gets the tool selection.
	 *
	 * @return the tool selection
	 */
	public String getToolSelection() {
		return toolSelection;
	}

	/**
	 * Sets the tool selection.
	 *
	 * @param toolSelection the new tool selection
	 */
	public void setToolSelection(String toolSelection) {
		this.toolSelection = toolSelection;
	}

	/**
	 * Gets the tool configuration.
	 *
	 * @return the tool configuration
	 */
	public String getToolConfiguration() {
		return toolConfiguration;
	}

	/**
	 * Sets the tool configuration.
	 *
	 * @param toolConfiguration the new tool configuration
	 */
	public void setToolConfiguration(String toolConfiguration) {
		this.toolConfiguration = toolConfiguration;
	}

	/**
	 * Tool to string.
	 *
	 * @return the string
	 */
	public String toolToString() {
		return "T" + this.toolSelection + this.toolConfiguration;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "T" + this.toolSelection + this.toolConfiguration;
	}

}
