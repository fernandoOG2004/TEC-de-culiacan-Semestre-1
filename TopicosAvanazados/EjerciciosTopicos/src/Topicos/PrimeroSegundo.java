package Topicos;
import javax.swing.*;
import java.awt.*;

public class PrimeroSegundo extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrimeroSegundo() {
		super("**ITC**");
		setVisible(true);
		setSize(350,150);
		setLocation(400,200);
		JLabel Etiqueta1 = new JLabel("HOLA MUNDO", SwingConstants.CENTER);
		add(Etiqueta1);
		JLabel Etiqueta2 = new JLabel("*HOLA MUNDO*",SwingConstants.CENTER);
		add(Etiqueta2 ,BorderLayout.WEST);
	}

	public static void main(String[] args) {
		PrimeroSegundo obj = new PrimeroSegundo();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
