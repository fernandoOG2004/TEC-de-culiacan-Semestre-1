package unidad2;

import java.util.Scanner;

public class NumeroConPotencia {

	public static void main(String[] args) {
		
		// Autor: Roberto Valenzuela Arce
		// Fecha: 07 de octubre de 2022
		// proposito: elevar al cuadrado, cubo y quienta un numero entero
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		// Definir variables
		int x  ;
		int x1, x2, x3 ;
		
		//Proceso 
		System.out.println("Dame un numero");
		x = entrada.nextInt(); 
		
		x1 =  (int) Math.pow(x, 2);
		System.out.println("Resultado: ");
		System.out.println(x1);
		x2 = (int) Math.pow(x, 3);
		System.out.println(x2);
		x3 = (int) Math.pow(x, 5);
		System.out.println(x3);
		

	}

}
