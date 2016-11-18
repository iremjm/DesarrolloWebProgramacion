package prueba;
import java.util.Scanner;
//4.Pedir un número e indicar si es positivo o negativo
public class EjercicioCuatro {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		//Defimnimos las variables
		int numero;
		String valor;
		//Pedimos un numero por consola
			System.out.print("Ingrese un número");
		//Ingresamos el número
			numero= teclado.nextInt();
		//Comprobamos si es positivo o negativo
			if(numero==0){
				System.out.print("El número es neutro");
				}
			 if((numero>=1)){
					System.out.print("El número es positivo");
					}
			 if(numero<=-1){
					System.out.print("El número es negativo");
					}
			}
			
			
	}


