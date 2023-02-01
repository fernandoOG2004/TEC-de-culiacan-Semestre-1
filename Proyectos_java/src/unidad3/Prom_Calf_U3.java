package unidad3;

import java.util.Scanner;

public class Prom_Calf_U3 {

	public static void main(String[] args) {
		// Ejercicio 20
		// Autor: Valenzuela Arce Roberto
		// Proposito: sacar el promedio de 5 calificaciones
		// por medio de ciclo for
		// Fecha:
		
		// Definir variable de salida
		double prom;
		// Definir variable de entrada
		int calif;
		// Definir variables auxiliares
		int suma = 0;
		int i;
		
		Scanner entrada = new Scanner(System.in);
		
		for (i=1; i<=5; i++)
		{
			System.out.println("Proporciona calificacion " + i + ":");
			calif = entrada.nextInt();
			suma = suma + calif;
			
		}
			prom = suma/5;
			System.out.println("Promedio: " + prom);
		
		

	}

}
