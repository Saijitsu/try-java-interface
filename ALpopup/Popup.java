package ALpopup;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Popup extends JFrame {

	/**
	 * Une fenetre avec un bouton , puis ouvre un popup
	 */
	private static final long serialVersionUID = 1L;
	protected static final Component Popup = null;
	private JButton button;

	public Popup() {
		super();
		this.button = new JButton();
		this.button.setText("Click me to show dialog");
		this.add(button);
		this.pack();
		this.setSize(300, 150);
		this.setVisible(true);

		this.button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = JOptionPane.showInputDialog(Popup, "What is your name?", null);

				JOptionPane.showMessageDialog(Popup, "Hello " + name, "Exo interface", JOptionPane.INFORMATION_MESSAGE);

			}
		});
	}
}
