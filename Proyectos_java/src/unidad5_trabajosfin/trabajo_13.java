package unidad5_trabajosfin;
import java.util.*;
public class trabajo_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		System.out.print("Ingresa una cadena: ");
		cadena = entrada.nextLine();
		
		cadena = cadena.replace('A','-');
		cadena = cadena.replace('a','-');
		cadena = cadena.replace('E','-');
		cadena = cadena.replace('e','-');
		cadena = cadena.replace('I','-');
		cadena = cadena.replace('i','-');
		cadena = cadena.replace('O','-');
		cadena = cadena.replace('o','-');
		cadena = cadena.replace('U','-');
		cadena = cadena.replace('u','-');

		System.out.println("\n"+cadena);
		
	}
}
