package ExamenRecu.Ejercicio4;

public class Oveja {
	private String nombre;
	private long crotal;
	private double litros;
	private Oveja padre;
	private Oveja madre;
		//Constructoras
		public Oveja(){
			
		}
		public Oveja(long crotal){
			this.crotal=crotal;
		}
		public Oveja(Oveja o){
			
		}		
		//metodos getter and setter
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public long getCrotal() {
			return crotal;
		}
		public void setCrotal(long crotal) {
			this.crotal = crotal;
		}
		public double getLitros() {
			return litros;
		}
		public void setLitros(double litros) {
			this.litros = litros;
		}
		public Oveja getPadre() {
			return padre;
		}
		public void setPadre(Oveja padre) {
			this.padre = padre;
		}
		public Oveja getMadre() {
			return madre;
		}
		public void setMadre(Oveja madre) {
			this.madre = madre;
		}
		@Override
		public String toString() {
			
			return "Nombre: "+ nombre + " Crotal: " + crotal;
		
		}
		public boolean equals(Oveja o){
			if(this.crotal==(o.crotal)){
			return true;
			}
			else{
			return false;
			}
		}
			
		
		
}