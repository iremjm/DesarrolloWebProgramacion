
package CreacionObjetos;
import java.util.Scanner;
public class ProgramaAlumno {

	public static void main(String[] args) {
		//iniciar scanner
		Scanner sc= new Scanner(System.in);
		System.out.print("Alumno: ");
		String nombre=sc.nextLine();
		//Crear alumno
		Alumno alum1=new Alumno();
		alum1.setNombre("");
		System.out.print(alum1.getNombre());
		System.out.print("Asignatura: ");
		String asignatura=sc.nextLine();
		System.out.print("Nota: ");
		
		

	}

}