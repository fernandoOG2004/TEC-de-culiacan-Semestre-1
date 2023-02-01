package unidad3;

public class Parciales {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 06 de octubre de 2022
		// proposito: hacer un programa para evaluar la expresion dada
		
		// Definir variables de entrada
		int a,b,c,d,e;
		// Definir variable de salida
		int parcial;
		
		a = 3;
		b = 2;
		c = 1;
		d = 8;
		e = 4;
		
		parcial = (a+b+c+d+e) % 5;
		
		System.out.println("Resultado: " + parcial);

	}

}
