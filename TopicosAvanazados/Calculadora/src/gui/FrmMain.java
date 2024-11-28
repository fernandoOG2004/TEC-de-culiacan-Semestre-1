package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import gui.filtroCalculadora;
public class FrmMain extends JFrame implements ActionListener, KeyListener{
	private static final long serialVersionUID = 1L;
	private JPanel pnl_Centro, pnl_Norte;
	static filtroCalculadora txt_barra = new filtroCalculadora();
	private JButton btn_uno, btn_dos, btn_tres, btn_cuatro, btn_cinco, btn_seis, btn_siete, btn_ocho, btn_nueve, btn_cero, btn_C, btn_CE, btn_mod, btn_mult, btn_div, btn_rest, btn_suma, btn_punto, btn_signo, btn_igual ;
	private Dimension tamanio = new Dimension(70, 40);
	public static double v0 =0;
	public static double v1=0;
	public static double v2=0;
	public static double resultado=0;
	public static boolean suma;
	public static boolean resta;
	public static boolean multi;
	public static boolean div;
	public static boolean mod;
	public static boolean esResultado;
	public static boolean esOperacion;
	
	
	public FrmMain () {
		setTitle("Proyecto Complementario");
		setIconImage(new ImageIcon("D:\\TopicosAvanzados\\Calculadora\\src\\calculator_black.png").getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 600);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		initComponents();
	}
	
	private void initComponents() {
		pnl_Centro = new JPanel();
		pnl_Centro.setLayout(new GridBagLayout());
		Calculadora();
		add(pnl_Centro, BorderLayout.CENTER);
		esResultado = false;

		pnl_Norte = new JPanel();
		txt_barra.setMinimumSize(new Dimension(300, 60));
		txt_barra.setPreferredSize(new Dimension(300, 60));
		txt_barra.setMaximumSize(new Dimension(300, 60));
		txt_barra.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		pnl_Norte.add(txt_barra);
		add(pnl_Norte, BorderLayout.NORTH);
	}

