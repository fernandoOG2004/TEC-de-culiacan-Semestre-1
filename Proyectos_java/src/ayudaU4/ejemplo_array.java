package ayudaU4;
import java.util.*;
public class ejemplo_array {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nElementos;
		
		System.out.print("Ingresa el numero de elementos del arreglo: ");
		nElementos = entrada.nextInt();
		
		int array[] = new int[nElementos];	
		
		for (int i = 0; i < nElementos; i++) {
			System.out.print("["+i+"]: ");
				array[i] = entrada.nextInt();
		}
		
		
			
			for (int i = 0; i < nElementos; i++) {
				System.out.print("["+i+"]");
			}
	}

}
