package Canciones.programa;
import java.util.Scanner;

import Canciones.cancion.Canciones;

public class Programa {

	public static void main(String[] args) {
		//crear  canci�n 1
		Canciones cancion1=new Canciones("donde esta mi carro");
		cancion1.setAutor("Manolo");
		cancion1.setEstilo("Ca�i");
		cancion1.setDuracion(180);	
		
		
		//crear  canci�n 1
				Canciones cancion2=new Canciones("Chaos A.D");
				cancion2.setAutor("Sepultura");
				cancion2.setEstilo("Trash");
				cancion2.setDuracion(210);
				
		//imprimir las canciones
				System.out.println(cancion1);
				System.out.println(cancion2);
				
				
		
		/*System.out.println("ingrese le t�tulo de la canci�n");
		nomTitu = teclado.nextLine();
		//Crear una canci�n
		Canciones cancion1=new Canciones(nomTitu);
		//mientras no deje el nombre vacio,  pedir 		
		while((!nomTitu.equals(""))){
			
			//A�ado titulo a  canci�n1
			cancion1.setTitulo(nomTitu);
			
			//pedir autor
			System.out.println("Ingrese el autor");
			//dar autor
			nomAutor=teclado.nextLine();
			cancion1.setAutor(nomAutor);
		
			//pedir tipo de canci�n
			System.out.println("Ingrese tipo de canci�n");
			//dar tipo de canci�n
			tipoEstilo=teclado.nextLine();
			cancion1.setAutor(tipoEstilo);
			//pedir tiempo
			System.out.println("Ingrese duraci�n");
			//dar tiempo
			tiempo=teclado.nextDouble();
			cancion1.setDuracion(tiempo);
			//pedir si se ha o�do
			System.out.println("Se ha o�do la canci�n \"true-false\" ");
			oida=teclado.nextBoolean();
		    cancion1.setEscuchada(oida);		
			
		}//while
			
		System.out.println("El titulo de la canci�n es   " + cancion1.getTitulo() + " y el autor " + cancion1.getAutor());
		

		System.out.println("Ha salido del sistema");
		
		System.out.println(cancion1);*/
	

	}

}
