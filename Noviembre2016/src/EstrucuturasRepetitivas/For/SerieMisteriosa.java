package EstrucuturasRepetitivas.For;

import java.util.Scanner;

public class SerieMisteriosa {

	public static void main(String[] args) {
		int num=0;
		Scanner tc=new Scanner (System.in);
		for(int i=1;i<=100;i++){
			num=i;
			System.out.print(num+" ");
			while(num!=1){
				if(num%2==0){
					num/=2;
				}else {
					num=(num*3)+1;
				}
				System.out.print(num+" ");
			}
			//añadir un salto de línea para la siguiente série
			System.out.println();
		}
		
	}
	

}
