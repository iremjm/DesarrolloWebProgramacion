import java.util.Scanner;

/*Realizar un programa que pida al usuario dos n�meros y diga cu�l es el mayor y
cu�l el menor.*/
public class Ejerc4 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner tc=new Scanner(System.in);
		System.out.println("Ingresa el primer n�mero");
		num1=tc.nextInt();
		System.out.println("Ingresa el segundo n�mero");
		num2=tc.nextInt();
		if (num1>num2){
			System.out.print(num1 + " es mayor que " + num2);
		}
		else{
			System.out.print(num2 + " es mayor que " + num1);
		}
	}

}
