/*4) Realizar un programa de ordenador que pida el número de horas trabajadas durante la
semana, y el precio al que se le paga la hora. Entonces, el programa debe calcular el sueldo
bruto, y a partir de éste los impuestos, para finalmente obtener el sueldo neto.
Condiciones:
Las horas que sobrepasen de 35 las cobra un 50% más caras.
Empieza a pagar impuestos a partir de 250 euros reales.
De pagar impuestos, paga el 20% si no sobrepasa los 300 euros. A partir de 300 paga el 30%.
*/
package MetodosDiciembre.Ejer4;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculoHoras Semana1=new CalculoHoras();
		Semana1.PedirHoras();
		Semana1.LeerTotalHoras();
		Semana1.HorasExtras();
		Semana1.LeerSueldoBruto();
		Semana1.CobrarImpuestosReducidos();
		Semana1.CobrarImpuestosAmpliado();
		Semana1.NopagaImpuestos();
		Semana1.LeerSueldoNeto();
	}

}
