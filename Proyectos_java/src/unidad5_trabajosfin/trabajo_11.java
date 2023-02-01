package unidad5_trabajosfin;
import java.util.*;
public class trabajo_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		System.out.println("Ingresa tu nombre: ");
		nombre = entrada.nextLine();
		
		for (int i = nombre.length()-1; i >= 0; i--) {
			System.out.println(nombre.charAt(i));
		}
	}
}
