package unidad4;
import java.util.*;
/*
 * Arreglo : Es una secuencia de datos del mismo tipo
 * Sintaxis: 
 * 		Tipo [] Identificador
 * 		[] tipo identificador:
 * 		Sintaxis para declarar y definir un arreglo
 * Forma 1:
 * 		tipo nombreArreglo [] = new tipo [NumeroDeElementos]
 * Forma 2:
 * 		Tipo NombreArreglo [];
 * 		nombreArreglo = new tipo[NumeroDeElementos];
 */
public class DemoArreglo2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declarar arreglos
		
		int [] v;
		float w [];
		//Distintas declaraciones de arreglos
		char car[],p;
		int [] v1,w1;
		double []m,t[],x;
		//creacion de arreglos: 2 formas
		//Forma 1:
		float [] Notas; //primero declaro el arreglo
		Notas = new float [26]; //segundo creo el arreglo con un tama�o
		//forma 2
		float [] Notas2 = new float [26];
			for (int i = 0; i < 26; i++) 
				System.out.println("elemento "+i+" : "+
						Notas2[i]);
			
		final int MX = 20;
		racional []ra = new racional [MX];
		System.out.println(ra[MX - 4]); //Accediento a elementos
			
		int a[] = new int[10]; //Declarando un arreglo de nombre a y la definicion
												//con 10 elementos de tipo int
		final int N = 20;
		float []Vector;
		Vector = new float[N];
		//SubIndices o Indice de in arreglo
		/*
		 * La forma de acceder a un elemento de un arreglo es atraves
		 * de su indice.
		 * El metodo de numeracion de enesimo elemento del indice es 
		 * n-1 y se le denomina INDEXACION BASADA EN CERO
		 */
		int Mes[] = new int[12];
		//El pimero elemento es mes[0] y el ultimo es mes[12];
		Mes[4] = 5;  //Accediendo al elemento posicion 5
		for(int i = 0; i < 12;i++)
				System.out.println("posicion "+i+": "+Mes[i]);
		
		float Salarios [];
		Salarios = new float[25];
		Salarios[Mes[4]] = 3.15f;
		for(int i = 0; i < 25;i++)
			System.out.println("posicion "+i+": "+Salarios[i]);
		
		//Tama�o de los arreglos, ATRIBUTO lenght
		double []v2 = new double [15];
		System.out.println(v2.length);
		//Inicializacion de un arreglo
		//Un arreglo se puede inicializar con valores constantes en 
		//una sentencia que ademas es capaz de determinar su tama�o
		int Numeros[] = {10,20,30,40,50,60};
		System.out.println(Numeros.length);
		System.out.println(Numeros[3]);
		System.out.println(Numeros[5]);
		System.out.println(Numeros[0]);
		
		int [] nms = {3,4,5};
		
		char c [] = {'L','u','i','s'};
		
		final int ENE = 31,FEB = 28,MAR = 31,ABR = 30,MAY = 31,
					JUN = 30,JUL = 31,AGO = 31,SEP = 30,OCT = 31,
					NOV = 30,DIC = 31;
		int Meses[] = {ENE,FEB,MAR,ABR,MAY,JUN,JUL,AGO,SEP,OCT,NOV,DIC};
		System.out.println(Meses[1]);
		
		
	}
}
