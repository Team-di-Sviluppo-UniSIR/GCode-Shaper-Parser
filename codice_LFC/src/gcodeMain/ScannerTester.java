package main;

import java.io.FileReader;
import javaCompiler.simpleJavaLexer;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

public class ScannerTester {
	public static void main(String[] args) {
		String fileIn = ".\\resources\\input.file";
		Token tk;
		int i;

		try {
			System.out.println("Test ANTLR lexer\n");
			simpleJavaLexer lexer = new simpleJavaLexer(
					new ANTLRReaderStream(new FileReader(fileIn)));
			i = 1;
			while ((tk = lexer.nextToken()).getType() != simpleJavaLexer.EOF) {
				if (tk.getChannel() != simpleJavaLexer.HIDDEN)
					System.out.println("Token " + i++ + ": [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1)
							+ "]  " + "TokenType: " + tk.getType() + ": " + tk.getText());
			}
		} catch (Exception e) {
			System.out.println("Test ANTLR abortito");
			e.printStackTrace();
		}
	}
}