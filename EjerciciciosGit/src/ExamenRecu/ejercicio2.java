package ExamenRecu;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc=new Scanner(System.in);
		String color;
		String equipo;
		System.out.println("Ingresa el color de la trainera");
		System.out.println("-->verde\n-->rosa\n-->amarillo\n-->azul");
		color=tc.nextLine();
		if(color.equals("rosa")){
			System.out.println("San Juan");
		}else if(color.equals("verde")){
			System.out.println("Hondarribi");
		}else if(color.equals("amarillo")){
			System.out.println("Orio");
		}else if(color.equals("morado")){
			System.out.println("San Pedro");
		}else if(color.equals("Azul")){
			System.out.println("Kaiku");
		}else{
			System.out.println("Selecione un color valido");
		}
			
	}
}