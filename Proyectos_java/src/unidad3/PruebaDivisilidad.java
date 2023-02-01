package unidad3;
import java.util.Scanner;

public class PruebaDivisilidad {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 03 de octubre de 2022
		// proposito: leer numeros y determinar si son divisible 
		
		// crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		short a, b;
		
		System.out.println("proporciona primer numero:");
		a = entrada.nextShort();
		System.out.println("proporciona segundo numero:");
		b = entrada.nextShort();
		
		if (a%b == 0)
		{
			System.out.println(a + " Y " + b + " son divisibles");
		}

	}

}
