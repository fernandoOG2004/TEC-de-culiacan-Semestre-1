package gui;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BoxBox extends JFrame{
	private static final long serialVersionUID = 1L;
	Box H, V;
	
	public BoxBox() {
		setTitle("Ejemplo BoxLayout-Box");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(500,500);
		
	}
	
	private void InitComponents() {
		H = Box.createHorizontalBox();
		V = Box.createVerticalBox();
		JLabel Etiqueta1 = new JLabel("No.Control",SwingConstants.RIGHT);
		H.add(Etiqueta1);
		H.add(Box.createHorizontalStrut(10));
		JTextField NoControl = new JTextField(10);
		H.add(NoControl);
		JLabel Etiqueta2 = new JLabel("Nombre", SwingConstants.RIGHT);
		H.add(Box.createHorizontalStrut(10));
		H.add(Etiqueta2);
		JTextField Nombre = new JTextField(10);
		H.add(Box.createHorizontalStrut(10));
		H.add(Nombre);
		JButton Grabar = new JButton("Grabar");
		V.add(Grabar);
		JButton Cancelar = new JButton("Cancelar");
		V.add(Cancelar);
		
	}
}
