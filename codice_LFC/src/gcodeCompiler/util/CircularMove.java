package gcodeCompiler.util;

import org.antlr.runtime.Token;

// classe che descrive la struttura del movimento circolare
public class CircularMove {
	private String moveType; // G02, G03
	private Coordinate c_xyz; // coordinate punto finale
	private Coordinate c_ijk; // coordinate centro

	public CircularMove(Token move_type, Coordinate c_xyz, Coordinate c_ijk) {
		this.moveType = move_type.getText();
		this.c_xyz = c_xyz;
		this.c_ijk = c_ijk;
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

	public Coordinate getC_ijk() {
		return c_ijk;
	}

	public void setC_ijk(Coordinate c_ijk) {
		this.c_ijk = c_ijk;
	}

	public String getString() {
		return this.moveType + " " + this.c_xyz.getString() + " " + this.c_ijk.getString();
	}

}
