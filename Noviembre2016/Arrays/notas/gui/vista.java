package notas.gui;
import java.util.Scanner;
import notas.model.Alumno;
import notas.model.Asignatura;

public class vista {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//definimos las variables
	
		String nomAlum;
		String asignatura;
		double nota;
		//pedir nombre del alumno
		System.out.println("Ingresa el nombre del alumno");
		nomAlum = teclado.nextLine();
		//Crear un alumno
		Alumno alu1=new Alumno(nomAlum);
		//mientras no deje el nombre vacio de la asignatura pedir asignaturas
	  
	    // cadena est� vac�a
		//pedir asignatura
		System.out.println("Ingrese la asignatura");
		//ingresar asignatura
		asignatura=teclado.nextLine();
		
		while((!asignatura.equals(""))){
			//pedir nota
			System.out.println("Ingrese la nota");
			//ingresar nota
			nota=teclado.nextDouble();
			//reset
			teclado.nextLine();
			//crear la asignatura
			Asignatura asig=new Asignatura(asignatura);
			asig.setNota(nota);
			//A�ADIR ASIGNATURA AL ALUMNO
			alu1.addAsig(asig);
			//pido nombre asignatura
			System.out.println("Ingrese la asignatura");
			//ingresar asignatura
			asignatura=teclado.nextLine();
		}//while
		
		
		
		//mostrar resultado del expediente Juan[lm:4,prog:5,ddbb:7]
		System.out.println("Ha salido del sistema");
		//Muestro la media
		System.out.println("La nota media de " + alu1.getNomAlum() + " es " + alu1.getMedia());
		//Muestro los valores del alumno
		System.out.println(alu1);
	
	}
}
