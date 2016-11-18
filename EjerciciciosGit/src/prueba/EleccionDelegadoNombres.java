package prueba;

import java.util.Scanner;

public class EleccionDelegadoNombres {

	  
		public static void main(String[] args) {
			Scanner teclado= new Scanner (System.in);
			//Definimos las variables
			String[] delegado;
			int alumnos;
			int subDelegado;
						
			
		
				System.out.println("Indique el número de alumnos que hay en su clase");
				alumnos=teclado.nextInt();
			
				delegado=(int) (Math.random()*(alumnos-5)+5);
				System.out.println("El Delegado es el " + delegado);
						
				
				subDelegado=(int) (Math.random()*(alumnos-5)+5);
				System.out.println("El Subdelegado es el " + subDelegado);
				
				String[] nombreDelegado = {"Tibi[0]","Alex[1]","Marius[2]","Jesus[3]","Ion[4]","Juan[5]","Sergio[6]","Cristina[7]",
						"Andrea[8]","Maria[9]","Asier[10]","David[11]","Said[12]","Cesar[13]","Aitor[14]","Tamara[15]",
						"Aitor[16]","Iñigo[17]","Iker[18]","Asier[19]","JoseMaria[20]","Julen[21]"};
				String[] nombreSubDelegado = {"Tibi[0]","Alex[1]","Marius[2]","Jesus[3]","Ion[4]","Juan[5]","Sergio[6]","Cristina[7]",
						"Andrea[8]","Maria[9]","Asier[10]","David[11]","Said[12]","Cesar[13]","Aitor[14]","Tamara[15]",
						"Aitor[16]","Iñigo[17]","Iker[18]","Asier[19]","JoseMaria[20]","Julen[21]"};
				
				
			
			 
		}

	}
