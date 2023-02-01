package unidad3;

import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 10 de octubre de 2022
		// proposito: identificar un numero diferente de 0 si
		// es par 
		
		//crear opbjeto scanner
		Scanner entrada = new Scanner(System.in);
		// Definir variable 
		int num;
		
		//proceso
		System.out.println("proporciona un numero");
		num = entrada.nextInt();
		
		if (num % 2==0)
			System.out.println(num + "es par");

	}

}
