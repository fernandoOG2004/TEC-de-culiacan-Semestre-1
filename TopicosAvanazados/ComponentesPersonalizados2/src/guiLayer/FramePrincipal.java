package guiLayer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import componentes.JTextParImpar;
import componentes.JTextEntero;

public class FramePrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNormal;
	private JTextEntero txtEntero;
	private JTextParImpar txtParImpar;

	
	public FramePrincipal() throws HeadlessException {
		super("Mis componentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(new Dimension (600,400));
		InitComponents();
	}

	private void InitComponents() {
		JLabel lblTitutlo = new JLabel ("Ejemplo de componentes Personalizados");
		add(lblTitutlo, BorderLayout.NORTH);
		JPanel pnlCentro = new JPanel();
		pnlCentro.setLayout((new GridLayout(5,2)));
		pnlCentro.add(new JLabel ("Texfield normal: "));
		txtNormal = new JTextField();
		txtNormal.setPreferredSize(new Dimension (150,25));
		pnlCentro.add(txtNormal);
		
		pnlCentro.add(new JLabel ("Textfield entero: "));
		txtEntero = new JTextEntero();
		txtEntero.setPreferredSize(new Dimension (150,25));
		pnlCentro.add(txtEntero);
		
		pnlCentro.add(new JLabel ("Textfield Par/Impar: "));
		txtParImpar = new JTextParImpar(false);
		txtEntero.setPreferredSize(new Dimension (150,25));
		pnlCentro.add(txtParImpar);
		
		add(pnlCentro, BorderLayout.CENTER);
	

	}
}

