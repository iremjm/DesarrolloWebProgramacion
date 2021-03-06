package model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GestorPlantaciones {
	private ArrayList<Plantacion> lstPlantacion=new ArrayList<Plantacion>();
	private static final String FILENAME = "filename.txt";
	private void leerParcelas() {
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String linea;
		
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				//trozear lainformación y añadimos ;
				String[] datos= linea.split(";"); 
				String parcela= datos[0];
				Date fechaPlantacion=new Date(datos[1]);
				Date fechaRecogida=new Date(datos[2]);
				String especie=datos[3];
				int cantPlant=new int(datos[4]);
				int cantRec=new int(datos[5]);
							
				//crear una plantacion
				Plantacion plnt1=new Plantacion(parcela,fechaPlantacion,fechaRecogida,especie,cantPlant,plant1.setCantRec);
							
				this.addPlantacion(plant1);
			}
		} catch (IOException e) {

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
	private void guardarPlantacion(){
		BufferedWriter bw = null;
		FileWriter fw = null;

			try {
	
				fw = new FileWriter(FILENAME);
				bw = new BufferedWriter(fw);
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
		}//guardarplantacion
	public void Plantar(Plantacion plant){
		lstPlantacion.add(plant);
	}
	public void recolectar(int parcela, Date fechaPlant, int cantRec){
		lstPlantacion.addAll(parcela, lstPlantacion);
	}
	
	public  Plantacion getPlantacion(int parcela, Date fechaPlant){
		Plantacion plantacion;
		  for(int i = 0 ; i < lstPlantacion.size();i++){
			  plantacion= lstPlantacion.get(i);
			  if(plantacion.toString().equals(parcela) && plantacion.compareto(fechaPlant)){
				System.out.println("Plantación: "+ );
			  }
		  }
		return null;
		
	}
	public Plantacion[] getPlantaciones() {
		return lstPlantacion.toArray(new Plantacion[0]);
	}
	
		
	
	public String getPlantRecoger() {
		Plantacion plantacion;
		  for(int i = 0 ; i < lstPlantacion.size();i++){
			  plantacion= lstPlantacion.get(i);
			  if( plantacion.compareto()){
				
			  }
		  }
			
		}else{
			return "cantRec=0";
				};
	}
}
