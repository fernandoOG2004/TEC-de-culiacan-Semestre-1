package unidad2;
/*
 * Autor: Roberto Valenzuela Arce
 * Fecha: 23 de septiembre del 2022
 * Proposito: Calcular el puntaje 
 */

import java.util.Scanner;

public class CalculoPuntaje {

	public static void main(String[] args) {
		// definir variables de salida
		int puntaje;
		//Definir varaible de entrada
		int respuestasCorrectas, respuestasIncorrectas;
		int respuestasEnBlanco;
		
		//Crear objeto scanner
		Scanner Entrada = new Scanner(System.in);
				
		//Lectura de datos 
		System.out.println("cantidad de respuestas correctas:");
		respuestasCorrectas = Entrada.nextInt();
		
		System.out.println("cantidad de respuestas incorrectas:");
		respuestasIncorrectas = Entrada.nextInt();
		
		System.out.println("cantidad de respuestas en blanco:");
		respuestasEnBlanco  = Entrada.nextInt();
		
		puntaje = respuestasCorrectas * 4 + respuestasIncorrectas;
			
		//Imprimir puntaje final
		System.out.println("puntaje = "+puntaje);
		


	}

}
