package unidad4_trabajosfin;
import java.util.*;
public class trabajo6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
				
		int f,c;
		
	System.out.print("Ingresa el numero de filas: ");
		f = entrada.nextInt();
		
	System.out.print("Dame el numero de columnas de la matriz: ");
		c = entrada.nextInt();
		
		int [][] array= new int [f][c];
			for(int j = 0;j<f;j++){
				for(int i=0; i<c;i++){
					array[j][i]=(j*c)+1+i;
		}
	}
		for(int j = 0;j<f;j++){
			for(int i=0; i<c;i++){
				System.out.print("["+j+"]["+i+"] = "+array[j][i]+" ");
			}
				System.out.println();
		}
	}
}
