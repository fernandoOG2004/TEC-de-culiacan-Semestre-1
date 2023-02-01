package unidad4;
import java.util.*;
public class SumaMax {

	public static void main(String[] args) {
		
		final int NUM = 21;
		int items[] = new int [NUM];
		int n;
		n = entrada(items);//Devolver el numero de elementos que leyo)
		
		System.out.println("\n Suma de "+n+" elementos");
		System.out.println(sumaEnteros(items,n));
		System.out.println("\nValor Maximo:"+maximo(items,n));
		
	}
	static int entrada(int w[]){
		int k = 0,x;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un maximo de "+w.length
				+" datos, terminar con -1");
		do{
			x = entrada.nextInt();
			if(x != 1)
				w[k] = x;
			
		}while((k<w.length && (x != -1)));
		return k;
		
	}
	static int sumaEnteros(int w[],int n){
		int i,total = 0;
		for(i=0;i<n;i++)
			total +=w[i];
		return total;
	}
	static int maximo(int w[], int n){
		int mx,i;
		mx =w[0];
		for(i=1;i<n;i++)
			mx=(w[i]>mx?w[i]:mx);
		/*
		 * if(w[i]>mx)
		 * mx = w[i];
		 * else
		 * 	mx = mx;
		 * 
		 */
		return mx;
	}
}
