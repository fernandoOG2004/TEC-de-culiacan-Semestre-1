package unidad3;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// Nombre: Valenzuela Arce Roberto
		// Fecha: 03 de noviembre del 2022
		// Proposito: calcular la media de un numero y utilizar un 
		// valor centinela -9
		
		//crear objeto scanner
		Scanner teclado = new Scanner (System.in);
		
		
		// Definir variable de salida
		float media ;
		// Definir variable de entrada
		int num ;
		// Definir variables auxiliares
		int suma,cuenta ;
		int CENTINELA ;
		CENTINELA = -9;
		suma = 0;
		cuenta = 0;
		System.out.println("Prporcione un valor numerico (-9) para terminar");
		num = teclado.nextInt();
		while (num != CENTINELA) 
		{
			suma = suma + num;
			cuenta++ ;
			System.out.println("Prporcione un valor numerico (-9) para terminar ");
			num = teclado.nextInt();
		}
		if (cuenta>0) 
		{
			media = (float)suma/cuenta;
			System.out.println("Media = " + media);
		}
		else
			System.out.println("Sin valores de entrada");
	} 

	}


