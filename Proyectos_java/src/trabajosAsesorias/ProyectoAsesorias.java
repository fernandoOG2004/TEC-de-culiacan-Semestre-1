package trabajosAsesorias;
/*
 * Elaborado Por:
 * 		Luis Fernando Olivarria Garcia
 * 		Hugo Adriel Ramirez Barraza
 */
import java.util.*;
public class ProyectoAsesorias {;
	static int x[],aux,nRep,xd = 0;
	static String Nombre = null;
	static double Calf1,Calf2,Calf3,Promedio;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int Opcion = 0;
		
		do{
			
		System.out.println("--------------------");	
		System.out.println("***MENU DESPLEGABLE***");
		System.out.println("   OPCIONES   ");
		System.out.println("1.  Calcular promedio de 3 Calificaciones");
		System.out.println("2.  Ordenar 3 edades de Mayor a Menor");
		System.out.println("3.  Imprimir nombre infinitamente");
		System.out.println("4.  Salir del Programa");
		System.out.print("  Ingresa una Opcion: ");
		Opcion = entrada.nextInt();
		System.out.println("--------------------");
		
		switch(Opcion) {
		case 1:
			calcularPromedio(Calf1,Calf2,Calf3);
				break;
		case 2: 
			llenarArreglo();
				break;
		case 3:
			repNombre();
				break;
		case 4:
			System.out.println("ADIOS.......");
				break;
		default:
			System.out.println("Ingresa una opcion valida");
	}
		
		}while(Opcion != 4);
		
	
	}
	public static double calcularPromedio(double Calf1, double Calf2, double Calf3 ) {
		System.out.print("Ingresa la primera Calificacion: ");
		Calf1 = entrada.nextDouble();
		System.out.print("Ingresa la segunda Calificacion: ");
		Calf2 = entrada.nextDouble();
		System.out.print("Ingresa la tercera Calificacion: ");
		Calf3 = entrada.nextDouble();
		
		Promedio = (Calf1+Calf2+Calf3)/3;
		System.out.println("El promedio es de: "+Promedio);
		return Promedio;
		}
	
	public static void llenarArreglo() {
		Scanner leer = new Scanner(System.in);
		 int x[] = new int [3];
		int aux = 0;
		for(int i=0; i<x.length;i++)
		{
			System.out.println("Proporciona elemento "+i+":");
			x[i] = leer.nextInt();
		}
		System.out.println("Ordenado");
		for(int k=0; k<x.length;k++)
		{
			for(int i=0; i<x.length-1;i++)
			{
				if(x[i]<x[i+1])
				{
					aux = x[i];
					x[i] = x[i+1];
					x[i+1] = aux;
				}
			}
		}
		for(int i=0; i<x.length; i++)
			System.out.println("Elemento "+i+": "+x[i]);
	}
	public static void repNombre () {
		System.out.print("Ingresa tu nombre: ");
		Nombre = entrada.next();
		System.out.print("Cuantas veces quieres que se repita?: ");
		nRep = entrada.nextInt();
		
		while (xd < nRep) {
			System.out.println(Nombre);
			xd++;
		}
		
	}
		
}
