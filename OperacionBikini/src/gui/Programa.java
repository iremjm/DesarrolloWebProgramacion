package gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.GestorEntrena;

public class Programa {
	private static Scanner sc=new Scanner(System.in);
	private static GestorEntrena entr=new GestorEntrena();
	private static final int OPCION_SALIDA=6;
	public static void main(String[] args) {
		int opc=0;
			do{
				//Mostrar menu
				motrarMenu();
				//leer opci�n
				opc=leerOpcion();
				//ejecutar la opci�n
				ejecutarOpcion();
			}while(opc!=OPCION_SALIDA);

	}//main
	private static void motrarMenu() {
		System.out.println("***** Entrenamientos *****");
		System.out.println("1.- Nuevo");
		System.out.println("2.- Eliminar");
		System.out.println("3.- Modificar");
		System.out.println("4.- Listar ");
		System.out.println("5.- Totales");
		System.out.println("6.- Salir");
		System.out.print("Opci�n: ");
		
	}
	private static int leerOpcion() {
		int opc;
		try{//POSIBLE ERROR... Si no se insterta un n�mero
			opc=sc.nextInt();
			sc.nextLine();
			return opc;
		}catch (InputMismatchException e){
			System.out.println("La opci�n ha de ser un n�mero !!");
			//para saltar lo escrito anteiormente
			sc.nextLine();
			//espera a que el usuario pulse intro
			pulsaintro();
			return 0;
		}//catch
	}//leerOpcion
	private static void pulsaintro() {
			System.out.println("Pulse intro para continuar...");
			//esperar que pulse intro
			sc.nextLine();	
		}	
	private static void ejecutarOpcion() {
	
		
	}
	


}
