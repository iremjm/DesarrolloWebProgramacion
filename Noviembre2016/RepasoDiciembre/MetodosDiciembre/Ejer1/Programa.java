package MetodosDiciembre.Ejer1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos el d�a
		TemperaturaMedia dia1=new TemperaturaMedia();
		Scanner tc=new Scanner(System.in);
		String diaSem;
		double tempMin;
		double tempMax;
		String salir="";
		//Pedimos datos por consola
		//while (salir.equals("salir")){	
			
			System.out.println("Ingrese el d�a: ");
			diaSem=tc.nextLine();
			System.out.println("Ingrese la temperatura m�nima del d�a: ");
			tempMin=tc.nextDouble();
			System.out.println("Ingrese la temperatura m�xima del d�a: ");
			tempMax=tc.nextDouble();
			
		
			
				//Asignamos los datos al dia
				dia1.setDia(diaSem);
				dia1.setTemperaturaMin(tempMin);
				dia1.setTemperaturaMax(tempMax);
				
			System.out.println("La temperatura Media del "+dia1.getDia()+" es de " + dia1.TemperaturaMedia()+" grados");
		//}//while
	}

}