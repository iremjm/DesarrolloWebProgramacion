import java.util.Scanner;

/*2. Realizar un programa que pida al usuario un n�mero y presente los n�meros del 1 al
n�mero que introdujo el usuario.*/
public class Ejerc2 {

	public static void main(String[] args) {
		int num;
		Scanner tc=new Scanner(System.in);
		System.out.println("Ingresa un n�mero");
		num=tc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
