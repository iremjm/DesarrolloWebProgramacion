package prueba;
///Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos el objeto Scanner
			Scanner teclado= new Scanner(System.in);
			int numero;
			int cifras = 0;
			
			//Pedimos el numero por pantalla
			System.out.println("Inserte un número entre 0 y 9999");
			//Metemos el número por teclado
			numero= teclado.nextInt();
			int numerocon=numero;
			//Comprobamos que numero no sea mayor a 9999 o menor a 0
			if(numero<0 || numero>9999){
				//Si se cumple if mostramos un mendaje de ERROR
					System.out.println("ERROR!!! Ha insertado el **"+ numero +"** Inserte un número entre 0 y 9999.");
					//Volvemos a meter el número por teclado
					numero=teclado.nextInt();
			}
				else{
					while(numerocon>0){
						  /*le quitamos el último dígito
		            	 1234 / 10 = 123
		            	 123 / 10 = 12
		            	 12 / 10 = 1
		            	 1 / 10 = 0*/
						numerocon=numerocon/10;
						cifras ++;
						
						}
				System.out.println("El número "+ numero + " tiene "+cifras+" dígitos");
				
				
				}
	}
}
