import java.util.Scanner;

/*3. Realizar un programa que pida al usuario tres n�meros y los muestra por consola en
el orden inverso al introducido.*/
public class Ejerc3 {

	public static void main(String[] args) {
		/*int num1;
		int num2;
		int num3;
		Scanner tc=new Scanner(System.in);
		System.out.println("Ingresa el primer n�mero");
		num1=tc.nextInt();
		System.out.println("Ingresa el segundo n�mero");
		num2=tc.nextInt();
		System.out.println("Ingresa el tercer n�mero");
		num3=tc.nextInt();
		System.out.println(num3 + " "+ num2+ " "+ num1);*/
		Scanner tc=new Scanner(System.in);
		final int MAX_LENGTH=10;
		int num[]=new int[MAX_LENGTH];
		
		for(int i=MAX_LENGTH-1;i>=0;i--){
			System.out.println("Ingrese un n�mero : ");
			num[i]=tc.nextInt();	
		}
		
		for(int j=0;j<MAX_LENGTH;j++) {
			System.out.print(num[j]+" ");
		}
	}
	

}
