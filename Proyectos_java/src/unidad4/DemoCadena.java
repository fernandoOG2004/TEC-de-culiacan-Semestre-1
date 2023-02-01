package unidad4;
import java.util.*;
public class DemoCadena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String mipueblo = "Cuiacan";
		String respuesta = "S";
		String vacioa = "";
		String blanco = " ";
		System.out.println(mipueblo);
		
		System.out.println("Introduce tu nombre y apellido: ");
		String nombreApe = entrada.nextLine();
		System.out.println("Buenos dias "+nombreApe);
		
		System.out.println("");
		String ciudades[] = {"ahome","el fuerte","choix"};
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println(ciudades[i]);
		}
		
	}

}
