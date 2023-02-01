package unidad2;
import java.util.Scanner;

public class Calcular_distancia {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 28 de septiembre de 2022
		//proposito: calcular distancia a partir de 
		//velocidad y tiempo
		
		//Definir variable de salida
		int d;
		//Definir variable de entrada
		int v, t;
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
				
		
		//Lectura de datos 
		System.out.println("Dame la velocidad (m/s): ");
		v = entrada.nextInt();
		System.out.println("Dame el tiempo (s): ");
		t = entrada.nextInt();
		
		d = v * t ;
		
		
		//Imprimir puntaje final
		System.out.println("Distancia recorrida: " + d);
		
		

	}

}
