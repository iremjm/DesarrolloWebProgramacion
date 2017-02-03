import java.util.Scanner;

/*realizar un programa que pida al usuario dos numeros y un operador (+,-,/,*) y controlar que el
 *usuario escriba valores nuemricos y que si divide entre cero mediante excepciones*/
public class EjerciciosExcepciones {
	
	public static void main(String[] args) {
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		//atributos
		int a=100;
		double b=0;
		double c=a/b;
		System.out.println(c);
		System.out.println(Double.POSITIVE_INFINITY);
		sc.hasNextDouble();
	}

}
