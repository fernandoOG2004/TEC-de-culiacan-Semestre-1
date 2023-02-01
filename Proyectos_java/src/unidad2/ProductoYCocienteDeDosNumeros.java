package unidad2;
import java.util.Scanner;

public class ProductoYCocienteDeDosNumeros {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 07 de octubre de 2022
		//proposito: calcular el producto y cociente (con residuo) 
		// de dos numero enteros con 3 digitos
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//proceso
		
		System.out.println("Dame el valor 1");
		int valor1 = entrada.nextInt();
		System.out.println("Dame el valor 2");
		int valor2 = entrada.nextInt();
		
		int producto = valor1 * valor2 ;
		int cociente = valor1 / valor2 ;
		int residuo = valor1 % valor2 ;
		
		System.out.println("Producto: " + producto);
		System.out.println("Cociente: " + cociente);
		System.out.println("Residuo: " + residuo);


	}

}
