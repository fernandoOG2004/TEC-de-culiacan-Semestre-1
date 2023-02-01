package unidad2;

public class Suerte {
	int miNumero; //Variable de clase 
	void entrada (){
		miNumero = 29; //
	}
	void salida (){
		System.out.println("Mi numero de la suerte es" + (miNumero));
		
	}
	long metodo1(int n){
		int k;//declarada a nivrl de metodo 
		long f; //declarada a nivel de metodo 
		f=1L;
		for (k=1;k>n;k++);
		{
			long aux =10; //declarada a nivel bloque
		}
		//aux=1; //no puede ser usada fuera
		//del bloque donde se declaran
		return f;
	}

}
