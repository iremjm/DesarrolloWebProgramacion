package oop_Herencia;

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
	}

}
