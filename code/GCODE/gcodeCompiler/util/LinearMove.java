package gcodeCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class LinearMove.
 */
// classe che descrive il movimento lineare (veloce o lento)
public class LinearMove {
	
	/** The move type. */
	private String moveType; // G00, G01
	
	/** The c xyz. */
	private Coordinate c_xyz;

	/**
	 * Instantiates a new linear move.
	 *
	 * @param move_type the move type
	 * @param c_xyz the c xyz
	 */
	/*
	 * per costruire un'istanza, passo il tipo di movimento e l'oggetto di tipo
	 * Coordinate
	 */
	public LinearMove(Token move_type, Coordinate c_xyz) {
		this.moveType = move_type.getText();
		this.c_xyz = c_xyz;
	}

	/**
	 * Gets the move type.
	 *
	 * @return the move type
	 */
	public String getMoveType() {
		return moveType;
	}

	/**
	 * Sets the move type.
	 *
	 * @param moveType the new move type
	 */
	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}

	/**
	 * Gets the c xyz.
	 *
	 * @return the c xyz
	 */
	public Coordinate getC_xyz() {
		return c_xyz;
	}

	/**
	 * Sets the c xyz.
	 *
	 * @param c_xyz the new c xyz
	 */
	public void setC_xyz(Coordinate c_xyz) {
		this.c_xyz = c_xyz;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return this.moveType + " " + this.c_xyz.toString();
	}

}
