package prueba;
//6.Pedir dos n�meros y mostrarlos de mayor a menor
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	//Creamos el objeto Scanner
		Scanner teclado= new Scanner(System.in);
		//Definimos las variables
			int num1;
			int num2;
			
			//Pedimos el primer n�mero
			System.out.println("Ingresa el primer n�mero");
			//Insertamos el segundo n�mero por consola
			num1= teclado.nextInt();
			//Pedimos el segundo n�mero
			System.out.println("Ingrese el segundo n�mero");
			//Insertamos el segundo n�mero por consola
			num2= teclado.nextInt();
			//Comprobamos si num1 es mayor a num2
			if(num1>num2){
				System.out.println("El n�mero mayor es el " + num1 + " y luego va " + num2 );
							}
			//Si num1 es mayor
			//Mostramos num1 primero 
			else{
				System.out.println("El n�mero mayor es el " + num2 + " y luego va " + num1 );
			}
				//si no, lo mostramos en segunda posici�n
	}

}
