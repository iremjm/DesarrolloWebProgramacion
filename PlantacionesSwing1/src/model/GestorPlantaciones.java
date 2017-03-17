package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GestorPlantaciones {
	
	private ArrayList<Plantacion> lstParcelas= new ArrayList<Plantacion>();
	private static final String FILENAME = "plantacion.txt";
	private SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/dd");
	private static final Date HOY=new Date(System.currentTimeMillis());
	//contructora
	public GestorPlantaciones(){
		leerParcelas();
	}
	public void leerParcelas(){
		BufferedReader br = null;
		FileReader fr = null;

		try {
			//abre fichero
			fr = new FileReader(FILENAME);
			//para que vaya mas rapido
			br = new BufferedReader(fr);
			String linea;
			//lee la linea entera y la guarda en la variable linea mientras que no este vacia
			while ((linea = br.readLine()) != null) {
				//trozear la informacion
				String [] datos=linea.split(":");
				int parcela=Integer.parseInt(datos[0]);
				Date fechaPlan=null;
				try {
					fechaPlan=sdf.parse(datos[1]);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Date fechaRec=null;
				try {
					fechaRec=sdf.parse(datos[2]);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String especie= datos[3];
				int cantPlant=Integer.parseInt(datos[4]);
				//crear una plantacion con la informacion
				Plantacion p =new Plantacion(parcela, fechaPlan, fechaRec, especie, cantPlant);
				//añadir la plantacion a la lista de tareas
				lstParcelas.add(p);
			}

		} catch(FileNotFoundException fnde){
			System.out.println("Guardando...");
		}catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
	public void guardarParcelas(){
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			//Recorremos el array de las parcelas
			for(Plantacion p:lstParcelas){
				String datos=p.getParcela()+":"+sdf.format(p.getFechaPlan())+":"+sdf.format(p.getFechaRec())+":"+
			p.getEspecie()+":"+p.getCantPlant()
				;
				bw.write(datos+"\r\n");
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public void plantar(Plantacion p){
		lstParcelas.add(p);
		guardarParcelas();
	}
	public void recolectar(int parcela,Date fechaPlan,int cantRec){
		for(int i=0;i<lstParcelas.size();i++){
			Plantacion p=lstParcelas.get(i);
			if(p.getParcela()==parcela && p.getFechaPlan().equals(fechaPlan)){
				p.setCantRec(cantRec);				
			}
			guardarParcelas();
		}		
	}
	public Plantacion getPlantacion(int parcela,Date fechaPlan){
		for(int i=0;i<lstParcelas.size();i++){
			Plantacion p=lstParcelas.get(i);
			if(p.getParcela()==parcela && p.getFechaPlan().equals(fechaPlan)){
				return p;
			}		
		}
		return null;
	}
	public ArrayList<Plantacion> getPlantaciones(){
		return lstParcelas;
	}
	public ArrayList<Plantacion> getPlanRecoger(){
		ArrayList<Plantacion> lstNoRec=new ArrayList<Plantacion>();
		for(Plantacion p:lstParcelas){
			if(p.getFechaRec().before(HOY)&& p.getCantRec()==0){
				lstNoRec.add(p);
			}
		}
		return lstNoRec;
	}
}

