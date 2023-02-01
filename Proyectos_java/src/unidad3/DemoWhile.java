package unidad3;

public class DemoWhile {

	public static void main(String[] args) {
		int x = 0; //variable de contorl 
		while (x<10)//Prueba/Condicion
		{
			System.out.println(" x: " + x);
			x ++; //Actualizacion
		}
		//visualizar n asteriscos 
		int contador = 0; //inicializacion
		int n = 5;
		while (contador<n)//prubea/condicion
		{
			System.out.println("*");
			contador++;//actualizacion
		}
		/*fila del bucle
		 * 
		 * 1.- Inicializacion
		 * 2.- Prueba/condicion
		 * 3.- actualizacion
		 * 
		 */
		
		
		//bucle infinito
		/*
		contador =1;
		while (contador<100)
		{
			System.out.println(contador);
			contador --
		}
		*/
		
	}

}
