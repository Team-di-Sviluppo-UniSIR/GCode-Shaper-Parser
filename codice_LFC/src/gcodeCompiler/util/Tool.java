package gcodeCompiler.util;

public class Tool {
	private String toolSelection;
	private String toolConfiguration;

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

}
