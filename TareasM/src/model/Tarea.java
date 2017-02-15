package model;

public class Tarea {
String titulo;
boolean hecho;
String hecha;
	public Tarea(String titulo){
		this.titulo=titulo;
	}

	public void finalizar(){
		hecho=true;
	}
	//getter and setter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isHecho() {
		return hecho;
	}
	public void setHecho(boolean hecho) {
		this.hecho = hecho;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return  titulo ;
	}


	
}
