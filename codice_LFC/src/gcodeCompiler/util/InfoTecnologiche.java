package gcodeCompiler.util;

import org.antlr.runtime.Token;

public class InfoTecnologiche {
	private String free_move_speed;
	private String job_move_speed;
	private Tool t;

	public InfoTecnologiche(Token commmand, char type) {
		if (type == 'x') {
			this.free_move_speed = commmand.getText();
		} else {
			this.job_move_speed = commmand.getText();
		}
	}
	public InfoTecnologiche(Tool t) {
		this.t = t;
	}
	
	public String getFree_move_speed() {
		return free_move_speed;
	}

	public void setFree_move_speed(String free_move_speed) {
		this.free_move_speed = free_move_speed;
	}
	
	public String getJob_move_speed() {
		return job_move_speed;
	}

	public void setJob_move_speed(String job_move_speed) {
		this.job_move_speed = job_move_speed;
	}
	
	public Tool getT() {
		return t;
	}

	public void setT(Tool t) {
		this.t = t;
	}
}