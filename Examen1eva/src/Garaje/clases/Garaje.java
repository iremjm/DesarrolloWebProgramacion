package Garaje.clases;


public class Garaje {
		//atributos
		private final int MAX_PLAZAS=100;
		private  Vehiculos[] plazas=new Vehiculos[MAX_PLAZAS];
		private String nombre;
		private double longitud;
		private double latitud;
		private int mumPlazasOcupadas=0;
		
		
		
		//METODOS
		public Garaje(String nombre){
		this.nombre=nombre;
		}
		//entra un vehiculo
		public void  entra (Vehiculos v){
			for(int i=0;i<MAX_PLAZAS;i++){
				if(plazas[i]== null){
					plazas[i]=v;
					return;
				}//if	
			
			}//for
		}//ENTRA vehiculo
		//sale un vehiculo
		public void sale (Vehiculos v){
			for(int i=0;i<MAX_PLAZAS;i++){
				if(plazas[i]=null){
					plazas[MAX_PLAZAS]--;
				}//if	
				
		}//for
		}//SALE Vehiculo
			
		public int getPlazasLibre(){
			return(MAX_PLAZAS-mumPlazasOcupadas);
		}
		public int[] getListadoPlazasLibres();
		//creamos un array donde introducir las plazas libres
		int[] lista=new int [getPlazasLibres()];
		//contador paara sabresa donde meter el �ndice de la plaza libre
			int contList=0;
			for(int i=0;i<MAX_PLAZAS;i++){
				if(plazas[i]==null){
					lista[contLsita]=i;
					contLista;
			}//if
		}
			return lista;
		
		public Garaje(String nombre){
			this.nombre=nombre;
		}
	
	
		
		
		
		
		
}