package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Border extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel1, panel2, panel3, panel4, panel5;
	public Border() {
		setTitle("Ejemplo Border Layout");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		InitComponents();
	}
	private void InitComponents() {
		//Norte
				panel1  = new JPanel();
				panel1.setBackground(new Color(255,0,0));
				panel1.add(new JLabel("Zona Norte"));
				add(panel1,BorderLayout.NORTH);
		
		//Sur
				panel2  = new JPanel();
				panel2.setBackground(new Color(0,255,0));
				panel2.add(new JLabel("Zona Sur"));
				add(panel2,BorderLayout.SOUTH);
		//Oeste
				panel3  = new JPanel();
				panel3.setBackground(Color.YELLOW);
				panel3.add(new JLabel("Zona Oeste"));
				add(panel3,BorderLayout.EAST);

		//Este
				panel4  = new JPanel();
				panel4.setBackground(new Color(255,255,255));
				panel4.add(new JLabel("Zona Este"));
				add(panel4,BorderLayout.WEST);

		 //Centro
				panel5  = new JPanel();
				panel5.setBackground(Color.CYAN);
				panel5.add(new JLabel("Zona Centro"));
				add(panel5,BorderLayout.CENTER);
	}
}
