package componentes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTextEntero extends JTextField implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tamanio;

	public JTextEntero() {
		super();
		tamanio = Integer.MAX_VALUE;
		addKeyListener(this);
	}

	public JTextEntero(int columns) {
		super(columns);
		tamanio = columns;
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		if (getText().length() == tamanio)
			e.consume();
		else if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9'))
			e.consume();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.isControlDown())
			if (e.getKeyCode() == KeyEvent.VK_X || e.getKeyCode() == KeyEvent.VK_C || e.getKeyCode() == KeyEvent.VK_V)
				e.consume();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			JOptionPane.showMessageDialog(this, "BackSpace");
		}
		if (e.getKeyCode() == KeyEvent.VK_DELETE) {
			JOptionPane.showMessageDialog(this, "Delete");
		}
	}
}