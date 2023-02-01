package unidad4;
/*
 * Prop�sito:Leer 10 n�meros y ordenarlos (burbuja)
 * 18/11/22
 * 
 */
import java.util.Scanner;
public class OrdenarBurbuja {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x[] = new int [3];
		int aux = 0;
		for(int i=0; i<x.length;i++)
		{
			System.out.println("Proporciona elemento "+i+":");
			x[i] = leer.nextInt();
		}
		//Ordenar Burbuja
		System.out.println("Ordenado");
		for(int k=0; k<x.length;k++)
		{
			for(int i=0; i<x.length-1;i++)
			{
				if(x[i]>x[i+1])
				{
					aux = x[i];
					x[i] = x[i+1];
					x[i+1] = aux;
				}
			}
		}
		for(int i=0; i<x.length; i++)
			System.out.println("Elemento "+i+": "+x[i]);
	}

}