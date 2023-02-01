package unidad3;
import java.util.Scanner;

public class MayorNumero {
	  public static void main(String[] args){
	        //Crear Objeto Scanner
	        Scanner teclado = new Scanner(System.in);

	        //Declarar variable de entrada
	        int num1=0,num2=0;

	        //Declarar bandera
	        boolean bandera = false;

	        //Crear bandera/Recoleccion de datos
	        while (bandera != true){
	            System.out.println("Proporciona el primero de los 2 numeros que quieras comparar");
	            num1 = teclado.nextInt();
	            System.out.println("Proporciona el segundo numero que quieras comparar");
	            num2 = teclado.nextInt();
	            if (num1 != num2)
	            bandera = true;
	        }

	        if (num1>num2)
	        System.out.println(num1+" es mayor que "+num2);
	        else
	        System.out.println(num2+" es mayor que "+num1);
}
}