/*3) Declarar una clase llamada Circulo que tenga como atributo el radio de tipo real y los
siguientes metodos:
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
f) Calcule el per�metro de la moneda.*/package EjerciciosENERO.Perimetro;

public class CalculaPerimetro {
	private double radio = 1.0;
	public CalculaPerimetro(){
		
	}
	public CalculaPerimetro(double radio){
		this.radio = radio;
	}
	//Metodo calcular perimetro
	public double calcPerimetro(){//asignamos el perimetro
		double perimetro = 	(2 * Math.PI) * radio;
		//metodo rint() de la clase Math de java, este metodo tiene
		//la peculiaridad de redondear al entero mayor o igual al
		//numero double que estee en su argumento.
		return Math.rint(perimetro*100)/100;
	}
	//Metodo calcular area
	public double calcArea(){ //asignamos el area
		double area = Math.PI * Math.pow(radio, 2);
		return Math.rint(area*100)/100;
	}
	@Override
	public String toString() {
		return "Valor de radio=" + radio + ", Perimetro(cm)=" +
				calcPerimetro() + ", Area(cm2)=" + calcArea() ;
	}

}
