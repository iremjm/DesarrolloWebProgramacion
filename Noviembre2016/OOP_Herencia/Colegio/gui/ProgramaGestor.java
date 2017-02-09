package gui;
import java.io.FileInputStream;
import java.util.Scanner;
public class ProgramaGestor {
	public static void mostrarMenu(){
		System.out.println("***** MEN� DE ALUMNOS ********");
		System.out.println("1.-A�adir");
		System.out.println("2.- Modificar");
		System.out.println("3.- Borrar");
		System.out.println("4.- Buscar");
		System.out.println("5.- Imprime");
		System.out.println("6.- Salir");
		System.out.print("Opci�n:");
	}
	public static void ejecutarOpcion(opc){
		switch(opc){
		case 1://a�adir alumno
			break;
		case 2://modificar alumno
			break;
		case 3:///borrar alumno
			break;
		case 4://buscar alumno
			break;
		case 5://imprime alumno
			break;
		case 6://salir
			break;
		default://error
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorAlumnos ga= new GestorAlumnos();
		Scanner sc=new Scanner(System.in);
		//mostrar menu
		int opc=0;
		do{
		mostrarmenu();			
		//leer opci�n
		opc=sc.nextInt();
		//ejecutar opci�n
		ejecutarOcion(opc);
	
		}while(opc!=6);
	
		//a�adir alumnos
		ga.addAlumnos(new Alumno("Pedro",5));
		ga.addAlumnos(new Alumno("Alex",7));
		System.out.println("Total alumnos: "+ ga.getSize());
	}

}