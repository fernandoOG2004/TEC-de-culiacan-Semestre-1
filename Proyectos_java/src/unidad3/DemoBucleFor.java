package unidad3;
/*
 * Sintaxixs:
 *           (1)
 * for (Inicializacion;Condicion;Incremento/Decremento)
 *    Sentencias:
 * (1) Inicializa las variables de control
 * (2)Expresion logica que determina que las sentencias se ejecutan
 * mientras sea verdadera
 * (3) Incremento o decremento de la variable control  
 * 
 */

public class DemoBucleFor {

	public static void main(String[] args) {
		// Imprime Hola 10 veces
		int i;
		for (i=0;i<10;i++)
		{
			System.out.println("Hola");
		}
		System.out.println(i);
		//Muestre los numeros naturales del 1 al 10 
		for (int j=1;j<=10;j++)
		{
			System.out.println(j);
		}
		//Muestre los primeros 10 numeros pares
		for (int k=2;k<=20;k+=2)
		{
				System.out.println(k);
		}
		//Imprimir un ciclo de forma decsendente
		for (int r=10;r>0;r--)
		{
			System.out.println(r);
		}
		//Errores logicos
		//ciclo ininito
				//for (int r=10;r>0;r++)
				//{
				//	System.out.println(r);
				//}
		for (int q=10;q>10;q--)
		{
			System.out.println("Entre al ciclo");
		}
	}

}
