package gui;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.GestorTarea;
import model.Tarea;
public class Programa {
	private static Scanner sc= new Scanner(System.in);
	private static final int OPCION_SALIDA = 8;
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
			System.out.println("6.- Leer tareas");
			System.out.println("7.- Guardar Tareas");
			System.out.println("8.- Salir");
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
				finTarea();
				break;
			case 3://Listar tareas
				PedirAlGestorTareas(GestorTarea.LISTAR_TODAS);
				break;
			case 4://Listar Realizadas
				PedirAlGestorTareas(GestorTarea.LISTAR_REALIZADAS);
				break;
			case 5://Listar no Realizadas
				PedirAlGestorTareas(GestorTarea.LISTAR_NO_REALIZADAS);
				break;
			case 6://
				gt.leerTareas();
				break;
			case 7://
				gt.guardarTareas();
				break;
			case 8://salir
				System.out.println("Ha salido del programa.");
				break;
			default://error
				System.out.println("La opci�n tiene que ser entre 0 y "+ OPCION_SALIDA);
			}//switch
		
		}//ejecutaopcion
			private static void AnnadirTarea() {
			//pedir nombre tarea			
			//crear objeto tarea. Se pide mediante pedirTitulo()
			Tarea t1=new Tarea(pedirTitulo());
			gt.addTarea(t1);
			//crear tarea. 
			//pedir al gestor de tareas que a�ada esta tarea
		}
		private static void finTarea() {
			//pedir datos de la tarea al usuario.Se pide mediante pedirTitulo()
			//pedir al gestor que finalice la tarea.
			gt.finTarea(pedirTitulo());
		}//finTarea()
		private static String pedirTitulo(){
		//pedir datos de la tarea al usuario.
		System.out.println("Ingresa el t�tulo de la tarea.");
		String titulo=sc.nextLine();
		return titulo;
		}
		private static void PedirAlGestorTareas(int tipo){
			//Pedir al gestor todas las tareas
			Tarea[] lstTareas= gt.getTareas(tipo);
			//Recorrer el array de tareas e imprimirlas.
			for(int i=0; i<lstTareas.length;i++){
				
				System.out.println("Tarea: "+ lstTareas[i]);
			}
		}
	}//programa


