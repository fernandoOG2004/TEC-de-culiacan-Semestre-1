package Topicos;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TamanioBoton extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton boton;
	public TamanioBoton() {
		add(new JLabel("Este boton aumenta 50 pixeles por dimensión"));
		setLayout(new FlowLayout());
		boton = new JButton("Boton");
		boton.setPreferredSize(new Dimension(80,85));
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				JButton boton = (JButton)evt.getSource();
				boton.setSize(boton.getWidth()+50,boton.getHeight()+50);
				repaint();
			}
		});
		
		
		add(boton);
		setSize(350,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TamanioBoton demo = new TamanioBoton();
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}