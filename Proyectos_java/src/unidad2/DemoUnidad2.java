package unidad2;
import unidad3.ClaseUnidad3;

public class DemoUnidad2 {

	public static void main(String[] args) {
		System.out.println("Estoy en la linea 1 del metodo main");
		System.out.println("Estoy en la linea 2 del metodo main");
		System.out.println("Estoy en la linea 3 del metodo main");
		metodo2 ();
		metodo3 ();
		unidad3.ClaseUnidad3.metodo1();
	}
public static void metodo2 (){
	System.out.println("Estoy en metodo 2");
}
public static void metodo3 (){
	System.out.println("Estoy en metodo 3");
}
}
