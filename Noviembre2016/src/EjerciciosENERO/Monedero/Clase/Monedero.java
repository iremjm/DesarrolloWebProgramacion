/*2) Defina una clase 'Monedero' que permita gestionar la cantidad de dinero de que una persona
dispone en un momento dado.
La clase tendrá los siguientes métodos:
* Constructor común: que inicializa el dinero a 0.
* Constructor de inicialización: Donde se indica el dinero que tendrá el monedero. No se puede
indicar un número negativo.
* Constructor de copia.
* meterDinero: Método que me permite meter más dinero en el monedero.
* sacarDinero: Método que me permite sacar dinero. Por supuesto, no se podrá sacar más
dinero del que haya en un momento dado en el monedero.
* consultar: Método que me devuelve la cantidad de dinero que hay en el monedero.
Para probar el funcionamiento de la clase, escriba un método 'main' con una serie de
instrucciones que hagan uso de los métodos definidos.*/
package EjerciciosENERO.Monedero.Clase;
	public class Monedero{
			private double saldoMonedero;
			public Monedero(){	
			}
			//Constructor común: que inicializa el dinero a 0.
			//Crear con valor positivo.
			public Monedero(double saldoMonedero){
				if(saldoMonedero > 0){
				this.saldoMonedero = saldoMonedero;
				}
			}
			//metodo para añadir dinero
			public void meterDinero(double AnnadirSaldo){
				if(AnnadirSaldo > 0){
				this.saldoMonedero = saldoMonedero+AnnadirSaldo;
				}
			}
			//metodo para sacar dinero
			public void sacarDinero(double quitarSaldo){
				if(this.saldoMonedero< quitarSaldo){//No superar el saldo actual	
					System.out.println("No tiene suficiente saldo.");
				}else if(quitarSaldo > 0){//Parametro tiene que ser positivo
					this.saldoMonedero = saldoMonedero - quitarSaldo;  
				}
			}
			public double consultarSaldo(){
				return saldoMonedero;
			}
			//Resumen de la clase
			public String toString() {
				return "Monedero saldo actual " + saldoMonedero+ "€.";
			}
		}
		
