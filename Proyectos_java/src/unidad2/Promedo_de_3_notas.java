package unidad2;
import java.util.Scanner;


public class Promedo_de_3_notas {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 28 de septiembre de 2022
		//proposito: calcular promedio por medio de 3 notas
		
		//Definir variable de salida
		float promedio;
		//Definir variables de entrada
		float calf1, calf2, calf3;
		
		//Crear objeto scanner
		Scanner Entrada = new Scanner(System.in);
		
		//Lectura de datos 
		System.out.println("Dame calificacion1:");
		calf1 = Entrada.nextInt();
						
		System.out.println("Dame calificacion2:");
		calf2 = Entrada.nextInt();
						
		System.out.println("Dame calificacion3:");
		calf3  = Entrada.nextInt();
		
		
		promedio = (calf1 + calf2 + calf3) / 3 ;
		
		//Imprimir puntaje final
		System.out.println("Promedio: " + promedio);
		
		

	}

}
