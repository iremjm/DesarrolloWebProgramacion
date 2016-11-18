package prueba;

import java.util.Scanner;

//Pedir un número de 4 cifras y decir si es capicua
public class Ejercicio9 {

	public static void main(String[] args) {
		//creamos el objeto scanner
		Scanner teclado= new Scanner(System.in);
		//Definimos las variables
		int numero, resto, numeroInverso=0, n;
		//Pedimos un número de 4 cifras
		System.out.println("Ingrese un número de 4 cifras");	
			numero= teclado.nextInt();
		//Comprobamos que el numro tenga cuatro cifras
		if(numero>1000 && numero<9999){
			n=numero;
				//Inicializamos las tres variables, que se cumplira mientras que n sea diferente a 0
				while (n != 0){
				//Para obtener el último dígito del número lo haremos con 
				//el resto de una división entre
				//diez. Es decir, si de 4224 queremos obtener el último
			    //dígito haremos la siguiente operación:
				/*le quitamos el último dígito
	            1234 / 10 = 123
	            123 / 10 = 12
	            12 / 10 = 1
	            1 / 10 = 0*/
				resto =n % 10;
				/*Falta tiene el número del que vamos substrayendo dígitos.
				2. Del número original hay que quitarle el último dígito.
				 En este caso utilizamos la división entre 10.*/
				n=n/10;
				/*Habrá que guardar el número substraído. Para ello
				 *  simplemente lo sumaremos al número que tengamos,
				multiplicado por 10. En el primer caso lo haremos 
				sobre el 0. Las secuencias para el n
				0*10+4=4
				4*10+2=42
				42*10+2=422
				422*10+4=4224
				 */
				numeroInverso=numeroInverso*10 + resto;
				}//while
				//Comprobamos que es capicua
					if(numero == numeroInverso){
				//Mostramos que sea apocua
					System.out.println("El número es capicua");
					}//if
						//Mostramos que no es capicua
						else{
						System.out.println("El número no es capicua");
						}//else
		}//if
		else{
			System.out.print("ERROR!!!! El numero ingresado no es valido");
		}//else
	}

}
