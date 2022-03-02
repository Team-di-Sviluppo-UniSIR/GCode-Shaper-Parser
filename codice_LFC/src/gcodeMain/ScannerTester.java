package gcodeMain;

import java.io.FileReader;

import gcodeCompiler.gcodeGrammarLexer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

public class ScannerTester {

	public static void main(String[] args) {
		String fileIn = ".\\resources\\input.file";

		Token tk;
		int i;

		try {
			System.out.println("Test ANTLR lexer");
			// istanzio lo scanner passandogli un stream di ingresso
			gcodeGrammarLexer lexer = new gcodeGrammarLexer(new ANTLRReaderStream(new FileReader(fileIn)));

			i = 1;
			// attivo un ciclo che scandisce lo stream dall'inizio alla fine
			// richiedendo ogni volta allo scanner di fornire il token successivo (metodo
			// nextToken)
			// fino ad incontrare l' End Of File EOF
			while ((tk = lexer.nextToken()).getType() != gcodeGrammarLexer.EOF) {
				// stampo a video le informazioni relative ai token rilevati
				if (tk.getChannel() != gcodeGrammarLexer.HIDDEN)
					System.out.println("Token " + i++ + ": (" + tk.getLine() + "," + (tk.getCharPositionInLine() + 1)
							+ ")\t" + "TokenType:" + tk.getType() + ":\t" + tk.getText());
			}

		} catch (Exception e) {
			System.out.println("Test ANTLR abortito");
			e.printStackTrace();
		}

	}

}