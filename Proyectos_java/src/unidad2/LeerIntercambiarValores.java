package unidad2;
import java.util.Scanner;

public class LeerIntercambiarValores {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 29 de septiembre del 2022
		// proposito leer 2 valores e intercambiarlos
		
		//Crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		int a, b ;
		
		//Introduzco valores
		System.out.println("Introduszca valor de a");
		a = entrada.nextInt();
		System.out.println("Introduszca valor de b");
		b = entrada.nextInt();
		
		int aux = a;
		a = b;
		b= aux;
		
		System.out.println("Valor de a= " + a);
		System.out.println("Valor de b= " + b);

	}

}
