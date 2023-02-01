package unidad3;

import java.util.Scanner;

public class MenuOpciones {

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
				// Fecha: 13 de octubre del 2022
				// Proposito: hacer un menu de claculadora
				
				//Crar objeto scanner
				Scanner entrada = new Scanner (System.in);
				
				
				// Definir variables
				int OP;
				System.out.println("Menu de recomendaciones");
				System.out.println("   1. Literatura ");
				System.out.println("   2. Cine ");
				System.out.println("   3. Musica ");
				System.out.println("   4. Videojuegos ");
				System.out.println("   5. Salir ");
				//ingresar opcion
				System.out.println("Elija una opcion (1-5)");
				OP = entrada.nextInt();
				//procesar opcion
				switch (OP){
				case 1: System.out.println("Leer recomendaciones:");
				System.out.println(" + Esperandolo a Tito y otros cuentos de futbol (Eduardo scheri)");
				System.out.println(" + El juego de Ender (Drson Scott Card)");
				System.out.println(" + El sueñon de los heroes (Adolfo Bioy Casares)");
				break;
				case 2: System.out.println("Peliculas recomendables: ");
				System.out.println(" + Matrix (1999)");
				System.out.println(" + El ultimo samurai (2003)");
				System.out.println(" + Cars (2006)");
				break;
				case 3: System.out.println("Discos recomendables: ");
				System.out.println(" + Despedazado por mil partes ");
				System.out.println(" + Bufalo ( La Mississippi, 2008)");
				System.out.println(" + Gaia (Mago de Oz, 2003)");
				break;
				case 4: System.out.println(" Videojuegos clasicos recomendables: ");
				System.out.println(" + Dia del tentaculo (LucasArts, 1993) ");
				System.out.println(" + Terminal velocity (Terminal Reality/3D Realms, 1995");
				System.out.println(" + Death rally (Remedy/Apogge, 1996");
				break;
				case 5: System.out.println("Gracias, vuelva pronto");
				break;
				default:
				System.out.println("Opcion no valida");
				
				}
				
				
	

	}

}
