package prueba;


	import java.util.Scanner;

	//1.Pedir el radio de un circulo y calcular su área. A=PI*r^2
	public class EjercicioUno {

		private static Scanner teclado;

		public static void main(String[] args) {
					
		teclado = new Scanner(System.in);
			 
				double radio;
				double area;
			
				
			//Pedimos el radio
				System.out.println("Ingrese el radio del circulo en centímetros");
				radio= teclado.nextFloat();
				
			//Hacemos el cálculo A=PI*r^2
				area= (Math.PI )*radio*radio;
				System.out.println("El circulo tiene un radio de " + radio + "cm y un area de " + String.format("%.2f", area) + " cm");
				
				
				}
				
		}

