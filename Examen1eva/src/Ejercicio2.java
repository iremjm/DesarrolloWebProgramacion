import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
			//creamos la entrada teclado
			Scanner teclado=new Scanner (System.in);
			//definimos las variables
			String asignatura = "";
			String codigo="";
			//pedimos la asignatura
			System.out.println("Elija una asignatura: \n ->PR \n ->ED \n ->BD \n ->LM \n ->SI");
			codigo=teclado.nextLine();

			if(codigo.equals("PR")){
				asignatura="Programación";
			}//if
			else if(codigo.equals("ED")){
				asignatura="Entornos de desarrollo";
			}//if
			else if(codigo.equals("BD")){
				asignatura="Bases de datos";
			}//if
			else if(codigo.equals("LM")){
				asignatura="Lenguajes de marcas";
			}//if
			else if(codigo.equals("SI")){
				asignatura="Sistemas Informáticas";
			}//if
			else{
				System.out.println("No ha introducido una asignatura correcta");
			}
			System.out.println(codigo+"->"+ asignatura);
		}
}
