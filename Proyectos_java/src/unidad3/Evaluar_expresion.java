package unidad3;

import java.util.Scanner;

public class Evaluar_expresion {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
				// Fecha: 06 de octubre de 2022
				// proposito: hacer un programa para evaluar la expresion dada
				
				// crear objeto scanner
				Scanner entrada = new Scanner(System.in);
				
				// definir variables
				int a, b, c, d, e;
				double resultado;
				
				System.out.println("Dame el primer valor");
				a = entrada.nextInt();
				System.out.println("Dame el segundo valor");
				b = entrada.nextInt();
				System.out.println("Dame el tercer valor");
				c = entrada.nextInt();
				System.out.println("Dame el cuarto valor");
				d = entrada.nextInt();
				System.out.println("Dame el quinto valor");
				e = entrada.nextInt();
				
				resultado = a*(b+c)+c*(d+e);
				
				System.out.println("Resultado: " + resultado);

	}

}
