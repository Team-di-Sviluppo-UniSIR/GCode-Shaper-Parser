package shaperCompiler.util;

import org.antlr.runtime.Token;

public class Shape {
	char type;

	String moveSpeed;
	String jobSpeed;
	String lube;

	public Shape(char type, Token ms, Token js, Token lb) {
		this.type = type;
		this.moveSpeed = "F" + ms.getText().substring(2);
		this.jobSpeed = "S" + js.getText().substring(2);

		if (lb.getText().equals("ON"))
			this.lube = "M08";
		else
			this.lube = "M09";
	}

	public Shape(char type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CONFIGURATION: " + moveSpeed + " " + jobSpeed + " " + lube;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(String moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public String getJobSpeed() {
		return jobSpeed;
	}

	public void setJobSpeed(String jobSpeed) {
		this.jobSpeed = jobSpeed;
	}

	public String getLube() {
		return lube;
	}

	public void setLube(String lube) {
		this.lube = lube;
	}

}
