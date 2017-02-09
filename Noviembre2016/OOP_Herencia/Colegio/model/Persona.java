package model;

import java.io.Serializable;

public class Persona implements Serializable{
	protected String nombre;
	public Persona(){
		
	}
	public Persona(String nombre){
		this.nombre=nombre;
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
		return "Nombre:"+nombre;
	}

	

	

}
