package dialogmessage;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class AL extends Frame implements WindowListener, ActionListener {
	/**
	 * Create a button that add "Hello World" message modal on click
	 */
	public static void main(String[] args) {
		AL myWindow = new AL("Action Listener Test");
		myWindow.setSize(350, 75);
		myWindow.setVisible(true);
	}

	private static final long serialVersionUID = 1L;
	Button b;

	public AL(String title) {

		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		b = new Button("Click me");
		add(b);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Hello World!!!");
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