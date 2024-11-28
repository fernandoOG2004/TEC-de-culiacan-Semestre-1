package guiLayer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AbstractDocument;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JToolBar;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dataLayer.DBRegistro;
import dataLayer.Registro;
import guiLayer.decimaltextfield; 


public class MainFrame extends JFrame implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;

	private JButton btnAgregar, btnModificar, btnDelFisico, btnDelLogico, btnConsultar, btnSalir;
	private JTextField txtClave, txtNombre, txtDireccion;
	private telefonoTextField txtTelefono;
    private decimaltextfield txtSaldo;  

	
	private boolean regNuevo;
	private JList<String> lstLista;
	private JLabel lblStatus;

 	public MainFrame() {
		super("Ejemplo de Acceso a datos SQL");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(525, 220));
		setLocationRelativeTo(null);
		InitComponents();
		ActivaTextFields(false);
		//ActivaBotones(true, false,false,false,false,true);
		OcultaBotones("100001");
		regNuevo=false;		
	}

	private void InitComponents() {
		//Norte
		JToolBar tbHerramientas = new JToolBar(JToolBar.HORIZONTAL);
		tbHerramientas.setFloatable(false);

		btnAgregar = new JButton("Nuevo");
		btnAgregar.setToolTipText("Capturar un nuevo registro");
		btnAgregar.addActionListener(this);
		tbHerramientas.add(btnAgregar);

		btnModificar = new JButton("Modificar");
		btnModificar.setToolTipText("Modifica un registro existente");
		btnModificar.addActionListener(this);
		tbHerramientas.add(btnModificar);

		btnDelFisico = new JButton("Borrar Fisico");
		btnDelFisico.setToolTipText("Eliminar permanentemente un registro");
		btnDelFisico.addActionListener(this);
		tbHerramientas.add(btnDelFisico);

		btnDelLogico = new JButton("Borrar/Desborrar");
		btnDelLogico.setToolTipText("Marca o desmarca como borrado un registro");
		btnDelLogico.addActionListener(this);
		tbHerramientas.add(btnDelLogico);

		btnConsultar = new JButton("Buscar");
		btnConsultar.setToolTipText("Busca el registro");
		btnConsultar.addActionListener(this);
		tbHerramientas.add(btnConsultar);

		tbHerramientas.addSeparator();
		tbHerramientas.add(new JSeparator(JSeparator.VERTICAL));
		tbHerramientas.addSeparator();

		btnSalir = new JButton("Salir");
		btnSalir.setToolTipText("Salir de la aplicacion");
		btnSalir.addActionListener(this);
		tbHerramientas.add(btnSalir);

		add(tbHerramientas,BorderLayout.NORTH);

		//Centro (int cve, String nombre, String direccion, String telefono, float saldo)
		JPanel pnlCentro = new JPanel();
		pnlCentro.setLayout(new GridLayout(6, 2));

		pnlCentro.add(new JLabel("Clave: ",JLabel.RIGHT));
		txtClave = new JTextField(3);
		txtClave.setPreferredSize(new Dimension(50, 20));
		txtClave.addKeyListener(this);
		txtClave.addActionListener(this);
		pnlCentro.add(txtClave);

		pnlCentro.add(new JLabel("Nombre: ",JLabel.RIGHT));
		txtNombre = new JTextField();
		txtNombre.setPreferredSize(new Dimension(200, 20));
		pnlCentro.add(txtNombre);

		pnlCentro.add(new JLabel("Direccion: ",JLabel.RIGHT));
		txtDireccion = new JTextField();
		txtDireccion.setPreferredSize(new Dimension(200, 20));
		pnlCentro.add(txtDireccion);

		pnlCentro.add(new JLabel("Telefono: ",JLabel.RIGHT));
		txtTelefono = new telefonoTextField();
		txtTelefono.setPreferredSize(new Dimension(100, 20));
		pnlCentro.add(txtTelefono);

		pnlCentro.add(new JLabel("Saldo: ",JLabel.RIGHT));
		txtSaldo = new decimaltextfield(6,2);
		txtSaldo.setPreferredSize(new Dimension(70, 20));
		pnlCentro.add(txtSaldo);
		
		pnlCentro.add(new JLabel(""));
		lblStatus= new JLabel("");		
		pnlCentro.add(lblStatus);
		
		add(pnlCentro,BorderLayout.CENTER);
		
		// Oeste
		JPanel pnlOeste = new JPanel();		
		lstLista = new JList<String>();
		lstLista.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!lstLista.isSelectionEmpty()) {
					try {
						Registro reg= DBRegistro.DBLeeRegistro(Integer.parseInt(
								lstLista.getSelectedValue().toString().substring(0, 
										lstLista.getSelectedValue().toString().indexOf(' '))));
						LlenaCampos(reg);
						OcultaBotones(reg.isBorrado()?"001111":"011111");
						btnConsultar.setText("Cancelar");
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, 
								"Registro no encontrado", "Aviso del sistema",JOptionPane.ERROR_MESSAGE);
					}
					lstLista.requestFocus();
				}
			}
		});
		lstLista.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				 if (!lstLista.isSelectionEmpty()) {
				        try {
				            String selectedValue = lstLista.getSelectedValue();
				            int claveRegistro = Integer.parseInt(selectedValue.split(" ")[0]); // Asegúrate de obtener la clave correcta
				            Registro reg = DBRegistro.DBLeeRegistro(claveRegistro);
				            LlenaCampos(reg); // Llena los campos con el registro seleccionado
				        } catch (Exception ex) {
				            ex.printStackTrace(); // Para depuración
				            JOptionPane.showMessageDialog(null, "Error al cargar el registro: " + ex.getMessage(), "Aviso del sistema", JOptionPane.ERROR_MESSAGE);
				        }
				/*
				if (!lstLista.isSelectionEmpty()) {
					try {
						Registro reg= DBRegistro.DBLeeRegistro(Integer.parseInt(
								lstLista.getSelectedValue().toString().substring(0, 
										lstLista.getSelectedValue().toString().indexOf(' '))));
						LlenaCampos(reg);
						OcultaBotones(reg.isBorrado()?"001111":"011111");
						btnConsultar.setText("Cancelar");
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, 
								"Registro no encontrado", "Aviso del sistema",JOptionPane.ERROR_MESSAGE);
					}
					*/
					lstLista.requestFocus();
				}
			}
		});
		LlenaListado(lstLista);
		
		JScrollPane jspLista = new JScrollPane();
		jspLista.setMinimumSize(new Dimension(150, 150));
		jspLista.setPreferredSize(new Dimension(200, 150));
		jspLista.setMaximumSize(new Dimension(250, 150));		
		jspLista.setViewportView(lstLista);
		
		pnlOeste.add(jspLista);
		
		add(pnlOeste, BorderLayout.WEST);
		
		lstLista.addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		        if (!lstLista.isSelectionEmpty()) {
		            String selectedValue = lstLista.getSelectedValue().toString();
		            try {
		                int clave = Integer.parseInt(selectedValue.substring(0, selectedValue.indexOf(' ')));

		                Registro reg = DBRegistro.DBLeeRegistro(clave);
		                
		                LlenaCampos(reg);

		                OcultaBotones(reg.isBorrado() ? "001111" : "011111");

		                btnConsultar.setText("Cancelar");
		            } catch (Exception ex) {
		                JOptionPane.showMessageDialog(null, 
		                        "Registro no encontrado", "Aviso del sistema", JOptionPane.ERROR_MESSAGE);
		            }
		            lstLista.requestFocus();
		        }
		    }
		});
	}
	
	public static void LlenaListado(JList <String> lista) {
		try	{
			lista.setModel(DBRegistro.Listado());
		}
		catch (Exception e)	{
			lista.setModel(new DefaultListModel<String>());	
		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAgregar) {
			if (btnAgregar.getText().equalsIgnoreCase("Nuevo")) {
				ActivaTextFields(true);
				btnAgregar.setText("Guardar");
				btnModificar.setText("Cancelar");
				OcultaBotones("110000");
				try {
					txtClave.setText(String.valueOf(DBRegistro.SiguienteClave()));
				} catch(Exception error) {
					//txtClave.setText("0");
					System.out.println(error.getMessage());
				}
				txtClave.setEditable(false);
				regNuevo=true;
			}
			else {
				try {
					if (regNuevo)  //Agrega el registro nuevo
						DBRegistro.DBInsert(new Registro(Integer.parseInt(txtClave.getText()),txtNombre.getText(),
								txtDireccion.getText(),txtTelefono.getText(),Float.parseFloat(txtSaldo.getText()),false));
					else  //Actualiza el registro existente
						DBRegistro.DBUpdate(new Registro(Integer.parseInt(txtClave.getText()),txtNombre.getText(),
								txtDireccion.getText(),txtTelefono.getText(),Float.parseFloat(txtSaldo.getText()),false));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex, "Error al agregar registro: "+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
				}
				LlenaListado(lstLista);
				LimpiaTextFields();
				ActivaTextFields(false);
				txtClave.setEditable(true);
				btnAgregar.setText("Nuevo");
				btnModificar.setText("Modificar");
				btnConsultar.setText("Buscar");
				OcultaBotones("100001");
				regNuevo=false;
			}


		}

		if (e.getSource()==btnModificar) {
			if (btnModificar.getText().equalsIgnoreCase("Cancelar")) {
				LimpiaTextFields();
				ActivaTextFields(false);
				txtClave.setEditable(true);
				btnAgregar.setText("Nuevo");
				btnModificar.setText("Modificar");
				lstLista.clearSelection();
				OcultaBotones("100001");
			}
			else {  //Modificar
				ActivaTextFields(true);
				txtClave.setEditable(false);
				btnAgregar.setText("Guardar");
				btnModificar.setText("Cancelar");
				OcultaBotones("110000");
				regNuevo=false;
			}
		}

		if (e.getSource()==btnDelFisico) {
			try {
				DBRegistro.DBDeleteFisico(Integer.parseInt(txtClave.getText()));
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex, "Error al borrar registro: "+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
			}
			LlenaListado(lstLista);
			LimpiaTextFields();
			ActivaTextFields(false);
			txtClave.setEditable(true);
			btnAgregar.setText("Nuevo");
			btnModificar.setText("Modificar");
			btnConsultar.setText("Buscar");
			OcultaBotones("100001");
		}

		if (e.getSource()==btnDelLogico) {
			try {
				DBRegistro.DBDeleteLogico(Integer.parseInt(txtClave.getText()),
						lblStatus.getText().equalsIgnoreCase("Registro Activo"));
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex, "Error al borrar registro: "+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
			}
			LlenaListado(lstLista);
			LimpiaTextFields();
			ActivaTextFields(false);
			txtClave.setEditable(true);
			btnAgregar.setText("Nuevo");
			btnModificar.setText("Modificar");
			btnConsultar.setText("Buscar");
			OcultaBotones("100001");
		}

		if (e.getSource()==btnConsultar) {
			if (btnConsultar.getText().equals("Buscar")) {
				try {
					Registro reg= DBRegistro.DBLeeRegistro(Integer.parseInt(txtClave.getText()));
					LlenaCampos(reg);
					OcultaBotones(reg.isBorrado()?"001111":"011111");
					btnConsultar.setText("Cancelar");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Registro no encontrado", "Aviso del sistema",JOptionPane.ERROR_MESSAGE);
				}
			}
			else {
				LimpiaTextFields();
				OcultaBotones("100001");
				btnConsultar.setText("Buscar");
			}
		}

		if (e.getSource()==btnSalir) {
			System.exit(0);
		}

		

	}
	
	private void LlenaCampos(Registro reg) {
	    txtClave.setText(String.valueOf(reg.getCve())); 
	    txtNombre.setText(reg.getNombre());              
	    txtDireccion.setText(reg.getDireccion());        
	    txtTelefono.setText(reg.getTelefono());          
	    txtSaldo.setText(String.valueOf(reg.getSaldo())); 
	    lblStatus.setText(reg.isBorrado() ? "Registro Inactivo" : "Registro Activo"); 
	}
	/*
	private void LlenaCampos(Registro reg) {
		txtClave.setText(String.valueOf(reg.getCve()));
		txtNombre.setText(reg.getNombre());
		txtDireccion.setText(reg.getDireccion());
		txtTelefono.setText(reg.getTelefono());
		txtSaldo.setText(String.valueOf(reg.getSaldo()));	
		lblStatus.setText(reg.isBorrado()?"Registro Inactivo":"Registro Activo");
	}
*/
	private void LimpiaTextFields() {
		txtClave.setText("");
		txtNombre.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtSaldo.setText("");	
		lblStatus.setText("");
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource()==txtClave) {
			if(txtClave.getText().toString().length()==0)
				OcultaBotones("100001");
			else
				OcultaBotones("100011");
		}
	}

	private void ActivaTextFields(boolean activar) {
		/*
		txtNombre.setEnabled(activar);
		txtDireccion.setEnabled(activar);
		txtTelefono.setEnabled(activar);
		txtSaldo.setEnabled(activar);
		*/
		txtNombre.setEditable(activar);
		txtDireccion.setEditable(activar);
		txtTelefono.setEditable(activar);
		txtSaldo.setEditable(activar);
	}

	private void ActivaBotones(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6) {
		btnAgregar.setEnabled(b1);
		btnModificar.setEnabled(b2);
		btnDelFisico.setEnabled(b3);
		btnDelLogico.setEnabled(b4);
		btnConsultar.setEnabled(b5);
		btnSalir.setEnabled(b6);
	}

	//"100011"
	private void ActivaBotones(String cad) {
		ActivaBotones(cad.substring(0, 1).equals("1"),
				cad.substring(1, 2).equals("1"),
				cad.substring(2, 3).equals("1"),
				cad.substring(3, 4).equals("1"),
				cad.substring(4, 5).equals("1"),
				cad.substring(5, 6).equals("1"));
	}

	private void OcultaBotones(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6) {
		btnAgregar.setVisible(b1);
		btnModificar.setVisible(b2);
		btnDelFisico.setVisible(b3);
		btnDelLogico.setVisible(b4);
		btnConsultar.setVisible(b5);
		btnSalir.setVisible(b6);
	}

	//"100011"
	private void OcultaBotones(String cad) {
		OcultaBotones(cad.substring(0, 1).equals("1"),
				cad.substring(1, 2).equals("1"),
				cad.substring(2, 3).equals("1"),
				cad.substring(3, 4).equals("1"),
				cad.substring(4, 5).equals("1"),
				cad.substring(5, 6).equals("1"));
	}
	
	
	
}