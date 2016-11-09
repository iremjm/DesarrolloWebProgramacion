import java.util.Scanner;

public class OrdenInverso {

	public static void main(String[] args) {	
		int []TotNotas={5,4,8,10};
		Scanner sc=new Scanner(System.in);	
		//escribe las notas en orden inverso al introducido
		for(int i=TotNotas.length-1;i>=0;i--){		
			System.out.println("Nota "+i+":"+TotNotas[i]);			
		}
		//calcular la suma de las notas
		int suma=0;	
		for(int j=0;j<TotNotas.length;j++){
			suma+=TotNotas[j];				
		}//for
		System.out.println("La suma de las notas es: "+suma);
		System.out.println("La nota media es: "+(double) suma/TotNotas.length);
	}//main

}//class
