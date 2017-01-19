package ExamenRecu.Ejercicio6;

import ExamenRecu.Ejercicio4.Oveja;
import Garaje.clases.Vehiculos;

public class Rebano {
	int MAX_OVEJAS=100;
	private  Oveja[] ovejas=new Oveja[MAX_OVEJAS];
	private String pastor;
	private String raza;
	private int cantOvejas;
	
	public Rebano(){
		
	}
	public void addOveja(Oveja o){
		for(int i=0;i<MAX_OVEJAS;i++){
			if(ovejas[i]== null){
				ovejas[i]=o;
				return;
			}//if	
		
		}//for
		
	}
	public void delOveja(Oveja o){
		for(int i=0;i<MAX_OVEJAS;i++){
			if(ovejas[i]!=null){
				if(ovejas[i].equals(o)){
					ovejas[i]=null;
					return;
				}
			}
		}
	}
	public void getMejorOveja(){
		
	}
	//Getter and setter
	public String getPastor() {
		return pastor;
	}
	public void setPastor(String pastor) {
		this.pastor = pastor;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