	private void Calculadora(){
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 2;
		c.weighty = 2;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(1, 1, 1, 1);
		
		btn_C = new JButton("C");
		btn_C.setPreferredSize(tamanio);
		btn_C.addActionListener(this);
		pnl_Centro.add(btn_C, c);
		
		c.gridx = 1;
		btn_CE = new JButton("CE");
		btn_CE.setPreferredSize(tamanio);
		btn_CE.addActionListener(this);
		pnl_Centro.add(btn_CE, c);

		c.gridx = 2;
		btn_mod = new JButton("MOD");
		btn_mod.setPreferredSize(tamanio);
		btn_mod.addActionListener(this);
		pnl_Centro.add(btn_mod, c);

		c.gridx = 3;
		btn_mult = new JButton("x");
		btn_mult.setPreferredSize(tamanio);
		btn_mult.addActionListener(this);
		pnl_Centro.add(btn_mult, c);

		c.gridy = 1;
		c.gridx = 0;
		btn_siete = new JButton("7");
		btn_siete.setPreferredSize(tamanio);
		btn_siete.addActionListener(this);
		pnl_Centro.add(btn_siete, c);

		c.gridx = 1;
		btn_ocho = new JButton("8");
		btn_ocho.setPreferredSize(tamanio);
		btn_ocho.addActionListener(this);
		pnl_Centro.add(btn_ocho, c);

		c.gridx = 2;
		btn_nueve = new JButton("9");
		btn_nueve.setPreferredSize(tamanio);
		btn_nueve.addActionListener(this);
		pnl_Centro.add(btn_nueve, c);

		c.gridx = 3;
		btn_div = new JButton("÷");
		btn_div.setPreferredSize(tamanio);
		btn_div.addActionListener(this);
		pnl_Centro.add(btn_div, c);

		c.gridy = 2;
		c.gridx = 0;
		btn_cuatro = new JButton("4");
		btn_cuatro.setPreferredSize(tamanio);
		btn_cuatro.addActionListener(this);
		pnl_Centro.add(btn_cuatro, c);

		c.gridx = 1;
		btn_cinco = new JButton("5");
		btn_cinco.setPreferredSize(tamanio);
		btn_cinco.addActionListener(this);
		pnl_Centro.add(btn_cinco, c);

		c.gridx = 2;
		btn_seis = new JButton("6");
		btn_seis.setPreferredSize(tamanio);
		btn_seis.addActionListener(this);
		pnl_Centro.add(btn_seis, c);

		c.gridx = 3;
		btn_rest = new JButton("-");
		btn_rest.setPreferredSize(tamanio);
		btn_rest.addActionListener(this);
		pnl_Centro.add(btn_rest, c);

		c.gridy = 3;
		c.gridx = 0;
		btn_uno = new JButton("1");
		btn_uno.setPreferredSize(tamanio);
		btn_uno.addActionListener(this);
		pnl_Centro.add(btn_uno, c);

		c.gridx = 1;
		btn_dos = new JButton("2");
		btn_dos.setPreferredSize(tamanio);
		btn_dos.addActionListener(this);
		pnl_Centro.add(btn_dos, c);

		c.gridx = 2;
		btn_tres = new JButton("3");
		btn_tres.setPreferredSize(tamanio);
		btn_tres.addActionListener(this);
		pnl_Centro.add(btn_tres, c);

		c.gridx = 3;
		btn_suma = new JButton("+");
		btn_suma.setPreferredSize(tamanio);
		btn_suma.addActionListener(this);
		pnl_Centro.add(btn_suma, c);

		c.gridy = 4;
		c.gridx = 0;
		btn_signo = new JButton("+/-");
		btn_signo.setPreferredSize(tamanio);
		btn_signo.addActionListener(this);
		pnl_Centro.add(btn_signo, c);

		c.gridx = 1;
		btn_cero = new JButton("0");
		btn_cero.setPreferredSize(tamanio);
		btn_cero.addActionListener(this);
		pnl_Centro.add(btn_cero, c);

		c.gridx = 2;
		btn_punto = new JButton(".");
		btn_punto.setPreferredSize(tamanio);
		btn_punto.addActionListener(this);
		pnl_Centro.add(btn_punto, c);

		c.gridx = 3;
		btn_igual = new JButton("=");
		btn_igual.setPreferredSize(tamanio);
		btn_igual.addActionListener(this);
		pnl_Centro.add(btn_igual, c);
	}

	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btn_uno || e.getSource() == btn_dos|| e.getSource() == btn_tres || e.getSource() == btn_cuatro || e.getSource() == btn_cinco || e.getSource() == btn_seis || e.getSource() == btn_siete || e.getSource() == btn_ocho || e.getSource() == btn_nueve || e.getSource() == btn_cero) {
	    	JButton boton = (JButton) e.getSource();
	    	if (esResultado == true) {
				txt_barra.setText("");
				esResultado = false;
			}
	    	if (esOperacion == true) {
				txt_barra.setText("");
			esOperacion = false;
			}
	        txt_barra.setText(txt_barra.getText() + boton.getText());
	    }else if (e.getSource() == btn_C) {
	    	if (esResultado == true) {
				txt_barra.setText("");}
				esResultado = false;
				esOperacion = false;
				v0 = 0;
				v1 = 0;
				v2 = 0;
	        txt_barra.setText("");
	    } else if (e.getSource() == btn_suma) {
	    	if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = true;
		        resta = false;
		        multi = false;
		        div = false;
		        mod = false;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
	    } else if (e.getSource() == btn_rest) {
	    	if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = false;
		        resta = true;
		        multi = false;
		        div = false;
		        mod = false;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
			} else if (e.getSource() == btn_mult) {
				if (suma == true) {
		    		v1 = Double.parseDouble(txt_barra.getText());
					v0= v0+v1;
					txt_barra.setText(String.valueOf(v0));
				}else if (resta == true) {
					v1 = Double.parseDouble(txt_barra.getText());
					v0= v0-v1;
					txt_barra.setText(String.valueOf(v0));
				}else if (multi == true) {
					v1 = Double.parseDouble(txt_barra.getText());
					v0= v0*v1;
					txt_barra.setText(String.valueOf(v0));
				}else if (div == true) {
					v1 = Double.parseDouble(txt_barra.getText());
					v0= v0/v1;
					txt_barra.setText(String.valueOf(v0));
				}else if (mod == true) {
					v1 = Double.parseDouble(txt_barra.getText());
					v0= v0%v1;
					txt_barra.setText(String.valueOf(v0));
				} 
		    	//if (v0 != v1) {
		    		v0 = Double.parseDouble(txt_barra.getText());
			        suma = false;
			        resta = false;
			        multi = true;
			        div = false;
			        mod = false;
			        esResultado = false;
			        esOperacion = true;
			        /*
			        txt_barra.setText(String.valueOf(v0));
				}else {*/
					txt_barra.setText(String.valueOf(v0));
	    } else if (e.getSource() == btn_div) {
	    	if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = false;
		        resta = false;
		        multi = false;
		        div = true;
		        mod = false;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
	    } else if (e.getSource() == btn_mod) {
	    	if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = false;
		        resta = false;
		        multi = false;
		        div = false;
		        mod = true;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
	    } else if (e.getSource() == btn_igual) {
	        v1 = Double.parseDouble(txt_barra.getText());
	        if (suma) {
	            resultado = v0 + v1;
	            suma = false;
	        } else if (resta) {
	            resultado = v0 - v1;
	            resta = false;
	        } else if (multi) {
	            resultado = v0 * v1;
	            multi = false;
	        } else if (div) {
	            resultado = v0 / v1;
	            div = false;
	        } else if (mod) {
	            resultado = v0 % v1;
	            mod = false;
	        }
	        txt_barra.setText(String.valueOf(resultado));
	        esResultado = true;
	        
	    } else if (e.getSource() == btn_CE) {
	    	String currentText = txt_barra.getText();
	        if (!currentText.isEmpty()) {
	            txt_barra.setText(currentText.substring(0, currentText.length() - 1));
	            }
	        esResultado = false;
	    } else if (e.getSource() == btn_punto) {
	        if (!txt_barra.getText().contains(".")) {
	            txt_barra.setText(txt_barra.getText() + ".");
	        }
	        esResultado = false;
	    } else if (e.getSource() == btn_signo) {
	    	  if (!txt_barra.getText().isEmpty()) {
	    	        try {
	    	            double value = Double.parseDouble(txt_barra.getText());
	    	            value = value * -1;
	    	            txt_barra.setText(String.valueOf(value));
	    	            txt_barra.revalidate(); // Forzar actualización gráfica
	    	            txt_barra.repaint();
	    	            esResultado = false;
	    	        } catch (NumberFormatException ex) {
	    	            txt_barra.setText("Error");
	        }
	        esResultado = false;
	    }
	}
}
	
	public static void TeclaPresionada(KeyEvent e) {
        char key = e.getKeyChar();
        
        if (key == '0' || key == '2' || key == '3' ||key == '4' ||key == '5' ||key == '6' ||key == '7' ||key == '8' ||key <= '9' || key =='.') {
            if (esResultado) {
                txt_barra.setText("");
                esResultado = false;
            }
            if (esOperacion) {
                txt_barra.setText("");
                esOperacion = false;
            }
            
        }
        if (key == KeyEvent.VK_ESCAPE) {
            if (esResultado) {
                txt_barra.setText("");
            }
            esResultado = false;
            esOperacion = false;
            v0 = 0;
            v1 = 0;
            v2 = 0;
            txt_barra.setText("");
        }
        if (key == KeyEvent.VK_ENTER) {
        	v1 = Double.parseDouble(txt_barra.getText());
	        if (suma) {
	            resultado = v0 + v1;
	            suma = false;
	        } else if (resta) {
	            resultado = v0 - v1;
	            resta = false;
	        } else if (multi) {
	            resultado = v0 * v1;
	            multi = false;
	        } else if (div) {
	            resultado = v0 / v1;
	            div = false;
	        } else if (mod) {
	            resultado = v0 % v1;
	            mod = false;
	        }
	        txt_barra.setText(String.valueOf(resultado));
	        esResultado = true;
        }
        if (key == '+') {
        	if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = true;
		        resta = false;
		        multi = false;
		        div = false;
		        mod = false;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
        }
        
		if (key == '-') {
			if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = false;
		        resta = true;
		        multi = false;
		        div = false;
		        mod = false;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
		        }
		if (key == '*') {
			if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = false;
		        resta = false;
		        multi = true;
		        div = false;
		        mod = false;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
		        }
		        
		if (key == '/') {
			if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = false;
		        resta = false;
		        multi = false;
		        div = true;
		        mod = false;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));	
				}
		if (key == '%') {
			if (suma == true) {
	    		v1 = Double.parseDouble(txt_barra.getText());
				v0= v0+v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (resta == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0-v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (multi == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0*v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (div == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0/v1;
				txt_barra.setText(String.valueOf(v0));
			}else if (mod == true) {
				v1 = Double.parseDouble(txt_barra.getText());
				v0= v0%v1;
				txt_barra.setText(String.valueOf(v0));
			} 
	    	//if (v0 != v1) {
	    		v0 = Double.parseDouble(txt_barra.getText());
		        suma = false;
		        resta = false;
		        multi = false;
		        div = false;
		        mod = true;
		        esResultado = false;
		        esOperacion = true;
		        /*
		        txt_barra.setText(String.valueOf(v0));
			}else {*/
				txt_barra.setText(String.valueOf(v0));
		}
    }


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
            if (esResultado) {
                txt_barra.setText("");
                esResultado = false;
            }
            if (esOperacion) {
                txt_barra.setText("");
                esOperacion = false;
            }
            txt_barra.setText(txt_barra.getText() + e.getKeyChar());
        }
        
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            String currentText = txt_barra.getText();
            if (!currentText.isEmpty()) {
                txt_barra.setText(currentText.substring(0, currentText.length() - 1));
            }
            esResultado = false;
        }
        
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if (esResultado) {
                txt_barra.setText("");
            }
            esResultado = false;
            esOperacion = false;
            v0 = 0;
            v1 = 0;
            v2 = 0;
            txt_barra.setText("");
        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
