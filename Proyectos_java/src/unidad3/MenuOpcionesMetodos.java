package unidad3;

import java.util.Scanner;

public class MenuOpcionesMetodos {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
				// Fecha: 13 de octubre del 2022
				// Proposito: hacer un menu de claculadora
				
				//Crar objeto scanner
				Scanner entrada = new Scanner (System.in);
				
				
				// Definir variables
				double a, b ;
				int opcion;
				double resultado = 0;
				System.out.println("Proporciona valor 1");
				a = entrada.nextDouble();
				System.out.println("Proporciona valor 2");
				b = entrada.nextDouble();
				
				System.out.println("Menu de opciones:");
				System.out.println("   1. Sumar ");
				System.out.println("   2. Restar ");
				System.out.println("   3. Multiplicar ");
				System.out.println("   4. Dividir ");
				System.out.println("   5. Salir ");
				
				//ingresar opcion 
				System.out.println("Elija una opcion (1-5)");
				opcion = entrada.nextInt();
				//procesar opcion
				switch (opcion) {
				case 1: resultado = sumar(a,b);
				break;
				case 2: resultado = a-b;
				break;
				case 3: resultado = a*b;
				break;
				case 4: resultado = a/b;
				break;
				case 5:System.out.println("Hasta pronto!");
				break;
				default:
					System.out.println("Opcion invalida");
				
				}
				System.out.println("El resultado= " + resultado);

	}

public static double sumar(double valor1, double valor2) {
	double r;
	r = valor1 + valor2;
	return r;
}
public static double restar (double valor1, double valor2) {
	double r;
	r = valor1 - valor2;
	return r;
}
public static double multiplicar (double valor1, double valor2) {
	double r;
	r = valor1 * valor2;
	return r;
}
public static double dividir (double valor1, double valor2) {
	double r;
	r = valor1 / valor2;
	return r;
}
}
