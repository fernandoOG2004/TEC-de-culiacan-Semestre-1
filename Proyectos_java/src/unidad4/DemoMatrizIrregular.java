package unidad4;

public class DemoMatrizIrregular {

	public static void main(String[] args) {
		int num[][];
		num = new int [7][];
		num[0] = new int[1];
		num[1] = new int[2];
		num[2] = new int[3];
		num[3] = new int [4];
		num[4] = new int [5];
		num[5] = new int [6];
		num[6] = new int [7];
		num[0][0] = 1;
		num[1][0] = 1;
		num[1][1] = 1;
		num[2][0] = 1;
		num[2][1] = 2;
		num[2][2] = 1;
		num[3][0] = 1;
		num[3][1] = 3;
		num[3][2] = 3;
		num[3][3] = 1;
		num[4][0] = 1;
		num[4][1] = 4;
		num[4][2] = 6;
		num[4][3] = 4;
		num[4][4] = 1;
		num[5][0] = 1;
		num[5][1] = 5;
		num[5][2] = 10;
		num[5][3] = 10;
		num[5][4] = 5;
		num[5][5] = 1;
		num[6][0] = 1;
		num[6][1] = 6;
		num[6][2] = 15;
		num[6][3] = 20;
		num[6][4] = 15;
		num[6][5] = 6;
		num[6][6] = 1;
		
		int num2[][] = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1},{1,5,10,10,5,1},{1,6,15,20,15,6,1}};
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("\nColumnas del renglon: "+i+"="+num[i].length);
			
		}
		//Arreglos de mas de 2 dimensiones
		int equipos[][][] = new int[3][12][4];
		
	}

}
