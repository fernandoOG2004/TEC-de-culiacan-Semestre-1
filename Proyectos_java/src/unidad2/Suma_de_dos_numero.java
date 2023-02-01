package unidad2;
import java.util.Scanner;

public class Suma_de_dos_numero {

	public static void main(String[] args) {
		//Autor:Roberto Valenzuela Arec
		//Fecha: 28 de septimbre del 2022
		//Proposito:calcular la suma de dos numeros
		
		//Defunir variable de salida
		int c;
		//Definir variables de entrada
		int a, b;
		
		
		//Crear objeto scanner
		Scanner Entrada = new Scanner(System.in);
		
		
		//Lectura de datos 
		System.out.println("Dame el valor de a:");
		a = Entrada.nextInt();
						
		System.out.println("Dame el valor de b:");
		b = Entrada.nextInt();
		
		c = a + b;
		
		//Imprimir puntaje final
		System.out.println("Respuesta: " + c);
		

	}

}
