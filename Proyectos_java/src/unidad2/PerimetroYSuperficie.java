package unidad2;

import java.util.Scanner;

public class PerimetroYSuperficie {

	public static void main(String[] args) {
	
		// Autor: Roberto Valenzuela Arce
		// Fecha: 07 de octubre de 2022
		// proposito: calcular perimetro y superficie de un rectangulo 
		
//		Crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		
		// Definir variables
		double b, h ;
		double A, P ;
		
		//Proceso 
		System.out.println( "Dame la base");
		b = entrada.nextDouble();
		System.out.println("Dame la altura");
		h = entrada.nextDouble();
		
		A = b * h;
		P = (2 * b) + (2 * h);
		
		System.out.println("Resltado: ");
		System.out.println(A);
		System.out.println(P);
		

	}

}
