package unidad2;

public class DemoSalida {

	public static void main(String[] args) {
		/*
		 * System.in para entrada por teclado 
		 * System.out para salida por teclado
		 */
		// System.out 
		System.out.println("Esto es una cadena");
		System.out.println("Esto es otra cadena");
		System.out.println("Viaje rempalago a "+
		" a la comarca" +  "lagunera");
		System.out.print("Es un renglon");
		System.out.println("Esto es otro renglon");
		
		int x = 500;
		System.out.print(x);
		
		double r = 2.0;
		double area = Math.PI *r * r;
		System.out.println();
		System.out.println("Radio = " + r + ',' + "area = " + area);
		
		System.out.println("\nError - pulsa una tecla para continuar \n");
		
		System.out.println("Yo estoy preocupando\n" 
				+ "no por el funcionamiento \n" 
				+ "sino por la claridad.\n");
		
		//Salidas con formato: printf
		//inspirado en la funcion clasica de c
		
		float y = 1.1234f;
		System.out.printf("%8.3f", y);
		System.out.println();
		System.out.println(y);
		
		double precio = 25.4;
		System.out.printf("$");
		System.out.printf("%6.2f", precio);
		System.out.printf(" unidad");
		
		double z = 10000.0 / 3.0;
		System.out.println();
		System.out.println(z);
		System.out.printf("%9.3f",z);
				
	

	}

}
