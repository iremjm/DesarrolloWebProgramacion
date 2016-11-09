
import java.util.Scanner;

public class NumAprobNumSusp {

	public static void main(String[] args) {	
		int []TotNotas={5,4,8,10};
		int contAprob=0;
		int contSusp=0;
		Scanner sc=new Scanner(System.in);		
		//cuenta el numero de aprobados y suspensos
		for(int i=0;i<TotNotas.length;i++){
			//si la nota i es >=5 incrementar contAprobados
			//si no, incrementar contSuspensos
		}//for		
		//calcular la suma de las notas
		int suma=0;
		for(int j=0;j<TotNotas.length;j++){
			suma+=TotNotas[j];				
		}//for
		System.out.println("La suma de las notas es: "+suma);
		System.out.println("La nota media es: "+(double) suma/TotNotas.length);
	}//main
}//class