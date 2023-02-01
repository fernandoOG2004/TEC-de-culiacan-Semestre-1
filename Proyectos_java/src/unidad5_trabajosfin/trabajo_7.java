package unidad5_trabajosfin;
import java.util.*;

import unidad3.DemoBucleFOR2;
public class trabajo_7 {
	
	static int nElementos;		
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Ingresa el numero de elementos: ");
		nElementos = entrada.nextInt();
		
		cuadradoNum();
		
	}
	public static void cuadradoNum() {	
		int numeros[] = new int[nElementos];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingresa los valores: ");
			numeros[i] = entrada.nextInt();
		}
		System.out.println("El cubo de los ingresados son: ");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.pow(numeros[i],3);
			System.out.println(numeros[i]);
		}
	}
}
