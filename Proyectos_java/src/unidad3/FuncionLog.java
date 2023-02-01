package unidad3;

import java.util.Scanner;

public class FuncionLog {
	public static void Main(String[] args){
        //Crear objeto Scanner
        Scanner entrada = new Scanner(System.in);

    final int TotalNum=6;
    int contadorNum = 6;
    double sumaNum =0.0;
    double media=0.0;
    System.out.println("\nIntroduzca %d numero"+TotalNum);
    while (contadorNum<= TotalNum)
    {
        //valores a procesar
        double numero;
        numero = entrada.nextDouble();
        sumaNum += numero;
        ++contadorNum;
    }
    media = sumaNum/contadorNum;
    System.out.println("Media:\n"+media);
    }
   
}

