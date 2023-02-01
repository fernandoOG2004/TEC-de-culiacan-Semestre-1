package trabajosAsesorias;
import java.util.*;
public class raizcuadradaOfactorial {
	static double Aguila = 0, Sello =0;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int Moneda;
		
		Moneda = (int) (Math.random() * 2 + 1);

		if(Moneda == 1) {
			System.out.println("Callo Sello");
			ingresarNumSello();
			System.out.println("El Factorial de " + Sello + " es: "+factorial(Sello));
		}else {
			System.out.println("Callo Aguila");
			ingresarNumAguila();
			System.out.println("La raiz cuadrada del numero es de: "+raiz(Aguila));
		}
		
		
		
	}
	public static double factorial(double numero) {
		double aux = 1;
		for(double i = 2;i < numero;i++) {
			aux *= i;
		}
		return aux;
	}
	static void ingresarNumSello() {
		System.out.print("Ingresa un numero para saber su factorial: ");
		Sello = entrada.nextInt();
	}
	public static double raiz(double Aguila) {
		return Math.sqrt(Aguila);
		
	}static void ingresarNumAguila() {
		System.out.print("Ingresa un numero para saber su raiz cuadrada: ");
		Aguila = entrada.nextInt();
	}
	
}