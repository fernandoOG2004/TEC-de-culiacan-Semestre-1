package unidad4;
/*
 * Prop�sito:Leer 10 n�meros y ordenarlos (burbuja)
 * 18/11/22
 * 
 */
import java.util.Scanner;

public class OrdenarBurbuja2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x[] = new int [3];
		for(int i=0; i<x.length;i++)
		{
			System.out.println("Proporciona elemento "+i+":");
			x[i] = leer.nextInt();
		}
		//invocar al m�todo ordenar
		ordenar(x);
		
		//Imprime al arreglo ordenado
		for(int i=0; i<x.length; i++)
			System.out.println("Elemento "+i+": "+x[i]);
	}
	static void ordenar(int arreglo[]){
		//Ordenar Burbuja
		System.out.println("Ordenado");
		for(int k=0; k<arreglo.length;k++)
		{
			for(int i=0; i<arreglo.length-1;i++)
			{
				if(arreglo[i]>arreglo[i+1])
				{
					int aux = 0;
					aux = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = aux;
				}
			}
		}
	}

}