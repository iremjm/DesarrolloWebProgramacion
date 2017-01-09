/*3 Crear el programa, utilizando la tÃ©cnica de programaciÃ³n estructurada, para un determinado
comercio en el que se realiza un descuento dependiendo del precio de cada producto. Si el
precio es inferior a 6 euros, no se hace descuento; si es mayor o igual a 6 euros y menor que 60
euros, se hace un 5 por 100 de descuento, y si es mayor o igual a 60 euros, se hace un 10 por
100 de descuento. Finalizar visualizando el precio inicial, el valor del descuento y el precio final.
Nota: Puedes utilizar las siguientes funciones:
â—� leerPrecio: QuÃ© lee un precio y valida que sea positivo.
â—� calcularDescuento: Que recibe un precio y devuelve el descuento.
â—� CalcularPrecioTotal: Que recibe un precio y y el descuento y devuelve el precio final.*/
package MetodosDiciembre.Ejer3;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor;
		ImporteTienda Importe1=new ImporteTienda();
		Scanner tc=new Scanner (System.in);
		
		System.out.println("Ingrese el precio del producto");
		valor =tc.nextDouble();
		
		Importe1.setPrecio(valor);
		
		Importe1.ComprobarPrecioMayor6();
		Importe1.LeerResultado();
	}

}
