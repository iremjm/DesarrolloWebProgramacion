import java.util.Scanner;

public class NotasArrays {

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		//String [] asignaturas=new [] ;
		int [] tNotas= new int [10];
		int suma=0;
		//String [] alumnos;
		
		for(int i=0;i<tNotas.length;i ++){
				//Pedimos datos
				System.out.print("Ingrese la nota " + (i+1) + " : ");
				int nota=teclado.nextInt();
				tNotas[i]=nota;
				//Sumar notas
				suma+=nota;
		}
		System.out.println(suma);
	}//main
		
}//class
