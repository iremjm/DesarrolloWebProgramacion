package Canciones2.programa;
import java.util.Scanner;

import Canciones.cancion.Canciones;

public class Programa {

	public static void main(String[] args) {
		//crear  canci�n 1
			Canciones cancion1=new Canciones("donde esta mi carro");
			cancion1.setAutor("Manolo");
			cancion1.setEstilo("Ca�i");
			cancion1.setEstilo("death");
			cancion1.setEstilo("Grind");
			cancion1.setDuracion(180);	
		
		
		//crear  canci�n 2
			Canciones cancion2=new Canciones("Chaos A.D");
			cancion2.setAutor("Sepultura");
			cancion2.setEstilo("Trash");
			cancion2.setDuracion(210);
				
		//imprimir las canciones
				System.out.println(cancion1);
				System.out.println("Estilos " + cancion1.sbEstilos);
				System.out.println(cancion2);
				
				
	

	}

}