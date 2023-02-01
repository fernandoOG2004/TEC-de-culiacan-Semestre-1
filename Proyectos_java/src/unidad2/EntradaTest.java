package unidad2;

import java.util.Scanner;

public class EntradaTest {

	public static void main(String[] args) {
		// Crear objeto scanner
		Scanner teclado = new Scanner (System.in);

		//Obtener la primera entrada 
				System.out.println("¿Cual es tu nombre?");
				String nombre = teclado.nextLine();
				
		//Obtener la primera entrada 
				System.out.println("¿Cual es tu edad?");
				int edad = teclado.nextInt();		
				
		//Visualizar salida
				System.out.println("Buenos dias!" + nombre 
						+", años " + edad);
		//Sintaxis de la entrada 
			/*
			 * Import java.util.Scanner;
			 * Scanner nombreObjeto = new Scanner (System.in);
			 * nombreObjeto puede ser cualquier identificador valido
			 * los metodos nextInt, nextDouble, next, nextLine leen respectivamente
			 * un valor tipo Int, Double, String de una palabra, String con espacio
			 * en blanco
			 */
	}

}
