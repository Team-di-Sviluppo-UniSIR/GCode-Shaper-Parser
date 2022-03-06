package gcodeCompiler.util;

import org.antlr.runtime.Token;

// ciò che non viene inizializzato rimane a null
public class InfoGeometriche {
	private String coord_abs_rel;
	private String compensation;
	private LinearMove lm;
	private CircularMove cm;

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

	public InfoGeometriche() {
	}

	public InfoGeometriche(LinearMove lm) {
		this.lm = lm;
	}

	public InfoGeometriche(CircularMove cm) {
		this.cm = cm;
	}

	public String getCoord_abs_rel() {
		return coord_abs_rel;
	}

	public void setCoord_abs_rel(String coord_abs_rel) {
		this.coord_abs_rel = coord_abs_rel;
	}

	public String getCompensation() {
		return compensation;
	}

	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	public LinearMove getLm() {
		return lm;
	}

	public void setLm(LinearMove lm) {
		this.lm = lm;
	}

	public CircularMove getCm() {
		return cm;
	}

	public void setCm(CircularMove cm) {
		this.cm = cm;
	}

}
