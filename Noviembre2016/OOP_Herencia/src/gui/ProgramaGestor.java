package gui;
import java.io.FileInputStream;
import java.util.Scanner;
import model.Alumno;
import model.GestorAlumnos;
public class ProgramaGestor {
	private static GestorAlumnos ga=new GestorAlumnos();
	private static Scanner sc=new Scanner (System.in);
	public static void main(String[] args){

		int opc=0;
		do{
			mostrarMenu();
			//leer opci�n
			opc=sc.nextInt();
			 sc.nextLine();
			//ejecutar opcion
			ejecutarOpcion(opc);
		}while(opc!=6);
	}
	public static void mostrarMenu(){
		System.out.println("***** MEN� DE ALUMNOS *****");
		System.out.println("1.- A�adir");
		System.out.println("2.- Modificar");
		System.out.println("3.- Borrar");
		System.out.println("4.- Buscar");
		System.out.println("5.- Imprime");
		System.out.println("6.- Salir");
		System.out.print("Opci�n:");
	}
	public static void ejecutarOpcion(int opc){
		switch(opc){
		case 1://a�adir alumno
		anadeAlumno();
			break;
		case 2://modificar alumno
			modAlumno();
			break;
		case 3:///borrar alumno
			BorraAlumno();
			break;
		case 4://buscar alumno
			//pedir nombre al asuario
			System.out.println("Ingresa el nombre:");
			String nombre=sc.nextLine();
			//pedir al gestor el alumno
			Alumno al=ga.getAlumno(nombre);
			//muestra sus datos por consola
			if(al==null){
				System.out.println("Alumno no encontrado!!");
			}else{
			System.out.println(al);
			}
			break;
		case 5://imprime alumno
			PrintAlumno();
			break;
		case 6://salir
			break;
		default://error
			System.out.println("Ingrese un valor del menu");
		}//switch
	}
	private static void anadeAlumno() {
		// TODO Auto-generated method stub
		//pedir datos  y crear alumno
		Alumno al=PedirDatosAlumno();
		//llamar la metodo al m�todo del gestor addAlumno
		ga.addAlumno(al);	
	}
	private static void modAlumno() {
		//pedir indice o c�digo
		int index=sc.nextInt();
		//pedir datos  y crear alumno
		Alumno al=PedirDatosAlumno();		
		//llamar al m�todo del gestor modAlumno()
		ga.modAlumno(index, al);
	}
	private static Alumno PedirDatosAlumno(){
		//pedir nombre
		System.out.println("Nombre: ");
		String nombre=sc.nextLine();
		//pedir nota
		System.out.println("Nota: ");
		double nota=sc.nextDouble();
		//crear objeto alumno con los datos
		Alumno al= new Alumno(nombre,nota);
		return al;
	}
	private static void BorraAlumno(){
		//pedir indice o c�digo
		int index=Pideindice();
		ga.delAlumno(index);
		System.out.println("El alumno "+ index + " ha sido eliminado.");
	}
	private static int Pideindice() {
		// TODO Auto-generated method stub
		System.out.println("Indice: ");
		int index=sc.nextInt();
		sc.nextLine();
		return index;
	}
	private static void PrintAlumno() {
		// TODO Auto-generated method stub
		
		ga.leerListado();
	}
}
