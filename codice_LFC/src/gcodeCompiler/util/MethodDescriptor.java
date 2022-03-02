package gcodeCompiler.util;

import java.util.ArrayList;
import java.util.List;

// deve implementare la stessa interfaccia del VarDescriptor
public class MethodDescriptor {
	public String type;
	public String name;
	List<VarDescriptor> parameters;

	public MethodDescriptor(String t, String n, List<VarDescriptor> p) {
		type = t;
		name = n;
		parameters = p;
	}
}
