package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Absolut extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3;
	private JLabel lbl1;
	
	public Absolut() {
		setTitle("Ejemplo Sin Layout");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		setLayout(null);
		InitCOmponents();
	}
	
	private void InitCOmponents() {
		lbl1 = new JLabel("Frame con Layout = null", JLabel.CENTER);
		lbl1.setSize(200,15);
		lbl1.setLocation(200,10);
		add(lbl1);
		
		btn1 = new JButton("Boton 1");
		btn1.setBounds(20,50,100,30);
		add(btn1);
		
		btn2 = new JButton("Boton 2");
		btn2.setBounds(100,70,150,15);
		add(btn2);
		
		btn3 = new JButton("Boton 3");
		btn3.setBounds(200,100,200,50);
		add(btn3);
	}
}
