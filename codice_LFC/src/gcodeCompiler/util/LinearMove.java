package gcodeCompiler.util;

import org.antlr.runtime.Token;

public class LinearMove {

	private String moveType; // G00, G01
	private Coordinate c_xyz;

	public LinearMove(Token move_type, Coordinate c_xyz) {
		this.moveType = move_type.getText();
		this.c_xyz = c_xyz;
	}

	public String getMoveType() {
		return moveType;
	}

	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}

	public Coordinate getC_xyz() {
		return c_xyz;
	}

	public void setC_xyz(Coordinate c_xyz) {
		this.c_xyz = c_xyz;
	}

}
