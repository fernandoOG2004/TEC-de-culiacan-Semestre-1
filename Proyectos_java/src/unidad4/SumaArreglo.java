package unidad4;
/*
 * Proposito = Suma los elementos de un arreglo
 */
import java.util.*;
public class SumaArreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double Arreglo[] = new double [13];
		for(int i = 0;i < Arreglo.length;i++)
		{
			System.out.print("Proporciona el valor de la posicion "+i+": ");
			Arreglo[i] = entrada.nextDouble();
		}
		System.out.println(Suma(Arreglo));
	
	}
	static double Suma(double [] W){
		double s = 0.0;
		for (int i = 0; i < W.length; i++)
			s += W[i];
			return s;
		
	}
	
	
}
