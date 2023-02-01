package unidad3;

import java.util.Scanner;

public class Calorias {

	public static void main(String[] args) {
		// Autor: Valenzuela Arce Roberto
		// Proposito: calcular en numero de calorias por
		// las comidas del dia
		// Fecha: 27/10/2022
		
		//crear objeto scanner 
		Scanner entrada = new Scanner(System.in);
		
		
		// variables de salida
		int totalcalorias = 0;
		// variables de entrada
		int numelementos ;
		int calalimentos;
		// Definir variables auxiliares}
		int cuenta = 1;
		System.out.println("¿Cuantos alimentos has consumido el dia de hoy?");
		numelementos = entrada.nextInt();
		System.out.println("Introducir el numero de calorias de cada uno de los alimentos " + numelementos +  "alimentos tomados");
		
		while (cuenta<=numelementos) 
		{
			calalimentos = entrada.nextInt();
			totalcalorias = totalcalorias + calalimentos;
			cuenta++;
		
		}
			
		System.out.println("Calorias totales consumidas hoy:" + totalcalorias);

	}

}
