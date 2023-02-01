package unidad2;

import java.util.Scanner;


public class Promedio {

	public static void main(String[] args) {
		
         //definir variables de salida
		float promedio = 0;
		//definir variable de entrada
		short calf1, calf2, calf3;
		
		//crear el objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//capturar datos
		System.out.println("Calificacion 1:");
		calf1 = entrada.nextShort();
		
		System.out.println("Calificacion 2:");
		calf2 = entrada.nextShort();

		System.out.println("Calificacion 3:");
		calf3 = entrada.nextShort();
		
		promedio = (float)(calf1 + calf2 + calf3) / 3.0f;
		
		System.out.println("promedio: " + promedio);
		




	}

}
