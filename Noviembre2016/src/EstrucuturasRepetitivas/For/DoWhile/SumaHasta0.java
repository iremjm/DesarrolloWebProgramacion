package EstrucuturasRepetitivas.For.DoWhile;

import java.util.Scanner;

//Pide n�mros al usuario hasta que introduzca 0 y muestra
//la cantidad de numeros introducidos y su suma


public class SumaHasta0 {

	public static void main(String[] args) {
		//Variables
		int num;
		int suma=0;
		int contador=0;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Que se haga todo mientras el numero sea distinto de cero
		do{
		contador++;
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();
		suma+=num;}//do
		while (num!=0);	contador--;
		//Leer por pantalla el resultado
		System.out.print("La cantidad de numeros introducidos: "+contador+" y su suma es: "+suma);	 
	}



}
