
import java.util.*;

import javax.swing.JOptionPane;
public class LetrasArregloPractica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nElementos;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo :"));
			
		char[] Letras = new char[nElementos];
		
		System.out.println("Digite los elementos del arrelgo: ");
		for (int i = 0; i < nElementos; i++) {
			System.out.print((i+1)+". Digite un caracter: ");
			Letras[i] = entrada.next().charAt(0);
		}
		
		System.out.println("\nLos caracteres del arreglo son: ");
		for (int i = 0; i < nElementos; i++) {
			System.out.println(Letras[i]+" ");
		}
		
		
	}
}
