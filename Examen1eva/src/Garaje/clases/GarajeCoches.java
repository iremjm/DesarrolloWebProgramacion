package Garaje.clases;

import Garaje.clases.Vehiculos;

public class GarajeCoches {
		//atributos
		private final int MAX_PLAZAS=100;
		private  Vehiculos[] plazas=new Vehiculos[MAX_PLAZAS];
		private String nombre;
		private double longitud;
		private double latitud;
		private int mumPlazasOcupadas=0;
		
		
		
		//METODO constructor
		public GarajeCoches(String nombre){
			this.nombre=nombre;
		}
		//metodo entra un vehiculo
		public void  entra (Vehiculos v){
			for(int i=0;i<MAX_PLAZAS;i++){
				if(plazas[i]== null){
					plazas[i]=v;
					return;//sale fuera de la funci�n con un return, con un break sale fuera del for, while o dowhile
				}//if	
			
			}//for
		}//FIN ENTRA veh�culo
		
		//metodo sale un vehiculo
		public void sale (Vehiculos v){
			for(int i=0;i<MAX_PLAZAS;i++){
				if(plazas[i]!=null){
					if(plazas[i].equals(v)){
						plazas[i]=null;
						return;//sale fuera de la funci�n con un return, con un break sale fuera del for, while o dowhile.
					}//if
				}
		}//for
		}//FIN SALE Vehiculo
		
		//Metodo devuelve el veh�culo que se encuentra en dicha plaza
		public int getVehiculoPlaza(Vehiculos v){
			for(int i=0;i<MAX_PLAZAS;i++){
				if(plazas[i]!=null){
					if(plazas[i].equals(v)){
						return i;
					}
				}
		}
	
		return-1;
		}//FIN devuelve veh�culo
		
		//Metodo devuleve la primera plaza libre del array
		public int getPlazasLibre(){
			
			return(MAX_PLAZAS-mumPlazasOcupadas);
		}
		
		int[] lista=new int [getPlazasLibres()];
		//contador para saber donde meter el �ndice de la plaza libre
			int contList=0;
			for(int i=0;i<MAX_PLAZAS;i++){
				if(plazas[i]==null){
					lista[contLsita]=i;
					contLista;
			}//if
		}
			
		
		
	
		
		
		
		
		
}
