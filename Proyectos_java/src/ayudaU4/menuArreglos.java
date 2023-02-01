package ayudaU4;
import java.util.*;
public class menuArreglos {

	static Scanner entrada = new Scanner(System.in); 
	public static void main(String[] args) {				
				int opcion = 0;
				
				do{
	
			System.out.println("1. Aplicacion de 10 elementos" );
			System.out.println("2. 5 elementos numericos" );
			System.out.println("3. Recorrido de valores en tabla de 10" );
			System.out.println("4. Tabla de elementos pares e impares" );
			System.out.println("5. series de numeros N enteros" );
			System.out.println("6. 10 enteros ordenados crecientemente" );
			System.out.println("7. Tabla de los dias del año bisiesto" );
			System.out.println("8. " );
			System.out.println("9. " );
			System.out.println("10. " );
			System.out.println("11. " );
			System.out.println("12. SALIR" );
			System.out.print("   Ingresa una opcion:   ");
			opcion = entrada.nextInt();
			
			switch(opcion){
			case 1:
				ejercicio1();
					break; 
			case 2:
				ejercicio2();
					break;
			case 3:
				ejercicio3();
					break;
			case 4:
				ejercicio4();
					break;
			case 5:
				ejercicio5();
					break;
			case 6:
				ejercicio6();
					break;
			case 7:
				ejercicio7();
					break;
			case 8:
				ejercicio8();
				break;
			case 9:
				ejercicio9();
				break;
			case 10:
				ejercicio10();
				break; 
			case 11:
				ejercicio11();
				break;
			case 12: 
					System.out.println("------------------------------");
					System.out.println("FIN DEL PROGRAMA");
				break;
		
		}
		
		
		}while(opcion != 12);	
	}
		public static void ejercicio1() {
			System.out.println("Este es el ejercicio 1: ");
			int p;
			int f;
			int p2;
			int f2;
		
		int[] arreglo = new int[10];
			Scanner leer = new Scanner(System.in); 
			for(int i=0;i<8;i++) {
				System.out.println("Ingrese los valores deseados: "+(i+1)+":");
				arreglo[i]=leer.nextInt(); 
				
			}
			System.out.println("Ingrese un  valor para remplazar: ");
			p=leer.nextInt(); 
			System.out.println("Ingrese la posicion a colocar el valor: ");
			f=leer.nextInt(); 
			for(int i =8;i>=f;i--) {
				arreglo[i+1]=arreglo[i];
			}
			arreglo[f-1]=p;
			System.out.println("Ingrese el segundo valor para reemplazar: ");
			p2=leer.nextInt();
			System.out.println("Ingrese la posicion a colocar el valor: ");
			f2=leer.nextInt();
			for(int i=8;i>=f2;i--) {
				arreglo[i+1]=arreglo[i];
			}
			arreglo[f2-1]=p2;
			System.out.println("El arreglo que se obtuvo es: ");
			for(int i=0;i<10;i++) {
				System.out.println(arreglo[i]+" ");
			}
		}
		
		public static void ejercicio2() {
			System.out.println("Este es el ejercicio 2: ");
			int p; 
			int arreglo[] = new int[10]; 
			Scanner leer = new Scanner(System.in); 
			for(int i = 0; i < 10;i++) {
				System.out.println("Ingrese el valor"+(i+1)+":");
				arreglo[i]= leer.nextInt();
			}
			System.out.println("Movimientos de posiciones: ");
			p=leer.nextInt();
			int aux[]=arreglo.clone(); 
			for(int i=0;i<10;i++) {
				arreglo[i]=aux[(i+p)%10]; 
			}
			System.out.println("Arreglo: ");
			for(int i = 0;i<10;i++) {
				System.out.println("Posicion"+(i+1)+": "+arreglo[i]);
			}
		}
		
		public static void ejercicio3() {
			System.out.println("Este es el ejercicio 3: ");
			int p; 
			int arreglo[] = new int[10]; 
			Scanner leer = new Scanner(System.in); 
			for(int i = 0; i < 10;i++) {
				System.out.println("Ingrese el valor"+(i+1)+":");
				arreglo[i]=leer.nextInt(); 
			}
			System.out.println(" ");
			System.out.println("La posicion a eliminar");
			p=leer.nextInt(); 
			for(int i =p-1;i<9;i++) {
				System.out.println(arreglo[i]+ " ");
			}

		}
		
