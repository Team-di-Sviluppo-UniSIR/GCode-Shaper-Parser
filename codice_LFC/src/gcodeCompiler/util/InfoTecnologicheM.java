package gcodeCompiler.util;

import org.antlr.runtime.Token;

public class InfoTecnologicheM {
	private String rot_tool;
	private String stop_tool;
	private String change_tool;
	private String lube;
	private String end_program;

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

	public InfoTecnologicheM() {
	}

	public String getRot_tool() {
		return rot_tool;
	}

	public void setRot_tool(String rot_tool) {
		this.rot_tool = rot_tool;
	}

	public String getStop_tool() {
		return stop_tool;
	}

	public void setStop_tool(String stop_tool) {
		this.stop_tool = stop_tool;
	}

	public String getChange_tool() {
		return change_tool;
	}

	public void setChange_tool(String change_tool) {
		this.change_tool = change_tool;
	}

	public String getLube() {
		return lube;
	}

	public void setLube(String lube) {
		this.lube = lube;
	}

	public String getEnd_program() {
		return end_program;
	}

	public void setEnd_program(String end_program) {
		this.end_program = end_program;
	}

	public String toString() {
		String s = "";

		if (this.rot_tool != null)
			s = s.concat(this.rot_tool);

		if (this.stop_tool != null)
			s = s.concat(this.stop_tool);

		if (this.change_tool != null)
			s = s.concat(this.change_tool);

		if (this.lube != null)
			s = s.concat(this.lube);

		if (this.end_program != null)
			s = s.concat(this.end_program);

		return s;

	}

}
