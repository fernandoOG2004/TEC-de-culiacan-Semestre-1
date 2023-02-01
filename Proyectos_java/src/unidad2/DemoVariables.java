package unidad2;

public class DemoVariables {

	public static void main(String[] args) {
		//Declarar una variable de tipo entero
		long a;
		a = 1250;
		a = -233372036854775808L;
		System.out.println(a);
		//Declarar variable de tipo enteroCorto
		int b = 1250;
		b = 2147483647;
		System.out.println(b);
		//Declarar una variable de tipo short
		short c = -32768;
		System.out.println(c);
		//Declarar una variable byte
		byte d = 0 ;
		System.out.println(d);
		//Declarar una variable tipo float 
		float e = 3.0f ;
		System.out.println(e);
		//Declarar una variable tipo double
		double f = 5.18129;
		System.out.println(f);
		double g = 5.4e-2; // Notacion cientifica
		System.out.println(g);
		int h,j,k;
		float x,z;
		byte x1 = 5,x2 = 10;
		System.out.print(Math.sqrt(-1));
		
		System.out.println(1.1e200*1.1e200);
		
		System.out.println(-1.1e200*1.1e200);
		
		//Representacion de tipo caracter
		char car1, car2 = ' ';
		car1 = 'A';
		System.out.println(car1);
		System.out.println(car2);
		char car3 = '\t';
		System.out.println(car3);
		
		//Representacion de datos boleanos 
		boolean bandera ;
		bandera = true;
		System.out.println(bandera);
		bandera = false;
		System.out.println(bandera);
		bandera = true;
		if (bandera)
			System.out.println("cierto");
		else
			System.out.println("mentira");
				
		//liteales para numero octal y hexa
		int var0ctal;
		var0ctal= 07;
		System.out.println(var0ctal);
		byte varHD;
		varHD= 0xA;
		System.out.println(varHD);
		
		//Declarar constantes (se escriben en mayusculas)
		final double PI=3.141592653589793;
		System.out.println(PI);
	
		//Ejemplo de conversion de tipos
		System.out.println((int)(8.5));
		System.out.println((int)(4.3));
		System.out.println((double)(42));
		double q = 10.78;
		int num = (int)q;
		

	}

}
