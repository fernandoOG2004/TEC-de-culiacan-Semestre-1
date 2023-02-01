package ayudaU4;
import java.util.*;
public class ejemplo_rellenarmatrzCompleta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int filas,columnas;
		
		//Ingreso del numero de filas y columnas
		System.out.print("Ingresa el numero de filas: ");
		filas = entrada.nextInt();
		
		System.out.print("Ingresa el numero de columnas: ");
		columnas = entrada.nextInt();
		
		int matriz[][] = new int [filas][columnas];
		
		//Entrada de los valores de la matriz
		for (int j = 0; j < args.length; j++) {
			for (int i = 0; i < args.length; i++) {
				System.out.print("["+j+"]"+"["+i+"] = ");
					matriz[j][i]=entrada.nextInt();

			}
		}
		
		//Imprimir la matriz
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print("["+j+"]["+i+"] = "+matriz[j][i]+" ");
			}
				System.out.println();

		}
		
		
	}

}
