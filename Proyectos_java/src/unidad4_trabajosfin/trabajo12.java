package unidad4_trabajosfin;
import java.util.*;
/*
 * j = filas
 * i + coluimnas
 */

public class trabajo12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int j,i;
		int matriz1[][] = {{4,7,1,3,5},{2,0,6,9,7},{3,1,2,6,4}};
		int matriz2[][] = new int[5][3];
		
		for(j=0;j<5;j++){
			for(i=0;i<3;i++){
				
				matriz2[j][i]=matriz1[i][j];
			}
		}
			
		for(j=0;j<5;j++){
			for(i=0;i<3;i++){
				
			System.out.print("["+matriz2[j][i]+"]");
			}
			
				System.out.println();
		}
	}
}