package gcodeCompiler.util;

public class blockDescriptor {
	String num_block;

	public blockDescriptor(String numBlock) {
		this.num_block = numBlock;
	}

	public String getBlockContent() {
		return this.num_block;
	}
}
