package unidad5_trabajosfin;
import java.util.*;
public class trabajo_17 {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Proporcione la primera cadena: ");
	    String cadena1 = entrada.nextLine();
	    
	    System.out.println("Proporcione la segunda cadena: ");
	    String cadena2 = entrada.nextLine();
	    
	    detecMayor(cadena1, cadena2);
	    System.out.println("\nCadena 1: "+vocMayusculas(cadena1));
	    System.out.println("\nCadena 2: "+consonantesMayus(cadena2));
	    System.out.println("\nLas 2 cadenas concatenadas: "+concat(cadena1, cadena2));
	    System.out.println("\nLa invertida de las 2 cadenas: "+invertir(cadena1, cadena2));


	}
	public static void detecMayor(String cadena1, String cadena2) {
		int diff = cadena1.compareTo(cadena2);
		if(diff > 0) {
			System.out.println("La cadena mayor es: "+cadena1);
		}else if(diff < 0) {
			System.out.println("La cadena mayor es: "+cadena2);
		}else {
			System.out.println("Su valor alfabetico es el mismo");
		}
	}
	public static String vocMayusculas(String cadena1) {
		String vocalMayusculas = " ";
		char vocales [] = {'a','A','e','E','i','I','o','O','u','U'};
		boolean CENT;
		
		for (int i = 0; i < cadena1.length()-1; i++) {
			CENT = false;
			for (int j = 0; j < vocales.length-1; j++) {
				if(cadena1.charAt(i) == vocales[j]) {
					char carMayus = cadena1.charAt(i);
					carMayus = Character.toUpperCase(carMayus);
					vocalMayusculas = vocalMayusculas + carMayus;
					CENT = true;
				}
			}
			if(CENT != true)
				vocalMayusculas = vocalMayusculas + cadena1.charAt(i);
		}
		return vocalMayusculas;
	}
	public static String consonantesMayus(String cadena2) {
		String consonantesMayus = "";
		char consonantes[] = {'a','b','c','d','f','g','h','i','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z',
				'A','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','X','Z','W','Y','Z'};
		boolean CENT;
		
		for (int i = 0; i < cadena2.length(); i++) {
			CENT = false;
			for (int j = 0; j < consonantes.length-1; j++) {
				if(cadena2.charAt(i) == consonantes[j]) {
					char carMayus = cadena2.charAt(i);
					carMayus = Character.toUpperCase(carMayus);
                    consonantesMayus = consonantesMayus + carMayus;
                    CENT = true;
				}
			}
			if(CENT != true)
				consonantesMayus = consonantesMayus + cadena2.charAt(i);
		}
		return consonantesMayus;
	}
	public static String concat(String cadena1, String cadena2) {
		String cadenaConcat = vocMayusculas(cadena1)+""+consonantesMayus(cadena2);
		
		return cadenaConcat;
	}
	public static String invertir(String cadena1, String cadena2) {
		String cadenaInver = "";
		
		for (int i = concat(cadena1, cadena2).length()-1; i >= 0; i--) {
			cadenaInver = cadenaInver + concat(cadena1, cadena2).charAt(i);
		}
		return cadenaInver;
	}
}
