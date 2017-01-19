package ExamenRecu;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc=new Scanner(System.in);
			int num1;
			int num2;
			int aux;
			System.out.println("Ingresa el primer número");
			num1=tc.nextInt();
			System.out.println("Ingresa el segundo número");
			num2=tc.nextInt();
			aux=num1;
			num1=num2;
			num2=num1;
			System.out.println("num1: "+ num2 + ", num2: "+num1 );
	}

}
