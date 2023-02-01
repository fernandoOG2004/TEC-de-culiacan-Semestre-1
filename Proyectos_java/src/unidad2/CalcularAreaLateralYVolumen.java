package unidad2;
import java.util.Scanner;

public class CalcularAreaLateralYVolumen {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 07 de octubre de 2022
		//proposito: calcular el area lateral y volumen de un
		// cilindro por medio de el radio y la altura
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//proceso
		System.out.println("Dame el radio");
		int radio = entrada.nextInt();
		System.out.println("Dame altura");
		int altura = entrada.nextInt();
		
		double areaLateral = (2 * 3.141592) * (radio * altura);
		double volumen = (3.141592 * (radio^2)) * altura ;
		
		System.out.println("Area lateral: " + areaLateral);
		System.out.println("Voumen: " + volumen);


	}

}
