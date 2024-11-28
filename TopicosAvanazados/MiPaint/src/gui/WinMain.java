package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;

import componentes.JpLienzo;
import utilerias.Fecha;

public class WinMain extends JFrame implements ActionListener, WindowListener {
	private static final long serialVersionUID = 1L;
	private JMenuBar mbMenu;
	private JMenu mArchivo, mEdicion, mColores, mFormas, mAcercaDe;
	//Menu Archivo
	private JMenuItem miAbrir, miGuardar, miSalir, miNuevo, miGuardarComo;
	//Menu Edicion
	private JMenuItem miCopiar, miCortar, miPegar;
	//Menu Colores
	private JMenuItem miPersonalizado;
	//Menu Figuras
	private JMenuItem miCuadrado, miRectangulo, miCirculo, miOvalo, miLinea;
	//Menu AcercaDe
	private JMenuItem miAyuda, miInfo;
	//Barra de herramientas;
	private JToolBar tbHerr;
	private JButton btnNuevo, btnAbrir, btnGuardar, btnSalir,btnCopiar,btnCortar,btnPegar;
	//Barra de status
	private JToolBar tbStatus;
	private JLabel lblInfo1, lblInfo2;
	private Fecha lblHora;
	private Timer tiempo, timer;
	private JpLienzo Lienzo;
	//Barra de colores
	private JToolBar tbColores;
	private JButton btnAzul, btnNegro, btnRojo, btnPersonalizado;
	//Barra de Formas
	private JToolBar tbFormas;
	private JButton btnCuadrado, btnRectangulo, btnCirculo, btnOvalo, btnLinea;
	private JCheckBox cbRelleno;
	private File Archivo;
	
	public WinMain() {
		setTitle("Mi Paint");
		setIconImage(new ImageIcon("src\\bullet_brush.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setSize(new Dimension (800, 500));
		InitComponents();
		timer = new Timer(4000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurarStatus();
			}
		});
			
		
	}
	
