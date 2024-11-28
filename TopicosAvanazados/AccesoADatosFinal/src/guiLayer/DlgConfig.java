package guiLayer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dataLayer.Config;


public class DlgConfig extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JLabel lblServidor, lblUsuario, lblContra;
	private JTextField txtServidor, txtUsuario, txtContra;
	private JButton btnAceptar, btnCancelar;
	private JPanel jpBotones, PanelDB;
	private GridBagConstraints c = new GridBagConstraints();

	public DlgConfig(JFrame marco, boolean nuevo) {
		super(marco,"Configuracion");
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		setSize(550,200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		InitComponents();
		if (nuevo)
			CargaConfiguracion();
	}

	private void InitComponents() {
		InitPanelDB();
		jpBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnAceptar = new JButton("Actualizar");
		btnAceptar.addActionListener(this);
		jpBotones.add(btnAceptar);

		btnCancelar = new JButton("Descartar cambios");
		btnCancelar.addActionListener(this);
		jpBotones.add(btnCancelar);
		getContentPane().add(jpBotones, BorderLayout.SOUTH);
	}

	private void InitPanelDB() {

		PanelDB = new JPanel();
		PanelDB.setLayout(new GridBagLayout());
		c.insets = new Insets(3, 10, 3, 3);
		lblServidor = new JLabel("Servidor:");
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.0;
		c.weighty = 0.0;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.EAST;
		PanelDB.add(lblServidor, c);

		c.insets = new Insets(3, 3, 3, 10);
		txtServidor = new JTextField();
		txtServidor.setPreferredSize(new Dimension(200, 28));
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 0.0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		PanelDB.add(txtServidor, c);

		c.insets = new Insets(3, 10, 3, 3);
		lblUsuario = new JLabel("Usuario:");
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.0;
		c.weighty = 0.0;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.EAST;
		PanelDB.add(lblUsuario, c);

		c.insets = new Insets(3, 3, 3, 10);
		txtUsuario = new JTextField();
		txtUsuario.setPreferredSize(new Dimension(200, 28));
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 0.0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		PanelDB.add(txtUsuario, c);

		c.insets = new Insets(3, 10, 3, 3);
		lblContra = new JLabel("Contraseña:");
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.0;
		c.weighty = 0.0;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.EAST;
		PanelDB.add(lblContra, c);

		c.insets = new Insets(3, 3, 3, 10);
		txtContra = new JTextField();
		txtContra.setPreferredSize(new Dimension(200, 28));
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 0.0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		PanelDB.add(txtContra, c);

		add(PanelDB, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == btnAceptar) {
			GrabaConfiguracion();
			dispose();
		}

		if (evento.getSource() == btnCancelar) {
			dispose();
		}
	}

	private void CargaConfiguracion() {
		Config.CargaConfiguracion();
		txtServidor.setText(Config.getServidor());
		txtUsuario.setText(Config.getUsuarioDB());
		txtContra.setText(Config.getPasswordDB());
	}

	private void GrabaConfiguracion() {
		Config.setServidor(txtServidor.getText());
		Config.setUsuarioDB(txtUsuario.getText());
		Config.setPasswordDB(txtContra.getText());
		Config.GrabaConfiguracion();
	}
}