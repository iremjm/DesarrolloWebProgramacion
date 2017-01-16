package oop_Herencia;

public class Alumno extends Persona {
	
	public Alumno(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	private String nota;

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		//Nombre:xxxxx, Nota:yyyyy
		return super.toString() + ", Nota: "+ nota;
	}
}
