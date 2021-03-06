package model;
import java.util.Date;

public class Entrena {
	private double kms;
	private  int mins;
	private String lugar;
	private Date fecha;
	
	public void Taarea(){
		
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean equals(Object obj) {
	// si tiene la misma fecha y lugar
	//  es es el mismo Entrenamiento
		if(obj instanceof Entrena){
			Entrena ent=(Entrena) obj;//transformamos el objeto a la clase que pertenece
			if(fecha==ent.fecha && lugar.toUpperCase(). equals(ent.lugar.toUpperCase())){
				return true;
			}
		}
		return false;
	}
			
	@Override
	public String toString() {
		
		return  fecha + lugar;
	}
	
}
