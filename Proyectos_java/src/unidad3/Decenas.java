package unidad3;

import java.util.Scanner;

public class Decenas {
	public static void main(String[] args){
        //Crear Objeto Scanner
        Scanner teclado = new Scanner(System.in);

        //Definir variables de Salida
        int dec, uni;

        //Definir variables de Entrada
        int num;

        //Recoleccion de datos
        System.out.println("Dame el valor de un numero entero "
        + "con dos digitos que quieras descomponer: ");
        num = teclado.nextInt();

        //Condiconal
        if (num>=10 && num<100){

            //Operaciones
            dec = num/10;
            uni = num%10;

            //Reproduccion de resultados
            System.out.println("Tu numero tiene "+dec+" Decenas.\n"
            +"Tu numero tiene "+uni+" Unidades");
        }
        else
        System.out.println("Ingresa un numero valido.");
	}
}
