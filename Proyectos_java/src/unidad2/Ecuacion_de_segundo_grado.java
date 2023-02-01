package unidad2;
import java.util.Scanner;

public class Ecuacion_de_segundo_grado {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 28 de septiembre de 2022
		//proposito: resolver ecuaciones de segundo grado
		
		//Definir variables de salida
		double x1, x2;
		//Definir variables de entrada
		double a, b, c;
		
		//Crear objeto scanner
		Scanner Entrada = new Scanner(System.in);
		
		//Lectura de datos 
		System.out.println("Dame valor a:");
		a = Entrada.nextInt();
				
		System.out.println("Dame valor b:");
		b = Entrada.nextInt();
				
		System.out.println("Dame valor c:");
		c  = Entrada.nextInt();
		
		x1 = -b + Math.sqrt(( b * b -4 *a *c ) /2 *a) ;
		x2 = -b - Math.sqrt(( b * b -4 *a *c ) /2 *a) ;
		
		//Imprimir puntaje final
		System.out.println("Valor de x1: " + x1);
		System.out.println("Valor de x2: " + x2);
		
		

	}

}
