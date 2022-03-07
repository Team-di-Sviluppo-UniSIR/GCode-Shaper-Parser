package gcodeCompiler.util;

import org.antlr.runtime.Token;

// classe che descrive il movimento lineare (veloce o lento)
public class LinearMove {
	private String moveType; // G00, G01
	private Coordinate c_xyz;

	/*
	 * per costruire un'istanza, passo il tipo di movimento e l'oggetto di tipo
	 * Coordinate
	 */
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

	public String getString() {
		return this.moveType + " " + this.c_xyz.getString();
	}

}
