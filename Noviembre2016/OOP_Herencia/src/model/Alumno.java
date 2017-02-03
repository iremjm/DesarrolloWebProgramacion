package model;

import java.io.Serializable;

public class Alumno extends Persona implements Comparable,Serializable{
private double nota;

public Alumno(String nombre,double nota){
	super(nombre);
	this.nota=nota;
	}
public double getNota() {
	return nota;
}

public void setNota(double nota) {
	this.nota = nota;
	
}
@Override
public String toString(){
	//Nombre: xxxx, nota: yyyy
	return super.toString()+ ", Nota:"+nota;
}

@Override
public int compareTo(Object obj) {
	Alumno alu=(Alumno)obj;
	return((int)(this.nota*100-alu.nota*100));
	
}
}
