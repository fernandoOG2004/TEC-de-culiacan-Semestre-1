package unidad5_trabajosfin;
import java.util.*;
public class trabajo_16 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		
        System.out.print("Ingresa una frase para invertir su orden: ");
        String cadena=entrada.nextLine();
        
        String fraseInvertida = "";
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			if(cadena.substring(i,i+1).equals(" ")) {
				for (int j = i + 1; j < cadena.length(); j++) {
					fraseInvertida += cadena.charAt(j);
				}
				cadena = cadena.replace(cadena.substring(i,cadena.length()),"");
				fraseInvertida += "";
			}else if(i == 0) {
				for (int j = 0; j < cadena.length(); j++) {
					fraseInvertida += cadena.charAt(j); 
				}
				cadena = cadena.replace(cadena.substring(i,cadena.length()),"");
			}
		}
		System.out.println(fraseInvertida);
        
	}
}
