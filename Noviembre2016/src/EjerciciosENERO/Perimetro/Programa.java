/*3) Declarar una clase llamada Circulo que tenga como atributo el radio de tipo real y los
siguientes metidos:
* Los tres constructores. No se puede tener c�rculos con radios negativos.
* Los m�todos de modificaci�n y devoluci�n.
* escribir: Te escribe el radio de c�rculo.
* calcularArea y calcularPerimetro: Devuelven el �rea y el per�metro.
En el programa principal: Declare dos objetos: rueda y moneda y realice las siguientes
operaciones:
a) Inicialice el radio de la rueda con el valor de 10.
b) Inicialice el radio de la moneda con el valor de 1.
c) Calcule el �rea de la rueda.
d) Calcule el �rea de la moneda.
e) Calcule el per�metro de la rueda.
f) Calcule el per�metro de la moneda.*/
package EjerciciosENERO.Perimetro;

public class Programa {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String objeto1="-MONEDA";
		String objeto2="-RUEDA";
		CalculaPerimetro moneda = new CalculaPerimetro(2);
		CalculaPerimetro rueda = new CalculaPerimetro(150);
		System.out.println(objeto1+": "+moneda);
		System.out.println(objeto2+":  "+rueda);
	}

}
