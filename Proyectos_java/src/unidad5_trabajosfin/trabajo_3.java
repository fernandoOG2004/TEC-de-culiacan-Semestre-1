package unidad5_trabajosfin;
import java.util.*;
public class trabajo_3 {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
	parImpar();
		
	}
	public static void parImpar() {
		
		System.out.print("Ingresa un numero entero: ");
		int numero = entrada.nextInt();
		
		System.out.println("-----------------");
		if(numero == 0) {
			System.out.println("EL numero es igual a cero");
		} else if(numero % 2 == 0) {
			System.out.println(numero+ " es numero par");
		}	else {
			System.out.println(numero+ " es numero impar");
		}
	}
}
