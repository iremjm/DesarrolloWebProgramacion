package prueba;
//Pedir una nota de 0 a 10 y mostrarla de las forma: insuficiente ,suficiente Bien.....

import java.util.Scanner;
public class Ejerciccio10 {

	public static void main(String[] args) {
		
		//Creamos el obejeto teclado
		Scanner teclado= new Scanner(System.in);
		//Definimos las variables
		int nota;
		String calificacion;
		//Pedimos una nota para ingresar
		System.out.println("Por favor ingrese la nota");
		//Ingresamos la nota por teclado
		nota = teclado.nextInt();
			//Procesamos los datos
			switch (nota){
			
				case 5 :calificacion="Suficiente";
				break;
				case 6 :calificacion="Bien";
				break;
				case 7 :calificacion="Notable-";
				break;
				case 8 :calificacion="Notable+";
				break;
				case 9 :calificacion="Sobresaliente-";
				break;
				case 10 :calificacion="Sobreasaliente";
				break;
				default:calificacion="Insuficiente";
			}//switch
				//Si la nota es igual o mayor a 5
				if (nota >= 5){
					System.out.println("El alumno ha sacado un " + calificacion + " por lo que es apto.");
				}//if
				//Sino
				else{
					System.out.println("El alumno ha sacado un " + calificacion + " por lo que no es apto.");
				}
				
			
	}//main

}//class
