import java.util.Scanner;
//Crear varios case
public class PruebaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Declaracion e inicializacion de variables
			int repeticiones = 0;
			int contador;
			int resultado=0;
			String palabra;
			//Salida de informacion
			Scanner teclado= new Scanner(System.in);
			System.out.println("Indicar número de repeticiones");
			repeticiones= teclado.nextInt();
			System.out.println("Indicar palabra");
			teclado.nextLine();
			palabra=teclado.nextLine();
			
			
			//Utilizamos el bucle while
			contador=1;//Iniciamos la variable contadora
			while(contador<=repeticiones)//Establecemos la condiccion de bucle
			{
				
				System.out.println("case" + contador +": "+ palabra.toLowerCase() + "=      ;");
				System.out.println("          break;"  );
				//Modificamos el valor de la cariable conatadora, parahacer 
				//que  el bucle pueda seguir calculando hasta llegar a finalizar
				contador++;
			}//while	
			
	}

}
/*//Declaracion e inicializacion de variables
			int numero = 7;
			int contador;
			int resultado=0;
			//Salida de informacio n
			System.out.println("Tabla de multiplicar de " + numero);
			
			
			//Utilizamos el buvle while
			contador=1;//Iniciamos la variable contadora
			while(contador<=23)//Establecemos la condiccion de bucle
			{
				resultado=contador * numero;
				System.out.println(numero + " x " + contador + " = " + resultado );
				//Modificamos el valor de la cariable conatadora, parahacer 
				//que  el bucle pueda seguir calculando hasta llegar a finalizar
				contador++;
			}//while*/