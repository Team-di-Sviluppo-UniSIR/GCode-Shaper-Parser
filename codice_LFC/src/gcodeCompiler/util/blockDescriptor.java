package gcodeCompiler.util;

// classe che descrive la struttura interna di un blocco
public class blockDescriptor {
	private String num_block; // N[]
	private String coord_abs_rel; // G90, G91
	private String compensation; // G40, G41, G42
	private LinearMove lMove; // [G00, G01][X,Y,Z]
	private CircularMove cMove; // [G02, G03][X,Y,Z][I,J,K]
	private Tool changeTool; // T[][]
	private ConfM auxConf; // M[]
	private String workSpeed; // S[]
	private String moveSpeed; // F[]

	public blockDescriptor(String num_block, String coord_abs_rel, String compensation, LinearMove lMove,
			CircularMove cMove, Tool changeTool, ConfM auxConf, String workSpeed, String moveSpeed) {
		this.num_block = num_block;
		this.coord_abs_rel = coord_abs_rel;
		this.compensation = compensation;
		this.lMove = lMove;
		this.cMove = cMove;
		this.changeTool = changeTool;
		this.auxConf = auxConf;
		this.workSpeed = workSpeed;
		this.moveSpeed = moveSpeed;
	}

	public String getNum_block() {
		return num_block;
	}

	public String getCoord_abs_rel() {
		return coord_abs_rel;
	}

	public String getCompensation() {
		return compensation;
	}

	public LinearMove getlMove() {
		return lMove;
	}

	public CircularMove getcMove() {
		return cMove;
	}

	public Tool getChangeTool() {
		return changeTool;
	}

	public ConfM getAuxConf() {
		return auxConf;
	}

	public String getWorkSpeed() {
		return workSpeed;
	}

	public String getMoveSpeed() {
		return moveSpeed;
	}

}
