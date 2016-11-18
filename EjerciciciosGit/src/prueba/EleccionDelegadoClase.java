package prueba;

import java.util.Scanner;

//programas números aleatorios
public class EleccionDelegadoClase {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		//Definimos las variables
		int delegado;
		int alumnos;
		int subDelegado;
		
		
			System.out.println("Indique el número de alumnos que hay en su clase");
			alumnos=teclado.nextInt();
		
			delegado=(int) (Math.random()*(alumnos-5)+5);
			System.out.println("El Delegado es el " + delegado);
					
			
			subDelegado=(int) (Math.random()*(alumnos-5)+5);
			System.out.println("El Subdelegado es el " + subDelegado);
	
	}

}
