import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {


	//Defimos las constantes
		final int MAYORIA_EDAD=18;
	//Definos las variables
		String nombre;
		int edad;
		//años que tiene que esperar para matricularse
		int anosEspera;
		//plural singular constantes
		final String singular=" año";
	
		
		//definmos scanner para leer en consola
		Scanner teclado=new Scanner(System.in);
		
		//mostrar mensaje inicial 
	
		//pedir nombre 
		System.out.print("Ingrese el nombre del alummno");
		//leer nombre y guardarlo en la variable
		nombre=teclado.nextLine();
		//leer edad y guardarlo en la variable
		System.out.print("Ingrese la edad del alumno");
		edad=teclado.nextInt();
		//si es mayor de edad 
				if(edad>=MAYORIA_EDAD){
					//escribir matricula realizada
					System.out.print("La matrícula de "+nombre+" ha sido realizada");
				}
			
		
		//si no es mayor de edad
				if(edad<MAYORIA_EDAD){
					System.out.println(nombre+ " tienes que ser mayor de edad ");
					edad=MAYORIA_EDAD-edad;
						if (edad==1){
							System.out.print("Vuelve dentro de "+ edad + singular);
						}
						else 
							System.out.print("Vuelve dentro de "+ edad+ " años" );
				}
				//calcular los años de espera
				
				//mostrar mensaje
		
		
		
	}

}
