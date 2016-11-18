package prueba;
//3.Pedir dos nombres y comprobar si son iguales.
import java.util.Scanner;


public class EjercicoTres {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		//Definimos las variables
		String nombre1;
		String nombre2;
		//Pedimos nombre1
			System.out.print("Ingrese el primer nombre");
		//Ingresamos el primer nombre
			nombre1= teclado.nextLine();
		//Pedimos nombre2
			System.out.print("Ingrese el segundo nombre");
		//Ingresamos el nombre2
			nombre2=teclado.nextLine();
		//comprobamos si los nomres son iguales
			if (nombre1.equals(nombre2)){
		//Mostramos el mensaje diciendo que son iguales
			System.out.println("Los nombres son iguales");
			}
			else{
				System.out.print("Los nombres son distintos");
			}
			
	}

}
