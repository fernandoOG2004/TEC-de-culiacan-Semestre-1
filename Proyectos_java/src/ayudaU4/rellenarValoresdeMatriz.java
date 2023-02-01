package ayudaU4;
import java.util.*;
public class rellenarValoresdeMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Filas y columnas ya definidas desde un principio
		int matriz[][] = new int [4][4];
		
		//Entrada de los valores de la matriz
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print("["+j+"]"+"["+i+"]= ");
					matriz[j][i] = entrada.nextInt();
			}
		}
		
		System.out.println("");
		//Print para mostar la matriz
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print("["+j+"]["+i+"]= "+matriz[j][i]+" ");
			}
				System.out.println();

		}
	}

}
