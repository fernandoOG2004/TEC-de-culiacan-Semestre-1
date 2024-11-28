package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.Timer;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.MatteBorder;

import componentes.JMyButton;

public class FrmMain extends JFrame implements ActionListener, KeyListener, FocusListener{

	private JPanel  pnlOeste, pnlCentro, pnlEste, pnlSur;
	private JComboBox<String> cmbCombo1;
	private JLabel lblOpcionCmb, lblCheck2, lblRadio2, lblTexto2, lblTextoRFC, lblReloj;
	private JLabel lblSInfo1, lblSInfo2, lblSFecha, lblSHora;
	private JMenuBar jmbMenu;
	private JMenu jmArchivo, jmEdicion,jmAyuda;
	private JCheckBox chkOp1,chkOp2, chkOp3;
	private JRadioButton rdb0p1,rdb0p2,rdb0p3;
	private JMenuItem jmiAbrir, jmiGuardar,jmiSalir,jmiCopiar,jmiCortar,jmiPegar,jmiAcercaDe,jmiBarra;
	private JToolBar jtbStatus,jtbBarraH;
	private JButton bbhABrir, bbhGuardar, bbhSalir,btn1,btn2,btnSalir;
	private JTextField txtBox1;
	private Timer tiempo;
	private JButton miButtonPrueba;
	public FrmMain(){
		setTitle("Ejemplo de Componentes");
		setIconImage(new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\processor.png").getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,700);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		initComponents();
	}
	
	private void initComponents() {
		
		//Norte
		
		BarraHerramientas();
		Menu();
		
		//Sur Status Bar
		jtbStatus = new JToolBar("Status Bar");
		jtbStatus.setFloatable(false);
		jtbStatus.setBorderPainted(false);
		jtbStatus.setPreferredSize(new Dimension(this.getWidth(),30));
		MatteBorder mattborder = new MatteBorder(5,0,0,0,Color.LIGHT_GRAY);
		jtbStatus.setBorder(mattborder);
		
		lblSInfo1 = new JLabel("Informacion 1");
		jtbStatus.add(lblSInfo1);
		jtbStatus.add(new JToolBar.Separator());
		lblSInfo2 = new JLabel("Informacion 2");
		jtbStatus.add(lblSInfo2);
		jtbStatus.add(new JToolBar.Separator());
		jtbStatus.add(new JSeparator(JSeparator.VERTICAL));
		lblSFecha = new JLabel("");
		jtbStatus.add(new JToolBar.Separator());
		lblSHora = new JLabel("");
		jtbStatus.add(lblSHora);
		jtbStatus.add(new JToolBar.Separator());
		
		// Oeste
		pnlOeste = new JPanel();
		Vector <String> NombreCol = new Vector<>();
		NombreCol.addElement("Cant.");
		NombreCol.addElement("Descripcion");
		NombreCol.addElement("Precio");
		
		Vector<Vector<String>> filas = new Vector<>();
		Vector<String> row = new Vector<>();
		row.addElement("1");
		row.addElement("Cuaderno");
		row.addElement("100");
		filas.addElement(row);
		
		row = new Vector<>();
		row.addElement("2");
		row.addElement("Lapiz");
		row.addElement("10");
		filas.addElement(row);
		
		row = new Vector<>();
		row.addElement("3");
		row.addElement("Borrador");
		row.addElement("20");
		filas.addElement(row);
		
		JTable tb1 = new JTable(filas,NombreCol);
		JScrollPane jsp = new JScrollPane(tb1);
		tb1.setPreferredSize(new Dimension(200,150));
		pnlOeste.add(jsp);
		add(pnlOeste,BorderLayout.WEST);
		
		// Centro
		
		pnlCentro = new JPanel();
		pnlCentro.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0; // Columna en la que inicia
		c.gridy = 0; //Fila en la que inicia
		c.gridwidth = 5; // Columnas que ocupa
		c.gridheight = 1; // Filas que ocupa
		c.weightx = 0.0; //1 si la columna debe estirarse y 0 si no
		c.weighty = 1.0; //1 si la columna debe estirarse y 0 si no
		c.fill = GridBagConstraints.NONE; //Si el componente se estira junto con la celda
		c.anchor = GridBagConstraints.CENTER; //Cuando el componente es mas chico que la celda
		c.insets = new Insets(0, 5, 0, 0);
		c.ipadx = 0; // Margen Interno en x de la celda
		c.ipady = 7; // Margen interno en y de la celda
		JLabel lbl1 = new JLabel("Listado de diversos componentes");
		pnlCentro.add(lbl1,c);
		
		c.gridy = 2; //FIla en la que inicia
		c.gridwidth = 1; //Columnas que ocupa
		JLabel lblcombo = new JLabel("ComboBox");
		pnlCentro.add(lblcombo,c);
		
		c.gridx = 2;
		cmbCombo1 = new JComboBox<>();
		cmbCombo1.setPreferredSize(new Dimension(150,25));
		for (int i = 0; i <=10; i++) {
			cmbCombo1.addItem("Opcion"+i);
		}

		cmbCombo1.setSelectedIndex(3);
		cmbCombo1.setEditable(true);
		cmbCombo1.setMaximumRowCount(4);
		cmbCombo1.addActionListener(this);
		pnlCentro.add(cmbCombo1,c);
		
		c.gridx = 3;
		lblOpcionCmb = new JLabel(cmbCombo1.getSelectedItem().toString());
		pnlCentro.add(lblOpcionCmb,c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.gridheight = 3;
		JLabel lblCheckBox1 = new JLabel("CheckBox: ");
		pnlCentro.add(lblCheckBox1,c);
		
		c.gridx = 2;
		c.gridheight = 1;
		chkOp1 = new JCheckBox("Opcion 1: ");
		chkOp1.setSelected(true);
		chkOp1.addActionListener(this);
		pnlCentro.add(chkOp1,c);
		
		c.gridy = 5;
		chkOp2 = new JCheckBox("Opcion 2: ");
		chkOp2.addActionListener(this);
		pnlCentro.add(chkOp2,c);
		
		c.gridy = 6;
		chkOp3 = new JCheckBox("Opcion 3: ");
		chkOp3.addActionListener(this);
		pnlCentro.add(chkOp3,c);
		
		
		c.gridx = 3;
		c.gridy = 4;
		c.gridheight = 3;
		lblCheck2 = new JLabel("1 Opcion Seleccionada");
		pnlCentro.add(lblCheck2,c);
		
		//RadioButton
		c.gridx = 0;
		c.gridy = 8;
		c.gridheight = 3;
		pnlCentro.add(new JLabel("RadioButton:"),c);
		
		ButtonGroup grupo = new ButtonGroup();
		
		c.gridx = 2;
		c.gridheight = 1;
		rdb0p1 = new JRadioButton("Opcion 1");
		rdb0p1.setSelected(true);
		rdb0p1.addActionListener(this);
		grupo.add(rdb0p1);
		pnlCentro.add(rdb0p1,c);
		
		c.gridy = 9;
		rdb0p2 = new JRadioButton("Opcion 2");
		rdb0p2.addActionListener(this);
		grupo.add(rdb0p2);
		pnlCentro.add(rdb0p2,c);
				
		c.gridy = 10;
		rdb0p3 = new JRadioButton("Opcion 3");
		rdb0p3.addActionListener(this);
		grupo.add(rdb0p3);
		pnlCentro.add(rdb0p3,c);
		
		c.gridx = 3;
		c.gridy = 8;
		c.gridheight = 3;
		lblRadio2 = new JLabel();
		pnlCentro.add(lblRadio2,c);
		
		add(pnlCentro,BorderLayout.CENTER);
		
		//CUadro de texto
		c.gridx = 0;
		c.gridy = 12;
		c.gridheight = 1;
		
		pnlCentro.add(new JLabel("Cuadro de texto"),c);
		
		c.gridx = 2;
		txtBox1 = new JTextField();
		txtBox1.setMinimumSize(new Dimension(100,25));
		txtBox1.setPreferredSize(new Dimension(200,25));
		txtBox1.setMaximumSize(new Dimension(300,25));
		
		txtBox1.addKeyListener(this);
		txtBox1.addFocusListener(this);
		pnlCentro.add(txtBox1,c);
		
		c.gridx = 3;
		lblTexto2 = new JLabel();
		pnlCentro.add(lblTexto2,c);
		
		//Este
		pnlEste = new JPanel();
		add(pnlEste,BorderLayout.EAST);
		pnlEste.setLayout(new BoxLayout(pnlEste, BoxLayout.Y_AXIS));
		btn1 = new JButton("Boton 1");
		btn1.setPreferredSize(new Dimension(100,20));
		btn1.addActionListener(this);
		pnlEste.add(btn1);
		
		btn2 = new JButton("Boton 2");
		btn2.setPreferredSize(new Dimension(100,20));
		btn2.addActionListener(this);
		pnlEste.add(btn2);
		
		miButtonPrueba = new JMyButton();
		miButtonPrueba.addActionListener(this);
		pnlEste.add(miButtonPrueba);
		
		btnSalir = new JButton("Salir");//new ImageIcon("D:\\Iconos\\FatCow_Icons32x32\\door_in.png)"));
		btnSalir.setPreferredSize(new Dimension(100,20));
		btnSalir.addActionListener(this);
		pnlEste.add(btnSalir);
		}
	
	
	
	private void Menu() {
		jmbMenu = new JMenuBar();
		jmbMenu.setAlignmentX(LEFT_ALIGNMENT);
		
		jmArchivo = new JMenu("Archivo");
		jmArchivo.setMnemonic('A');
		
		jmiAbrir = new JMenuItem("Abrir");
		jmiAbrir.setMnemonic('A');
		jmiAbrir.addActionListener(this);
		jmArchivo.add(jmiAbrir);
		
		jmiGuardar = new JMenuItem("Guardar");
		jmiGuardar.setMnemonic('G');
		jmiGuardar.addActionListener(this);
		jmArchivo.add(jmiGuardar);
		
		jmArchivo.addSeparator();
		
		jmiSalir = new JMenuItem("Salir");
		jmiSalir.setMnemonic('S');
		jmiSalir.addActionListener(this);
		jmArchivo.add(jmiSalir);
		
		jmbMenu.add(jmArchivo);
		
		jmEdicion = new JMenu("Edicion");
		jmEdicion.setMnemonic('E');

		jmiCopiar = new JMenuItem("Copiar");
		jmiCopiar.setMnemonic('C');
		jmiCopiar.addActionListener(this);
		jmArchivo.add(jmiCopiar);
	
		jmEdicion.add(jmiCopiar);
		
		jmiCortar = new JMenuItem("Cortar");
		jmiCortar.setMnemonic('o');
		jmiCortar.addActionListener(this);
		
		jmEdicion.add(jmiCortar);
		
		jmiPegar = new JMenuItem("Pegar");
		jmiPegar.setMnemonic('P');
		jmiPegar.addActionListener(this);
		
		jmEdicion.add(jmiPegar);
		
		jmbMenu.add(jmEdicion);
		
		jmAyuda = new JMenu("Ayuda");
		jmAyuda.setMnemonic('y');
		
		jmiAcercaDe = new JMenuItem("Arcerca De...");
		jmiAcercaDe.setMnemonic('A');
		jmiAcercaDe.addActionListener(this);
		
		jmAyuda.add(jmiAcercaDe);
		
		jmiBarra = new JMenuItem("Ocultar/Mostrar Barra de Herramientas");
		jmiBarra.setMnemonic('H');
		jmiBarra.addActionListener(this);
		
		jmAyuda.add(jmiBarra);
		
		jmbMenu.add(jmAyuda);
		
		setJMenuBar(jmbMenu);
	}

	private void BarraHerramientas() {
		jtbBarraH = new JToolBar("Barra Herramientas", JToolBar.HORIZONTAL);
		jtbBarraH.setFloatable(true);
		jtbBarraH.setAlignmentX(JToolBar.LEFT_ALIGNMENT);
		
		bbhABrir = new JButton("Abrir");
		bbhABrir.setToolTipText("Abre un Documento");
		bbhABrir.addActionListener(this);
		jtbBarraH.add(bbhABrir);
		
		bbhGuardar = new JButton("Guardar");
		bbhGuardar.setToolTipText("Guarda Documento actual");
		bbhGuardar.addActionListener(this);
		jtbBarraH.add(bbhGuardar);
		
		jtbBarraH.add(new JToolBar.Separator());
		
		bbhSalir = new JButton(new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\door_in.png"));
		bbhSalir.setToolTipText("Salir del Sistema");
		bbhSalir.addActionListener(this);
		jtbBarraH.add(bbhSalir);
		
		//pnlNorte
		add(jtbBarraH,BorderLayout.NORTH);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cmbCombo1)
			lblOpcionCmb.setText(cmbCombo1.getSelectedItem().toString());
		if (e.getSource() == chkOp1 || e.getSource() == chkOp2 || e.getSource() == chkOp3) {
			int cont = 0;
			if (chkOp1.isSelected()) 
				cont++;
			if(chkOp2.isSelected())
				cont++;
			if(chkOp3.isSelected())
				cont++;
			lblCheck2.setText(cont +(cont==1?"opcion seleccionada":"Opciones seleccionadas"));
		}
	
		
		if(e.getSource() == jmiSalir|| e.getSource() == bbhSalir||e.getSource() == btnSalir) {
			if(JOptionPane.showConfirmDialog(this, "¿Salir del programa?","Aviso del sistema", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
				System.exit(0);
			if(e.getSource() == jmiAcercaDe)
				JOptionPane.showMessageDialog(this,"Hola", "Acerca deMi Primer Programa Grafico", JOptionPane.PLAIN_MESSAGE, new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\processor.png"));
			if(e.getSource() == jmiBarra)
				jtbBarraH.setVisible(!jtbBarraH.isVisible());
			if(e.getSource() == jmiAbrir||e.getSource() == jmiAbrir)
				lblSInfo1.setText("Abriendo Documento");
			
			if(e.getSource() == jmiGuardar|| e.getSource() == jmiGuardar)
				lblSInfo1.setText("Guardando Documento");
			
			}
		}
		if (e.getSource()==miButtonPrueba) {
			JOptionPane.showMessageDialog(this, ((JMyButton) e.getSource()).isEncendido()?"Apagar":"Encender","Aviso",JOptionPane.PLAIN_MESSAGE,new ImageIcon("D:\\Iconos\\FatCow_Icons16x16\\processor.png"));
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == txtBox1) {
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
				lblTexto2.setText(txtBox1.getText());
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				lblTexto2.setText("");
				txtBox1.setText("");
			}
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == txtBox1) {
			lblTexto2.setText(txtBox1.getText());
		}
	}
}
