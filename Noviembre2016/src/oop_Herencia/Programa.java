package oop_Herencia;

import java.util.Arrays;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		String nombreAlum;
			
		Persona p1=new Persona("Juan");
		Profesor profe1=new Profesor("Aitor");
		profe1.setSalario(2000);
		System.out.println(profe1);
		System.out.println(p1);
		
		Alumno alumn1=new Alumno("");
		alumn1.setNota("LM:7, BBDD:7");
		System.out.println("Ingresa el nombre");
		nombreAlum=tc.nextLine();
		
		alumn1.setNombre(nombreAlum);
		System.out.println(alumn1);
		if(profe1 instanceof Profesor){
			Profesor profe2=(Profesor)profe1;
			profe2.setPrecioHora(60);
			//Alquilable b=new Alquilable(); <-- No se pueden crear porque no implementa el interfaz
			Alquilable a=profe2;// Ok
			//Alquilable b=new Alquilable(); <-- No se pueden crear porque no implementa el interfaz
			Alquilable [] lista= new Alquilable [100];
			
		}
		//pruebas interface Alquilable
		//crear un array con 10 alumnos, nombre y nota
		Alumno [] listado= new Alumno [10];
		listado[0]= new Alumno ("Maialen,5");
		listado[1]= new Alumno ("Jos�,3");
		listado[2]= new Alumno ("Ruth,3");
		listado[3]= new Alumno ("Ahinara,6");
		listado[4]= new Alumno ("Bego�a,5");
		listado[5]= new Alumno ("Mikel,9");
		listado[6]= new Alumno ("Antxon,2");
		listado[7]= new Alumno ("Miguel,5");
		listado[8]= new Alumno ("Paqui,10");
		listado[9]= new Alumno ("Laura,5");
		
		//ordenar el array por nota utilizando Array.sort(Object)
		Arrays.sort(a);
		//mostrar el array ordenado por
		
		
	}

}
