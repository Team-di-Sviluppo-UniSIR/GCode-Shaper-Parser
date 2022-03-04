package gcodeCompiler.util;

public class ConfM {
	private String toolRotation;
	private String lube;
	private String changeTool;
	private String endProgram;

	public ConfM(String toolRotation, String lube, String changeTool, String endProgram) {
		this.toolRotation = toolRotation;
		this.lube = lube;
		this.changeTool = changeTool;
		this.endProgram = endProgram;
	}

	public String getToolRotation() {
		return toolRotation;
	}

	public void setToolRotation(String toolRotation) {
		this.toolRotation = toolRotation;
	}

	public String getLube() {
		return lube;
	}

	public void setLube(String lube) {
		this.lube = lube;
	}

	public String getChangeTool() {
		return changeTool;
	}

	public void setChangeTool(String changeTool) {
		this.changeTool = changeTool;
	}

	public String getEndProgram() {
		return endProgram;
	}

	public void setEndProgram(String endProgram) {
		this.endProgram = endProgram;
	}
}
