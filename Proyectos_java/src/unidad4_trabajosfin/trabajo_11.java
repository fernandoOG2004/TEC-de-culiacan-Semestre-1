package unidad4_trabajosfin;
import java.util.*;
public class trabajo_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int nCalf,Calf = 0;
		
		System.out.print("Dime el numero de calificaciones a promediar: ");
			nCalf = teclado.nextInt(); 
				int arreglo []= new int [nCalf];
				
		for(int i =0;i<arreglo.length;i++){
		System.out.println("Dame la calificacion "+(i+1));
		arreglo[i]=teclado.nextInt();
		}
		
		for(int i=0;i<arreglo.length;i++)
			Calf += arreglo[i];
				System.out.println("Tu promedio es = "+Calf/nCalf);
	}
}
