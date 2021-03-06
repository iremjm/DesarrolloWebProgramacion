/*Ejercicio 1:
Dentro de un sistema bancario que ya está funcionando disponemos de una clase Cuenta, los
datos que guarda dicha clase son los siguientes:
● String titular; Nombre del dueño de la cuenta
● double saldo: Dinero disponible en la cuenta
Además una cuenta tiene los siguientes métodos:
● Los constructores: Cuenta(String titular, double saldo)
● Los métodos getter y setter
● Un método reintegro, que recibe una cantidad y lo saca de la cuenta (resta del saldo),
● Un método ingreso, que recibe una cantidad y lo mete en la cuenta (suma al saldo).
● Un método toString, para poder escribir los datos de la cuenta en pantalla.

La nueva política del banco exige que tengamos otros tipos de cuentas con características
diferentes. En particular debemos admitir los siguientes tipos:
● CuentaCredito: Permite obtener reintegros hasta un saldo negativo fijo para cada cuenta y, si
el saldo es negativo el banco le cobra un 1% más.

● CuentaNomina: Permite obtener reintegros hasta un saldo negativo igual al importe mensual
de la nómina que el cliente tiene domiciliada en dicha cuenta. Hay que añadir un atributo nomina
y los métodos que creas necesarios.

● Cuenta de ahorro: No admite saldo negativo. Cada vez que se ingresa una cantidad se suma
el 0,1%.
Crea un programa principal donde definas una cuenta de cada clase, con un saldo inicial de 100
€, realiza una operación de ingreso de 50 € y un reintegro de
200 €, muestra los saldos de cada cuenta.*/
package Banco;

public abstract class Cuenta {
	//se define como protected para poder usarlo desde una clase hija
	protected String titular;
	protected double saldo;
	
	//constructoras
	public Cuenta(String titular, double saldo){
		this.saldo=saldo;
		this.titular=titular;
	}
	public abstract void reintegro(double cant);
	
	public void ingreso(double cant){
		this.saldo=saldo+cant;
	}
	public String toString() {
		return "Titular "+ titular +" Saldo:" + saldo;
	}
	
	//getter and setter
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
