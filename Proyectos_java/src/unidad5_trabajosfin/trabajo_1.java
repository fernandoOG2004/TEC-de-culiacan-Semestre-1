package unidad5_trabajosfin;
import java.util.*;
public class trabajo_1 {
	
	static double a,b;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		sumar(a,b);
		
	}
	 public static void sumar(double a, double b) {
		 
		 System.out.print("Ingresa el primer Valor: ");
		 a = entrada.nextDouble();
		 
		 System.out.print("Ingresa el segundo Valor: ");
		 b = entrada.nextDouble();
		 
		 double resultado = a + b;
		 
		 System.out.println("-------------");
		 System.out.println("La suma de los Valores es de: "+resultado);
	 }
}
