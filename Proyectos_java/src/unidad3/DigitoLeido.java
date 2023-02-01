package unidad3;

import java.util.Scanner;

public class DigitoLeido {

	public static void main(String[] args) {
		//BUCLES CONTROLADOS POR INDICADORES O BANDERA
		
		Scanner entrada = new Scanner(System.in);
		
		boolean digito_leido = false;
		while (!digito_leido)
		{
			System.out.println("Introduzca un caracter");
			char car = entrada.next().charAt(0);
			digito_leido = (('0' <= car)&&((car<='9')));
		}//Fin bucle

	}

}
