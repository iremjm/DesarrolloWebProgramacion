package oop_Herencia;

public class Persona {
	private String nombre;
	//Creamos la constructora Persona
	public Persona(String nombre){
		this.nombre=nombre;
	}
	public Persona(){
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+nombre;
	}

	
}
