package oop_Herencia;

public class Profesor extends Persona {
	private double salario;
	
	public Profesor(String nombre){
		super(nombre);
	}
	//getter and setter
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		//Nombre: xxxx, salario:yyyyyy
		return super.toString()+", Salario: "+salario;
	}
}

