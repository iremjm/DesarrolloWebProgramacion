import java.util.Scanner;

/*7. Realizar un programa que pida las notas de 10 alumnos por pantalla y muestre un
		men� de opciones: 1. Listar notas, 2.Calcular la media, 3.Calcular el menor, calcular
		el mayor.*/
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		final int MAX_NOTAS=10;
		double nota []= new double[MAX_NOTAS];
		double suma = 0;
		int cont=0;
		int opcion = 0;
		double notaMenor=100;
		double notaMayor=-1;
		for(int i=0;i<MAX_NOTAS;i++){
			System.out.println("Ingrese la nota : ");
			nota[i]=tc.nextDouble();				
		}//for
		System.out.println("Seleccione una opci�n del 1 al 4.");
		System.out.println(" 1. Listar notas \n 2.Calcular la media \n "
				+ "3.Calcular el menor \n 4,calcular el mayor");
		opcion=tc.nextInt();
		switch(opcion){
		case 1:	for(int i=0;i<MAX_NOTAS;i++){
				System.out.print(" -"+nota[i]);
				}
		case 2:	for(int i=0;i<MAX_NOTAS;i++){
					suma+=nota[i];
				}
				System.out.println("La media es: "+(suma/MAX_NOTAS));
		case 3:	for(int i=0;i<MAX_NOTAS;i++){
					if(nota[i]<notaMenor){
						notaMenor=nota[i];
						
					}//if
					
				}
				System.out.println(notaMenor);
				break;
		case 4:	for(int i=0;i<MAX_NOTAS;i++){
					if(nota[i]>notaMayor){
				notaMayor=nota[i];
				
					}//if
				
				}
					System.out.println(notaMayor);
		break;
		}//switch
	}

}
