package unidad3;

import java.util.Scanner;

public class IdentificarTriangulo {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 10 de octubre de 2022
		// proposito: identificar tipo de triangulo 
		//(isoceles, ecaleno y equilatero), dependiendo de sus lados
		
	    // crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//Definir variable de salida
		String tipoTriangulo; 
		//Definir variables de entrada
		int lado1, lado2, lado3 ;
		
		//proceso
		System.out.println("Proporciona lado 1");
		lado1 = entrada.nextInt();
		System.out.println("Proporciona lado 2");
		lado2 = entrada.nextInt();
		System.out.println("Proporciona lado 3");
		lado3 = entrada.nextInt();
		
		if (lado1 != lado2 & lado2 != lado3 & lado3 !=lado1 )
			tipoTriangulo = "Escaleno";
		else
		{
			if (lado1 == lado2 & lado2 == lado3)
				tipoTriangulo = "Equilatero";
			else 
			{
			tipoTriangulo = "isoceles";	
			}
		}
			
		System.out.println("Tipo de Triangulo: " + tipoTriangulo);

	}

}
