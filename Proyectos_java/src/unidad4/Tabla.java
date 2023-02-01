package unidad4;
/*
 * Proposito: programa que entrada y una posterior
 * 		visualizacion de un arreglo bidimensional
 */
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Tabla {

	public static void main(String[] args) {
		int v[][] = new int [3][5];
		
		leer(v);
		vizualizar(v);
	
	}
	static void leer(int a[][])
	{
		int i,j;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entrada de datos de la matriz");
		for(i=0;i<3;i++)
		{
			System.out.println("Fila: "+i);
			for(j=0;j<5;j++)
			{
				a[i][j] = entrada.nextInt();
			}
		}
	}
	static void vizualizar(int a[][]){
		int i,j;
		System.out.println("\nMatriz leida\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<5;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
