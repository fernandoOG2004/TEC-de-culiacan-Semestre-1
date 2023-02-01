package unidad3;
import java.util.Scanner;

public class Calcular_expresion {

	public static void main(String[] args) {
		
		// Autor: Roberto Valenzuela Arce
		// Fecha: 07 de octubre de 2022
		// proposito: Calcular la expresion mediante a y b
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		// Definir variables
		double a, b ;
		double c ;
		
		//Proceso 
		System.out.println("Dame a");
		a = entrada.nextDouble();
		System.out.println("Dame b");
		b = entrada.nextDouble();
		
		c = ((a+b)*(a+b))/(3*b)  ;
		
		System.out.println("Resultado : " + c);
	
	}

}
