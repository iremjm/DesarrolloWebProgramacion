//Importamos la clase Scanner para ingresar valores por teclado
import java.util.Scanner;
//Importamos la clase DecimalFormat para limitar los decimales
import java.text.DecimalFormat;
//Definimos la función main
public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Definir una variable para guardar la nota de programación
Definir una variable para guardar la nota de lenguaje de marcas
Definir una variable para guardar la nota de BBDD
		
Inicializa las vars con las notas q vas a sacar
Definir una var para calcular tu media
Escribe tu media por consola*/
		
		
			/*Creamos un objeto de la clase Scammer que permite
			ingresar por teclado los valores*/
			Scanner teclado=new Scanner(System.in);
			
			/*Creamos un objeto de la clase DecimalFormat para 
			 * delitar los decimales*/
			DecimalFormat decimales = new DecimalFormat("0.0");
			
			////Definimos las variables
			float notaProgramacion;
			float notaMarcas;
			float notaBase;
			float notaMed;
			
			//Para mostrar mendajes en la consola utlizamos:
			System.out.print("Ingrese la nota media de la asignatura de Programacíon: ");
			//para cargar valores enteros por teclado 
			notaProgramacion=teclado.nextFloat();
			
			System.out.print("Ingrese la nota media de la asignatura de Lenguaje de Marcas: ");
			notaMarcas=teclado.nextFloat();
			
			System.out.print("Ingrese la nota media de la asignatura de Bases de Datos: ");
			notaBase=teclado.nextFloat();
			
			//Asignamos el cálcuo a la variable notaMed
			notaMed=(notaProgramacion + notaMarcas + notaBase)/3;
			//Mostramos en pantalla el resultado
			System.out.print("La nota media del alumno es: " + decimales.format(notaMed) );
			
			
			
	}

}
