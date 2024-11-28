package componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JMyButton extends JButton implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean encendido;
	public JMyButton() {
		super();
		setIcon(new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\apagado 1.png"));
		encendido = false;
		setFocusPainted(false);
		addActionListener(this);
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
		if (encendido) {
			setIcon(new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\apagado 1.png"));
		}else {
			setIcon(new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\encendido 1.png"));		
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (encendido) {
			setIcon(new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\apagado 1.png"));
		}else {
			setIcon(new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\encendido 1.png"));
			encendido =! encendido;
		
		}
	}
	

}
