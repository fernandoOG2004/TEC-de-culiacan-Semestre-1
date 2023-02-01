package unidad3;
import java.util.Scanner;

public class Bonificacion {

	public static void main(String[] args) {
		// Autor: Adolfo Angel Medina Muñoz
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		double boni;
		
		System.out.println("Proporciona ventas mensuales");
		double ventas = entrada.nextDouble();
		
		if (ventas <= 9000)
			boni = 0.20;
			else
			{
				if(ventas <= 15000)
					boni = ventas * 0.10;
			
		else 
		{
			if (ventas <= 20000)
				boni = ventas * 0.05;
		
		else 
		{
			boni = ventas * 0;
		}
		}
			}
			System.out.println("Bonficacion: " + boni);
	
	}		
}
