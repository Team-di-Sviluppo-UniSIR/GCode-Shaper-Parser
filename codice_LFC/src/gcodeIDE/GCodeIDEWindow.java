package gcodeIDE;

// Java Program to create a simple JTextArea
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GCodeIDEWindow extends JFrame implements ActionListener {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	static JFrame frame;
	static JButton parse_button;
	static JButton reset_button;
	static JTextArea areaInserimento;
	static JLabel scritta_console;
	static JScrollPane scorrimento_ins;
	static JTextArea areaConsole;
	static JScrollPane scorrimento_console;

	static JLabel l; // da togliere

	GCodeIDEWindow() {
	}

	@SuppressWarnings("deprecation")
	public static void gCodeIDEWindow() {

		GCodeIDEWindow ide = new GCodeIDEWindow();

		frame = new JFrame("G-Code IDE v1.0");

		parse_button = new JButton("PARSE");
		reset_button = new JButton("RESET");

		parse_button.addActionListener(ide);
		reset_button.addActionListener(ide);

		areaInserimento = new JTextArea(25, 40);
		areaInserimento.setFont(new Font("Monospace", Font.PLAIN, 18));
		areaInserimento.setForeground(Color.BLACK);
		scorrimento_ins = new JScrollPane(areaInserimento);
		scorrimento_ins.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scorrimento_ins.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		areaConsole = new JTextArea(25, 60);
		areaConsole.setFont(new Font("Courier", Font.PLAIN, 16));
		areaConsole.setEditable(false);
		scorrimento_console = new JScrollPane(areaConsole);
		scorrimento_console.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scorrimento_console.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		scritta_console = new JLabel();

		l = new JLabel("nothing entered"); // da togliere

		JPanel p = new JPanel();
		p.setLayout(null);

		p.add(scorrimento_ins);
		scorrimento_ins.setSize(WIDTH - 200, HEIGHT / 2 - 50);
		scorrimento_ins.setLocation(20, 20);

		p.add(parse_button);
		parse_button.setSize(110, 30);
		parse_button.setLocation(WIDTH - 150, 140);

		p.add(reset_button);
		reset_button.setSize(110, 30);
		reset_button.setLocation(WIDTH - 150, 190);

		p.add(scritta_console);
		scritta_console.setText("G-Code Parser Console");
		scritta_console.setSize(300, 50);
		scritta_console.setLocation(20, (HEIGHT / 2 - 50) + 40);
		scritta_console.setFont(new Font("Monospace", Font.PLAIN, 20));

		p.add(scorrimento_console);
		scorrimento_console.setSize(WIDTH - 55, HEIGHT / 2 - 100);
		scorrimento_console.setLocation(20, (HEIGHT / 2 - 50) + 20 + 20 + 50);

		p.add(l);

		frame.add(p);
		frame.setSize(WIDTH, HEIGHT);
		frame.show();
	}

	// if the button is pressed
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		if (s.equals("PARSE")) {
			l.setText(areaInserimento.getText());
		}

		if (s.equals("RESET")) {
			l.setText(areaInserimento.getText() + " cancellato");
		}
	}

	// main class da togliere
	public static void main(String[] args) {
		gCodeIDEWindow();
	}

}