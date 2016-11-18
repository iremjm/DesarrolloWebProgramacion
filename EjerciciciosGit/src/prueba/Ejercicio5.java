package prueba;

import java.util.Scanner;

//Pedir dos números y decir cual es mayor o si son iguales
public class Ejercicio5 {

	public static void main(String[] args) {
			//Creamos el objeto Scanner
		Scanner teclado= new Scanner(System.in);
			//Definimos las variables
			int num1;
			int num2;
			
			//Pedimos el número uno
			System.out.println("Ingrese el número 1");
			//Añadimos por teclado el número uno
			num1 = teclado.nextInt(); 
			//Pedimos el número dos
			System.out.println("Ingrese el número 2");
			//Añadimos por teclado el número dos
			num2=teclado.nextInt();
			//Comparamos si son iguales
				if (num1==num2){
					System.out.print("Los números son iguales");
				}
				//Si no son iguales
				//Comprobamos cual es el mayor
				else if(num1>num2){
					System.out.print(num1 + " es maypr que " + num2);
					}
				else {
					System.out.print(num2 + " es mayor que " + num1);
					}
	}

}
