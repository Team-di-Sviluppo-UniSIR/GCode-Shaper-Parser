package gcodeCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * 
 * Circular move class.
 *
 */
// classe che descrive la struttura del movimento circolare
public class CircularMove {
	
	/** The move type. */
	private String moveType; // G02, G03
	
	/** The c xyz. */
	private Coordinate c_xyz; // coordinate punto finale
	
	/** The c ijk. */
	private Coordinate c_ijk; // coordinate centro

	/**
	 * Circular move constructor.
	 *
	 * @param move_type the move type
	 * @param c_xyz the c xyz
	 * @param c_ijk the c ijk
	 */
	public CircularMove(Token move_type, Coordinate c_xyz, Coordinate c_ijk) {
		this.moveType = move_type.getText();
		this.c_xyz = c_xyz;
		this.c_ijk = c_ijk;
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
	 * Gets the c ijk.
	 *
	 * @return the c ijk
	 */
	public Coordinate getC_ijk() {
		return c_ijk;
	}

	/**
	 * Sets the c ijk.
	 *
	 * @param c_ijk the new c ijk
	 */
	public void setC_ijk(Coordinate c_ijk) {
		this.c_ijk = c_ijk;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return this.moveType + " " + this.c_xyz.toString() + " " + this.c_ijk.toString();
	}

}
