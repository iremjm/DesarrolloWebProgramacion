package oop_Herencia;

public class Profesor extends Persona implements Alquilable{
	private double salario;
	private double precioHora=Alquilable.MIN_PRECIO;
	
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
	@Override
	public double getPrecioHora() {
		// TODO Auto-generated method stub
		return precioHora;
	}
	@Override
	public void setPrecioHora(double precio) {
		// TODO Auto-generated method stub
		if(precio>=Alquilable.MIN_PRECIO && precio<= MAX_PRECIO)
		this.precioHora=precio;
	}
	@Override
	public boolean isLibre() {
		// TODO Auto-generated method stub
		return false;
	}
}

