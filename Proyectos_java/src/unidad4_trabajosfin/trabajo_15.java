package unidad4_trabajosfin;
import java.util.*;
public class trabajo_15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int fil,col;
		
		System.out.print("Ingresa le numero de filas: ");
		fil = entrada.nextInt();
		
		System.out.print("Ingresa el numero de columnas: ");
		col = entrada.nextInt();
		
		int matriz [][] = new int [fil][col];
		
		for(int j=0;j<fil;j++){
			for(int i = 0;i<col;i++){
				System.out.print("["+j+"]["+i+"]= ");
					matriz[j][i]=entrada.nextInt();
				}
			}
		
		System.out.println("\nMatriz original");
		for(int j=0; j<fil;j++){
			for(int i=0;i<col;i++){
				System.out.print("["+matriz[j][i]+"]");
			}
				System.out.println();
		}
	
		for(int i=0;i<col;i++){
			int aux = matriz[matriz.length-1][i];
				matriz[matriz.length-1][i]=matriz[matriz.length-2][i];
				matriz[matriz.length-2][i]=aux;
		}
		
		System.out.println("\nMatriz cambiada");
			for(int j=0; j<matriz.length;j++){
				for(int i = 0;i<matriz[j].length;i++){
					System.out.print("["+matriz[j][i]+"]");
		}
					System.out.println();
		}
	}
}
