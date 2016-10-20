//Pedir al usuario número haste que introduzca un núemro negativo 
//y muestra la cantidad de números.
package EstrucuturasRepetitivas.For.While;

import java.util.Scanner;

public class EjercicioWhile1 {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
			int contador= 0;
			int numero= 0;
			
			while(numero>=0){
			//añadimos 1 al contador
				contador++;
				//pedimos número
				System.out.print("Ingrese un número: ");
				//leémos número
				numero= teclado.nextInt();
				
			}//while
			System.out.print("El número de veces que ha inicializado la variable ha sido "
			+contador+ " veces");
	}

}
