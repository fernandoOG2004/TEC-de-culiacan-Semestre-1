package unidad2;

import java.util.Scanner;

public class CalcularHipotenusaYAngulos {

	public static void main(String[] args) {
		//Autor: Roberto Valenzuela Arce
		//Fecha: 07 de octubre de 2022
		//proposito: calcular el area lateral y volumen de un
		// cilindro por medio de el radio y la altura
				
		//crear objeto scanner
	    Scanner entrada = new Scanner(System.in);
	    
	    //proceso
	    System.out.println("Dame el primer cateto");
	    double cateto1 = entrada.nextDouble();
	    System.out.println("Dame el segundo cateto");
	    double cateto2 = entrada.nextDouble();
	    
	    double hipotenusa = Math.sqrt(( Math.pow(2, cateto1)) + (Math.pow(2, cateto2)));
	    double anguloAgudo1 = Math.atan(cateto1 / cateto2);
	    double anguloAgudo2 = Math.atan(cateto2 / cateto1);
	
	    System.out.println("Hipotenusa: " + hipotenusa);
	    System.out.println("Primer angulo agudo: " + anguloAgudo1);
	    System.out.println("Segundo angulo agudo: " + anguloAgudo2);

	}

}
