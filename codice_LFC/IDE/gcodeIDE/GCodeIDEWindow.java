package gcodeIDE;

// Java Program to create a simple JTextArea
import java.awt.event.*;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.awt.*;
import javax.swing.*;

import org.antlr.runtime.RecognitionException;

import gcodeCompiler.*;
import gcodeCompiler.util.*;
import gcodeDrawingTool.*;
import gcodeMain.*;
import shaperCompiler.*;
import shaperCompiler.util.*;
import shaperMain.*;

@SuppressWarnings("serial")
public class GCodeIDEWindow extends JFrame implements ActionListener {

	private static final int WIDTH = 1500;
	private static final int HEIGHT = 850;

	static JFrame frame;
	static JButton parse_button;
	static JButton reset_button;
	static JTextArea areaGCODE;
	static JLabel scritta_console;
	static JScrollPane scorrimento_GCODE;
	static JTextArea areaConsole;
	static JScrollPane scorrimento_console;
	static JTextArea areaSHAPER;
	static JScrollPane scorrimento_SHAPER;
	static JButton convert_button;
	static JButton clear_button;
	static JLabel scritta_shaper;
	static JLabel scritta_gcode;

	GCodeIDEWindow() {
	}

	@SuppressWarnings("deprecation")
	public static void gCodeIDEWindow() {

		GCodeIDEWindow ide = new GCodeIDEWindow();

		frame = new JFrame("G-Code IDE v1.0");
		frame.setResizable(false);

		areaSHAPER = new JTextArea(10, 30);
		areaSHAPER.setFont(new Font("Monospace", Font.PLAIN, 18));
		areaSHAPER.setForeground(Color.BLACK);
		scorrimento_SHAPER = new JScrollPane(areaSHAPER);
		scorrimento_SHAPER.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scorrimento_SHAPER.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		convert_button = new JButton("CONVERT");
		parse_button = new JButton("PARSE");
		reset_button = new JButton("RESET");
		clear_button = new JButton("CLEAR");

		convert_button.addActionListener(ide);
		parse_button.addActionListener(ide);
		reset_button.addActionListener(ide);
		clear_button.addActionListener(ide);

		areaGCODE = new JTextArea(10, 30);
		areaGCODE.setFont(new Font("Monospace", Font.PLAIN, 18));
		areaGCODE.setForeground(Color.BLACK);
		scorrimento_GCODE = new JScrollPane(areaGCODE);
		scorrimento_GCODE.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scorrimento_GCODE.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		areaConsole = new JTextArea(10, 60);
		areaConsole.setFont(new Font("Courier", Font.PLAIN, 16));
		areaConsole.setEditable(false);
		scorrimento_console = new JScrollPane(areaConsole);
		scorrimento_console.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scorrimento_console.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		scritta_console = new JLabel();
		scritta_shaper = new JLabel();
		scritta_gcode = new JLabel();

		JPanel p = new JPanel();
		p.setLayout(null);

		p.add(scorrimento_SHAPER);
		scorrimento_SHAPER.setSize(575, 800 / 2 - 50);
		scorrimento_SHAPER.setLocation(20, 20 + 50);

		p.add(scorrimento_GCODE);
		scorrimento_GCODE.setSize(575, 800 / 2 - 50);
		scorrimento_GCODE.setLocation(750, 20 + 50);
		
		p.add(convert_button);
		convert_button.setSize(110, 30);
		convert_button.setLocation(618, 165 + 50);

		p.add(parse_button);
		parse_button.setSize(110, 30);
		parse_button.setLocation(WIDTH - 150, 140 + 25);
		
		p.add(clear_button);
		clear_button.setSize(110, 30);
		clear_button.setLocation(WIDTH - 150, 165 + 50);

		p.add(reset_button);
		reset_button.setSize(110, 30);
		reset_button.setLocation(WIDTH - 150, 190 + 50 + 25);
		
		p.add(scritta_shaper);
		scritta_shaper.setText("Shaper Metalanguage Input");
		scritta_shaper.setSize(300, 50);
		scritta_shaper.setLocation(20, 20);
		scritta_shaper.setFont(new Font("Monospace", Font.PLAIN, 20));
		
		p.add(scritta_gcode);
		scritta_gcode.setText("G-Code Language Input");
		scritta_gcode.setSize(300, 50);
		scritta_gcode.setLocation(750, 20);
		scritta_gcode.setFont(new Font("Monospace", Font.PLAIN, 20));

		p.add(scritta_console);
		scritta_console.setText("Console");
		scritta_console.setSize(300, 50);
		scritta_console.setLocation(20, (800 / 2 - 50) + 40 + 50);
		scritta_console.setFont(new Font("Monospace", Font.PLAIN, 20));

		p.add(scorrimento_console);
		scorrimento_console.setSize(WIDTH - 55, 800 / 2 - 100);
		scorrimento_console.setLocation(20, (800 / 2 - 50) + 20 + 20 + 50 + 50);

		frame.add(p);
		frame.setSize(WIDTH, HEIGHT);
		frame.show();
	}

