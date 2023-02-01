package unidad3;

import java.util.Scanner;

public class PruebaCompuestaSwitch {
	public static void main(String[] args) { 

		Scanner teclado = new Scanner(System.in); 

		int nota; 

		 

		System.out.print 

		("Introduzca una calificación (1-10), pulse Intro:"); 

		nota = teclado.nextInt(); 

		switch (nota) 

		{ 

		case 10: 

		case 9: System.out.println("Excelente"); 

		break; 

		case 8: 

		case 7: System.out.println("Notable"); 

		case 6: 

		break; 

		case 5: System.out.println("Aprobado"); 

		case 4: 

		case 3:  

		case 2: 

		case 1:  

		case 0: System.out.println("Suspendido"); 

		break; 

		default: System.out.println("No es posible " 

		+ "esta nota"); 

		 

		} 

		System.out.println("Final de programa"); 

		  

		} 

		  

		}

