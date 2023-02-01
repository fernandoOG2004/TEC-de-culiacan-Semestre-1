package unidad3;

import java.util.Scanner;

public class BonificacionDeficiente {

	public static void main(String[] args) {
		// Autor: Roberto Valenzuela Arce
		// Fecha: 06 de octubre de 2022
		// proposito: Calacular la bonificacion mediante de
        // ventas y tabla ya dada

        //crear objetp scanner
        Scanner entrada = new Scanner(System.in);

        //proceso 
        double boni = 0;

        System.out.println("Proporciona ventas mensuales");
        double ventas = entrada.nextDouble();
        
        if (ventas > 0 && ventas <= 1000)
        	boni = 0;
        if (ventas > 1000 && ventas <= 5000)
        	boni = ventas * 0.03; 
        if (ventas > 5000 && ventas <= 20000)
        	boni = ventas * 0.05;
        if (ventas > 20000)
        	boni = ventas * 0.08;
        
        System.out.println("Bonificacion: " + boni);


	}

}
