package EstrucuturasRepetitivas;
//Dibujar cuadrados ingresando el número
import java.util.Scanner;

public class DibujoConFor {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//declaramos las variables
		int cantidad;
		//Ingresamos los números
		System.out.println("Ingrese el numero de columnas y filas");
		cantidad= teclado.nextInt();
		
		for (int columnas = 1;columnas<= cantidad;columnas++){ 
		for(int filas=1; filas <=cantidad; filas ++){
		System.out.print("*"); 
		}//filas
		System.out.print("\n"); 
		}//columnas
		
	}

}
