package gui;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import model.GestorPlantaciones;
import model.Plantacion;
public class Programa {
	private static Scanner sc= new Scanner(System.in);
	private static final int OPCION_SALIDA = 5;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	private static GestorPlantaciones gp=new GestorPlantaciones();
	
	public static void main(String[] args) throws Throwable {
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
		System.out.println("***** MEN� Plantaciones *****");
		System.out.println("1.- Sembrar/Plantar");
		System.out.println("2.- Recolectar");
		System.out.println("3.- Listar");
		System.out.println("4.- Alertas");
		System.out.println("5.- Salir");
		System.out.print("Opci�n: ");
	}
	private static int leerOpcion(){
		int opc;
		try{//POSIBLE ERROR... Si no se insterta un n�mero
			opc=sc.nextInt();
			sc.nextLine();
			return opc;
		}catch (InputMismatchException e){
			System.out.println("La opci�n ha de ser un n�mero!!");
			
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
	private static void ejecutarOpcion(int opc) throws Throwable{
		switch(opc){
		case 0://es cuando el usuario ha introducido algo no n�merico en opc.
			break;
		case 1:
		SembrarPlantar();
			break;
		case 2:
			Recolectar();
			break;
		case 3:
			Listar();
			break;
		case 4:
			Alertas();
			break;
		case 5://salir
			System.out.println("Ha salido del programa.");
			break;
		default://error
			System.out.println("La opci�n tiene que ser entre 0 y "+ OPCION_SALIDA);
		}//switch
	
	}//ejecutaopcion
	private static void Alertas() {
		// TODO Auto-generated method stub
		
	}
	private static void Listar() {
		//pedimos al gestor las plantaciones
		ArrayList<Plantacion> lstPlantacion=gp.getPlantaciones();
		//recorremos el array 
		for(int i=0; i<lstPlantacion.size();i++){
			//imprimimos
			System.out.println("Tipo de plantaci�n: "+ lstPlantacion.get(i).toString());
		}
	}
	private static Plantacion pedirDatosPLantacion () throws ParseException{
		System.out.println("Ingresa la parcela");
		int parcela=sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa la fecha de la plantacion(yyyy/MM/dd):");
		Date fechaPlantacion=null;
		try {
			fechaPlantacion = sdf.parse(sc.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ingresa la fecha de recogida(yyyy/MM/dd):");
		Date fechaRecogida=null;
		try {
			fechaRecogida = sdf.parse(sc.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ingresa la especie plantada:");
		String especie=sc.nextLine();
		System.out.println("Ingresa la cantidad plantada:");
		int cantPlant=sc.nextInt();
		Plantacion plnt1=new Plantacion(parcela,fechaPlantacion,fechaRecogida,especie,cantPlant);
		
		return plnt1;
	}
	private static void SembrarPlantar() throws ParseException {
		Plantacion plnt1=pedirDatosPLantacion();
		gp.Plantar(plnt1);
	}
	private static void Recolectar() throws ParseException {
		//Pedir datos 
		Plantacion plnt1=pedirDatosPLantacion();
		System.out.println("Ingresa la cantidad recolectada.");
		//a�adir al gestor
		
	}
}//programa
