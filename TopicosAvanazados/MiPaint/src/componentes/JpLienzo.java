package componentes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import utilerias.Figura;

public class JpLienzo extends JPanel implements MouseListener, MouseMotionListener, KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int getFig() {
		return Fig;
	}
	public void setFig(int fig) {
		Fig = fig;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public int getAncho() {
		return Ancho;
	}
	public void setAncho(int ancho) {
		Ancho = ancho;
	}
	public int getAlto() {
		return Alto;
	}
	public void setAlto(int alto) {
		Alto = alto;
	}
	public boolean isRelleno() {
		return Relleno;
	}
	public void setRelleno(boolean relleno) {
		Relleno = relleno;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public ArrayList<Figura> getContenido() {
		return Contenido;
	}
	public void setContenido(ArrayList<Figura> contenido) {
		Contenido = contenido;
	}
	public boolean isNoGuardado() {
		return NoGuardado;
	}
	public void setNoGuardado(boolean noGuardado) {
		NoGuardado = noGuardado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int Fig;
	private int x1,y1,x2,y2,Ancho, Alto;
	private boolean Relleno;
	private Color color;
	private ArrayList<Figura>Contenido;
	private boolean NoGuardado;
	
	
	public JpLienzo(){
		super();
		Contenido = new ArrayList<>();
		setBackground(Color.WHITE);
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		
		ValoresIniciales();
		repaint();
	}
	
	public void ValoresIniciales() {
		NoGuardado = true;
		Fig = 1;
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		Ancho = 0;
		Alto = 0;
		Relleno = false;
		color = Color.BLACK;
		
	}
	
	public void PintaTodo(Graphics g) {
		Figura f ; 
		for (int i = 0; i < Contenido.size(); i++) {
			f = Contenido.get(i);
			g.setColor(f.getColor());
			if (f.isRelleno()) {
				switch (f.getFig()) {
				case 1: //Cuadrado
				case 2: // Rectangulo
					g.fillRect(f.getX1(), f.getY1(), f.getAncho(), f.getAlto());
					break;
				case 3: //Circulo
				case 4: //Ovalo
					g.fillOval(f.getX1(), f.getY1(), f.getAncho(), f.getAlto());
					break;
				case 5: //Linea
					g.drawLine(f.getX1(), f.getY1(), f.getX2(), f.getY2());
				}
			}else {
				switch (f.getFig()) {
			case 1: //Cuadrado
			case 2: // Rectangulo
				g.drawRect(f.getX1(), f.getY1(), f.getAncho(), f.getAlto());
				break;
			case 3: //Circulo
			case 4: //Ovalo
				g.drawOval(f.getX1(), f.getY1(), f.getAncho(), f.getAlto());
				break;
			case 5: //Linea
				g.drawLine(f.getX1(), f.getY1(), f.getX2(), f.getY2());
			
				}
			}
		}
		
	}
	
	public void Paint (Graphics g) {
		super.paint(g);
		PintaTodo(g);
		Ancho = Math.abs(x2-x1);
		Alto = Math.abs(y2-y1);
		if (Fig == 1 || Fig == 3) {
			Ancho = Ancho > Alto ? Ancho : Alto;
			Alto = Ancho > Alto ? Ancho : Alto;	
		}
		g.setColor(color);
		if (Relleno) {
			switch (Fig) {
			case 1: //Cuadrado
			case 2: // Rectangulo
				g.fillRect(x1,y1,Ancho,Alto);
				break;
			case 3: //Circulo
			case 4: //Ovalo
				g.fillOval(x1,y1,Ancho,Alto);
				break;
			case 5: //Linea
				g.drawLine(x1,y1,x2,y2);
			}
		}else {
			switch (Fig) {
		case 1: //Cuadrado
		case 2: // Rectangulo
			g.drawRect(x1,y1,Ancho,Alto);
			break;
		case 3: //Circulo
		case 4: //Ovalo
			g.drawOval(x1,y1,Ancho,Alto);
			break;
		case 5: //Linea
			g.drawLine(x1,y1,x2,y2);
		
			}
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (e.getButton() == 0) {
			x2 = e.getX();
			y2 = e.getY();
			repaint();
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == 1) {
			Contenido.add(new Figura(Fig,x1,y1,x2,y2,Ancho,Alto,Relleno,color));
			NoGuardado=true;
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
