package unidad3;

import java.util.Scanner;

public class Parciales2 {
 
	public static void main (String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 06 de octubre de 2022
		// proposito: hacer un programa para evaluar la expresion dada
		
		// crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		// definir variables
		int a, b, c, y1, h;
		double parcial;
		
		System.out.println("Dame el primer valor");
		a = entrada.nextInt();
		System.out.println("Dame el segundo valor");
		b = entrada.nextInt();
		System.out.println("Dame el tercer valor");
		c = entrada.nextInt();
		System.out.println("Dame el cuarto valor");
		y1 = entrada.nextInt();
		System.out.println("Dame el quinto valor");
		h = entrada.nextInt();
		
		parcial = (a % 2)/b-c*a*y1+18/c-3*h;
		
		System.out.println("Resultado: " + parcial);
	}
}
