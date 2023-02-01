package unidad4;

import java.util.Scanner;

public class Inicial2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int NUM = 10;
		int [] nums = new int[NUM];
		int total = 1;
		System.out.println("Por favor, introduzca "+NUM+" datos");
		for (int i = 0; i < NUM; i++) 
		{
			nums[i] = entrada.nextInt();
		}
		System.out.println("\nLista de Numeros:");
		for (int i = 0; i < NUM; i++) 
		{
			System.out.println(" "+nums[i]);
			total = total * nums[i];
		}
		System.out.println("\nEl producto es "+total);
		
	}
	static int producto(int arreglo[]){
		int total = 1;
		for(int i = 0;i < arreglo.length;i++)
		{
			System.out.println(" "+arreglo[i]);
			total *= arreglo[i];
		}
		return total;
	}
	
}
