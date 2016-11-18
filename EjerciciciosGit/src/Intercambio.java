import java.util.Scanner;
public class Intercambio {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Inicio las variables
		String nombre1;
		String nombre2;
		String auxNom;
		
		//pedir su nombre
		System.out.println("Inserte el primer nombre por favor");
		//leer nombre1
		nombre1=teclado.nextLine();
		//pedir el nombre  del sustituido
		System.out.println("Inserte el segundo nombre por favor");
		//leer nombre2
		nombre2=teclado.nextLine();
		//realizar intercambio del contenido de vaariables
		auxNom= nombre1;
		nombre1=nombre2;
		nombre2=auxNom;
		//mostrar mensaje final
		System.out.print("ok¡ Ahora tu eres " + nombre1+ " y el otro es "+ auxNom);
	}

}
