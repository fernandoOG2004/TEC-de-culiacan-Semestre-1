package unidad3;

import java.util.Scanner;

public class MenuCalculadoraBucle {
	static int valor1, valor2;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// Autor: Roberto Valenzulea Arce
				// Fecha: 10 de noviembre del 2022
				// Proposito: hacer un menu de claculadora
		
		//crear objeto scanner
		
		InvocarCalculadora calculadora = new InvocarCalculadora();
		
		double resultado;
		int opc;
		
		do{
		  System.out.println("Menu de opciones:");
		  System.out.println("   1. Sumar ");
		  System.out.println("   2. Restar ");
		  System.out.println("   3. Multiplicar ");
		  System.out.println("   5. Salir ");
		  System.out.println("Selccione opcion deseada (1-4)");
		  opc = entrada.nextInt();
		
		  switch (opc) {
		  case 1: //invocar suma
			  capturar ();
			  
			  resultado = calculadora.sumar(valor1, valor2);
			  System.out.println("resultado" + resultado);
			  break;
		  case 2: // invocar restar
			  capturar ();
			  
			  resultado = calculadora.restar(valor1, valor2);
			  System.out.println("resultado" + resultado);
			  break;
		  case 3: // invocar multiplicar 
			  System.out.println("Dame valor 1");
			  valor1= entrada.nextInt();
			  System.out.println("Dame valor 2");
			  valor2= entrada.nextInt();
			  
			  resultado = calculadora.multiplicar(valor1, valor2);
			  System.out.println("resultado" + resultado);
			  break;
		  case 4: // invocar salir
			  break;
			 default:
				 System.out.println("Opcion incorrecra, intente de nuevo");
		}
		}while (opc != 4);
		System.out.println("Programa finalizado");

	}
	static void capturar (){
		System.out.println("Dame valor 1");
		  valor1= entrada.nextInt();
		  System.out.println("Dame valor 2");
		  valor2= entrada.nextInt();
	}

}
