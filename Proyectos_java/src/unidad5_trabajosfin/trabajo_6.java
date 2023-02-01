package unidad5_trabajosfin;
import java.util.*;
public class trabajo_6 {
	
	static final int CENT = -1;
	static int articulos, cuenta = 1, suma;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Ingresa el precio de el primer articulo: ");
		articulos = entrada.nextInt();

		totalArticulos();
		
	}
	public static void totalArticulos() {
				
		while(articulos != CENT) {
			cuenta++;
			suma += articulos;
			System.out.println("Ingresa el precio del articulo "+cuenta+" (-1 para terminar)");
			articulos = entrada.nextInt();
		}
			System.out.println("El total gastado en el viaje fue de: "+suma);	
	}
}