package unidad4;
import java.util.*;
public class DemoCadena2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		if(args.length>0) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		
		for (int i = args.length-1;i >= 0; i--) 
			System.out.println(args[i]);
		}
		
		/*
		String miCiudad = "Culiacan";
		*/
		/*
		String miCiudad;
		
		System.out.print("Ingresa el nombre de tu ciudad: ");
		miCiudad = entrada.nextLine();
		
		System.out.println("Longitud de cadena: "+miCiudad.length());
		*/
		
		//METODO CONCAT(),INGRESAR UNA CADENA AL FINAL DE OTRA CADENA
		String numero = "1,000.00";
		String moneda = "PESOS";
		numero = numero.concat(moneda);
		System.out.println(numero);
		
		//metodo charAt() que devuelve el caracter cuyo indice es posicion
		String nombrePropio = "Lorena";
		for (int i = 0; i < nombrePropio.length()-1; i++) 
		{
			System.out.println(nombrePropio.charAt(i));
		}
		System.out.println("");
		for (int i = nombrePropio.length()-1; i >= 0; i--) {
			System.out.println(nombrePropio.charAt(i));
		}
		
		/*
		 * 
		 */
		
		String nom1 = "Ana Maria";
		String nom2 = "Berta";
		if(nom1 == nom2) {
			System.out.println("Los nombres son iguales");
		}
		else {
			System.out.println("Los nombres son diferentes");
		}
		
		int valor = nom1.compareTo(nom2);
		System.out.println(valor);
		
		if(nom1.compareTo(nom2)==0)
		{
			System.out.println("Las cadenas son iguales");
		}
		else if(nom1.compareTo(nom2)<0)
		{
			System.out.println(nom1 + " Es menor que "+nom2);
		}
		else 
		{
			System.out.println(nom1 +" es mayor que "+nom2);
		}
		
		//Metodo substring() devuelve una cadena formada por los caracteres entre inicio y final
		
	
			
	}
}