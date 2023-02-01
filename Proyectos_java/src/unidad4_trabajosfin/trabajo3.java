package unidad4_trabajosfin;
import java.util.*;
public class trabajo3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int [] Valores;
		int nElementos = 0;
		int Aux;
		
		System.out.print("Ingresa el numero de elementos: ");
		nElementos = entrada.nextInt();
		
		Valores = new int[nElementos];
			
		for (int i = 0; i < nElementos; i++) {
			System.out.print((i + 1)+". Digite un numero: ");
			Valores[i] = entrada.nextInt();
		}
		for (int i = 0; i < (nElementos - 1); i++) {
			for(int j = 0;j<(nElementos - 1);j++) {
				if(Valores[j] > Valores[j + 1]) { 
					Aux = Valores[j];
					Valores[j] = Valores[j + 1];
					Valores[j + 1] = Aux;
				}
			}
		}
		
		System.out.println("\nArreglo ordenado en forma creciente");
		for (int i = 0; i < nElementos; i++) {
			System.out.println(Valores[i]+" - ");
		}
		
		System.out.println("");
		
	}	
}