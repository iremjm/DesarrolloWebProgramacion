package EstrucuturasRepetitivas.For;
//Crear una escalera con asteriscos
import java.util.Scanner;

public class CrearEscalera {

	public static void main(String[] args) {
	Scanner teclado= new Scanner (System.in);
		int cantidad= 0;
		//Mostramos mensaje para pedir n�mero
		System.out.println("Ingrese el n�mero");
		//ingresamos el n�mero
		cantidad= teclado.nextInt();
		for(int i =1; i <=cantidad; i ++){
			for(int j = 1; j <= i; j++ ){
			System.out.print("X");
			
			}//for
			System.out.print("\n");
		}
	}

}


/*if(i==cantidad){
	System.out.print("x");
}//if
else{
	System.out.print("\n");
}//else*/