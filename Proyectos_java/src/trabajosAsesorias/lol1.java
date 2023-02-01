package trabajosAsesorias;
import java.util.*;
public class lol1 {
	static int Calf1,Calf2,Calf3,i,x;
	static double resultado;
	static 	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
	int opcion;
	
	System.out.println("***MENU DESPLEGABLE***");
	System.out.println("***Opciones***");
	System.out.println(" 1.   Promediar Calificaciones");
	System.out.println(" 2.   Acomodar edades de Mayor a Menor");
	System.out.println(" 3.   Ingresar un Nombre y repetir las finitamente");
	System.out.println(" 4.   Salir del Programa");
	System.out.print("Ingresa una opcion: ");
	opcion = entrada.nextInt();
	System.out.println(" ");
			
	switch(opcion) {
		case 1:
			calcularPromedio(Calf1,Calf2,Calf3);
		System.out.println("El promedio es de: "+resultado);
			break;
		case 2:
			llenarArreglo();
			
		
	}
	
	
		 
	 
	}
	
	public static double calcularPromedio(double Calf1,double Calf2,double Calf3) {
		System.out.print("Ingresar Calf 1: ");
		Calf1 = entrada.nextInt();
		System.out.print("Ingresar Calf 2: ");
		Calf2 = entrada.nextInt();
		System.out.print("Ingresar Calf 3: ");
		Calf3 = entrada.nextInt();
		
		resultado = (Calf1+Calf2+Calf3)/3;
			return resultado;
	}
		public static void llenarArreglo() {
			int x[] = new int [3];
			int h = 1;
			int mayor = 0;
			int menor = 0, medio =0;
			for(int i=0; i<x.length;i++)
			{ 
			
				System.out.print("Proporciona edad "+h+": ");
				x[i] = entrada.nextInt();
				h = h +1;
				if(x[i]>mayor) {
					
					mayor = x[i];
				}if(x[i]<menor) {
					
					menor = x[i];
				}else {
					medio = x[i];
				}
				
				
				
			}
			System.out.println(mayor+" "+" "+medio+" "+" "+menor);
		}
		
		
		

		
		
	 
		
		
}
