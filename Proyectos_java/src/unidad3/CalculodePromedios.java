package unidad3;
import java.util.Scanner;


public class CalculodePromedios {

	public static void main(String[] args) {
		//porposito: entrada de datos numericos y 
		//un centinela de -1
		
		//	BUCLES COBTROLADOS POR CENTINELA
		
		Scanner entrada = new Scanner (System.in);
		
		final int CENTINELA = -1;
		System.out.println("Introsuca un primera nota (-1 para terminar):");
		int nota = entrada.nextInt();
		int cuenta= 0, suma =0;
		while (nota != CENTINELA)
		{
			cuenta++;
			suma += nota ;
			System.out.println("Introduzca la sguiente nota (-1 para terminar):");
			nota = entrada.nextInt();
		}
		//fin while
		if (cuenta>0)
		System.out.println("Promedio: " + suma/cuenta);
	}

}
