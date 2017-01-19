package ExamenRecu;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		int num = -1;
		int numMayor = 0;
		int suma = 0;
		int cont=0;
		do{
			System.out.println("Ingresa un número");
			num=tc.nextInt();
			cont++;
			if(numMayor>num){
				numMayor=num;
			}
			suma=suma+num;
			System.out.println("Número: " + num);
		}
		while(num!=0);
		
		System.out.println("Cantidad: " + cont );
		System.out.println("Suma: " + suma );
		System.out.println("Mayor: " + numMayor );

	}

}
