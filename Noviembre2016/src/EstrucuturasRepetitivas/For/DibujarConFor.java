package EstrucuturasRepetitivas.For;
//Dibujar cuadrados ingresando el número
import java.util.Scanner;

public class DibujarConFor {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//declaramos las variables
		int cantidad;
		//Ingresamos los números
		System.out.println("Ingrese el numero de columnas y filas");
		cantidad= teclado.nextInt();
		
		for (int i = 0;i < cantidad;i++){ 
		for(int j= 0; j < cantidad; j ++){
		System.out.print("*"); 
		}
		System.out.print("\n"); 
		}
		
		
	}

}