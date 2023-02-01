package ayudaU4;
import java.util.*;
public class ejercicioExamen {

	public static void main(String[] args) {
		final int N=6, M=25; 

		int matriz[][] = new int [N][M];

		leerEntrada(matriz);

		promedioAlumno(matriz);

		System.out.println("El promedio grupal del grupo es ="+
                       promedioGrupal(matriz));
		//ejemplo:
		//Promedio del Alumno 5
		int a=5;
		System.out.println("Promedio Alumno "+a+"="+promedioAlumno(matriz,a));

}

	

	public static void leerEntrada(int matriz[][]){

		Scanner teclado = new Scanner(System.in);
		//Las calificaciones se capturan por reglón
		

		for(int n=0;n<matriz.length;n++){
			System.out.println("*** MATERIA " +n+"***");

			for(int m=0;m<matriz[n].length;m++){

				System.out.print("Dame la calificacion del alumno ["+m+" ]en la materia ["+n+"] ");

				//matriz[n][m]=teclado.nextInt();
				matriz[n][m]=(int)(Math.random()*100)+1;
				System.out.println(matriz[n][m]+"\n");

			}
			//Fin de la materia y vamos por la segunda
		}

	}

	static void promedioAlumno(int matriz[][]){
		//Los alumnos, se representan en las columnas
		//Por eso hay que recorrerla poc columna

		double promedioA=0;

		for(int m=0;m<matriz[0].length;m++){

			for(int n=0;n<matriz.length;n++){

				promedioA += matriz[n][m];
			}

			//matriz.length = 6
			promedioA = promedioA/matriz.length;
			System.out.println("El promedio de Alumno "+m+" es = "+promedioA);
			promedioA=0;
		}

	}
	static double promedioAlumno(int matriz[][],int alumno){
		//Los alumnos, se representan en las columnas
		//Por eso hay que recorrerla poc columna

		double promedioA=0;

		for(int m=0;m<matriz.length;m++){
			
			promedioA=promedioA+matriz[m][alumno];
			
		}
		promedioA=promedioA/matriz.length;
	
		return promedioA;

	}


	 static double promedioGrupal(int matriz[][]){

		 double promedioG=0;
		 //La puedo recorrer por renglón 
		 //o por columna

		 for(int n=0;n<matriz.length;n++){

			 for(int m=0;m<matriz[n].length;m++){

				 promedioG+= matriz[n][m];
				 //lo que cambia más rápido es la columna

			 }

			// promedioG = promedioG+promedioG/24;
			

		 }
		 int cantidadCalificaciones = matriz.length*matriz[0].length;
		 promedioG = promedioG/cantidadCalificaciones;

		return promedioG;

	}

}
