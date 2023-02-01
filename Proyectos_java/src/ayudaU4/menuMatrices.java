package ayudaU4;
import java.util.*;
public class menuMatrices {

	static Scanner entrada = new Scanner(System.in); 
	public static void main(String[] args) {
			
			int opcion = 0;
			
			do{
			System.out.println(" ");
			System.out.println("-------------------------------------");
			System.out.println("1. Calcular suma de NxN" );
			System.out.println("2. Calcular si es simetrica o no" );
			System.out.println("3. suma de matrices 3x3" );
			System.out.println("4. Transpuesta de una matriz 3x3" );
			System.out.println("5. Tabla de 7x7" );
			System.out.println("6. Tabla de 6x6" );
			System.out.println("7. Matriz tamaño de MxN" );
			System.out.println("8. Salir" );
			System.out.print("   Ingresa una opcion:   ");
			opcion = entrada.nextInt();
			
			switch(opcion){
				case 1:
					ejercicio1();
						break; 
				case 2:
					ejercicio2();
						break;
				case 3:
					ejercicio3();
						break;
				case 4:
					ejercicio4();
						break;
				case 5:
					ejercicio5();
						break;
				case 6:
					ejercicio6();
						break;
				case 7:
					ejercicio7();
					break;
				case 8:
						System.out.println("------------------------------");
						System.out.println("FIN DEL PROGRAMA");
					break;
			
			}
			
			
			}while(opcion != 8);	
	}
		public static void ejercicio1 () {
			System.out.println("Este es el ejercicio 1: ");
			int[][] num = new int[5][5];
	        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
	            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
	                  num[i][j]=i+j;              
	            }            
	        }
	        System.out.println("Imprimiendo Tabla.");
	        for (int i = 0; i < num.length; i++) {
	            System.out.println();
	            for (int j = 0; j < num.length; j++) {
	                  System.out.print(num[i][j] + " ");
	            }
	     
	        }
	      
		
		}
		public static void ejercicio2() {
			System.out.println("Este es el ejercicio 2: ");
			int [][] num2 = new int [4][4]; 
			boolean simetrico; 
			Scanner numero = new Scanner(System.in); 
			System.out.println("Ingrese los numeros: ");
			for (int i = 0; i <num2.length; i++){//Dimension uno. 
				for(int j = 0; j <num2.length; j++) {//Dimension dos. 
					System.out.println("["+i+"]"+"["+j+"]"+"=");
					num2[i][j]=numero.nextInt(); 
				}
			}
			System.out.println("Imprimiendo Tabla: ");
			for (int i = 0; i <num2.length; i++) {
				System.out.println(" ");
				for(int j = 0; j <num2.length; j++) {
					System.out.print(num2[i][j]+ " ");
				}
			}
			System.out.println("\nComprobando Simetria" );
			simetrico = true; 
			int control = num2.length -1; 
			int i=0; 
			while(i < control && simetrico == true) {
				int j=0; 
				while(j < control && simetrico == true) {
					if(num2[i][j] != num2[j][i]) {
						simetrico = false; 
					}
					j++;
				}
				i++; 	
			}
			if(simetrico) {
				System.out.println("La tabala SI es simetrica. ");
			}
			else {
				System.out.println("La tabla NO es simetrica. ");
			}
			
		}

        public static void ejercicio3() {
        	System.out.println("Este es el ejercicio 3: ");
			int [][] num1 = new  int [3][3]; 
	        int [][] Num2 = new  int [3][3]; 
	       Scanner Numero = new Scanner (System.in); 
	        System.out.println( "Cargando Tabla Uno." ); 
	        for ( int I = 0; I < num1.length; I++) { //Dimensión Uno. 
	            for ( int j = 0 ; j < num1.length; j++) { //Dimensión Dos. 
	                System.out.print( "[" +I+ "]" + "[" +j+ "]" + "=" ); 
	                num1[I][j]=Numero.nextInt();              
	            }             
	        } 
	        System.out.println( "Cargando Tabla Dos." ); 
	        for ( int I = 0 ; I < Num2.length; I++) { //Dimensión Uno.
	           for  (int j = 0 ; j < Num2.length; j++) { //Dimensión Dos. 
	                System.out.print( "[" +I+ "]" + "[" +j+ "]" + "=" );  
	                Num2[I][j]=Numero.nextInt();              
	            }             
	        } 
	        System.out.println( "Imprimiendo Tabla Uno." ); 
	        for ( int I = 0 ; I < num1.length; I++) { 
	            System.out.println(); 
	            for ( int j = 0 ; j < num1.length; j++) { 
	                  System.out.print(num1[I][j]+ "  ");              
	            }             
	        } 
	        System.out.println( "\nImprimiendo Tabla Dos." ); 
	        for ( int I = 0 ; I < Num2.length; I++) { 
	            System.out.println(); 
	            for ( int j = 0 ; j < Num2.length; j++) { 
	                  System.out.print(Num2[I][j] + "  ");              
	            }             
	        } 
	        int [][] suma = new  int [ 3 ][ 3 ]; 
	        System.out.println("\nSumando las dos Tablas."); 
	        for ( int I = 0 ; I < suma.length; I++) { 
	            for ( int j = 0 ; j < suma.length; j++) { 
	                  suma[I][j]= num1[I][j] + Num2[I][j];            
	            }             
	        } 
	        System.out.println( "\nImprimiendo Suma." ); 
	        for ( int I = 0 ; I < suma.length; I++) { 
	            System.out.println(); 
	            for ( int j = 0 ; j < suma.length; j++) {
	                  System.out.print(suma[I][j] + " " );              
	            }       }
	        } 
	        
	        public static void ejercicio4() {
	        	System.out.println("4. Transpuesta de una matriz 3x3" ); 
	        	Scanner entrada = new Scanner (System.in); 
				int matriz[][] = new int[3][3];
				
				System.out.println("Datos de la matriz");
				for(int i1 =0;i1<3;i1++) {
					for(int j=0;j<3;j++) {
						System.out.print("Matriz["+i1+"]["+j+"]: ");
						matriz[i1][j] = entrada.nextInt();
					}
				}
				
				System.out.println("\nMatriz: ");
				for(int i1=0;i1<3;i1++) {
					for(int j=0; i1<3;j++) {
						System.out.println(matriz[i1][j]+ " ");
					}
					int aux;
					for(int I=0;I<3;I++) {
						for(int j=0;j<I;j++) {
							aux = matriz[I][j]; 
							matriz[I][j]=matriz[j][I]; 
							matriz[j][I]=aux; 
								
						}
					}
					System.out.println("\nLa matriz traspuesta es: ");
					for(int I=0;I<3;I++) {
						for(int j=0;j<3;j++) {
							System.out.print(matriz[I][j]+ "");
						}
						System.out.println("");
					}
				}
				}
	        	
	        public static void ejercicio5() {
	        	System.out.println("Este es el ejercicio 5: ");
				 int[][] matriz1 = new int[7][7];
			        int f;
			        
			        //Relleno la diagonal principal con 1
			        //Solo tengo que recorrer las casillas en las que el número de fila es
			        //igual que el número de columna:  matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
			        for (f=0 ; f < matriz1.length ; f++){
			            matriz1[f][f]=1;                           
			        }
			        
			        //Muestro las filas de la matriz haciendo uso de la libreria "Arrays"
			        for (f=0 ; f < matriz1.length ; f++){
			            System.out.println(Arrays.toString(matriz1[f]));
			        }
			        }
			        
			        
		public static void ejercicio6() {
			System.out.println("Este es el ejercicio 6: ");
			Scanner in = new Scanner(System.in);
		    
		    //Creamos una matriz
		    int nFilas, nCol;
		    System.out.print("Ingrese el numero de Filas: ");
		    nFilas = in.nextInt();
		    System.out.print("Ingrese el numero de columnas: ");
		    nCol = in.nextInt();
		    int matriz [][] = new int [nFilas][nCol];
		    int sumfil = 0, sumCol = 0;

			int i = 0;
		    
		    {
		    
		    //Llenamos la matriz
		    for (int i1 = 0; i < matriz.length; i++) {
		        for (int j = 0; j < matriz[0].length; j++) {
		            System.out.print("Matriz ["+i1+"]["+j+"] : ");
		            matriz[i1][j] = in.nextInt();
		            sumfil += matriz [i1][j]; //En esta linea sumamos todos los numeros de la fila
		        }
		        System.out.println("Resultado de suma de los numero de la fila "+i1+": "+sumfil);
		        sumfil = 0; //Aca reiniciamos el contador a cero
		    }
		    System.out.println("Mostramos la matriz Creada");
		    for (int i1 = 0; i1 < matriz.length; i1++) {
		        for (int j = 0; j < matriz[0].length; j++) {
					System.out.print("["+matriz[i1][j]+"]");
		        }
		        System.out.println("");
		    }
		    
		    //Calculamos la suma de los numeros de cda columna
		    for (int j = 0; j < matriz.length; j++) {
		        for (int i1 = 0; i1 < matriz[0].length; i1++) {
		            sumCol += matriz [i1][j]; //Sumamos todos los numeros de la columna
		        }
		        System.out.println("Resultado de la suma de los numeros de de su columnas "+j+": "+sumCol);
		        sumCol = 0;//Reiniciamos el contador a cero
		    }
		}
		}

			
			
		public static void ejercicio7() {
			System.out.println("Este es el ejercicio 7: ");
			 int matriz11[][] = new int [5][5]; 
			 
			 for(int i1 = 0;i1<5;i1++) {//para incluir los datos de la matriz
				 for(int j = 0;j<5;j++) {
					 if(i1==0 || i1==4) {//para la columna
						 matriz11[i1][j] = 1;
					 }
					 else if (j==0 || j==4) {
						 matriz11 [i1][j] =1; 
					 }
					 else {
						 matriz11[i1][j] = 0;
					 }
				 }
			 }
			 System.out.println("La matriz es: \n");
			 for(int i1=0;i1<5;i1++) {
			 for(int j=0;j<5;j++) {
				System.out.print(matriz11[i1][j]+ " ");
			 }
			 System.out.println("");
		}
			 System.out.println("");
	        
	        
		
        }
  }
