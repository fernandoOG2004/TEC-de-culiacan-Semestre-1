package unidad2;

public class Dulces {

	public static void main(String[] args) {
		
		// Autor: Roberto Valenzuela Arce
		// Fecha: 07 de octubre de 2022
		// proposito: calcular el numero de dulces y el costo de estos
		//en la diesta de eduardo
		
		// Definir variables
		int d, cd, p ;
		int dulcesd, gasto ;
		
		//Proceso 
		p = 7;
		d = 3;
		cd = 13;
		
		dulcesd = p * d;
		gasto = dulcesd * cd;
		
		System.out.println("Resultado: ");
		System.out.println("Dulces consumidos: " + dulcesd);
		System.out.println("Gastos: " + gasto);

	}

}
