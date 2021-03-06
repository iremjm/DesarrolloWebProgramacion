package model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Plantacion implements Serializable{
	private int parcela;
	private Date fechaPlantacion;
	private Date fechaRecogida;
	private String especie;
	private int cantPlant;
	private int cantRec;
	
	private DateFormat formaDate = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	public  Plantacion(int parcela,Date fechaPlantacion,Date fechaRecogida,String especie,int cantPlant){
		setParcela(parcela);
		setFechaPlantacion(fechaPlantacion);
		setFechaRecogida(fechaRecogida);
		setEspecie(especie);
		setCantPlant(cantPlant);
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public Date getFechaPlantacion() {
		return fechaPlantacion;
	}

	public void setFechaPlantacion(Date fechaPlantacion) {
		this.fechaPlantacion = fechaPlantacion;
	}

	public Date getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getCantPlant() {
		return cantPlant;
	}

	public void setCantPlant(int cantPlant) {
		this.cantPlant = cantPlant;
	}

	public int getCantRec() {
		return cantRec;
	}

	public void setCantRec(int cantRec) {
		this.cantRec = cantRec;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "N�mero de parcela: " + parcela + " Fecha de plantaci�n :"+formaDate.format(getFechaPlantacion()) +
				" Especie plantada: "+ especie  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Plantacion) {
			Plantacion plantacion = (Plantacion) obj;
			if(this.getFechaPlantacion().equals(plantacion.getFechaPlantacion()) 
					&& this.getParcela()==(plantacion.getParcela())){
				return true;
			} else{
				return false;
			}
		} else{
			return false;
		}
	}
	
	
	
	
}
