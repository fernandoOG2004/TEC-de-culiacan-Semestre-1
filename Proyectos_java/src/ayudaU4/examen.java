package ayudaU4;
import java.util.*;
public class examen {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double matriz [][] = new double [6][25];
		double suma = 0,promedio = 0,promedioG = 0;
		
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.println("Ingresa la calificacion; "+i+ " del alumno: "+i);
					matriz[j][i] = entrada.nextDouble();
			}
		}
		
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print("[" +matriz[j][j]+ "]");
				suma = suma + matriz[j][i];
		}
			promedio = suma / 6;
			System.out.println("El promedio del alumno: "+j+ " es de: "+promedio);

	}	
				
	}

}
