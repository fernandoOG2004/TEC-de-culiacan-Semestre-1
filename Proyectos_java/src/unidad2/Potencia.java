package unidad2;

public class Potencia {
	int n,p ;
	
	public static void main(String[] args) {
	    int r, e ; 
	    int n,p;
	    n = 7; 
	    p = e = 5;
	    r = 1;
	    for ( ; p > 0; p--)
	    	r = r*n;
	    System.out.println("Potencia de " + n + "^" + e + "=" + r);

	}

}
