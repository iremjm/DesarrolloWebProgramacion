package EstrucuturasRepetitivas.For;

import java.util.Scanner;

//Escribe los 50 primeros pares por consola************************************
public class Pares50 {

	public static void main(String[] args) {
			for(int numero=2;numero<=100;numero=numero+2){
		
			System.out.print(numero + " ");
		}			
//Salto de linea
			System.out.println(" ");
//Escribe impares los 50 primeros impares por consola***************************
			for(int num=1;num<=100;num=num+2){
				System.out.print(num + " ");
			}
//Salto de linea
			System.out.println(" ");
//Factorial pide un n�mero por sonsola y muestra su factorial*******************
			
			double numero;
			double factorial=1;
			Scanner teclado= new Scanner (System.in);
			System.out.println("Ingrese un n�mero");
			numero= teclado.nextDouble();
//Bucle i es al n�mero, mientras el n�mero es igual o mayor a uno continua restando 1.	
			for ( long i=1L; numero>=1;numero--){
				factorial=factorial*numero;
			
				
			}
			System.out.println(factorial);
		}
	}