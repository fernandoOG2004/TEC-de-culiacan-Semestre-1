package unidad4;
import java.util.*;
public class leerArreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x[] = new int[10];
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Introduce el valor de "+i+": ");
			x[i] = entrada.nextInt();
		}
		
		

	}
}
