package unidad4_trabajosfin;
import java.util.*;
public class trabajo_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int matriz[][] = {{4,7,-5,4,9},{0,3,-2,6,-2},{1,2,4,1,1},{6,1,0,2,-4}};
		int j,i,sum = 0;
		
		for (j = 0; j < 5; j++) {
			for (i = 0; i < 4; i++) {
				if(i != j)
					sum += matriz[i][j];
			}
		}
		System.out.println("La suma de los numeros a excepcion de la diagonal principal es de: "+sum);
		
	}

}
