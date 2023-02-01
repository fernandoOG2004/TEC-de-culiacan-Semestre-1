package unidad5_trabajosfin;
import java.util.*;
public class trabajo_2 {
	
	static double base,altura,resultado;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
	areaTriangulo(base,altura,resultado);
		
	}
	public static double areaTriangulo(double base, double altura, double resultado) {
		
		System.out.print("Ingresa el valor de la base: ");
		base = entrada.nextDouble();
		
		System.out.print("Ingresa el valor de la altura: ");
		altura = entrada.nextDouble();
		
		resultado = (base * altura)/2;
		
		System.out.println("---------------------------");
		System.out.println("El area del triangulo es de: "+resultado);
		
		return resultado;
		}
}
