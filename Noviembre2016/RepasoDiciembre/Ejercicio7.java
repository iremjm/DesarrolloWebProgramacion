import java.util.Scanner;

/*7. Realizar un programa que pida las notas de 10 alumnos por pantalla y muestre un
		men� de opciones: 1. Listar notas, 2.Calcular la media, 3.Calcular el menor, calcular
		el mayor.*/
public class Ejercicio7 {
	private static  Scanner tc=new Scanner(System.in);
	private final int MAX_NOTAS=10;
	private double nota []= new double[MAX_NOTAS];
	
	public static void main(String[] args) {
		Ejercicio7 ej7=new Ejercicio7();//Crear un metodo de la clase para que se puede ejecutar
		ej7.run();

	}
	
	public void run(){
		int opcion = 0;
		leerNotas();
		mostrarMenu();
		opcion=tc.nextInt();
		switch(opcion){
			case 1:imprimirNotas();break;
			case 2:mostrarMedia();break;
			case 3:mostrarMenor();break;
			case 4:mostrarMayor();break;	
			}//switch
	}
	public void leerNotas(){
		int cont=0;
		for(int i=0;i<MAX_NOTAS;i++){
			System.out.println("Ingrese la nota : ");
			nota[i]=tc.nextDouble();
			while(nota[i]<0 || nota[i]>10){//Mientras la nota es menor a 0 o mayor a 10 
				System.out.println("Nota no valida, ingrese un n�mero entre 0 � 10");
				System.out.println("Ingrese la nota : ");
				nota[i]=tc.nextDouble();
			}
		}//for
	}
	public void mostrarMenu(){
		System.out.println("Seleccione una opci�n del 1 al 4.");
		System.out.println(" 1.Listar notas \n 2.Calcular la media \n "
				+ "3.Calcular el menor \n 4.Calcular el mayor");
	}
	public void imprimirNotas(){
		System.out.println("Listado de notas.");
		for(int i=0;i<MAX_NOTAS;i++){
			System.out.print(" ->"+nota[i]);
			}
	}
	public void mostrarMedia(){
		double suma = 0;
		for(int i=0;i<MAX_NOTAS;i++){
			suma+=nota[i];
		}
		System.out.println("La media es: "+(suma/MAX_NOTAS));
	}
	public void mostrarMenor(){
		double notaMenor=100;
		for(int i=0;i<MAX_NOTAS;i++){
			if(nota[i]<notaMenor){
				notaMenor=nota[i];
			}//if
		}
	System.out.println("La nota menor es "+notaMenor);
	}
	public void mostrarMayor(){
		double notaMayor=-1;
		for(int i=0;i<MAX_NOTAS;i++){
			if(nota[i]>notaMayor){
				notaMayor=nota[i];
			}//if
		}
	System.out.println("La nota mayor es "+notaMayor);
	}
}
