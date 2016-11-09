import java.util.Scanner;

public class NotasAprobados {

	public static void main(String[] args) {	
		int []TotNotas={5,4,8,10};
		Scanner sc=new Scanner(System.in);		
		//escribe solo las notas aprobadas en orden introducido
		for(int i=0;i<4;i++){
			if(TotNotas[i]>=5){
				System.out.println("Nota "+i+":"+TotNotas[i]);
			}//if
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