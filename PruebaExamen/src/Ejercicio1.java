import java.sql.Date;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		//definimos las variables
		String nombre;
		int anho;
		final int ACTUAL=2016;
		
		//mostrar mensajes 
		System.out.println("Introduce tu nombre");
		//recoger datos
		nombre= teclado.nextLine(); 
		//mostrar mensajes 
		System.out.println("Introduce a�o de nacimiento");
		//mostrar mensajes 
		anho =teclado.nextInt();
		System.out.println("Nacimiento: " + anho);
		System.out.println("Nombre: " + nombre);
		
		System.out.println(nombre+ " tienes " + (ACTUAL-anho)+" a�os");
		
	}
	
}