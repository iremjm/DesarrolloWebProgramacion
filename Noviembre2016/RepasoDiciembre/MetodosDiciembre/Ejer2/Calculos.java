/*2) Diseñar una función que calcule el área y otra que calcule el
 perímetro de una circunferencia.
Utiliza esas funciones en un programa principal que lea el radio
 de una circunferencia y muestre
su área y perímetro.*/
package MetodosDiciembre.Ejer2;
import javax.swing.JOptionPane;
public class Calculos {
	//Atributos 
	private float perimetro;
	private float area;
	private float radio;
	
	//Método constructor
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
		JOptionPane.showMessageDialog(null, "El área es "+area);
	}
	public void imprimePerimetro(){
		JOptionPane.showMessageDialog(null, "El perímetro es "+perimetro);
	}

	
}
