package unidad3;
/*
 * Autor:Adolfo Angel Medina Muñoz
 */
import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Proporciona tu calificacion (0-10):");
		double calf = leer.nextDouble();
		
		if (calf < 7.0)
		{	
			System.out.println("Suspenso");
		}
		else
		{
			if (calf < 8.5)
			{
				System.out.println("Aprobado");
			}
			else
			{
				if (calf < 9.5)
				{
					System.out.println("Notable");
				}
				else
				{
					if (calf < 10)
					{
						System.out.println("Sobresaliente");
					}
					else 
					{
					 if (calf == 10)
					 {
						 System.out.println("Matricula de Honor");
					 }
					}
				}
			}
		}
	}
}



