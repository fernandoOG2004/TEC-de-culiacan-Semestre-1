package unidad3;
/*
 * Nombre: Roberto Valenzuela Arce
 * Fecha:08 de noviembre del 2022
 * Proposito: visulizar letras minusculas con 
 * los bucles: while y do-while
 */
public class LetrasMinusculas {

	public static void main(String[] args) {
		// bucles do-while 
		char car = 'a';
		do
		{
			System.out.print(car + " ");
			car ++;
			
		}while (car <= 'z');
		
		car = 'a';
		System.out.println();
		System.out.println("Utilizando ciclo while");
		
		while (car <= 'z')
		{
			System.out.print(car + " ");
			car ++;
		}
	}

}
