/*1)Crea un programa Java que permita “jugar a adivinar un número” como se expone a
continuación. El programa debe iniciarse indicando “Se ha generado un número aletatorio
entero entre 1 y 100, intente adivinarlo”. El usuario introducirá un número y si el número
aleatorio generado por el ordenador es menor deberá indicarse “No has acertado: el número
es menor. Prueba otra vez”. Si el usuario introduce un número menor que el número
aleatorio deberá indicarse “No has acertado: el número es mayor”.
El programa terminará cuando el usuario introduzca el número aleatorio que había
escogido el ordenador.
2)*/
package EjerciciosENERO;
import java.util.Random;


public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //hay que importar la librerai Random
	    //java.util.Random

	    //generador de numeros aleatorios
	    Random generadorAleatorios = new Random();

	    //genera un numero entre 1 y 5 y lo guarda en la variable numeroAleatorio
	    int numeroAleatorio = 1+generadorAleatorios.nextInt(5);
	    //imprimo el numero en consola
	    System.out.println(numeroAleatorio);

	}
	}

}
