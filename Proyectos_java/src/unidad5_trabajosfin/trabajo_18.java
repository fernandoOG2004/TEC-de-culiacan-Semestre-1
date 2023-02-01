package unidad5_trabajosfin;
import java.util.*;
public class trabajo_18 {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
        System.out.println("Proporcione la primera cadena");
        String cadena1 = entrada.nextLine();
        
        System.out.println("Proporcione la segunda cadena");
        String cadena2 = entrada.nextLine();
        
        encontrarMayor(cadena1, cadena2);
        System.out.println("\nCadena 1 transformada: "+vocalesMayus(cadena1));
        System.out.println("\nCadena 2 transformada: "+consonantMayus(cadena2));
        System.out.println("\nLas 2 cadenas concatenadas: "+concatenar(cadena1, cadena2));
        System.out.println("\nLa inversion de las 2 cadenas: "+inversion(cadena1, cadena2));
    }
    static void encontrarMayor(String cadena1,String cadena2){
        int diff = cadena1.compareTo(cadena2); 
        
        if(diff > 0) {
        System.out.println("La cadena alfabeticamente mayor es: "+cadena1);
        }else if(diff < 0) {
        System.out.println("La cadena alfabeticamente mayor es: "+cadena2);
        }else {
        System.out.println("Ambas cadenas tienen el mismo valor");
        }
    }
    public static String vocalesMayus(String cadena1){
        String vocalMayus = "";
        char vocales[] = {'a','e','i','o','u','A','E','I','O','U'};
        boolean CENT;

        for(int i = 0; i < cadena1.length(); i++){
        	CENT = false;
            for(int j = 0; j < vocales.length-1; j++){
                
                if(cadena1.charAt(i) == vocales[j]){
                    char carUpper = cadena1.charAt(i);
                    carUpper = Character.toUpperCase(carUpper);
                    vocalMayus = vocalMayus+carUpper;
                    CENT = true;
                }
            }
            if(CENT != true)
            vocalMayus = vocalMayus+cadena1.charAt(i);
        }
        return vocalMayus;
    }
    public static String consonantMayus(String cadena2){
        String consonMayus = "";
        char consonantes[] = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','X','Z','W','Y'
                        ,'b','c','d','f','g','h','i','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        boolean CENT;

        for(int i = 0; i < cadena2.length(); i++){
        	CENT = false;
            for(int j = 0; j < consonantes.length-1; j++){
                if(cadena2.charAt(i) == consonantes[j]){
                    char carUpper = cadena2.charAt(i);
                    carUpper = Character.toUpperCase(carUpper);
                    consonMayus = consonMayus+carUpper;
                    CENT = true;
                }
            }
            if(CENT != true)
            consonMayus = consonMayus + cadena2.charAt(i);
        }
        return consonMayus;
    }
    public static String concatenar(String cadena1, String cadena2){
        String cadenaConcat = vocalesMayus(cadena1)+" "+consonantMayus(cadena2);
        return cadenaConcat;
    }
    public static String inversion(String cadena1, String cadena2) {
    	String cadenaInvertida = "";
    	
    	for (int i = concatenar(cadena1, cadena2).length()-1; i >= 0; i--) {
    		 cadenaInvertida = cadenaInvertida+concatenar(cadena1, cadena2).charAt(i);
		}
    	return cadenaInvertida;
    }
}