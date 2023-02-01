package unidad3;

import java.util.Scanner;

public class Jubulacion {

	public static void main(String[] args) {
		//Nombre:Valenzuela Arce Roberto
		//Fecha: 10 de noviembre del 2022
		//Proposito: obtener los años a trabajar Para en base
		//a una meta, una aportacion anual y una tasa de interes
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//Definir variable de salida
		byte años;
		//Definir variables de entrada
		double meta, tasadeinteres, pago;
		//Definir variables auxiliares 
		double balance, interes;
		
		System.out.println("¿Cuanto deseas recibir en tu jubulacion?");
		meta = entrada.nextDouble();
		System.out.println("¿Cuanto sera tu aportacion anual?");
		pago =  entrada.nextDouble();
		System.out.println("Dame la tasa de interes bancaria anual en %");
		tasadeinteres = entrada.nextDouble();
		
		balance = 0;
		años = 0;
		
		while (balance < meta) 
		{
			balance = balance + pago;
			interes = balance * (tasadeinteres/100);
			balance = balance + interes;
			años = (byte) (años + 1);
		}
		
		System.out.println("Usted requiere " + años + " para jubilarse");
		System.out.println("Y recibir " + balance);

	}

}
