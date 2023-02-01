package unidad3;

import java.util.Scanner;

public class ABCpor10 {

	public static void main(String[] args) {

		// Autor: Roberto Valenzuela Arce
		// Fecha: 06 de octubre de 2022
		// proposito: multiplicar los valores de a,b y c por 10
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//Definir variables
		int a, b, c;
		
		//Proceso 
		System.out.println("Dame el valor de a");
		a = entrada.nextInt();
		System.out.println("Dame el valor de b");
		b = entrada.nextInt();
		System.out.println("Dame el valor de c");
		c = entrada.nextInt();
		
		a = a * 10;
		b = b * 10;
		c = c *10;
		
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de b: " + b);
		System.out.println("Valor de c: " + c);
		
		


	}

}
