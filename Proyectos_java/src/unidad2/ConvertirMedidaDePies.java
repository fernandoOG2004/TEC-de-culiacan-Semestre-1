package unidad2;
import java.util.Scanner;


public class ConvertirMedidaDePies {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 07 de octubre de 2022
		//proposito: covertir una unidad de pies a yardas, pulgadas,

		//Crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//proceso
		System.out.println("Dame la medida en pies");
		double pies = entrada.nextDouble();
		
		double yardas= pies / 3;
		double pulgadas = pies * 12 ;
		double centimetros = pulgadas * 2.54 ;
		double metros = centimetros / 100 ;
		
		System.out.println("Yardas: " + yardas);
		System.out.println("Pulgadas: " + pulgadas);
		System.out.println("Centimetros: " + centimetros);
		System.out.println("Metro: " + metros);
		

	}

}
