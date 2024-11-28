package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grid extends JFrame{

	private static final long serialVersionUID = 1L;
		public Grid() {
			setTitle("Ejemplo Grid Layout");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setSize(500,500);
			setLocationRelativeTo(null);
			setLayout(new GridLayout(3,2,10,15));
			InitComponents();
		}
		private void InitComponents() {
			add(new JLabel("Celda 0,0",JLabel.CENTER));
			add(new JLabel("Celda 0,1",JLabel.CENTER));
			add(new JLabel("Celda 1,0",JLabel.CENTER));
			add(new JLabel("Celda 1,1",JLabel.CENTER));
			add(new JLabel("Celda 2,0",JLabel.CENTER));
			add(new JLabel("Celda 2,1",JLabel.CENTER));
			
		}
}
