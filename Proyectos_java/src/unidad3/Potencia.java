package unidad3;
/*
 * Nombre: Roberto Valenzuela Arce
 * Fecha:08 de noviembre del 2022
 * Proposito: visualizar las potencias de enteros elevados al cuadrado cuyos valores 
 * esten en el rango de 1 al 1000
 * con los bucles: while y do-while
 */
public class Potencia {

	public static void main(String[] args) {
		// while
		int pot = 1 ;
		while (pot < 1000)
		{
			System.out.println(pot);
			//pot = pot * 2;
			pot *= 2; 
		} // fin del bucle 
		//realizado con un do-while
		pot = 1;
		do {
			System.out.println(pot);
			pot *= 2;
		}while (pot < 1000);
	}

}
