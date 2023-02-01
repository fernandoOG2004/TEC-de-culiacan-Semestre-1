package unidad5_trabajosfin;
import java.util.*;
public class trabajo_5 {
	
	static int num;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
			
		System.out.println("Ingresa el valor del numero: ");
		num = entrada.nextInt();
		
		valorNum();
		
	}
	public static void valorNum() {
		double resultado = 0;
		
		if(num == 1 || num == 2) {
			resultado = 100*num;
		}else if(num == 3) {
			resultado = 100/num;
		}else if(num == 0) {
			resultado = 0;
		}
		System.out.println("El resultado es de: "+resultado);
	}
}
