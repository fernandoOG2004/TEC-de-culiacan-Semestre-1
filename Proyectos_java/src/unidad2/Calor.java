package unidad2;

public class Calor {
	private int x,g,t; //solo son accesibles dentro de la clase 
	protected double gr; //son accesibles en todo el paquete y en 
	                    //las clases derivadas
	float nt; // por omision (sin modificador) desde cualquier clase
	          // del paquete
	public int i; //desde cualquier clase 
	double calculo()
	{
		double x=1; //declaracion local 
		gr = g*t+x;
		return gr;
	}
}
