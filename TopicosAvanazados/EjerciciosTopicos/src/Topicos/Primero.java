package Topicos;
import javax.swing.*;
public class Primero {

	public static void main(String[] args) {
		JFrame Marco = new JFrame("ITC");
		JLabel Etiqueta = new JLabel("HOLA MUNDO, hecho con SWING",SwingConstants.CENTER);
		JLabel Etiquera2 = new JLabel("Mi Segunda etiqueta", SwingConstants.CENTER);
			Marco.add(Etiqueta);
			Marco.add(Etiquera2);
			Marco.setVisible(true);
			Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
