package unidad3;

public class DemoBucleForVacios {

	public static void main(String[] args) {
		/*
		 * Sierra Leona se ejecuta una sola vez que el for es
		 * una sentencia vacia pues termina con un punto y coma 
		 * por lo tanto nno hace nada durante 10 interacciones y al 
		 * terminar ejecuta la sentencia que escribe Sierra Leona 
		 */
		
		for (int i=1; i<=10; i++);
		System.out.println("Sierra Leona");
		//Cualquiera de las tres expresiones que controlan un bucle 
		//for oueden ser nulas o vacias
		
		int contador = 0;
		for (;contador <5;)
		{
			contador++;
			System.out.println("Blcle!! ");
		}
		System.out.println("\n Contador: " + contador);
	}

}
