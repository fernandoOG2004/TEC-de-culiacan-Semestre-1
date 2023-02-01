package unidad5_trabajosfin;
import java.util.*;
public class trabajo_4 {
	
	static double X1,Y1,X2,Y2,distancia;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
	calcularDistancia();
		
	}
	private static void calcularDistancia() {
		System.out.println("Ingresa las coordenadas del primer punto: ");
		X1 = entrada.nextDouble();
		Y1 = entrada.nextDouble();
		
		System.out.print("Ingresa las coordenadas del segundo punto: ");
		X2 = entrada.nextDouble();
		Y2 = entrada.nextDouble();
		
		distancia = Math.round((int) Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2)));
		
		System.out.println("---------------------");
		System.out.println("La distancia de las puntos: "+X1+","+Y1+" y "+X2+","+Y2+" es de: "+distancia);
		
	}
}
	

