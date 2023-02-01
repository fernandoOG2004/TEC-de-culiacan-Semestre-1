package unidad2;

public class Decremento {

	public static void main(String[] args) {
		int m = 99, n ;
		n = ++m; // m = m+1 y despues n = m
		System.out.println("m = " + m + ", n = " + n);
		n = m++; // m = n y despues m = m+1
		System.out.println("m = " + m + ", n =" + n);
		System.out.println("m = " + m++);
		System.out.println("m = " + ++m);
		

	}

}
