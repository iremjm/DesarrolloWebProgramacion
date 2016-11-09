import java.util.Scanner;

public class VerificarNumero {

	public static void main(String[] args) {	
		//Definicion
		int []tNotas={5,4,8,10};
		int numero=10;
		boolean enc=false;
		//pedir numero y comprobar si se encuentra en el array
		for(int i=0;i<tNotas.length;i++){			
			if (tNotas[i]==numero){
				enc=true;
				break;
			}
		}
		if(enc==true){
			System.out.print("Encontrado\n");
		}else{
			System.out.print("No encontrado\n");
		}		
		//pedir numero y mostrar en el primer indice en el que se encuentra
		for(int i=0;i<tNotas.length;i++){
			if(tNotas[i]==numero){
				System.out.println(i);
				break;
			}
		}
		//El primer indice seria en la posicion 0
		//System.out.println(tNotas.length+"");
		//pedir numero y mostrar los indices en los que se encuentra
		
	}//main
}//class//http://jarroba.com/ordenar-arrays-en-java-con-sus-indices/