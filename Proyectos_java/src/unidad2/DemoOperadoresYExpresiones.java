package unidad2;

public class DemoOperadoresYExpresiones {

	public static void main(String[] args) {
		// Operador de asignacion
		int codigo;
		codigo = 3467;
		// Asigna el valor de la expresion que se encuentra 
		//en la parte derecha de la variable izquierda
		double fahrenheit = 123.456;
		//Es un operador asignacion es aociativo 
		//por la derecha por lo que :
		int a, b, c;
		a = b = c = 45;
		//es equivalente
		a = (b=(c=45));
		//operadores aritmeticos
		//conversion de operadores aritmeticos 
		int x = 5, y = 10 ;
		int resultado;
		resultado = x + y ;
		double x1 = 5.5, y1 = 10.10;
		double resultado2;
		resultado2 = x1 * y1;
		int resultado3;
		resultado3 = x + (int)x1;
		double resultado4;
		resultado4 = x + x1;
		//precedencia de operadores 
		//prioridad y asociatividad
		/*
		 * prioridad (mayor a menor) Asociatividad
		 * +,- (unarios)         izquierda-derecha (->)
		 * *,/,%                 izquierda-derecha (->)
		 * +,-                   izquierda-derecha (->)
		 * 
		 */
		
		x= -1; //significa que es negativo 
		y= +5; //significa que es positivo
		//¿cual seria el resultado de la expresion?
		// 6 + 2 * 3 - 4 / 2		
		// 6 + 6 - 4 / 2
		// 6 + 6 - 2
		// 12 - 2
		// 10
		
		System.out.println(6 + 2 * 3 - 4 / 2);
		
		// Uso de parentesis
		// cambia el orden usual de la evaluacion de una expresion
		// determinada por su prioridad y asociatividad 
		// ¿cual seria el resultado de la expresion?
		// 5 * (5+(6-2)+1)
		// 5 * (5+4+1)
		// 5 * (9+1)
		// 5 * 10
		// 50
		
		System.out.println(5 * (5+(6-2)+1));
		
		// ¿cual seria el resultado de la expresion?
		// 5 * 5 + 6 - 2 + 1
		// 25 + 6 - 2 + 1
		// 31 - 2 + 1
		// 29 + 1
		// 30
		
		System.out.println(5 * 5 + 6 - 2 + 1);
		
		// ¿cual seria el resultado de la expresion?
		// 70 - 10 - 5 % 3 * 4 + 9
		// 70 - 10 - 2 * 4 + 9
		// 70 - 10 - 8 + 9
		// 60 - 8 + 9
		// 52 + 9
		// 61
		
        System.out.println(70 - 10 - 5 % 3 * 4 + 9);
		
		// operadores de incremento y decremento 
		int n = 0;
		++n; //como sufijo // n = 0
		n++; // como prefijo // n = n + 1, n = 0 + 1, n = 1
		n = 0;
		n++;
		System.out.println(n);
		n = 0;
		++n;
		System.out.println(n);
		int m;
		n = 0; 
		m = n++; //m = 0; // m = n despues n = n + 1
		System.out.println(m);
		n = 0; 
		m = ++n; // n = n + 1 y despues m = n
		System.out.println(m);
		
		//operadores relacionales 
		/*
		 * Java tiene el tipo de datos boolean: false y true
		 * Sintaxis 
		 * expresion1 operador_relacional1 expresion2 
		 */
		
		boolean c1;
		c1 = 3 < 7 ;
		System.out.println(c1);
		
		double x2= 5.75, a2=1, b2=2.5, c2=3.0;
		c1 = b2 * b2 >= 5.0 * a2 * c2 ; // 6.25>= 15.0
		System.out.println(c1);
		
		c1 = 'B' > 'A';
		System.out.println(c1);
		
		//los operadores relacionales
		//tienen menor prioridad que los aritmaticos y
		//una asociatividad de izquierda a derecha
		c1 = m + 5 <= 2 * n ; // (+5) <= (2+n)
		
		if (m + 5 <= 2 * n)
		{
			
		}
		else
		{
			
		}
		
		//operadores logicos
		int x3 = 0;
		c1 = !(x3 == 5);
		System.out.println(c1);
		
		int edad = 18 ;
		String nacionalidad = "mexicano" ;
		if (edad>=18 && nacionalidad== "mexicano")
		{
			System.out.println("Ya puedes votar");
		}
		else
		{
			System.out.println("No puedes votar");
		}
		
		double ventas = 4999;
		int horas = 99;
		int prima;
		
		if (ventas > 5000 || horas < 100) // 4999>5000 || 99<100
			                              //     F         V
			                              //           V
			
		{
			prima = 100000;
		}
		else
		{
			prima = 0;
		}
		
		System.out.println(prima);
		
		//evaluaciones de corto circuito
		x = 0;
		System.out.println(Math.log(x));
		if (x>0 && Math.log(x)>2)
		{
			
		}
		
		n = 0;
		//System.out.println(1/n); es una error 
		if (n !=0 && (x<1/n))// F
		{
			System.out.println(n);
		}

		
		//operador condicional (? :)
		//reemplaza la sentencia if-else en algunas circunstancias
		//SINTAXIS
		//	expresion_C ? expresion_v : expresion_f
		int mayor;
		a= 10;
		b= 5;
		//utilizando la sentencia if
		if (a>b)
		{
			mayor = a;
		}
		else
		{
			mayor = b;
		}
		
		mayor = (a>b) ? a:b; //esta sentencia equivale al if de arriba
		
		int n1 = 0; 
		int res= (n1>0)? 1: -1;
		System.out.println(res);
		
		
	}

}
