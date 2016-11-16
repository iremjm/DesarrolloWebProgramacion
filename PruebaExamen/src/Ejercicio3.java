import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//definimos las variables
		Scanner teclado=new Scanner(System.in);
		double nota=0;
		int cont=0;
		double suma = 0;
		double media=0;
		
		do{
			System.out.println("Introduce una nota");
			nota=teclado.nextDouble();
			if(nota>=0 && nota<=10){
			suma=suma+nota;
			cont++;
			}//if
			else{
				System.out.println("Nota no valida");
			}
		}while(nota>=0);
		
		media=suma/cont;
		if (media>=0 && media<5){
			System.out.print( "Tienes un insuficiente" +"("+ media +")");
		}
		else if (media<6){
			System.out.print( "Tienes un suficiente" +"("+ media +")");
		}
		else if (media<=7){
			System.out.print( "Tienes un bien" +"("+ media +")");
		}
		else if (media<=8){
			System.out.print( "Tienes un Notable" +"("+ media +")");
		}
		else if (media<=10){
			System.out.print( "Tienes un Sobresaliente" +"("+ media +")");
		}
		
		/*
		System.out.print("Tienes un ");
		switch(media){
		case 0 : 
			System.out.print("Suspenso");
		case 1: 
			System.out.print("Suspenso");
		break;
		case 2: 
			System.out.print("Suspenso");
		break;
		case 3: 
			System.out.print("Suspenso");
		break;
		case 4: 
			System.out.print("Suspenso");
		break;
		case 5: 
			System.out.print("Suficiente");
		break;
		case 6:
			System.out.print("Bien");
		break;
		case 7: 
			System.out.print("Notables");
		break;
		case 8: 
			System.out.print("Notables");
		break;
		case 9: 
			System.out.print("Sobresaliente");
		break;
		case 10: 
			System.out.print("Sobresaliente");
		break;
	    }//swicth*/
		
	
		
	}
	

}
