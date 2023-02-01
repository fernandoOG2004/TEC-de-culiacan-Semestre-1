package unidad4;
/*
 * Los nombres de los arreglos SON REFERENCIAS A UN OBJETO
 * que define un bloque de memoria consecutiva, cuyo tamaño va a depender
 * del numero de elementos y del tipo, por lo que si se hace una asignacion
 * entre dos variables de tipo arreglo, estas se refieren al mismo objeto.
 */
public class DemoCopiarArreglos {

	public static void main(String[] args) {
		
		double [] r,w;
		r = new double[11];
		w = new double[15];
		
		for (int j = 0; j < r.length; j++) {
			r[j] = (double) 2 * j - 1; //Asignando valores a r
		}
		
		//Mostrar los valores de r
		for (int j = 0; j < r.length; j++) {
			r[j] = (double) 2 * j - 1;
				System.out.println("r["+j+"]="+r[j]+" ");
				
		}
		System.out.println("------------------------");
		//Mostrar los valores de w
		for (int j = 0; j < w.length; j++) {
				System.out.println("w["+j+"]="+w[j]+" ");
		}
		
		//Copia el arreglo de r a w
		w = r;
		System.out.println("-----------------------");
		for (int j = 0; j < w.length; j++) {
			System.out.println("w["+j+"]="+w[j]+" ");
		}
		
		/*
		 * Los elementos de un arreglo se pueden asignar a otro del mismo tipo
		 * construyendo un bucle que acceda a cada elemento del origen y destino
		 * el arreglo destino debe estar definido con al menos el mismo numero de elementos
		 * 
		 */
		final int N = 12;
		int V1 [] = new int [N], V2 [] = new int [N];
		for (int i = 0; i < N; i++) 
			V1[i] = (int)(Math.random()*199) + 1;
	//Mostrar el arreglo con los numeros aleatorios
			System.out.println("---------------------");
		for (int i = 0; i < N; i++) {
			System.out.println("V1["+i+"]="+V1[i]+" ");
		}
		//Copiar elementos de V1 a V2
		for (int i = 0; i < N; i++) 
			V2[i] = V1[i];
			//MOSTRAR ARREGLO V2
			System.out.println("------------------------");
			for (int i = 0; i < N; i++) {
				System.out.println("V2["+i+"]="+V2[i]+" ");	
			}
		/*
		 * Sintaxis del metodo
		 * 		System.arraycopy(arregloOrigen.inicioOrigen
		 * 			arregloDestino.inicioDestino,numElementos)
		 * arrelgoOrigen: nombre del arreglo que se va a copiar.
		 * 
		 * inicioOrigen: posicion del arreglo origen donde se inicia la copia.
		 * 
		 * arregloDestino: nombre del arreglo en que se hace la copia.
		 * 
		 * inicioDestino: es la posicion del arreglo destino donde empieza la copia.
		 * 
		 * numElementos: numero de elementos del arreglo origen que se va a copiar.
		 */		
			System.arraycopy(V1, 0, V2, 0, N);
			System.out.println("---------------");
		for (int i = 0; i < N; i++) {
			System.out.println("V2["+i+"]="+V2[i]+" ");	
		}
		
	}
		
}
		
		



