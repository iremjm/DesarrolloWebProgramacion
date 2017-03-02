package model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Entrena implements Serializable{
	
	/**
	 * Add default serial version UID para evitar advertencia por Serializable
	 */
	private static final long serialVersionUID = 1L;
	
	private double kms;
	private int mins;
	private String lugar;
	private Date fecha;
	
	private DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	
	public Entrena(Date fecha,String lugar){
		setFecha(fecha);
		setLugar(lugar);
	}
	
	public Entrena(Date fecha,String lugar,double kms,int mins){
		setFecha(fecha);
		setLugar(lugar);
		setKms(kms);
		setMins(mins);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Entrena) {
			Entrena entrena = (Entrena) obj;
			if(this.getFecha().equals(entrena.getFecha())&&this.getLugar().toLowerCase().equals(entrena.getLugar().toLowerCase())){
				return true;
			} else return false;
		} else return false;
	}

	@Override
	public String toString() {
		return "*Fecha: "+formatoFecha.format(getFecha())+" *Lugar: "+getLugar()+" *Kilometros: "+getKms();
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
	
}
