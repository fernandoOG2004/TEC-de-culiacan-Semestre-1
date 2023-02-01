import java.util.Scanner;
public class OperacionesAritmeticas {


	public static void main(String[] args) {
		
		// Autor: Roberto Valenzuela Arce
		// Fecha: 08 de octubre de 2022
		// proposito: hacer funciones diferentes para sumar, restar, multiplicar, dividir y residuo. 
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		// Definir variables
		int a, b  ;
		int s, r, m, d, re  ;
		
		//Proceso 
		System.out.println("Dame un numero");
		a = entrada.nextInt();
		System.out.println("Dame otro numero");
		b = entrada.nextInt();
		
		s = a + b;
		r = a - b;
		m = a * b;
		d = a / b;
		re = a % b;
		
		System.out.println("Resultados: ");
		System.out.println(s);
		System.out.println(r);
		System.out.println(m);
		System.out.println(d);
		System.out.println(re);
		
	}

}
