package unidad3;
/*
 * Nombre: Roberto Valenzuela Arce
 * Fecha:08 de noviembre del 2022
 * Proposito: generar n multiplos aleatorias de por las mas de 
 * tres cifras e imprimir por pantalla, solamente los que 
 * sean multiplos de 3
 * utilizar la sentencia continue
 * 
 * SINTAXIS:
 *    continue;
 *    continue etiqueta;
 */

public class MultiplosDe3 {

	public static void main(String[] args) {
		final int CLAVE = 3 ;
		final int RANGO = 999;
		int n = (int)(Math.random()*RANGO)+1;
		for (int i=0; i<n;i++)
		{
			int numero = (int)(Math.random()*RANGO)+1;
			if (numero % CLAVE == 0)
			{
				System.out.println();
				continue;
			}
			System.out.println(" " + numero);
		}


		

	}

}
