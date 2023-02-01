package unidad5_trabajosfin;
import java.util.*;
public class trabajo_9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		 String password = "Hugo";
		 String password2;
		 System.out.println("La password es Hugo");
		 
		 System.out.println("\nIngresa tu password: ");
		 password2 = entrada.next();
		 		 
		 if(password.equals(password2)) 
		 {
			 System.out.println("Tu password es correcta");
		 }else 
		 {
			 System.out.println("Tu password es incorrecta");
		 }
	}
}
