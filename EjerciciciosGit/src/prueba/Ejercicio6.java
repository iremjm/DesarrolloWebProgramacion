package prueba;
//6.Pedir dos números y mostrarlos de mayor a menor
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	//Creamos el objeto Scanner
		Scanner teclado= new Scanner(System.in);
		//Definimos las variables
			int num1;
			int num2;
			
			//Pedimos el primer número
			System.out.println("Ingresa el primer número");
			//Insertamos el segundo número por consola
			num1= teclado.nextInt();
			//Pedimos el segundo número
			System.out.println("Ingrese el segundo número");
			//Insertamos el segundo número por consola
			num2= teclado.nextInt();
			//Comprobamos si num1 es mayor a num2
			if(num1>num2){
				System.out.println("El número mayor es el " + num1 + " y luego va " + num2 );
							}
			//Si num1 es mayor
			//Mostramos num1 primero 
			else{
				System.out.println("El número mayor es el " + num2 + " y luego va " + num1 );
			}
				//si no, lo mostramos en segunda posición
	}

}
