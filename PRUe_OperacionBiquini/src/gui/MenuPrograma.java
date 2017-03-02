package gui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import manager.GestorEntrena;
import model.Entrena;

public class MenuPrograma {
	
	private static Scanner sc=new Scanner(System.in);
	
	private static GestorEntrena gestor = new GestorEntrena();
	
	private static DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	
	private static int opcion = 0;
	private static final int OPCION_SALIDA = 6;

	public static void main(String[] args) {

		do {
			try {
				mostrarMenu();
				opcion=pedirOpcion();
				ejecutarOpcion(opcion);
			} catch (InputMismatchException e) {
				System.out.println("Introduce un numero entero valido...");
				sc.nextLine();
			} catch (NumberFormatException | ParseException e) {
				System.out.println("Introduce los datos segun el formato indicado...");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("El entrena a modificar no existe...");
			}
		} while (opcion!=OPCION_SALIDA);

	}

	private static void mostrarMenu() {
		System.out.println("----------------------");
		System.out.println("** ENTRENAMIENTOS **");
		System.out.println("Nuevo: 1");
		System.out.println("Eliminar: 2");
		System.out.println("Modificar: 3");
		System.out.println("Listar: 4");
		System.out.println("Totales: 5");
		System.out.println("Salir: 6");
		System.out.println("----------------------");
		System.out.print("Introducir opcion: ");	
	}
	
	private static int pedirOpcion() throws InputMismatchException{
		int opc=sc.nextInt();
		sc.nextLine();
		return opc;
	}
	
	private static void ejecutarOpcion(int opcion) throws NumberFormatException, InputMismatchException, ParseException, IndexOutOfBoundsException {
		switch (opcion) {
		case 1:
			gestor.addEntrena(pedirDatos());
			break;
		case 2:
			gestor.delEntrena(pedirDatosBusqueda());
			break;
		case 3:
			Entrena entrena = pedirDatosBusqueda();
			if (gestor.existeEntrena(entrena)) {
				gestor.modEntrena(entrena, pedirDatos());
				break;
			} else {
				System.out.println("El entrena a modificar no existe...");
				break;
			}
		case 4:
			System.out.println(gestor.getEntrenas().toString().replaceAll(",", "\r\n"));
			break;
		case 5:
			mostrarTotales();
			break;
		case 6:
			despedida();
			break;

		default:
			System.out.println("Introduce un numero valido (1-6)");
			break;
		}
	}
	
	private static Entrena pedirDatosBusqueda() throws NumberFormatException, ParseException{
		System.out.print("Fecha (YYYY/MM/DD): ");
		String fechaString = sc.nextLine();
		Date fechaDate = formatoFecha.parse(fechaString);
		System.out.print("Lugar: ");
		String lugar = sc.nextLine();
		return new Entrena(fechaDate, lugar);
	}
	
	private static Entrena pedirDatos() throws NumberFormatException, ParseException, InputMismatchException{
		Entrena entrena = pedirDatosBusqueda();
		System.out.print("Kilometros: ");
		entrena.setKms(sc.nextDouble());
		sc.nextLine();
		System.out.print("Minutos: ");
		entrena.setMins(sc.nextInt());
		sc.nextLine();
		return entrena;
	}

	private static void mostrarTotales() {
		System.out.println("Kilometros totales: "+gestor.getTotalKms());
		System.out.println("Minutos totales: "+gestor.getTotalMins());
		System.out.println("Velocidad media: "+gestor.getVelocidadMedia()+" Km/h");
	}

	private static void despedida(){
		System.out.println("----------------------");
		System.out.println("Gracias por usar JuanZMgestorEntrenamientos");
	}

}
