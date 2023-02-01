package unidad2;
import java.util.Scanner;

public class Calcular_puntaje_de_partidos {

	public static void main(String[] args) {
		//Autor:Roberto Valenzuela Arce
		//Fecha:28 de septiembre del 2022
		//Proposito: Calcular puntaje a partir de partidos ganados,
		//perdidos y empatados
		
		//Definir variable de salida
		int puntaje;
		//Definir varaible de entrada
		int partidosGanados, partidosPerdidos, partidosEmpatados;
		
		
		//Crear objeto scanner
		Scanner Entrada = new Scanner(System.in);
				
		//Lectura de datos 
		System.out.println("Dame numero de partdos ganados:");
		partidosGanados = Entrada.nextInt();
		
		System.out.println("Dame numero de partidos perdidos:");
		partidosPerdidos = Entrada.nextInt();
		
		System.out.println("Dame numero de partidos empatados:");
		partidosEmpatados  = Entrada.nextInt();
		
		puntaje = partidosGanados * 3 +partidosEmpatados;
			
		//Imprimir puntaje final
		System.out.println("puntaje = " + puntaje);
		

	}

}
