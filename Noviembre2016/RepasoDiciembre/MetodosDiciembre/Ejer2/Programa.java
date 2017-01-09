/*2) Diseñar una función que calcule el área y otra que calcule el perímetro de una circunferencia.
Utiliza esas funciones en un programa principal que lea el radio de una circunferencia y muestre
su área y perímetro.*/
package MetodosDiciembre.Ejer2;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos el objeto
		Calculos Calculo1 = new Calculos();
		Calculo1.lee();
		Calculo1.calculaArea();
		Calculo1.imprimeArea();
		Calculo1.calculaPerimetro();
		Calculo1.imprimePerimetro();
	}

}
