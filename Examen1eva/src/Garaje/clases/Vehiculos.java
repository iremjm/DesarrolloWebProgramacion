package Garaje.clases;



public class Vehiculos {
	//aributos
	private String matricula;
	private int numRuedas;
	private boolean socio;
	//
	//Metodo constructor
		public Vehiculos (String matricula){
			this.matricula=matricula;
		}
	//getter and setter
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	
	
	@Override
	public String toString() {
		return  matricula;
	}
	//metodo boolean matricula.Se comprueba si tienen la misma matrícula.
	 public boolean equals(Vehiculos v){
		if(this.matricula.equals(v.matricula)){
			return true;
		}//if
		else{
			return false;
		}//else
	}		
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public boolean isSocio() {
		return socio;
	}
	public void setSocio(boolean socio) {
		this.socio = socio;
	}
	

	
}//class