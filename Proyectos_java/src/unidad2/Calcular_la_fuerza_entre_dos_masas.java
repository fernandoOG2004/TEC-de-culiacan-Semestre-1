package unidad2;
import java.util.Scanner;


public class Calcular_la_fuerza_entre_dos_masas {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 28 de septiembre de 2022
		//proposito: calcular la fuerza entre dos masas
		
		//Definir variable de salida
		float F;
		//Definir variables de entrada
		float G, m1, m2, D;
		G = 9.81f;
		
		
		//Crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//Lectura de datos 
		System.out.println("Dame la masa 1: ");
		m1 = entrada.nextFloat();
		System.out.println("Dame la masa 2: ");
		m2 = entrada.nextFloat();
		System.out.println("Dame la distancia: ");
		D = entrada.nextFloat();
		
		
		F = (G * m1 * m2) / (D * D) ;
		
		//Imprimir puntaje final
		System.out.println("Fuerza entre 2 masas: " + F);

	}

}
