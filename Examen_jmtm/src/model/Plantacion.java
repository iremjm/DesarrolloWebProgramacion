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
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	//private DateFormat formaDate = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);Otra manera de usar las fechas 
	public  Plantacion(int parcela,Date fechaPlantacion,Date fechaRecogida,String especie,int cantPlant){
		setParcela(parcela);
		setFechaPlantacion(fechaPlantacion);
		setFechaRecogida(fechaRecogida);
		setEspecie(especie);
		setCantPlant(cantPlant);
	}

	public Plantacion(int parcela, Date fechaPlant) {
		setParcela(parcela);
		setFechaPlantacion(fechaPlantacion);
	}

	public Plantacion(int parcela2, Date fechaPlantacion2, Date fechaRecogida2, String especie2, int cantPlant2,
			int cantRec2) {
		setParcela(parcela2);
		setFechaPlantacion(fechaPlantacion2);
		setFechaRecogida(fechaRecogida2);
		setEspecie(especie2);
		setCantPlant(cantPlant2);
		setCantRec(cantRec2);
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
		return  "N� de parcela " + parcela + ":" +"Fecha de plantaci�n " + sdf.format(fechaPlantacion) + ":" +
				"Tipo de especie "+ especie;
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