//import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculadoraFruteria{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usamos el objeto Scanner para meter valores mediante el teclado
			Scanner teclado= new Scanner(System.in);
			
		//Usamos el objeto DecimalFormat 
			//DecimalFormat deicimales= new DecimalFormat("0.00");
			
			//Definimos las variables
			String producto;
			double precioKilo;
			double cantidad;
			
			double resultado;
			double ofertaEspecial;
			
			//Añadimos que fruta se va a calcular
			System.out.print("Que fruta va a añadir: ");
			producto=teclado.nextLine();
			
			//Añadimos que precio tiene el kg
			System.out.println("Añada el precio por Kg de " + producto);
			precioKilo=teclado.nextDouble();
			
			//Añadimos que cantidad se va a calcular
			System.out.println("Cuantos kilos quiere añadir de " + producto);
			cantidad=teclado.nextDouble();
			
			
			//Hacemos el calculo  de precio kg por precio kg
			resultado= precioKilo * cantidad;
			
			//Mostramos el resultado por pantalla
			/*System.out.print("Usted ha añadido "+ cantidad + "Kg " +" de "+ producto + 
					" con un coste de " + resultado + " €");*/
			
			
			
			
	
			/*System.out.println("Usted ha añadido "+ cantidad + "Kg " +" de "+ producto + 
			" con un coste de " + String.format("%.2f", resultado));*/
			
			
			//Si compras más de 20€ tienes un 10% de descuentos
			if (resultado>20){
				resultado =resultado*0.9;
				

				if(producto.equals="fresas"){
					ofertaEspecial=resultado*0.95;
			}
			}
		System.out.print("CON EL 10% DE DESCUENTO SE QUEDA EN " + String.format("%.2f", resultado)+ " €" );
			//else (){}
			
		
			

	}

}
