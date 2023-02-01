package unidad4_trabajosfin;
import java.util.*;
public class trabajo7 {
static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int matriz [][] = new int [3][5];
		
		System.out.print("Ingresa los valores de la Matriz: ");
		for(int j=0;j<3;j++){
			for(int i=0;i<5;i++){
					System.out.print("["+j+"]"+"["+i+"] = ");
					matriz[j][i]=entrada.nextInt();
			}
		}	
		
		for(int j=0;j<3;j++){
			for(int i=0;i<5;i++){
			System.out.print("["+j+"]"+"["+i+"] = "+matriz[j][i]+" ");
			}
				System.out.println();
		}		
	}	
}
