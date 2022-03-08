package gcodeCompiler.util;

import org.antlr.runtime.Token;

public class InfoTecnologiche {
	private String free_move_speed;
	private String job_move_speed;
	private Tool t;

	public InfoTecnologiche(Token command, char type) {
		if (type == 'x')
			this.free_move_speed = command.getText();
		else if (type == 'j')
			this.job_move_speed = command.getText();
		else if (type == 't') {
			this.t = new Tool(command.getText().substring(1, 3), command.getText().substring(3, 5));
		}
	}

	public InfoTecnologiche(Tool t) {
		this.t = t;
	}

	public InfoTecnologiche() {
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
