package gcodeCompiler;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

import org.antlr.runtime.*;
import gcodeCompiler.util.*;

public class gcodeGrammarHandler<V, K> {

	public SortedMap<String, blockDescriptor> blocks;

	public gcodeGrammarHandler() {
		blocks = new TreeMap<String, blockDescriptor>();
	}

	public void createNewBlock(Token n) {
		blocks.put(n.getText(), new blockDescriptor(n.getText()));
	}

	public void printBlocks() {
		for (Entry<String, blockDescriptor> entry : blocks.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getBlockContent());
		}
	}

}