	private void InitComponents() {
		//Menu
		Menu();
		//Norte
		BarraDeHerramientas();
		//Centro
		Lienzo = new JpLienzo();
		add(Lienzo,BorderLayout.CENTER);
		//Sur
		BarradeStatus();
		tiempo = new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	tiempo.start();
	//Este
	BarraDeColores();
	//Oeste
	BarraDeFormas();
	}
	private void Salir() {
		tiempo.stop();
		System.exit(0);
	}
	private void GuardarComo() {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.setDialogTitle("Guardar imagen actual");
		FileNameExtensionFilter fnef = new FileNameExtensionFilter("Imagen de Mi Pain", ".imp");
		jfc.setFileFilter(fnef);
		if (jfc.showSaveDialog(this) != JFileChooser.CANCEL_OPTION) {
			if (jfc.getSelectedFile().getName().indexOf('.') == -1) 
				Archivo = new File(jfc.getSelectedFile().getPath()+".imp");
				else
				Archivo = jfc.getSelectedFile();
			ActualizaStatus1("Guardando imagen");
			//GuardarArchivo
			ActualizaStatus1("Imagen guardada");
		}
	}
	private void Guardar() {
		if (Archivo == null) {
			GuardarComo();
		}else {
			ActualizaStatus1("Guardando imagen");
			//GuardarArchivo();
			ActualizaStatus1("Imagen guardada");
		}
	}
	private void GuardarArchivo() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Archivo.getPath()));
			oos.writeObject(Lienzo.getContenido());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private void Cerrar() {
		if(Lienzo.() && Lienzo.getContenido().size()>0) {
			int resp = JOptionPane.showConfirmDialog(null, "Imagen no guardada, ¿Desea guardarla ahora?",
						"Salir de Mi Paint", JOptionPane.YES_NO_CANCEL_OPTION);
			if(resp == JOptionPane.YES_NO_CANCEL_OPTION) {
				Guardar();
				Salir();
		} else if(resp == JOptionPane.NO_OPTION) {
			Salir();
		}
		return;
	}
		Salir();
	}
	private void BarraDeFormas() {
		tbFormas = new JToolBar(JToolBar.VERTICAL);
		btnCuadrado = new JButton("Cuadrado");
		btnCuadrado.addActionListener(this);
		tbFormas.add(btnCuadrado);
		btnRectangulo = new JButton("Rectangulo");
		btnRectangulo.addActionListener(this);
		tbFormas.add(btnRectangulo);
		btnCirculo = new JButton("Circulo");
		btnCirculo.addActionListener(this);
		tbFormas.add(btnCirculo);
		btnOvalo = new JButton("Ovalo");
		btnOvalo.addActionListener(this);
		tbFormas.add(btnOvalo);
		btnOvalo = new JButton("Ovalo");
		btnOvalo.addActionListener(this);
		tbFormas.add(btnOvalo);
		btnLinea = new JButton("Linea");
		btnLinea.addActionListener(this);
		tbFormas.add(btnLinea);
		cbRelleno = new JCheckBox("Relleno");
		cbRelleno.addActionListener(this);
		tbFormas.add(cbRelleno);
		add(tbFormas,BorderLayout.WEST);
	}
	private void BarraDeColores() {
		tbColores = new JToolBar(JToolBar.VERTICAL);
		btnAzul = new JButton();
		btnAzul.setBackground(Color.BLUE);
		btnAzul.setPreferredSize(new Dimension(25,25));
		btnAzul.setToolTipText("Color Azul");
		btnAzul.addActionListener(this);
		tbColores.add(btnAzul);
		btnNegro = new JButton();
		btnNegro.setBackground(Color.BLACK);
		btnNegro.setPreferredSize(new Dimension(25,25));
		btnNegro.setToolTipText("Color Negro");
		btnNegro.addActionListener(this);
		tbColores.add(btnNegro);
		btnRojo = new JButton();
		btnRojo.setBackground(Color.RED);
		btnRojo.setPreferredSize(new Dimension(25,25));
		btnRojo.setToolTipText("Color Rojo");
		btnRojo.addActionListener(this);
		tbColores.add(btnRojo);
		btnPersonalizado = new JButton();
		btnPersonalizado.setBackground(Color.WHITE);
		btnPersonalizado.setPreferredSize(new Dimension(25,25));
		btnPersonalizado.setToolTipText("Color Personalizado");
		btnPersonalizado.addActionListener(this);
		tbColores.add(btnPersonalizado);
		add(tbColores,BorderLayout.EAST);
		
	}
	private void ActualizaFecha(){
		lblHora.setText(Fecha.now());
	}
	private void ActualizaStatus1(String texto) {
		lblInfo1.setText(texto);
	}
	private void RestaurarStatus() {
		lblInfo1.setText("Listo");
		timer.stop();
	}
	private void ActualizaStatus2(String texto) {
		lblInfo2.setText(texto);
	}
	private void BarradeStatus() {
		tbStatus = new JToolBar();
		tbStatus.setFloatable(false);
		lblInfo1 = new JLabel("Listo");
		lblInfo1.setToolTipText("Informacion de uso");
		tbStatus.add(lblInfo1);
		
		tbStatus.add(new JSeparator(JSeparator.VERTICAL));
		
		lblInfo2 = new JLabel("Listo");
		lblInfo2.setToolTipText("Informacion secundaria");
		tbStatus.add(lblInfo2);
		
		tbStatus.add(new JSeparator(JSeparator.VERTICAL));
		
		lblHora = new JLabel(Fecha.now());
		lblHora.setToolTipText("Hora Actual");
		tbStatus.add(lblHora);
		add(tbStatus,BorderLayout.SOUTH);
	}
	private void BarraDeHerramientas() {
		tbHerr = new JToolBar();
		tbHerr.setFloatable(true);
		btnNuevo = new JButton("Nueva imagen");
		btnNuevo.setToolTipText("Nueva imagen");
		btnNuevo.addActionListener(this);
		tbHerr.add(btnNuevo);
		
		btnAbrir = new JButton("Abre imagen existente");
		btnAbrir.setToolTipText("Abre imagen existente");
		btnAbrir.addActionListener(this);
		tbHerr.add(btnAbrir);
		
		btnGuardar = new JButton("Guarda la imagen");
		btnGuardar.setToolTipText("Guarda la imagen");
		btnGuardar.addActionListener(this);
		tbHerr.add(btnGuardar);
		
		tbHerr.addSeparator(new Dimension(35,20));
		tbHerr.add(new JSeparator(JSeparator.VERTICAL));
		
		btnCopiar = new JButton("Copiar");
		btnCopiar.setToolTipText("Copiar");
		btnCopiar.addActionListener(this);
		tbHerr.add(btnCopiar);
		
		btnCortar = new JButton("Cortar");
		btnCortar.setToolTipText("Cortar");
		btnCortar.addActionListener(this);
		tbHerr.add(btnCortar);
		
		btnPegar = new JButton("Pegar");
		btnPegar.setToolTipText("Pegar");
		btnPegar.addActionListener(this);
		tbHerr.add(btnPegar);
		
		btnSalir = new JButton("Salir de Mi Paint");
		btnSalir.setToolTipText("Salir de Mi Paint");
		btnSalir.addActionListener(this);
		tbHerr.add(btnSalir);
		
		add(tbHerr,BorderLayout.NORTH);	
	}
	private void Menu() {
		mbMenu = new JMenuBar();
		mArchivo = new JMenu("Archivo");
		mArchivo.setMnemonic('A');
		//Nuevo
		miNuevo = new JMenuItem("Nuevo");
		miNuevo.addActionListener(this);
		miNuevo.setMnemonic('N');
		mArchivo.add(miNuevo);
		//Abrir
		miAbrir = new JMenuItem("Abrir");
		miAbrir.addActionListener(this);
		miAbrir.setMnemonic('A');
		mArchivo.add(miAbrir);
		//Guardar
		miGuardar = new JMenuItem("Guardar");
		miGuardar.addActionListener(this);
		miGuardar.setMnemonic('G');
		mArchivo.add(miGuardar);
		//GuardarComo
		miGuardarComo = new JMenuItem("Guardar Como...");
		miGuardarComo.addActionListener(this);
		miGuardarComo.setMnemonic('C');
		mArchivo.add(miGuardarComo);
		
		mArchivo.add(mArchivo);
		//Salir
		miSalir = new JMenuItem("Salir");
		miSalir.addActionListener(this);
		miSalir.setMnemonic('S');
		mArchivo.add(miSalir);
		
		mbMenu.add(mArchivo);
		
		//miCopiar, miCortar, miPegar;
		//Menu Edicion
		mEdicion = new JMenu("Edicion");
		mEdicion.setMnemonic('E');
		//Nuevo
		miCopiar = new JMenuItem("Copiar");
		miCopiar.addActionListener(this);
		miCopiar.setMnemonic('C');
		mEdicion.add(miCopiar);
		//Abrir
		miCortar = new JMenuItem("Cortar");
		miCortar.addActionListener(this);
		miCortar.setMnemonic('O');
		mEdicion.add(miCortar);
		//Guardar
		miPegar = new JMenuItem("Pegar");
		miPegar.addActionListener(this);
		miPegar.setMnemonic('P');
		mEdicion.add(miPegar);
		
		mbMenu.add(mEdicion);
		//Menu Colores
		mColores = new JMenu("Colores");
		mColores.setMnemonic('C');
		
		miPersonalizado = new JMenuItem("Personalizado");
		miPersonalizado.addActionListener(this);
		miPersonalizado.setMnemonic('P');
		mColores.add(miPersonalizado);
		
		mbMenu.add(mColores);
		
		//miCuadrado, miRectangulo, miCirculo, miOvalo, miLinea;
		//MenuFormas
		
		mFormas = new JMenu("Formas");
		mFormas.setMnemonic('F');
		
		miCuadrado = new JMenuItem("Cuadrado");
		miCuadrado.addActionListener(this);
		miCuadrado.setMnemonic('C');
		mFormas.add(miCuadrado);
		
		miRectangulo = new JMenuItem("Rectangulo");
		miRectangulo.addActionListener(this);
		miRectangulo.setMnemonic('R');
		mFormas.add(miRectangulo);
		
		miCirculo = new JMenuItem("Circulo");
		miCirculo.addActionListener(this);
		miCirculo.setMnemonic('i');
		mFormas.add(miCirculo);
		
		miOvalo = new JMenuItem("Ovalo");
		miOvalo.addActionListener(this);
		miOvalo.setMnemonic('O');
		mFormas.add(miOvalo);
		
		miLinea = new JMenuItem("Linea");
		miLinea.addActionListener(this);
		miLinea.setMnemonic('L');
		mFormas.add(miLinea);
		
		mbMenu.add(mAcercaDe);
		setJMenuBar(mbMenu);
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == miSalir || e.getSource() == btnSalir) {
			Cerrar();
		}
		if (e.getSource() == miNuevo || e.getSource() == btnNuevo) {
			ActualizaStatus1("Nuevo lienzo preparado");
			//Lienzo.getContenido().clear();
			Lienzo.ValoresIniciales();
			Archivo = null;
			Lienzo.repaint();
		}
		
		if (e.getSource() == miAbrir || e.getSource() == btnAbrir) {
			JFileChooser jfc = new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
			jfc.setDialogTitle("Abrir imagen existente");
			FileNameExtensionFilter fnef = new FileNameExtensionFilter("Imagend de MiPaint", ".imp");
			jfc.setFileFilter(fnef);
			if (jfc.showOpenDialog(this) != JFileChooser.CANCEL_OPTION) {
				Archivo = jfc.getSelectedFile();
				ActualizaStatus1("Abriendo imagen");
				//LeerArchivo();
				if (e.getSource() == miGuardar || e.getSource() == btnGuardar) {
					Guardar();
				}
			}
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
