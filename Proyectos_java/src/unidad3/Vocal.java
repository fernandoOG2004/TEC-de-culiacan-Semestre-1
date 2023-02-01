package unidad3;

import java.util.Scanner;

public class Vocal {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
		// Fecha: 13 de octubre del 2022
		// Proposito:
		
		//Crar objeto scanner
		Scanner entrada = new Scanner (System.in);
		
		//proceso
		System.out.println("Escriba un valor de (1-5)");
		short voc = entrada.nextShort();
		switch (voc) {
		case 1: System.out.println('a');
		break;
		case 2:System.out.println('e');
		break;
		case 3: System.out.println('i');
		break;
		case 4: System.out.println('o');
		break;
		case 5: System.out.println('u');
		break;
		default: System.out.println("Opcion invalidad");
		}

	}

}
