package unidad3;
import java.util.Scanner;


public class LeerNumero {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 03 de octubre de 2022
		// proposito: leer numero y determinar si es mayor, igual 
		// o menor que cero
				
		// crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		double num;
		System.out.println("proporciona un numero:");
		num = entrada.nextDouble();
		
		if (num < 0)
		{
			System.out.println(num + " es menor que cero");
		}
		if (num > 0)
		{
			System.out.println(num + " es mayor que cero");
		}
		if (num == 0)
		{
			System.out.println(num + " es igual a cero");
		}
		
		

	}

}
