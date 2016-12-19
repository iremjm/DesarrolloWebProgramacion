import java.util.Scanner;

/*6. Realizar un programa que pida al usuario dos números y presente los números
impares que hay desde el primer número al segundo que introdujo el usuario.*/
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner  tc= new Scanner(System.in);
		int num1;
		int num2;

		System.out.println("Ingrese el número inicial.");
		num1=tc.nextInt();
		System.out.println("Ingrese el número final de la serie.");
		num2=tc.nextInt();
		for(int i=num1;i<num2;i++){
			if (i%2==1){
				
				System.out.print(i+ " --> ");
			}
			
		}
		
	}

}
