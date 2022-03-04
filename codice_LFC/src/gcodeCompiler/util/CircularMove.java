package gcodeCompiler.util;

public class CircularMove {

	private String moveType; // G00, G01

	private String coordX;
	private String coordY;
	private String coordZ;

	private String coordI;
	private String coordJ;
	private String coordK;

	public CircularMove(String move_type) {
		this.moveType = move_type;
		this.coordX = null;
		this.coordY = null;
		this.coordZ = null;
		this.coordI = null;
		this.coordJ = null;
		this.coordK = null;
	}

	public void setX(String coord_x) {
		this.coordX = coord_x;
	}

	public void setY(String coord_y) {
		this.coordY = coord_y;
	}

	public void setZ(String coord_z) {
		this.coordZ = coord_z;
	}

	public String getMoveType() {
		return this.moveType;
	}

	public int getX() {
		return Integer.parseInt(coordX.substring(1));
	}

	public int getY() {
		return Integer.parseInt(coordY.substring(1));
	}

	public int getZ() {
		return Integer.parseInt(coordZ.substring(1));
	}

	public void setI(String coord_i) {
		this.coordI = coord_i;
	}

	public void setJ(String coord_j) {
		this.coordJ = coord_j;
	}

	public void setK(String coord_k) {
		this.coordK = coord_k;
	}

	public int getI() {
		return Integer.parseInt(coordI.substring(1));
	}

	public int getJ() {
		return Integer.parseInt(coordJ.substring(1));
	}

	public int getK() {
		return Integer.parseInt(coordK.substring(1));
	}

	public String circularMoveToString() {
		String content = this.getMoveType();

		if (this.coordX != null)
			content.concat(" " + this.coordX);

		if (this.coordY != null)
			content.concat(" " + this.coordY);

		if (this.coordY != null)
			content.concat(" " + this.coordZ);

		if (this.coordI != null)
			content.concat(" " + this.coordI);

		if (this.coordJ != null)
			content.concat(" " + this.coordJ);

		if (this.coordK != null)
			content.concat(" " + this.coordK);

		return content;
	}
}
