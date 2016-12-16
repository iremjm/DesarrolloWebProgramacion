import java.util.Scanner;

/*Realizar un programa que pida al usuario dos números y diga cuál es el mayor y
cuál el menor.*/
public class Ejerc4 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner tc=new Scanner(System.in);
		System.out.println("Ingresa el primer número");
		num1=tc.nextInt();
		System.out.println("Ingresa el segundo número");
		num2=tc.nextInt();
		if (num1>num2){
			System.out.print(num1 + " es mayor que " + num2);
		}
		else{
			System.out.print(num2 + " es mayor que " + num1);
		}
	}

}
