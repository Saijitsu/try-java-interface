package interfaceJava;

import java.awt.*;
import java.awt.event.*;

public class AL extends Frame implements WindowListener, ActionListener {
	/**
	 * Create a button that add "Hello World" message on click
	 */
	private static final long serialVersionUID = 1L;
	TextField text = new TextField(20);
	Button b;

	public AL(String title) {

		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		b = new Button("Click me");
		add(b);
		add(text);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		text.setText("Hello World!");
	}

	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

}