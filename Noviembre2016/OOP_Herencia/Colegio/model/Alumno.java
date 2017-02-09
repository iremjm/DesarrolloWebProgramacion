package model;

import java.io.Serializable;

public class Alumno extends Persona implements Comparable,Serializable{
private double nota;
protected boolean visibile;


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
//Comprobamos si es el mismo alumno
@Override
public boolean equals(Object obj) {
	// si tiene el mismo nombre y nota es el mismo alumno
	// si es un alumno
	if(obj instanceof Alumno){
		Alumno al=(Alumno) obj;//transformamos el objeto a la clase que pertenece
		if(nota==al.nota && nombre.toUpperCase(). equals(al.nombre.toUpperCase())){
			return true;
		}
	}

	return false;
}
}
