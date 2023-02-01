package unidad3;

import java.util.Scanner;

public class Mayorde3Forma2 {

	public static void main(String[] args) {
		/*
		 * Autor:Roberto Valenzuela Arce
		 * Fecha: 05 de octubre del 2022
		 * proposito: clacula el mayo de 3 numeros reales
		 * forma 2
		 */
		double x,y,z;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero real: ");
		x = entrada.nextDouble();
		
		System.out.println("Introduzca el segundo numero real: ");
		y = entrada.nextDouble();
		
		System.out.println("Introduzca en tercer numero real: ");
		z = entrada.nextDouble();
		
		double mayor;
		if (x>y && x>z)
				mayor = x;
			else 
		if (y>z && y>z)
				mayor = y;
			else 
				mayor = z;
		System.out.println("El mayor es: " + mayor);

	}

}
