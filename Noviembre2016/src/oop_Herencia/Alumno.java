package oop_Herencia;

public class Alumno extends Persona implements Comparable{
	
	public Alumno(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public Alumno(String nombre, double nota){
		super(nombre);
		this.nota=nota;
	}
	private double nota;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		//Nombre:xxxxx, Nota:yyyyy
		return super.toString() + ", Nota: "+ nota;
	}
	@Override
	public int compareTo(Object obj) {
			Alumno alu=(Alumno)obj;
			return((int)(this.nota*100-alu.nota*100));
	}

}
