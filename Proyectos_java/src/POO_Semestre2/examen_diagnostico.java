package POO_Semestre2;
import java.util.*;
public class examen_diagnostico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int elementos = 0;
		int contador = 0;
		
		System.out.println("Ingresa el Numero de elementos de arreglo: ");
		elementos = entrada.nextInt();
		
		int nrestantes = elementos;
		
		int arreglo [] = new int [elementos];
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)(Math.random()*70)+10;
		}
		System.out.println("Arreglo Original: ");
		for (int i = 0; i < elementos; i++) {
			System.out.println("["+arreglo[i]+"]");
		}
		System.out.println("");
		
		System.out.println(" ");
		
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i]>50){
				arreglo[i] = 1;
				nrestantes--;
			}else if(arreglo[i]<20){
				arreglo[i] = 0;
				nrestantes--;
			}
		}
		System.out.println("Arreglo Cambiado: ");
		for (int i = 0; i < elementos; i++) {
			System.out.println("["+arreglo[i]+"]");
		}
		System.out.println("");
		
		System.out.println(" ");
		
		System.out.println("Numeros sin cambiar = "+nrestantes);
		
	}
	
}
