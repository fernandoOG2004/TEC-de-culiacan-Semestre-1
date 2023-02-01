package unidad3;
/*
 * Sintaxis:
 * if (condición 1)
 * 		sentencia 1
 * else if (condición 2)
 *		Sentencia 2
 * else if (Condición 3)
 * 		Sentencia n
 * else
 * 		sentencia e
 */
import java.util.Scanner;

public class DemolfAnidado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*System.out.println("Dame un día de la semana (1-7):");
		byte dia = teclado.nextByte();
		
		if (dia == 1)
			System.out.println("Lunes");
		else 
			if (dia == 2)
				System.out.println("Martes");
			else 
				if (dia == 3)
					System.out.println("Miércoles");
				else 
					if (dia == 4)
						System.out.println("Jueves");
					else 
						if (dia == 5)
							System.out.println("Viernes");
						else 
							if (dia == 6)
								System.out.println("Sábado");
							else 
								if (dia == 7)
									System.out.println("Domingo");
								else 
									System.out.println("Día Inválido");
		*/
		/*int x = 0,num_pos=0,num_neg=0,num_ceros=0;
		if (x>0)
			num_pos++;
		else 
			if (x<0)
				num_neg++;
			else 
				num_ceros++;*/
		
		/*
		int x = 0,num_pos=0,num_neg=0,num_ceros=0;
		if (x>0)
			num_pos++;
		else if (x<0)
			num_neg++;
		else 
			num_ceros++;
		*/
		
		
		//Sangrías en las sentencias y anidadas
		//Sintaxis:
		/*
		 * FORMATO 1
		 * if (expresion_lógica 1)
		 * 	Sentencia 1;
		 * else
		 * 		if(expresion_lógica 2)
		 * 			sentencia 2;
		 * 		else
		 * 			if(expresion_lógica 3)
		 * 				sentencia 3;
		 * 			else
		 * 				if(expresion_lógica 4)
		 * 					sentencia 4;
		 * 				else
		 * 					sentencia 5;
		 * 
		 * FORMATO 2
		 * if(expresión_lógica)
		 * 	sentencia 1
		 * else if(expresion_logica 2)
		 * 	sentencia 2
		 * else if (expresion_logica 3)
		 * 	sentencia 3
		 * else if (expresion_logica 4)
		 * 	sentencia 4
		 * else
		 * 	sentencia 5
		 */
		
		/*
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		int x = 0,y = 0;
		System.out.println("proporciona valoe de x: ");
		x = entrada.nextInt();
		System.out.println("proporciona valor de y: ");
		y = entrada.nextInt();
		
		double z = 0.0;
		
		if (x>0)
			if (y>0)
				z = Math.sqrt(x) + Math.sqrt(y);
			else
				System.out.println("**imposible calcular");
		
		System.out.println("Valor de z= " + z);
	
		*/
		
		//EXISTEN 3 FORMAS DE ESCRIBIR SENTANCIAS IF ANIDADAS
		//1.- Es muy engorrosa, su sintexis es correcta pero
		//su uso constituye un mala practica 
		int a=0,b=0,c=0;
		if (a>0) if (b>0) ++a; else if (c<0)
		if (a<5) ++b; else if (b<5) ++c; else --a;
		else if (c<5) --b; else --c; else a=0;
		//2.- Esta es una forma adecuada
		if (a>0)
			if (b>0) ++a;
			else 
				if (c<0)
					if (a<5) ++b;
					else 
						if (b<5) ++c;
						else --a;
				else
					if (c<5) --b;
					else --c;
		else a=0;
		//3.- Es tambien adecuada, mas legible que la anterior 
		if (a>0)
			if (b>0)
				++a;
			else if (c<0)
				if (a<5)
					++b;
				else if (b<5)
					++c;
				else 
					--a;
			else if (c<5)
				--b;
			else 
				--c;
		else 
		a=0;
			
		
		
	}
	}
