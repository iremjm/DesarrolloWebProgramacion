package EstrucuturasRepetitivas.For.DoWhile;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Realizar un programa que comprueba si un ISBN es correcto:
http://gaussianos.com/detectar-si-un-isbn-es-erroneo/
*/
public class ISBN {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//definimos las variables
		int numISBN;
		int contador=0;
		int cifras;
		//pedimos el n�mero
		System.out.println("Introduce el ISBN");
		numISBN= teclado.nextInt();
		
		//comprobamos la longitud del n�mero
			cifras= 0;//esta variable es el contador de cifras
          /*  while(numISBN!=0){             //mientras a n le queden cifras
            	numISBN = numISBN/10;         //le quitamos el �ltimo d�gito
                   cifras++;          //sumamos 1 al contador de cifras
            }*/
            String cifrasNum = Integer.toString(cifras);
            
            int cuenta=cifrasNum.length();
            System.out.print(cuenta);
		if(cifras<=10 && cifras>=0){
			System.out.print(cuenta);
		}//if
		else {
			System.out.println("Ingrese un n�mero de 10 d�gitos por favor");
		}
	
			
	}

}
