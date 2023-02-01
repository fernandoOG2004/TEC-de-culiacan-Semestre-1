package unidad3;

import java.util.Scanner;

public class Vehiculo {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
		// Fecha: 13 de octubre del 2022
		// Proposito: seleccionar el tipo de vehiculo y en concordancia
		// asignar un peaje y salta la ejecucion a la sentencia que sigue
		// switch
				
		//Crar objeto scanner
		Scanner entrada = new Scanner (System.in);
		
		double peaje = 0;
		int Tipo_vehiculo;
		System.out.println("*****MENU DE OPCIONES*****");
		System.out.println("\t1) Turismo .....$500.00");
		System.out.println("\t2) Autobus .....$3,000.00");
		System.out.println("\t3) Motocicleta .....$300.00");
		System.out.println();
		System.out.println("Introduzca un tipo de vehiculo: ");
		Tipo_vehiculo = entrada.nextInt();
		
		switch (Tipo_vehiculo)
		{
		case 1: System.out.println("Turismo");
		peaje = 500;
		break;
		case 2: System.out.println("Autobus");
		peaje = 3000;
		break;
		case 3: 
			System.out.println("Motocicleta");
		peaje = 300;
		break;
		default: System.out.println("Vehiculo no autorizado");
		
		}
		System.out.println("¿Con cuanro paga?");
		double paga = entrada.nextDouble();
		double cambio = entrada.nextDouble();
		System.out.println("Su cambio es " + cambio);

	}

}
