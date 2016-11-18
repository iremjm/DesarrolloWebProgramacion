//Importamos la clase Scanner para meter datos con teclado
import java.util.Scanner;
//Importamos la clase DecimalFormat para delimitar decimales
import java.text.DecimalFormat;
public class NotaMedia2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Creamos un objeto de la clase Scanner que permite
		 *  insertar datos con el teclado*/
		Scanner teclado=new Scanner(System.in);
		
		/*Creamos un objeto de las clase DecimalFormat para 
		 * delimitar  decimales*/
		DecimalFormat decimales= new DecimalFormat("0.00");
		
		//Definimos las variables
		String nombre;
		double notProgr;
		double notBD;
		double notLM;
		
		double notMedia;
		
		//Mostramos mensajes en consola
		//System.out.println("Introduzca las notas: " + nombre);
		
		//Metemos el nombre
		System.out.println("Introduzca el nombre del alumno:");
		nombre= teclado.nextLine();
		
		
		//Metemos las notas
		System.out.print("Ingrese la nota de Programación: ");
		notProgr= teclado.nextDouble();
		
		System.out.print("Ingrese la nota de Bases de Datos: ");
		notBD= teclado.nextDouble();
		
		System.out.print("Ingrese la nota de Lenguje de MArcas: ");
		notLM= teclado.nextDouble();
		
		//Asignamos el cálculo a la variable notaMedia
		notMedia= (notProgr+notBD+notLM)/3;
		//Mostramos en pantalla el resultado
		System.out.print("La nota media de "+ nombre + " es de " + decimales.format(notMedia));
		
		
		
		
		
		
		
		
		

	}

}
