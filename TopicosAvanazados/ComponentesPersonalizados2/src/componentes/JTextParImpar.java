package componentes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTextParImpar extends JTextField implements KeyListener {

	private static final long serialVersionUID = 1L;
	private int tamanio;
	private boolean esPar;

	public JTextParImpar(boolean esPar) {
		super();
		this.tamanio = Integer.MAX_VALUE;
		this.esPar = esPar;
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// If maximum length is reached or if the character is not a digit, consume the event
		if (getText().length() == tamanio || !Character.isDigit(e.getKeyChar())) {
			e.consume();
			return;
		}
		
		// Convert the character to a digit
		int digit = Character.getNumericValue(e.getKeyChar());

		// Check if the number matches the even/odd requirement
		if ((esPar && digit % 2 != 0) || (!esPar && digit % 2 == 0)) {
			JOptionPane.showMessageDialog(this, esPar ? "Solo se permiten números pares" : "Solo se permiten números impares");
			e.consume();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Prevent cut, copy, and paste operations
		if (e.isControlDown() && (e.getKeyCode() == KeyEvent.VK_X || e.getKeyCode() == KeyEvent.VK_C || e.getKeyCode() == KeyEvent.VK_V)) {
			e.consume();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Optional: Show messages when special keys like backspace or delete are pressed
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			JOptionPane.showMessageDialog(this, "BackSpace presionado");
		}
		if (e.getKeyCode() == KeyEvent.VK_DELETE) {
			JOptionPane.showMessageDialog(this, "Delete presionado");
		}
	}
}

