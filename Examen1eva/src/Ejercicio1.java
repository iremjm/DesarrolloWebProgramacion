import java.time.Year;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//se crea un teclado
		Scanner teclado=new Scanner(System.in);
		//definimos las variables
		String nombre;
		int edad;
		final int ACTUAL=2016;
		//mostrar mensajes 
		System.out.println("Introduce tu edad");
		//mostrar mensajes 
		edad =teclado.nextInt();
		teclado.nextLine();
		//mostrar mensajes 
		System.out.println("Introduce tu nombre");
		//recoger datos
		nombre= teclado.nextLine(); 		
		System.out.println("\""+nombre+ " naciste en  " + (ACTUAL-edad) +"\" ");
		System.out.println("\""+nombre+ " naciste en  " + (Year.now().getValue()-edad) +"\" ");
		
	}

}
