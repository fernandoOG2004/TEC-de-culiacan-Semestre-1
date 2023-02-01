package unidad3;

import java.util.Scanner;

public class DemoEnCaso {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
		// Fecha: 13 de octubre del 2022
		// Proposito: Leer un numero del 1-3 y va a Escribir 
		// el nombre del numero 
		
		//crear objeto scanner
		Scanner entrada = new Scanner (System.in);
		
		// Definir variable de entrado 
		int num;
		
		System.out.println("Proporciona un numero (1-3)");
		num = entrada.nextInt();
		
		switch (num) {
		case 1: 
			System.out.println("UNO");
			break;
		case 2: 
			System.out.println("DOS");
			break;
		case 3: 
			System.out.println("TRES");
			break;
			default: 
				System.out.println("Numero invalido");
			
		}

	}

}
