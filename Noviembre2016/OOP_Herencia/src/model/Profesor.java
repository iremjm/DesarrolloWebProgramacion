package model;

public class Profesor extends Persona implements Alquilable{
private double salario;
private double precioHora=Alquilable.MIN_PRECIO;

public Profesor(String nombre){
	super(nombre);

}
public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

@Override
public String toString(){
	//Nombre: xxxx, salario: yyyy
	return super.toString()+ ", Salario:"+salario;
}

public void saluda(){
	System.out.println("hola");
}

@Override
public double getPrecioHora() {
	// TODO Auto-generated method stub
	return precioHora;
}
@Override
public void setPrecioHora(double precio) {
	// TODO Auto-generated method stub
	if(precio>=Alquilable.MIN_PRECIO&& precio<=MAX_PRECIO){
		this.precioHora=precio;
	}
}
}
