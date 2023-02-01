package unidad3;
import java.util.Scanner;


public class CalificacionAprovatoria {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 03 de octubre de 2022
		// proposito: leer una nota y si es mayor igual a 70 
		// imprimir "aprovatoria"
		//v2, con el else es un sino, si es falso se ira al else
						
		// crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("proporciona calificacion (0-100):");
		byte calf = entrada.nextByte();
		
		if (calf >= 70)
		{	
			System.out.println("Calificacion aprovatoria");
		}
		//v2
		else
		{
			System.out.println("Calificacion reprovatoria");
		}
		

	}

}
