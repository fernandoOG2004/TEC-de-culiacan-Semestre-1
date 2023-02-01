package unidad2;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		
		// Autor: Roberto Valenzuela Arce
		// Fecha: 07 de octubre de 2022
		// proposito: intercambiar a por b
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		// Definir variables
		int a, b , c ;
		
		//Proceso 
		System.out.println("Dame a");
		a = entrada.nextInt();
		System.out.println("Dame b");
		b = entrada.nextInt();
		
		c = b;
		b = a;
		a = c;
		
		System.out.println("Respuesta: ");
		System.out.println(a);;
		System.out.println(b);
		
	}

}
