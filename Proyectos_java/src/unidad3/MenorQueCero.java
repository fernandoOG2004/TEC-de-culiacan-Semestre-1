package unidad3;

import java.util.Scanner;

public class MenorQueCero {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
		// Fecha: 13 de octubre del 2022
		// Proposito: 
		
		//Crar objeto scanner
		Scanner entrada = new Scanner (System.in);
		
		// proceso
		System.out.println("Proporcione un valor entero positivo: ");
		int opcion = entrada.nextInt();
		switch (opcion){
		case 0:
		case 1:
		case 2:
			System.out.println("Menor que 3!");
			break;
		case 3:
			System.out.println("Igual a 3");
			break;
			default:
				System.out.println("Mayor que 3!");
			
		}

	}

}
