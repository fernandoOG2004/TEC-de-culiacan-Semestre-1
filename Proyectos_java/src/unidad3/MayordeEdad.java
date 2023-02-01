package unidad3;
import java.util.Scanner;

public class MayordeEdad {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 28 de septiembre de 2022
		//proposito: calcular promedio por medio de 3 notas
		//v2 agg el else 
				
		//Crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Proporciona Edad: ");
		int edad = entrada.nextInt();
		
		if (edad >= 18)
		{
		System.out.println("Mayor de edad");
		System.out.println("Felicidades ya puedes obtener tu INE");
		}
		else
		{
			System.out.println("Espera un poco");
		}
		
		System.out.println("Usted tiene " + edad + " años");

	}

}
