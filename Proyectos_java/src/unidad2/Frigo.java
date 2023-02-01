package unidad2;

public class Frigo {
   protected double frigorias; //variable de clase
   public double frigoNria(Calor p)
   {
	   double x; //variable local
	   x = p.gr + frigorias -p.nt; // la variable gr es visibles
	                               //por que es de tipo proected
	                               //la variable nt es visible
	                               //por que es de tipo omision
	                               //las variables privadas de la clase
	                               //calor no son visibles desde frigo
	   return x;
   } 
}
