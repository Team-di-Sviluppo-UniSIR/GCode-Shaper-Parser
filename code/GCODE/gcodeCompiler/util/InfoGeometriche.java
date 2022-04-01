package gcodeCompiler.util;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class InfoGeometriche.
 */
// ciò che non viene inizializzato rimane a null
public class InfoGeometriche {
	
	/** The coord abs rel. */
	private String coord_abs_rel;
	
	/** The compensation. */
	private String compensation;
	
	/** The lm. */
	private LinearMove lm;
	
	/** The cm. */
	private CircularMove cm;

	/**
	 * Instantiates a new info geometriche.
	 *
	 * @param commmand the commmand
	 * @param type the type
	 */
	/*
	 * Il costruttore con un solo comando è usato sia per G90, G91 che per G40, G41,
	 * G42. Per poter discriminare se sto valorizzando il campo coord_abs_rel o
	 * compensation, faccio il controllo sulla lettera (immagino esistano metodi
	 * anche più belli, li valuteremo)
	 */
	public InfoGeometriche(Token commmand, char type) {
		if (type == 'x')
			this.coord_abs_rel = commmand.getText();
		else
			this.compensation = commmand.getText();
	}

	/**
	 * Instantiates a new info geometriche.
	 */
	public InfoGeometriche() {
	}

	/**
	 * Instantiates a new info geometriche.
	 *
	 * @param lm the lm
	 */
	public InfoGeometriche(LinearMove lm) {
		this.lm = lm;
	}

	/**
	 * Instantiates a new info geometriche.
	 *
	 * @param cm the cm
	 */
	public InfoGeometriche(CircularMove cm) {
		this.cm = cm;
	}

	/**
	 * Gets the coord abs rel.
	 *
	 * @return the coord abs rel
	 */
	public String getCoord_abs_rel() {
		return coord_abs_rel;
	}

	/**
	 * Sets the coord abs rel.
	 *
	 * @param coord_abs_rel the new coord abs rel
	 */
	public void setCoord_abs_rel(String coord_abs_rel) {
		this.coord_abs_rel = coord_abs_rel;
	}

	/**
	 * Gets the compensation.
	 *
	 * @return the compensation
	 */
	public String getCompensation() {
		return compensation;
	}

	/**
	 * Sets the compensation.
	 *
	 * @param compensation the new compensation
	 */
	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	/**
	 * Gets the lm.
	 *
	 * @return the lm
	 */
	public LinearMove getLm() {
		return lm;
	}

	/**
	 * Sets the lm.
	 *
	 * @param lm the new lm
	 */
	public void setLm(LinearMove lm) {
		this.lm = lm;
	}

	/**
	 * Gets the cm.
	 *
	 * @return the cm
	 */
	public CircularMove getCm() {
		return cm;
	}

	/**
	 * Sets the cm.
	 *
	 * @param cm the new cm
	 */
	public void setCm(CircularMove cm) {
		this.cm = cm;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String s = "";

		if (this.coord_abs_rel != null)
			s = s.concat(this.coord_abs_rel) + " ";

		if (this.compensation != null)
			s = s.concat(this.compensation) + " ";

		if (this.lm != null)
			s = s.concat(this.lm.toString()) + " ";

		if (this.cm != null)
			s = s.concat(this.cm.toString()) + " ";

		return s;
	}

}
