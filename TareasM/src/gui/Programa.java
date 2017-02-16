package gui;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.GestorTarea;
import model.Tarea;
public class Programa {
	private static Scanner sc= new Scanner(System.in);
	private static final int OPCION_SALIDA = 6;
	private static GestorTarea gt=new GestorTarea();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0;
		do{
			//Mostrar menu
			mostrarMenu();
			//leer la opci�n selecionada
			opc=leerOpcion();
			//ejecutar la opci�n seleccionada
			ejecutarOpcion(opc);
		}while(opc!=OPCION_SALIDA);
	}//main
	
		private static void mostrarMenu(){
			System.out.println("***** MEN� TAREAS *****");
			System.out.println("1.- A�adir Tarea");
			System.out.println("2.- Finalizar Tarea");
			System.out.println("3.- Listar todas");
			System.out.println("4.- Listar realizadas");
			System.out.println("5.- Listar no realizadas");
			System.out.println("6.- Salir");
			System.out.print("Opci�n: ");
		}
		private static int leerOpcion(){
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
				return 0;//vuleve a mostrar el menu
			}//catch
		
		}//leerOpcion
		private static void pulsaintro() {
			System.out.println("Pulse intro para continuar...");
			//esperar que pulse intro
			sc.nextLine();	
		}

		private static void ejecutarOpcion(int opc){
			switch(opc){
			case 0://es cuando el usuario ha introducido algo no n�merico en opc.
				break;
			case 1://a�adir Tarea
			AnnadirTarea();
				break;
			case 2://Finnalizar Tarea
				
				break;
			case 3://Listar tareas
				
				break;
			case 4://Listar Realizadas
				
				break;
			case 5://Listar no Realizadas
				
				break;
			case 6://salir
				System.out.println("Ha salido del programa.");
				break;
			default://error
				System.out.println("La opci�n tiene que ser entre 0 y "+ OPCION_SALIDA);
			}//switch
		}//ejecutaopcion
		private static void AnnadirTarea() {
			//pedir nombre tarea			
			System.out.println("Ingresa el nombre de la tarea.");
			String nomTarea=sc.nextLine();
			//crear objeto tarea
			Tarea t1=new Tarea(nomTarea);
			gt.addTarea(t1);
			
			//crear tarea
			//pedir al gestor de tareas que a�ada esta tarea
			
		}
	
	
	}//programa


