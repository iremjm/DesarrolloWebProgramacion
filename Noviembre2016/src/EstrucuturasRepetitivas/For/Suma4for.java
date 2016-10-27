package EstrucuturasRepetitivas.For;
//Pide al usuario 4 números  y muestra su suma utilizando la estructura for
import java.util.Scanner;
public class Suma4for {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int num;
		int suma=0;
		for(int i=1;i<=4;i++){
			System.out.println("introduzca un número");
			num= teclado.nextInt();
			suma+=num;
		}//for
		System.out.println("La suma de los números es " + suma);
	}		

}
