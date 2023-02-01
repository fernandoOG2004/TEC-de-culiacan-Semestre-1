package unidad3;

import java.util.Scanner;

public class PruebaCompuesta {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
		// Fecha: 13 de octubre del 2022
		// Proposito: 
		
		//Crar objeto scanner
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduxca una calificacion (1-10), pulse intro: ");
		int nota = entrada.nextInt();
		switch (nota)
		{
		case 10:
		case 9: System.out.println("Excelente");
		break;
		case 8: 
		case 7: System.out.println("Notable");
		break;
		case 6: 
		case 5: System.out.println("Aprobado");
		break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: System.out.println("Suspendido");
		break;
		default: System.out.println("No es posible esta nota");
		
		}
		System.out.println("Final del programa");

	}

}
