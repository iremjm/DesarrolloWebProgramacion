package EstrucuturasRepetitivas.For.DoWhile;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		Calendar calendario = new GregorianCalendar();
	//Definimos las variables
		int opcionSelec=0;
		int hora, minutos, segundos;
		//Una manera de mostrar la hora
		   hora =calendario.get(Calendar.HOUR_OF_DAY);
		    minutos = calendario.get(Calendar.MINUTE);
		    segundos = calendario.get(Calendar.SECOND);
		  //Otra manera de mostrar la hora
		    LocalTime horaEs= LocalTime.now();
	//Una manera de mostrar la fecha
		LocalDate fecha=LocalDate.now();
	//mostrar menu
		System.out.println("Selecccione una opcion:\n1:Saludo:\n2:Hora:\n3:Fecha:\n4:Salir:");

		do{
			//Seleccionamos el número
			opcionSelec= teclado.nextInt();
			//ejecutamos opcion selecionada
			switch(opcionSelec){
			case 1://Muestro saludo
				System.out.println("Bienvenido");
				break;
			case 2://Muestro la hora
			 
			    System.out.println("Son las " +hora +":"+minutos+":"+segundos);
				System.out.println("Son las " + horaEs);
				break;
			case 3://Muestro las fecha
				System.out.println("Hoy estamos a " + fecha);
				break;
			case 4:
				System.out.println("Saliendo del sistema");
				break;
			default://Muestro error
				System.out.println("Ingrese un número correcto");
		}//swithc
		}//do
		//Si es 4: salimos
		while(opcionSelec !=4);{
	
			System.out.println("Ha salido correctamente");
	}//while
	}//main

}//class
