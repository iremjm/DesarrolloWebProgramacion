/*2) Dise�ar una funci�n que calcule el �rea y otra que calcule el
 per�metro de una circunferencia.
Utiliza esas funciones en un programa principal que lea el radio
 de una circunferencia y muestre
su �rea y per�metro.*/
package MetodosDiciembre.Ejer2;
import javax.swing.JOptionPane;
public class Calculos {
	//Atributos 
	private float perimetro;
	private float area;
	private float radio;
	
	//M�todo constructor
	public float getPerimetro() {
		return radio;
	}
	//getter and setter
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	//funciones
	public void lee(){
		radio = Float.parseFloat(JOptionPane.showInputDialog(null,"Radio: "));
	}
	public void calculaArea(){
		area = (float)(Math.PI*(radio*radio));	
		}
	public void calculaPerimetro(){
		perimetro = (float)(Math.PI*(2*radio));
		}
	public void imprimeArea(){
		JOptionPane.showMessageDialog(null, "El �rea es "+area);
	}
	public void imprimePerimetro(){
		JOptionPane.showMessageDialog(null, "El per�metro es "+perimetro);
	}

	
}