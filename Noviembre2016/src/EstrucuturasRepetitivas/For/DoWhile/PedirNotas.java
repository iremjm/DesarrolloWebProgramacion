package EstrucuturasRepetitivas.For.DoWhile;

import java.util.Scanner;

/* lea una secuencia de notas que se van introduciendo por el teclado 
 * (las notas ser�n valores num�ricos que pueden contener decimales).
 * La secuencia de notas finalizar� cuando se introduzca un valor negativo.
 * El programa informar� al final del n�mero de aprobados,
 * el n�mero de suspensos y la nota media. El programa deber� controlar los
 * posibles errores que se puedan producir a la hora de introducir las notas 
 * por teclado de tal forma que si alguna nota introducida 
 * fuera err�nea la vuelva a solicitar.*/
public class PedirNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creammos la clase teclado
		Scanner teclado=new Scanner(System.in);
		//Definimos las variables
		double notas=0;
		int contador=0;
		int suma=0;
		//Pedimos las notas
		//Ingresamos las notas
		do{contador++;
		System.out.print("Introduce un numero: ");
		notas=teclado.nextInt();
		suma+=notas;}//do
		while (notas<0);
		System.out.println("");
		//Comprobamos que las notas sean correctas
		//
	}//main

}