	// if the button is pressed
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		// premuto il pulsante CONVERT
		if(s.equals("CONVERT")) {
			// TODO
			// instanziazione parser SHAPER
			
			String fileIn = ".\\temp_files\\shaper_temp.txt";
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream ps = new PrintStream(baos);
			PrintStream old = System.out;
			System.setOut(ps);
			
			try {
				PrintWriter out = new PrintWriter(fileIn);

				out.println(areaSHAPER.getText().toUpperCase());
				out.close();

				System.out.println("SHAPER METALANGUAGE PARSING WITH ANTLR3\n");

				// istanziamento parser
				shaperGrammarParser parser = new shaperGrammarParser(fileIn);

				// avvio parser
				parser.shaper();

				// check e print degli errori
				boolean convert = ShaperErrorManager.shaperErrorMgmt(parser);

				// qui innestiamo la funzione di stampa grafica
				if (convert) {
					System.out.println("\nShaper Metalanguage specification successfully converted to G-Code");
					System.out.flush();
					System.setOut(old);
					areaConsole.setForeground(Color.BLACK);
					areaConsole.setText(baos.toString());
					areaConsole.setCaretPosition(0);
					
					// TODO
					// operazione da fare quando non ci sono stati errori
					// conversione SHAPER in GCODE
					areaGCODE.setText("GCODE WILL BE SHOWN HERE");

				} else {
					System.out.println("\nCannot convert Shaper Metalanguage specification to G-Code");
					System.out.flush();
					System.setOut(old);
					areaConsole.setForeground(Color.RED);
					areaConsole.setText(baos.toString());
					areaConsole.setCaretPosition(0);
				}

			} catch (IOException | RecognitionException e1) {
				e1.printStackTrace();
			}
		}

		// premuto il pulsante PARSE
		if (s.equals("PARSE")) {
			String fileIn = ".\\temp_files\\gcode_temp.txt";

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream ps = new PrintStream(baos);
			PrintStream old = System.out;
			System.setOut(ps);

			try {
				PrintWriter out = new PrintWriter(fileIn);

				out.println(areaGCODE.getText().toUpperCase());
				out.close();

				System.out.println("GCODE LANGUAGE PARSING WITH ANTLR3\n");

				// istanziamento parser
				gcodeGrammarParser parser = new gcodeGrammarParser(fileIn);

				// avvio parser
				parser.gcode();

				// check e print degli errori
				boolean draw = GcodeErrorManager.gcodeErrorMgmt(parser);

				// qui innestiamo la funzione di stampa grafica
				if (draw) {
					System.out.println("\nG-Code drawing is on it's way");
					System.out.flush();
					System.setOut(old);
					areaConsole.setForeground(Color.BLACK);
					areaConsole.setText(baos.toString());
					areaConsole.setCaretPosition(0);
					new GCodeDrawingViewer(parser); // apertura finestra disegno

				} else {
					System.out.println("\nWe tried all our best but we couldnt draw the G-Code specification");
					System.out.flush();
					System.setOut(old);
					areaConsole.setForeground(Color.RED);
					areaConsole.setText(baos.toString());
					areaConsole.setCaretPosition(0);
				}

			} catch (IOException | RecognitionException e1) {
				e1.printStackTrace();
			}

		}
		
		// premuto il pulsante CLEAR
		if(s.equals("CLEAR")) {
			areaSHAPER.setText("");
			areaConsole.setText("");
		}

		// premuto il pulsante RESET
		if (s.equals("RESET")) {
			areaSHAPER.setText("");
			areaGCODE.setText("");
			areaConsole.setText("");
		}
	}

}