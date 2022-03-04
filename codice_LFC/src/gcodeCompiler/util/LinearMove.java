package gcodeCompiler.util;

public class LinearMove {

	private String moveType; // G00, G01

	private String coordX;
	private String coordY;
	private String coordZ;

	public LinearMove(String move_type) {
		this.moveType = move_type;
		this.coordX = null;
		this.coordY = null;
		this.coordZ = null;
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

	public String linearMoveToString() {
		String content = this.getMoveType();

		if (this.coordX != null)
			content.concat(" " + this.coordX);

		if (this.coordY != null)
			content.concat(" " + this.coordY);

		if (this.coordY != null)
			content.concat(" " + this.coordZ);

		return content;
	}

}
