package Garaje.programa;

import Garaje.clases.Garaje;
import Garaje.clases.Vehiculos;

public class Programa {

	public static void main(String[] args) {
			//crear vehiculo1
			Vehiculos v1=new Vehiculos ("1234543");
			v1.setNumRuedas(4);
			v1.setSocio(true);
			//crear vehiculo2
			Vehiculos v2=new Vehiculos ("1234543");
			v2.setNumRuedas(4);
			v2.setSocio(true);
			//Crear un garaje
			Garaje g1=new Garaje ("El txofre");
			
			
	}

}
