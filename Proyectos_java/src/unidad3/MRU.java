package unidad3;
import java.util.Scanner;

public class MRU {

	public static void main(String[] args) {
		
		// Autor: Roberto Valenzuela Arce
		// Fecha: 0r de octubre de 2022
		// proposito: Calcular la distancia de un coche mediante
		// verlocidad y tiempo
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//Definir variables
		Double d, t, v ;
		
		//Proceso 
		System.out.println("Dame la velocidad (m/s)");
		v = entrada.nextDouble();
		System.out.println("Dame el tiempo (s)");
		t = entrada.nextDouble();
		
		d = v * t;
		
		System.out.println("Distancia recorrida: " + d);

	}

}
