package unidad4;
import java.util.*;
public class tablaVotaciones {

	static int i = 0,j = 0;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int tabla[][] = new int[6][4];
		
		capturarTabla(tabla);
		imprimirTabla(tabla);
		totalCandidato(tabla);
		
		
		
		
		
		
		
			
	}
	public static void totalCandidato(int tabla[][]){
		
		int totalC,totalGlobal;
		totalGlobal = 0;
		for (i = 1; i < tabla[1].length; i++) 
		{
			totalC = 0;
			for (j = 0; j < tabla.length; j++) 
			{
				totalC += tabla[j][i];
				totalGlobal += tabla[j][i];
			}
			System.out.println("Candidato "+i+" ="+totalC);
			tabla[j-1][i] = totalC;
		}
		System.out.println("Votos totales = "+totalGlobal);
		for (int columna = 1; columna < tabla[5].length; columna++) 
		{
			System.out.println("Votos del candidato "+columna+" "+(double)(tabla[5][columna]/totalGlobal*100));
		}
		
	}
	public static void capturarTabla(int tabla[][]) {
		
		int votos;
		/*
		 * tabla[0][0]=1;
		 * tabla[1][0]=2;
		 * tabla[2][0]=3;
		 * tabla[3][0]=4;
		 * tabla[4][0]=5;
		 */
		for (i = 0; i < 5; i++) 
		{
			tabla[i][0] = i+1;
		}
		for (i = 0; i < tabla.length-1; i++) 
		{
			System.out.println("Ingresa los votos del distrito "+tabla[i][0]);
			for (j = 1; j < tabla[i].length; j++) 
			{
				do {
					System.out.print("Proporciona votos del candidato "+j+": ");
					votos = entrada.nextInt();
				}while(votos<0);
					tabla[i][j] = votos;
				
			}
		}	
	}
	public static void imprimirTabla(int tabla[][]) 
	{	
		System.out.println("----------------------------------------------------");
		System.out.println("DISTRITO    CANDIDATO A   CANDIDATO B  CANDIDATO C");
		for (i = 0; i < tabla.length; i++) 
		{
			System.out.print("* "+tabla[i][0]+"             ");
			for (j = 1; j < tabla[i].length; j++) 
			{
				System.out.print(tabla[i][j]+"              ");
			}
			System.out.println("");
			System.out.println("----------------------------------------------------");
		}
	}
}
