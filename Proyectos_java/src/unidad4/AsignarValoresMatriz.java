package unidad4;

public class AsignarValoresMatriz {

	public static void main(String[] args) {
		
		int Num[][] = new int [3][4];
		int i,j;
		//Asigno Valores consecutivos
		for (j = 0; j < 3; j++) 
			for (i = 0; i < 4; i++) 
				Num[j][i] = j*4 + i*1;
		//Imprima los valores internos
		for (j = 0; j < 3; j++) {
			for(i = 0; i < 4;i++)
			{
				System.out.print("num["+j+"]["+i+"]="+Num[j][i]+" ");
			}
				System.out.println(" ");

		}

	}

}
