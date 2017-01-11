/*2) Defina una clase 'Monedero' que permita gestionar la cantidad de dinero de que una persona
dispone en un momento dado.
La clase tendrá los siguientes métodos:
* Constructor común: que inicializa el dinero a 0.
* Constructor de inicialización: Donde se indica el dinero que tendrá el monedero. No se puede
indicar un número negativo.
* Constructor de copia.
* meterDinero: Método que me permite meter más dinero en el monedero.
* sacarDinero: Método que me permite sacar dinero. Por supuesto, no se podrá sacar más
dinero del que haya en un momento dado en el monedero.
* consultar: Método que me devuelve la cantidad de dinero que hay en el monedero.
Para probar el funcionamiento de la clase, escriba un método 'main' con una serie de
instrucciones que hagan uso de los métodos definidos.*/
package EjerciciosENERO.Monedero.program;

import java.util.Scanner;

import EjerciciosENERO.Monedero.Clase.Monedero;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		Monedero Monedero1 = new Monedero(10000.0);//instanciamos Monedero, la variable apuntará al objeto que creé
		
		System.out.println("Elija la operación que desea realizar:\n-------------------------------------"
				+ "\n 1.Añadir dinero.\n--------------------"
				+ "\n 2.Sacar dineron.\n--------------------"
				+ "\n 3.Mostrar saldo.\n--------------------");
		int opcion = tc.nextInt();
		switch(opcion){
			case 1: System.out.println("Suma a introducir: ");
					Monedero1.meterDinero(tc.nextDouble());//pasamos parametro al metodo para sumar  saldo
					System.out.println(Monedero1);
					return;// si acaba, vuelve al main
					
			case 2: System.out.println("extraer saldo: ");
					Monedero1.sacarDinero(tc.nextDouble());//pasamos parámetro al metodo para quitar saldo
					System.out.println(Monedero1);
					return;
					
			case 3:	System.out.println(Monedero1); //Metodo toString 
					return;
					
			default:System.out.println("Ingrese uno de los valores indicados.\nVuelva a reiniciar la aplicaión Gracias");
		}
			
	
		
	}

}
