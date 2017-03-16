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
	
	private static Scanner sc=new Scanner(System.in);
	private static DateFormat formatoFechaPlan = new SimpleDateFormat("YYYY/MM/dd");
	private static DateFormat formatoFechaRec = new SimpleDateFormat("YYYY/MM/dd");
	private static int OPCION_SALIR=5;
	private static GestorPlantaciones gp=new GestorPlantaciones();

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int opc=0;
		do{		
			MostrarMenu();
			//leer opcion seleccionada
			opc=leerOpcion();
			//ejecutar la opcion seleccionada
			ejecutarOpcion(opc);
		}while(opc!=OPCION_SALIR);
		System.out.println("Has salido del programa!!!");
	}
	private static void MostrarMenu(){
		System.out.println("***** GESTION DE PLANTACIONES ********");
		System.out.println("1.- Sembrar/Plantar");
		System.out.println("2.- Recolectar");
		System.out.println("3.- Listar");
		System.out.println("4.- Alertas");
		System.out.println("5.- Salir");
		System.out.print("Opci�n:");
	}
	private static int leerOpcion(){
		int opc;
		try{//Tratar la excepcion por si escribe algo que no sea un numero
		opc=sc.nextInt();
		sc.nextLine();
		return opc;
		}catch(InputMismatchException e){
			System.out.println("La opcion ha de ser un numero!!!");
			//para saltar lo escrito anteriormente
			sc.nextLine();
			//espera a que el usuario pulse intro
			pulsaIntro();		
			return 0;
		}		
	}
	private static void ejecutarOpcion(int opc) throws ParseException{
		switch(opc){
		case 0://es cuando el usuario ha introducido algo no num�rico en opc
			break;
		case 1://a�adir plantacion
			SembrarPlantar();
			break;
		case 2:
			Recolectar();
			break;
		case 3: 
			//listar plantaciones
			Listar();
			break;
		case 4:
			Alertas();
			break;
		case 5: 
			//Salir
			break;
		default: 
			//error
			System.out.println("La opcion tiene que ser entre 0 y "+OPCION_SALIR);
		}//switch		
	}	
	private static void pulsaIntro() {
		System.out.println("Pulse intro para continuar...");			
		//esperar a que pulse intro
		sc.nextLine();		
	}
	private static void SembrarPlantar() throws ParseException{
		//Pedir datos y crear plantacion
		Plantacion p=pedirDatosPlantacion();
		//A�adir al gestor
		gp.plantar(p);
	}
	private static Plantacion pedirDatosPlantacion() throws ParseException {
		//Pedir parcela
		System.out.println("Introduce la parcela: ");
		int parcela=sc.nextInt();
		sc.nextLine();
		//Pedir fecha plantacion
		System.out.print("Fecha plantacion (YYYY/MM/DD): ");
		String fechaPlant = sc.nextLine();
		Date fechaPlanta = formatoFechaPlan.parse(fechaPlant);
		//Pedir fecha recogida
		System.out.print("Fecha recogida (YYYY/MM/DD): ");
		String fechaRecog = sc.nextLine();
		Date fechaReco = formatoFechaRec.parse(fechaRecog);
		//Pedir especie
		System.out.println("Especie: ");
		String especie=sc.nextLine();
		//Pedir cantidad plantada
		System.out.println("Cantidad plantada: ");
		int cantPlan=sc.nextInt();
		Plantacion p=new Plantacion(parcela,fechaPlanta,fechaReco,especie, cantPlan);
		return p;
	}
	private static void Recolectar() throws ParseException {
		//Pedir parcela
		System.out.println("Introduce la parcela: ");
		int parcela=sc.nextInt();
		sc.nextLine();
		//Pedir fecha plantacion
		System.out.print("Fecha plantacion (YYYY/MM/DD): ");
		String fechaPlant = sc.nextLine();
		Date fechaPlanta = formatoFechaPlan.parse(fechaPlant);
		//pedir cantidad recolectada
		System.out.println("Cantidad recolectada: ");
		int cantRec=sc.nextInt();
		Plantacion p = new Plantacion(parcela,fechaPlanta);
		int indice;
		indice=gp.getPlantaciones().indexOf(p);
		gp.getPlantaciones().get(indice).setCantRec(cantRec);
	}
	private static void Listar(){
		//pedir al gestor todas las plantaciones
		ArrayList<Plantacion> lstParcelas=gp.getPlantaciones();
		//recorrer el array de plantaciones e imprimirlas
			for(int i=0;i<lstParcelas.size();i++){
				System.out.println("Plantacion: "+lstParcelas.get(i).toString());
			}
	}
	private static void Alertas(){
		
	}

}
