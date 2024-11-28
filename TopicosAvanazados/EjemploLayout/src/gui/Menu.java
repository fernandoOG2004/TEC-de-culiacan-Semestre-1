package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

	public class Menu extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton b1,b2,b3,b4,b5,b6,b7;
	
	public Menu() {
		setTitle("Ejemplo de Layouts");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(7,1,0,10));
		InitComponents();	}
	
	private void InitComponents() {
		b1 = new JButton("Border Layout");
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Flow Layout");
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Grid Layout");
		b3.addActionListener(this);
		add(b3);
		
		b4 = new JButton("Box Layout");
		b4.addActionListener(this);
		add(b4);
		
		b5 = new JButton("Posicionamiento Absoluto");
		b5.addActionListener(this);
		add(b5);
		
		b6 = new JButton("Box-Layout Box");
		b6.addActionListener(this);
		add(b6);
		
		b7 = new JButton("Salir");
		b7.addActionListener(this);
		add(b7);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
		Border BorderFrame = new gui.Border();
		BorderFrame.setVisible(true);
		}
		
		if(e.getSource() == b2) {
		Flow FlowFrame = new gui.Flow();
		FlowFrame.setVisible(true);
				}
		if(e.getSource() == b3) {
		Grid GridFrame = new gui.Grid();
		GridFrame.setVisible(true);
		}
		if(e.getSource() == b4) {
		BoxL BoxFrame = new gui.BoxL();
		BoxFrame.setVisible(true);
		}
		if(e.getSource() == b5) {
			
		}
		
		if(e.getSource() == b6) {
			
		}
		if(e.getSource() == b7) {
			
		}
	}
}
