package Ejercicio4.coche;

	public class Vehiculo {
		//aributos
		private String matricula;
		private int numRuedas;
		private boolean socio;
		//
		//Metodo constructor
			public Vehiculo (String matricula){
				this.matricula=matricula;
			}
		//getter and setter
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}	
		//metodo boolean matricula
		 boolean equals(Vehiculo v){
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
		
	
		@Override
		public String toString() {
			return  matricula;
		}

}//class
