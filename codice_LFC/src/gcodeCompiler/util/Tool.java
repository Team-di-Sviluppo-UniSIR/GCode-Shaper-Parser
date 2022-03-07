package gcodeCompiler.util;

/*
 *  classe per la descrizione della tipologia di tool e della sua configurazione 
 *  nella forma T[selezione][configurazione]
 */
public class Tool {
	private String toolSelection; // selezione del tool
	private String toolConfiguration; // configurazione del tool

	public Tool(String toolSelection, String toolConfiguration) {
		this.toolSelection = toolSelection;
		this.toolConfiguration = toolConfiguration;
	}

	public String getToolSelection() {
		return toolSelection;
	}

	public void setToolSelection(String toolSelection) {
		this.toolSelection = toolSelection;
	}

	public String getToolConfiguration() {
		return toolConfiguration;
	}

	public void setToolConfiguration(String toolConfiguration) {
		this.toolConfiguration = toolConfiguration;
	}

	public String toolToString() {
		return "T" + this.toolSelection + this.toolConfiguration;
	}

	public String getString() {
		return "T" + this.toolSelection + this.toolConfiguration;
	}

}
