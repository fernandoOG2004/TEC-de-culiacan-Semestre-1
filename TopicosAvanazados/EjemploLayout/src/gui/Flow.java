package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow extends JFrame{

		private static final long serialVersionUID = 1L;
		
		public Flow(){
			setTitle("Ejemplo Flow Layout");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setSize(500,500);
			setLocationRelativeTo(null);
			setLayout(new FlowLayout());
			InitComponents();
			
		}
		
		private void InitComponents() {
			add(new JButton("Boton 1"));
			add(new JButton("Boton 2"));
			add(new JButton("Boton 3"));
			add(new JButton("Boton 4"));
			add(new JButton("Boton 5"));
			
		}
}
