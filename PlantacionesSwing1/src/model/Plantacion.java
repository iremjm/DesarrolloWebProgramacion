package model;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Plantacion {
	private int parcela;
	private Date fechaPlan;
	private Date fechaRec;
	private String especie;
	private int cantPlant;
	private int cantRec;
	private SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/dd");
	//Constructora
	public Plantacion (int parcela, Date fechaPlan, Date fechaRec, String especie, int cantPlan){
		setParcela(parcela);
		setFechaPlan(fechaPlan);
		setFechaRec(fechaRec);
		setEspecie(especie);
		setCantPlant(cantPlan);
	}
	
	public Plantacion(int parcela2, Date fechaPlant) {
		setParcela(parcela2);
		setFechaPlan(fechaPlant);
	}

	//getters y setters
	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public Date getFechaPlan() {
		return fechaPlan;
	}

	public void setFechaPlan(Date fechaPlan) {
		this.fechaPlan = fechaPlan;
	}

	public Date getFechaRec() {
		return fechaRec;
	}

	public void setFechaRec(Date fechaRec) {
		this.fechaRec = fechaRec;
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
		return parcela + ":" + sdf.format(fechaPlan)+ ":"+ especie +":" + cantPlant;
	}

	@Override
	public boolean equals(Object obj) {
		//si tienen la misma parcela y fecha de plantacion sera la misma plantacion
		if(obj instanceof Plantacion){
			Plantacion plant=(Plantacion) obj;
			if((fechaPlan.compareTo(plant.getFechaPlan())<0) && parcela==plant.getParcela()){
				return true;
			}
		}				
		return false;
	}//equals	
	
}//class
