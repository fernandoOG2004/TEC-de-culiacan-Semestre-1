package unidad3;

import java.util.Scanner;

public class Vocal2 {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
		// Fecha: 13 de octubre del 2022
		// Proposito: identificar vocales
		
		//crear objeto scanner
		Scanner entrada = new Scanner (System.in);
		
		//proceso
		char voc = entrada.next().charAt(0);
		
		if ((voc == 'a' || voc == 'A'))
			System.out.println(voc + "Es una vocal");
		else if ((voc == 'e' || voc == 'E'))
			System.out.println(voc + "Es una vocal");
		else if ((voc == 'i' || voc == 'I'))
			System.out.println(voc + "Es una vocal");
		else if ((voc == 'o' || voc == 'O'))
			System.out.println(voc + "Es una vocal");
		else if ((voc == 'u' || voc == 'U'))
			System.out.println(voc + "Es una vocal");
		else System.out.println("No es una vocal");
		
		switch (voc) {
		case 'a' : case 'A' :
		case 'e' : case 'E' :
		case 'i' : case 'I' :
		case 'o' : case 'O' :
		case 'u' : case 'U' :
			
			System.out.println( voc + " Es una vocal");
			break;
			default:
				System.out.println(voc + "No es una vocal");
			
			
		}
		
		
		
			
		

	}

}
