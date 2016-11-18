package prueba;

import java.util.Scanner;

//Pedir un numero entre 0 y 9999 y mostrarlo con las cifras al revés.
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Definimos las variables
		int numero, numeroInver, division ,numeroInv, restoDiv;
		//Pedimos el numero por pantalla
			System.out.println("Inserte un número entre 0 y 9999");
		//Metemos el número por teclado
			numero= teclado.nextInt();
		//Comprobamos que numero no sea mayor a 9999 o menor a 0
		if(numero<0 || numero>9999){
			//Si se cumple if mostramos un mensaje de ERROR
				System.out.println("ERROR!!! Ha insertado el **"+ numero +"** Inserte un número entre 0 y 9999.");
				//Volvemos a meter el n�mero por teclado
				numero=teclado.nextInt();
				}
	
				else{
					numeroInv = 0 ; 
					division = numero ; 
					restoDiv = 0;
					while (division != 0) { 
					restoDiv = division % 10 ; 
					division = division / 10 ; 
					numeroInv = numeroInv * 10 + restoDiv; 
					} 
					System.out.println("El numero " + numero + " invertido es " + numeroInv); 
					}			
		
		}
	

}
