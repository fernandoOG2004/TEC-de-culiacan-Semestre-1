package unidad4_trabajosfin;
import java.util.*;
public class trabajo9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] nombre = new String[5];
		String[] apellido = new String[10];
		
		System.out.print("Ingresa tus nombres: ");
		nombre[1] = entrada.nextLine();
		
		System.out.print("Ingresa tus apellidos: ");
		apellido[1] = entrada.nextLine();
		
		System.out.println("");
		System.out.println("Tu nombre es: "+nombre[1]+" "+apellido[1]);
	}

}
