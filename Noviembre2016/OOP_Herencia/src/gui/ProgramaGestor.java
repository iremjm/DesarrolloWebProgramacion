package gui;
import java.io.FileInputStream;

public class ProgramaGestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorAlumnos ga= new GestorAlumnos();
		//añadir alumnos
		ga.addAlumnos(new Alumno("Juan",5));
		ga.addAlumnos(new Alumno("Erik",7));
		System.out.println("Totak alumnos: "+ ga.getSize());
	}

}
