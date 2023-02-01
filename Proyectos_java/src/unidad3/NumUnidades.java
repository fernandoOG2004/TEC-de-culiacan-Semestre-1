package unidad3;

import java.util.Scanner;

public class NumUnidades {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 10 de octubre de 2022
		// proposito: a partir de un numero de 2 cifras decir cuantas 
		//uniudades, desenas lo componen
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		// Definir variables de salida
		int unidades, decenas;
		//Definir variables 
		int num;
		
		//proceso
		System.out.println("Dame un numero de 2 cifras");
		num = entrada.nextInt();
		
		decenas = (int)(num / 10);
		unidades =  num % 10 ;
		
		System.out.println("Numero de decenas" +  decenas);
		System.out.println("Numero de unidades" +  unidades);

	}

}
