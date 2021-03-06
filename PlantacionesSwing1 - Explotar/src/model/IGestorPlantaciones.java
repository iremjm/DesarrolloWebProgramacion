package model;

import java.util.ArrayList;
import java.util.Date;

import datos.Plantacion;

public interface IGestorPlantaciones {
	public void plantar(Plantacion plant);
	public void recolectar(int parcela, Date fechaPlan, int cantRec);
	public Plantacion getPlantacion(int parcela, Date fechaPlan);
	public ArrayList<Plantacion> getPlantaciones();
	public ArrayList<Plantacion> getPlanRecoger();
	public  void delPlant(Plantacion p);
	public String[] getParcelas();
	public String[] getEspecies();
	
	
}
