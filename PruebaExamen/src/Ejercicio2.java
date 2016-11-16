import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//definimos las variables
		int dia = 0;
		//pedimos un numero del uno al 7
		System.out.println("Ingrese un número del 1 al 7");
		//recogemos número
		dia=teclado.nextInt();
		if(dia>0 && dia<8){
		switch(dia){
		case 1: 
			System.out.println("Hoy es lunes");
		break;
		case 2: 
			System.out.println("Hoy es martes");
		break;
		case 3: 
			System.out.println("Hoy es miércoles");
		break;
		case 4: 
			System.out.println("Hoy es jueves");
		break;
		case 5: 
			System.out.println("Hoy es viérnes");
		break;
		case 6: 
			System.out.println("Hoy es sábado");
		break;
		case 7: 
			System.out.println("Hoy es domingo");
		break;
	    }//swicth
		}//if
		
		else{
			System.out.println("ERROR no ha introducido un número entre el 1 y el 7");
		}
		
	}
}
