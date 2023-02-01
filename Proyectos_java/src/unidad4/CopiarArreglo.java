package unidad4;

public class CopiarArreglo {

	public static void main(String[] args) {
		
		final int N = 15;
		final int M = 20;
		double []v = new double[N];
		double w[] = new double[M];
		double x = 1.0;
		//Asigno valores al arreglo v
		for (int i = 0; i < N; x+=0.2,i++) 
			v[i] = Math.exp(2*x-1);
		
		//Asignar valores a w
		for (int i = 0; i < M; i++) 
			w[i] = (double)i;
		
		//Imprimir los elementos del vector v
		System.out.println("\nLos valores del vector v");
		for (int i = 0; i < v.length; i++) {
			System.out.println("v["+i+"]="+v[i]+" ");
			
		}
		System.out.println("\nLos valores del vector w");
		for (int i = 0; i < w.length; i++) {
			System.out.println("w["+i+"]="+w[i]+" ");	
		}
		//Realizar la copia de v a w
		System.arraycopy(v, (N-1)-10, w, 10, 10);
		//Imprimir los elementos del vector w
		System.out.println("\nLos valores del vector w");
		for (int i = 0; i < w.length; i++) {
			System.out.println("w["+i+"]="+w[i]+" ");	
		}
		
	}

}
