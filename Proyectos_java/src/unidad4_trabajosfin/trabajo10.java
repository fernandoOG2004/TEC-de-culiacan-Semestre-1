package unidad4_trabajosfin;
import java.util.*;
public class trabajo10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char car[] = new char [10];
		
	
		for(int i=0;i<car.length;i++) {
			System.out.print("Ingresa 10 caracteres: ");
				car[i]= entrada.next().charAt(0);
			}
		
		System.out.println("");
		System.out.println("Caracteres almacenados: ");
			for(int i=0;i<car.length;i++) {
					System.out.println("["+i+"] = "+car[i]);
			}
					
	}			
}