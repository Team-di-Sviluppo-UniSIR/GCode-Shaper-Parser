package gcodeCompiler.util;

// tabella delle variabili
public class VarDescriptor {
	public String type;
	public String name;
	public String value;

	public VarDescriptor(String t, String n) {
		type = t;
		name = n;
		value = "";
	}

	public VarDescriptor(String t, String n, String v) {
		type = t;
		name = n;
		value = v;
	}
}