		public static void ejercicio4() {
			System.out.println("Este es el ejercicio 4: ");
			int arreglo[]= new int[10]; 
			int ppar, par[];
			int pimpar, impar[];
			Scanner leer = new Scanner(System.in);
			for(int i = 0;i<10;i++) {
				System.out.println("Ingrese el valor "+(i+1)+":");
				arreglo[i]=leer.nextInt();
			}
			ppar=0; 
			pimpar=0; 
			for(int i = 0;i<10;i++) {
				if(arreglo[i]%2==0) {
					ppar++;
				}else {
					pimpar++; 
				}
			}
			par=new int[ppar]; 
			impar = new int [pimpar]; 
			ppar=0;
			pimpar=0; 
			for(int i=0;i<10;i++) {
				if(arreglo[i]%2==0) {
					ppar++;
				}
			else {
				impar[pimpar]=arreglo[i];
				pimpar++; 
			}
		}
				System.out.println("Arreglo par");
				for(int i=0;i<ppar;i++) {
					System.out.println(impar[i]+" ");
				}
				System.out.println(" ");
			}
		
		public static void ejercicio5() {
			System.out.println("Este es el ejercicio 5: ");
			int p[]= new int[10]; 
			int f[]= new int[10]; 
			Scanner leer = new Scanner (System.in); 
			System.out.println("Valor de el arreglo N");
			for(int i =0;i<10;i++) {
				System.out.println("Asigne valores de forma creciente: ");
				p[i]=leer.nextInt();
			}
			System.out.println("Valor de el arreglo M");
			for(int i =0;i<10;i++) {
				System.out.println("Asigne valores de forma creciente: ");
				f[i]=leer.nextInt();
			}
			System.out.println();
			int t[]= new int[20]; 
			int sp= 0; 
			int sf= 0; 
			int st= 0; 
			while (sp<10&&sf<10) {
				if(p[sp]<f[sf]) {
					t[st]=p[sp];
					sp++; 
				}else {t[st]=f[sf]; 
				sf++; 
				}
				st++; 
			}
			if(sp==10) {
				while(sf<10) {
					t[st] = f[sf]; 
					sf++; 
				}
			}else {
				while(sp<10) {
					t[st]=p[sp];
					sp++;
					sf++; 
				}
			}
			System.out.println("Arreglo: ");
			for(int st1=0;st1<20;st1++) {
				System.out.print(t[st1]+" ");
				
			}
		}
		
		public static void ejercicio6() { 
			System.out.println("Este es el ejercicio 6: ");
			int arreglo[]= new int[10]; 
			int p;
			int f;
			Scanner leer = new Scanner(System.in);
			for(int i=0;i<10;i++) {
				System.out.println("Asigne un valor de forma creciente: ");
				arreglo[i]=leer.nextInt();
			}
			System.out.println(" ");
			System.out.print("Valor a obtener: ");
			p=leer.nextInt();
			f=0; 
			while(f<10&&arreglo[f]<p) {
				f++; 
			}
			if(f==10) {
				System.out.println("No es posible obtener este valor");
			}else {
				if(arreglo[f]==p) {
					System.out.println("se obtuvo el valor en la posicion "+(f+1));
				}else {
					System.out.println("El valor no se pudo obtener");
				}
			}
		}
		public static void ejercicio7() {
			System.out.println("Este es el ejercicio 7: ");
			Scanner leer = new Scanner(System.in); 
			int mes[]= new int[12]; 
			int mesaux = 0;   
			int d = 0; 
			int p=0; 
			int f=0; 
			mes[1]=31; 
			mes[2]=28; 
			mes[3]=31; 
			mes[4]=30; 
			mes[5]=31; 
			mes[6]=30; 
			mes[7]=31; 
			mes[8]=31; 
			mes[9]=30; 
			mes[10]=31; 
			mes[11]=30; 
			mes[12]=31; 
			System.out.println("Ingrese el numero del mes: ");
			mesaux=leer.nextInt();
			for(int i=0;i<mesaux;i++) {
				f=f+mes[i];
			}
			System.out.println();
			System.out.println("Ingrese el dia del mes: ");
			d=leer.nextInt();  
			if(mesaux==1||mesaux==3||mesaux==5||mesaux==8||mesaux==10||mesaux==12) {
				p=f+d-30; 
			}else if(mesaux==2) {
				p=f+d-28; 
			}
			System.out.println("La fecha corresponde al dia "+p+" del año");
		}
		
