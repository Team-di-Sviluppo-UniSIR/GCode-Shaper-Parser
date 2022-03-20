package gcodeCompiler.util;

// classe che descrive la struttura interna di un blocco
public class BlockDescriptor {
	private String num_block; // N[]
	private InfoGeometriche infoGeo;
	private InfoTecnologiche infoTec;
	private InfoTecnologicheM infoTecM; // M[]

	public BlockDescriptor(String num_block, InfoGeometriche infoGeo, InfoTecnologiche infoTec,
			InfoTecnologicheM infoTecM) {
		this.num_block = num_block;
		this.infoGeo = infoGeo;
		this.infoTec = infoTec;
		this.infoTecM = infoTecM;
	}

	public BlockDescriptor(String num_block) {
		this.num_block = num_block;
	}

	public String getNum_block() {
		return num_block;
	}

	public void setNum_block(String num_block) {
		this.num_block = num_block;
	}

	public InfoGeometriche getInfoGeo() {
		return infoGeo;
	}

	public void setInfoGeo(InfoGeometriche infoGeo) {
		this.infoGeo = infoGeo;
	}

	public InfoTecnologiche getInfotTec() {
		return infoTec;
	}

	public void setInfotTec(InfoTecnologiche infotTec) {
		this.infoTec = infotTec;
	}

	public InfoTecnologicheM getInfoTecM() {
		return infoTecM;
	}

	public void setInfoTecM(InfoTecnologicheM infoTecM) {
		this.infoTecM = infoTecM;
	}

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
