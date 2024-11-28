package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxL extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnVertical, btnHorizontal;
	private JPanel panel1, panel2;
	public BoxL() {
		setTitle("Ejemplo Box Layout");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		InitComponents();
	}
		private void InitComponents() {
			panel1 = new JPanel();
			panel1.setBackground(Color.GRAY);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			
			AgregarComponentes(panel1);
			add(panel1);
			
			panel2 = new JPanel();
			panel2.setBackground(Color.LIGHT_GRAY);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
			
			AgregarComponentes(panel1);
			add(panel2);
			
		}
		
		private void AgregarComponentes(JPanel panel) {
			btnVertical = new JButton("Boton 1");
			btnVertical.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(btnVertical);
			
			btnHorizontal = new JButton("Boton 2");
			btnHorizontal.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(btnHorizontal);
			
			addAButton("Button 3", panel);
			addAButton("Long-Named Button 4", panel);
			addAButton("5", panel);
		}
		
		private void addAButton(String text, Container container) {
			JButton button = new JButton(text);
			button.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			container.add(button);
		}
}
		
