package unidad4;
/*
 * 	Proposito: Lee enteros en un arreglo, multiplica los elementos del arreglo y 
 * 	visualiza el producto 
 */
import java.util.*;
public class inicial {
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

}
