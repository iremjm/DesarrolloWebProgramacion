package EstrucuturasRepetitivas.For.While;

import java.util.Scanner;

public class DaUnoSal {

	public static void main(String[] args) {
		float num = 0.0f;
		int cont=0;
		Scanner tc=new Scanner (System.in);
		System.out.println("Introduce un n�mero: ");
		num=tc.nextInt();
		/*System.out.print(num+" ");*/
		while(num!=1 && cont<100){
			if(num%2==0){
				num/=2;
				cont++;
				
			}else {
				num=(num*3)+1;
				cont++;
			}
			System.out.println(num);
		}
		System.out.println("Ya llegaste al 1");
		System.out.println("El contador es "+ cont);
	}
	
}