	public static void ejercicio8() {
		System.out.println("Este es el ejercicio 8: ");
		Scanner leer = new Scanner(System.in); 
		int mes[]= new int[12]; 
		int mesaux = 0;   
		int d = 0; 
		int p=0; 
		int f=0; 
		mes[1]=31; 
		mes[2]=28; 
		mes[3]=31; 
		mes[4]=30; 
		mes[5]=31; 
		mes[6]=30; 
		mes[7]=31; 
		mes[8]=31; 
		mes[9]=30; 
		mes[10]=31; 
		mes[11]=30; 
		mes[12]=31; 
		System.out.println("Ingrese el numero del mes: ");
		mesaux=leer.nextInt();
		for(int i=0;i<mesaux;i++) {
			f=f+mes[i];
		}
	System.out.println();
	System.out.println("Ingrese el dia del mes: ");
	d=leer.nextInt();  
	if(mesaux==1||mesaux==3||mesaux==5||mesaux==8||mesaux==10||mesaux==12) {
		p=f+d-31; 
	}else if (mesaux==4||mesaux==6||mesaux==9||mesaux==11) {
		p=f+d-30; 
	
	}else if(mesaux==2) {
		p=f+d-28;
		int lqq=365-p; 
		System.out.println("A partir de este dia, al año le quedan "+lqq+"dias");
	}
	}
public static void ejercicio9() {
	System.out.println("Este es el ejercicio 9: ");
	int arreglo[]= new int[10]; 
	int sumar; 
	int restar; 
	int dividir; 
	int multiplicar; 
	Scanner leer= new Scanner(System.in); 
	for(int i=0;i<10;i++) {
		System.out.println("ingrese los valores ");
		arreglo[i]=leer.nextInt();
	}
	sumar= arreglo[0]; 
	restar = arreglo[0]; 
	dividir= arreglo[0]; 
	multiplicar= arreglo[0]; 
	for(int i=0;i<10;i++) {
		sumar=sumar+arreglo[i]; 
		restar=restar-arreglo[i]; 
		dividir=dividir/arreglo[i]; 
		multiplicar=multiplicar*arreglo[i]; 
	}
	System.out.println("Accion a realizar: ");
	System.out.println("1.Suma  2.Resta  3.Division  4.Multiplicacion  5.Todas las anteriores:");
	int valor = leer.nextInt(); 
	switch(valor) { 
	case 1:
		System.out.println("Sumar: "+sumar);
			break; 
	case 2:
		System.out.println("Restar: "+restar);
			break;
	case 3:
		System.out.println("Multiplicar: "+multiplicar);
			break;
	case 4:
		System.out.println("Dividir: "+dividir);
			break;
	case 5:
		System.out.println("todas las opciones juntas: "+sumar+restar+multiplicar+dividir);	
			break;
		default: 
			break; 
	}
}
public static void ejercicio10() { 
	System.out.println("Este es el ejercicio 10: ");
	int arreglo[]=new int[100]; 
	int sumar; 
	int i=0; 
	Scanner leer=new Scanner(System.in); 
	while(arreglo[i]<=200) {
		arreglo[i]++; 
		if(arreglo[i]%2==0) {
			System.out.println("Los numero primos son: ");
			System.out.println(arreglo[i]+" ");
		}
}
	System.out.println();
	sumar=0; 
	for(int j=0;j<100;j++) {
		sumar =(sumar+arreglo[i])-100; 
	}
	System.out.println("El resultado general de la suma de todos lo valores pares son: "+sumar);
}

public static void ejercicio11() { 
	System.out.println("Este es el ejercicio 11: ");
	int valores=0; 
	int primero=0; 
	int arr=1; 
	int sumar=0; 
	int act=0; 
	int[] c=new int[valores]; 
	int[] x=new int[valores]; 
	Scanner leer = new Scanner(System.in); 
	System.out.println("Valor de fibonacci a obtener: ");
	valores=leer.nextInt(); 
	for(int i= 0;i<c.length;i++) {
		System.out.println("El fibonacci de "+i+"es de:"+primero);
		sumar= primero + arr; 
		primero=arr; 
		c[i]=sumar; 
		if(sumar%3==0) {
			x[arr]=sumar; 
			arr++; 
		}
	}
	System.out.println(" ");
	System.out.println("Los multipos ordenados de 3 de forma ascendente: ");
	for(int i=arr-1;i>=0;i--) {
		System.out.println(x[i]+", ");
	}
		
	}
}
