import java.util.*;

public class wearandom {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nHoras,Salario = 0;
		
		System.out.print("Ingresa el numero de horas trabajadas: ");
		nHoras = entrada.nextDouble();
		
		if(nHoras <= 40) {
			Salario = nHoras * 16;
		}else {
			Salario = (40 * 16) + ((nHoras - 40) * 20);
		}
		
		
		
		
		System.out.println("El salario del obrero sera de = "+Salario);
	}

}
