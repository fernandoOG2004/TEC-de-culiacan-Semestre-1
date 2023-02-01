package unidad5_trabajosfin;
import java.util.*;
public class trabajo_12 {
	
	static String cadena;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una palbra/frase: ");
		cadena = entrada.nextLine();
		cadena = cadena.toLowerCase();
		
		Palindromo(cadena);
		
		if(Palindromo(cadena)) {
				System.out.println("Es palindromo");
			}else {
				System.out.println("No es palindromo");
			}
		}
					
	public static boolean Palindromo(String cadena) {
		for (int i = 0, j = cadena.length()-1; i < j; ++i, j--) {
			if(cadena.charAt(i) != cadena.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
