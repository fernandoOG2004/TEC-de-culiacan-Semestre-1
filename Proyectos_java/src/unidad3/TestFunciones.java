package unidad3;

import java.util.Scanner;

public class TestFunciones {

	public static void main(String[] args) {
		 System.out.println("Llamada a la funcion saludar: ");
		 saludar();
		 
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Proporciona un nombre");
		 String nombre = entrada.next();
		 saludar2(nombre);
		 
		 double x;
		 System.out.println("Ingrese un valor nmerico para x; ");
		 x = entrada.nextDouble();
		 
		 System.out.println("Llamada a al funcion CalcularDoble (pasaje por valor)");
		 System.out.println("El doble de " + x + " es " + CalcularDoble(x));
		 System.out.println("El valor original de x es " + x);
		 
		 System.out.println("Ingrese un valor numerico para y");
		 double y = entrada.nextDouble();
		 
		 sumar(x, y);

	}
static void saludar(){
	System.out.println("Hola mundo ");
	System.out.println("Espero que te encuentres bien");
	
}
static void saludar2 (String nom){
	System.out.println("Buenos dias " + nom);
}
static double CalcularDoble(double x){
	return x * 2;
}
static void sumar(double a, double b){
	System.out.println("La suma = " + (a+b));
}
}

