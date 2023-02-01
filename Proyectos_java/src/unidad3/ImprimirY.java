package unidad3;
import java.util.Scanner;


public class ImprimirY {

	public static void main(String[] args) {
		//Prposito: imprimir valor de y mientras que la x
		//sea mayor que 0
		
		Scanner entrada = new Scanner(System.in);
		int y1 = 5;
		int x;
		
		System.out.println("Valor de x (<0) para terminar:");
		x = entrada.nextInt();
		while (x>0)
		{
			System.out.println(y1);
			x = entrada.nextInt();
		}

	}

}
