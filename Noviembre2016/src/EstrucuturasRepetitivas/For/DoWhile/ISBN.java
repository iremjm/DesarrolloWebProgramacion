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
		String numISBN;
		int suma=0;
		int cifras;
		//pedimos el número
		System.out.print("Introduce el ISBN: ");
		numISBN= teclado.nextLine();
		if(numISBN.length()!=10){
			System.out.println("Introduce 10 dígitos");
		
			
		}//if
		else{
		//Comprobar que todos son dígitos
		for(int j=1;j<=10;j++){
			char car=numISBN.charAt(j);
			if(car>='0'|| car<'9'){
			System.out.println("El ISBN sólo puede contener dígitos");
			return;
			}//if
		
		}//for que todos son dígitos
			
		//Comprobar si tiene 10 dígitos
		for(int i=1;i<=10;i++){
		//TRES MANERAS DE HACERLO
		//suma=suma+i*isbn.charAt(i-1)-48;//Otra manera de hacerlo
		suma=suma+i*(numISBN.charAt(i-1)-'0');//Otra manera de hacerlo,el caracter 0 es 48 en ascii.
		//suma=suma+i*Integer.parseInt(numISBN.substring(i-1,1));
		//comprobamos la longitud del número
			cifras= 0;//esta variable es el contador de cifras
          /*  while(numISBN!=0){             //mientras a n le queden cifras
            	numISBN = numISBN/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }*/
         
         
       
		if(suma%11==0){
			System.out.println("ISBN Correcto!!!");
		
		}//if
		else {
			System.out.println("ISBN Incorrecto!!!");
		}//else
	}//else
		}//for si tiene 10 dígitos
			
	}

}
