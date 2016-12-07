import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creammos La Clase teclado
		Scanner teclado = new  Scanner ( System.in);
		// Definimos las variables
		double nota=0;
		final int MAX_NOTAS =10;
		int contador=0;
		double suma=0;
		double notaMayor =0 ;
		double notaMenor =21 ;//Una nota que no esté entre 0 ó 10.
		double notaMedia=0;
		String mediaTxt = "";
		//comienzo bucle
		for(int i=1;i<=MAX_NOTAS;i++){
			//pedir nota
			System.out.println("introduzca la nota "+ i+ ":");
			//insertar nota
			nota=teclado.nextDouble();
			//comprobar nota
			if(nota>=0 && nota<=10){
				suma=nota+suma;
				contador++;
				if(nota>notaMayor){
					notaMayor=nota;
				}//if
				if(nota<notaMenor){
					notaMenor=nota;
				}//if
			}//if
				
		}//for
		notaMedia=suma/contador;
		if (notaMedia>=0 && notaMedia<5){
			mediaTxt="Insuficiente";
		}
		else if (notaMedia<6){
			mediaTxt="Suficiente";
		}
		else if (notaMedia<=7){
			mediaTxt="Bien";
		}
		else if (notaMedia<=8){
			mediaTxt="Notable";
		}
		else if (notaMedia<=10){
			mediaTxt="Sobresaliente";
		}
		
		System.out.println("Mejor nota " + notaMayor);
		System.out.println("Peor nota " + notaMenor);
		System.out.println("Nota media " + mediaTxt + "("+ notaMedia+")");

	}

}
