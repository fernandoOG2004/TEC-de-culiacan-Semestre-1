package unidad4_trabajosfin;
import java.util.*;
public class trabajo8 {
	static int numeros[][],totalDP = 0;
	public static void main(String[] args) {
		
		int[][] numeros = new int[5][5];
		
		for(int j=0;j < 5;j++) {
			for (int i = 0; i < 5; i++) {
			
					numeros[j][i] = (int)(Math.random()*100);
					
			}
		}
		
		imprimir(numeros);
		
		System.out.println("");
		
		sumaDP(numeros);
		
		System.out.println("Total de la Suma de la Diagonal principal: "+totalDP);
		
	}
		public static void imprimir(int[][] numeros) {
			for(int j=0;j < 5;j++) {//Recorre las filas
				for (int i = 0; i < 5; i++) {//Recorre columnas
				
						numeros[j][i] = (int)(Math.random()*100);
						
						System.out.print("[" +numeros[j][i]+ "]");
						
				}
				System.out.println("");
			}
			
	}
		public static void sumaDP (int numeros[][]) {
			System.out.println("Valores de la diagonal Principal:");
			for(int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros[0].length; j++) {
					if(i==j) {
						System.out.println(numeros[i][j]);
						
						totalDP += numeros[i][j];
					}
				}
			}
				
		}
}
