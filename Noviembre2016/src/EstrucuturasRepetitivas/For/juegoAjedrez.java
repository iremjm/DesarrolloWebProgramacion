package EstrucuturasRepetitivas.For;

import java.util.Scanner;

public class juegoAjedrez {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double numero=1;
		System.out.println("Ingresa un n�mero");
		numero=teclado.nextDouble();
		for (double i=1;i<=64;i++){
			double resultado=(double)Math.pow(numero, i);
			System.out.println(resultado);
		}
			
	}

}
