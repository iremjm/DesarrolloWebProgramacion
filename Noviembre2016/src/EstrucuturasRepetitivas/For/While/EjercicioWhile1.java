//Pedir al usuario n�mero haste que introduzca un n�emro negativo 
//y muestra la cantidad de n�meros.
package EstrucuturasRepetitivas.For.While;

import java.util.Scanner;

public class EjercicioWhile1 {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
			int contador= 0;
			int numero= 0;
			
			while(numero>=0){
			//a�adimos 1 al contador
				contador++;
				//pedimos n�mero
				System.out.print("Ingrese un n�mero: ");
				//le�mos n�mero
				numero= teclado.nextInt();
				
			}//while
			System.out.print("El n�mero de veces que ha inicializado la variable ha sido "
			+contador+ " veces");
	}

}
