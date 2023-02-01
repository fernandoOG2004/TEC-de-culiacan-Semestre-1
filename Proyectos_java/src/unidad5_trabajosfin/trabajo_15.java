package unidad5_trabajosfin;
import java.util.*;

public class trabajo_15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cadena,cadena2;
		
		System.out.println("Ingresa una cadena: ");
		cadena = entrada.nextLine();
		
		System.out.println("Ingresa una parte de la cadena para su posicion: ");
		cadena2 = entrada.nextLine();
		
		int localizar = cadena.indexOf(cadena2);
		
		System.out.println("La subcadena se encuentra en la posicion: "+localizar);
	}
}