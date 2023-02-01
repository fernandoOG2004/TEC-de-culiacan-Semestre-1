package unidad3;
import java.util.Scanner;
/*
 * Proposito: Es una aplicacion que mediante un bucle indefinido
 * su ejecucion termina al teclear un valor equivalente a CLAVE
 */



public class CapturaBucleFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int CLAVE = -999;
		
		for(;;)
		{
			System.out.println("Introduzca un numero " + CLAVE + 
					" para terminar");
			int num = entrada.nextInt();
			if (num == CLAVE)
				break;
		}
		System.out.println("Sali del ciclo FOR");
	

	}

}
