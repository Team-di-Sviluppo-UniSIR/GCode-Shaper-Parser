/**
 * This package contains all the support classes used in the G-Code semantic analysis.
 */
package gcodeCompiler.util;

// TODO: Auto-generated Javadoc
/**
 * 
 * Block descriptor class. A block is the basic element of a G-Code file.
 *
 */
// classe che descrive la struttura interna di un blocco
public class BlockDescriptor {
	
	/** The num block. */
	private String num_block; // N[]
	
	/** The info geo. */
	private InfoGeometriche infoGeo;
	
	/** The info tec. */
	private InfoTecnologiche infoTec;
	
	/** The info tec M. */
	private InfoTecnologicheM infoTecM; // M[]

	/**
	 * Constructor of BlockDescriptor class.
	 *
	 * @param num_block the num block
	 * @param infoGeo the info geo
	 * @param infoTec the info tec
	 * @param infoTecM the info tec M
	 */
	public BlockDescriptor(String num_block, InfoGeometriche infoGeo, InfoTecnologiche infoTec,
			InfoTecnologicheM infoTecM) {
		this.num_block = num_block;
		this.infoGeo = infoGeo;
		this.infoTec = infoTec;
		this.infoTecM = infoTecM;
	}

	/**
	 * Instantiates a new block descriptor.
	 *
	 * @param num_block the num block
	 */
	public BlockDescriptor(String num_block) {
		this.num_block = num_block;
	}

	/**
	 * Gets the num block.
	 *
	 * @return the num block
	 */
	public String getNum_block() {
		return num_block;
	}

	/**
	 * Sets the num block.
	 *
	 * @param num_block the new num block
	 */
	public void setNum_block(String num_block) {
		this.num_block = num_block;
	}

	/**
	 * Gets the info geo.
	 *
	 * @return the info geo
	 */
	public InfoGeometriche getInfoGeo() {
		return infoGeo;
	}

	/**
	 * Sets the info geo.
	 *
	 * @param infoGeo the new info geo
	 */
	public void setInfoGeo(InfoGeometriche infoGeo) {
		this.infoGeo = infoGeo;
	}

	/**
	 * Gets the infot tec.
	 *
	 * @return the infot tec
	 */
	public InfoTecnologiche getInfotTec() {
		return infoTec;
	}

	/**
	 * Sets the infot tec.
	 *
	 * @param infotTec the new infot tec
	 */
	public void setInfotTec(InfoTecnologiche infotTec) {
		this.infoTec = infotTec;
	}

	/**
	 * Gets the info tec M.
	 *
	 * @return the info tec M
	 */
	public InfoTecnologicheM getInfoTecM() {
		return infoTecM;
	}

	/**
	 * Sets the info tec M.
	 *
	 * @param infoTecM the new info tec M
	 */
	public void setInfoTecM(InfoTecnologicheM infoTecM) {
		this.infoTecM = infoTecM;
	}

	/**
	 * This method returns the block printout informations.
	 *
	 * @return the string
	 */
	public String toString() {
		String s = "";

		if (this.infoGeo != null)
			s = s.concat(this.infoGeo.toString());

		if (this.infoTec != null)
			s = s.concat(this.infoTec.toString());

		if (this.infoTecM != null)
			s = s.concat(this.infoTecM.toString());

		if (s.charAt(s.length() - 1) == ' ')
			return s.substring(0, s.length() - 1);
		else
			return s;

	}

}
