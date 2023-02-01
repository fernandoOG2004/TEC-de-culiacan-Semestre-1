package trabajosAsesorias;
import java.util.*;
public class numero_primo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a = 0,numero;
		
		System.out.print("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				a++;
				
			}
			
		}
		if(a != 2) {
			System.out.println("No es primo");
		}else {
			System.out.println("Si es primo");
			
		}
	}
}
