package unidad3;

import java.util.Scanner;

public class DemoBucleFOR2 {
	
	public static void main (String[] args){
		//USOS DE BUCLE FOR 
		for (int n=1; n<=121; n = 2*n+1){
			System.out.println("n es ahora igaul a " + n);
		}
		int v = 9;
		for (int n=v; n>= -100; n -=5) // n -=5 equivale n = n-5
			System.out.println("n es ahoea igual a " + n );
		
		for (double p = 0.75; p <= 5; p += 0.25)// p+= 0.25 es igual a p = p+0.25
			System.out.println("Perimetro ahora es igaul a " + p);
	
		double y = 20.0;
		for (double x = Math.pow(y, 3); x > 2.0; x = Math.sqrt(x))
			System.out.println("x es ahora igual a " + x);
		
		//PRECAUCIONES DEL USO FOR 
		
		/* Se convierte en un ciclo infinito 
		 * por que modifico el limite
		int limite = 11 ;
		for (int  i=0; i<=limite; i++){
			System.out.println(i);
			limite++;
			
		}
		*/
		
		
		/* Se convierte en un ciclo infinito por que 
		 * actualizo de forma incorrectala variable de control por lo tanto
		 * la condicion de parada nunca se cumple
		 
		int limite = 1;
		for (int i=0; i<=limite; i ++){
			System.out.println(i);
			i--;
		}
		*/
		
		
		/*
		 * La condicion para terminar depende de un valor de entrada
		Scanner entrada = new Scanner (System.in);
		
		final int LIM = 50;
		int iter, tope;
		for  (iter = tope = 0; tope <= LIM; iter++){
			System.out.println("Interacion " + iter);
			tope = entrada.nextInt();
		}
		*/
		
		//BLUCLES INFINITOS
		/*
		for (;;)
			System.out.println("Hola");
			*/
		
		//BUCLE VACIO
		for (int i=1; i<=0;i++)
			System.out.println("Hola");
		
		for (int i=1; i<=10;i++);
			
		
	}
	

}
