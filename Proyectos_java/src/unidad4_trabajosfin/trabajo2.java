package unidad4_trabajosfin;
import java.util.*;
public class trabajo2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int Resultado = 0;
		int [] Valores = {3,6,9,12,15,18,21,24,27,30};

		for (int i = 0; i < Valores.length; i++) {
			
			Resultado += Valores[i];
		}
		
		System.out.println("La suma de los Valores es de: "+Resultado);
		
		
	}
}