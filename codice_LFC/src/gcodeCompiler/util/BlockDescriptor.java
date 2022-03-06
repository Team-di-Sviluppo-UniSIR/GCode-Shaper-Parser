package gcodeCompiler.util;

// classe che descrive la struttura interna di un blocco
public class BlockDescriptor {
	private String num_block; // N[]
	private String coord_abs_rel; // G90, G91
	private String compensation; // G40, G41, G42
	private LinearMove lMove; // [G00, G01][X,Y,Z]
	private CircularMove cMove; // [G02, G03][X,Y,Z][I,J,K]

	private Tool changeTool; // T[][]
	private String workSpeed; // S[]
	private String moveSpeed; // F[]

	private InfoTecnologicheM auxConf; // M[]

	public BlockDescriptor(String num_block, String coord_abs_rel, String compensation, LinearMove lMove,
			CircularMove cMove, Tool changeTool, InfoTecnologicheM auxConf, String workSpeed, String moveSpeed) {
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

	public BlockDescriptor(String num_block) {
		this.num_block = num_block;
	}

	public String getNum_block() {
		return num_block;
	}

	public void setNum_block(String num_block) {
		this.num_block = num_block;
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

	public LinearMove getlMove() {
		return lMove;
	}

	public void setlMove(LinearMove lMove) {
		this.lMove = lMove;
	}

	public CircularMove getcMove() {
		return cMove;
	}

	public void setcMove(CircularMove cMove) {
		this.cMove = cMove;
	}

	public Tool getChangeTool() {
		return changeTool;
	}

	public void setChangeTool(Tool changeTool) {
		this.changeTool = changeTool;
	}

	public InfoTecnologicheM getAuxConf() {
		return auxConf;
	}

	public void setAuxConf(InfoTecnologicheM auxConf) {
		this.auxConf = auxConf;
	}

	public String getWorkSpeed() {
		return workSpeed;
	}

	public void setWorkSpeed(String workSpeed) {
		this.workSpeed = workSpeed;
	}

	public String getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(String moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

}
