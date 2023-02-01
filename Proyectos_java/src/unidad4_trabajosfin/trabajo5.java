package unidad4_trabajosfin;
import java.util.*;
public class trabajo5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int arreglo [][] = new int [2][3];
		
		for(int i=0;i < arreglo.length;i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.println("Ingresa los valores de la matriz ["+i+"]["+j+"]: ");
				arreglo[i][j] = entrada.nextInt();
			}

		}
		
		for(int i=0;i < arreglo.length;i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.print("[" +arreglo[i][j]+ "]");
			}
			System.out.println("");
		}
		
		
	}
}
