package unidad4;

import java.util.Scanner;

public class DemoArreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * int calif1,calif2,calif3,calif4,calif5;
		 * double promedio;
		 * System.out.println("Introduce el valor de 5 calificaciones");
		 * calif1 = entrada.nextInt();
		 * calif2 = entrada.nextInt();
		 * calif3 = entrada.nextInt();
		 * calif4 = entrada.nextInt();
		 * calif5 = entrada.nextInt();
		 * promedio = (calif1+calif2+calif3+calif4+calif5)/5;
		 * System.out.println(promedio);
		 */
		//version iterativa
		/*double promedio = 0;
		int calf;
		System.out.println("Introduce el valor de 5 calificaciones: ");
		for(int i=1; i<=5; i++)
		{
			calf = entrada.nextInt();
			promedio += calf;
		}
		promedio = promedio/5;
		System.out.println(promedio);*/
		
		//version utilizando arreglos
		int calificacion[] = new int[5];//crea un arreglo de tama�o 5
		/*
		calificacion[0] = 9;
		calificacion[1] = 10;
		calificacion[2] = 7;
		calificacion[3] = 8;
		calificacion[4] = 5;
		*/
		double promedio = 0;
		final int n = 3;
		for(int i=0; i<n; i++)
		{
			System.out.println("Introduce calificaciones: ");
			calificacion[i] = entrada.nextInt();
			promedio = promedio + calificacion[i];
		}
		
		System.out.println("Promedio = "+promedio(calificacion,n));
		System.out.println("Calificaciones en Orden de captura");
		for(int i = 0; i<n; i++)
		{
			System.out.println(calificacion[i]);
		}
		//Invocar al m�todo ordenar
		ordenar(calificacion,n);
		System.out.println("Calificaciones en Orden Descendente:");
		for(int i=0;i<n;i++)
			System.out.println(calificacion[i]);
		
	}
	static void ordenar(int calificacion[], int n)
	{
		//Ordenar el arreglo por el m�todo de la burbuja
		for(int j=0;j<n;j++){
			for(int i=0;i<n-1;i++){
				if(calificacion[i+1]>calificacion[i])
				{
					int aux = calificacion[i+1];
					calificacion[i+1] = calificacion[i];
					calificacion[i] = aux;
				}
			}
		}
	}
	static double promedio(int calificacion[],int n)
	{
		double acumulador = 0;
		for(int i=0; i<n; i++)
		{
			acumulador = acumulador+calificacion[i];
		}
		return acumulador/n;
	}
}