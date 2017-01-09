/*5)Refactoriza el ejercicio 1 para utilizar una programación orientada objetos. Por ejemplo:
-define la clase DiaTemp, con los atributos:dia, minT y maxT y los métodos:pideTemps()->pide
por consola la temperatura máxima y mínima de ese día y las guarda en sus atributos privados;
double getTempMedia(); String toString()->imprime por consola el día la tempMax y min.
Define la clase DiasTemp, con al menos el atributo DiaTemp[] dias;
en la constructora se le pasarán en número de días máximo que queremos guardar…
*/
package MetodosDiciembre.Ejer5;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiaTemp Semana1=new DiaTemp();
		Semana1.pideTemps();
		Semana1.LeerTemp();
		Semana1.TempMedia();
		Semana1.LeerMedias();
		
		System.out.println(Semana1.toString());
	}

}
