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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class GestorPlantaciones {
	private ArrayList<Plantacion> lstParcelas=new ArrayList<Plantacion>();
	
	private static final String FILENAME = "filename.txt";
	private DateFormat fechaPlantacion = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	private DateFormat fechaRecogida = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
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
				String[] datos= linea.split(":"); 
				int parcela=Integer.parseInt(datos[0]);
				Date fechaPlantacion=new Date(datos[1]);
				Date fechaRecogida=new Date(datos[2]);
				String especie=datos[3];
				int cantPlant=Integer.parseInt(datos[4]);
				int cantRec=Integer.parseInt(datos[5]);
							
				//crear una plantacion
				Plantacion plnt1=new Plantacion(parcela,fechaPlantacion,fechaRecogida ,especie 
				,cantPlant,cantRec);
							
				lstParcelas.add(plnt1);
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
	private void guardarParcelas(){
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			for(Plantacion p:lstParcelas){
				String datos=p.getParcela()+":"+p.getFechaPlantacion()+":"+
						p.getFechaRecogida()+":"+p.getEspecie()+":"+p.getCantPlant()+":"+
						p.getCantRec();
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
		}//guardarplantacion

	public void Plantar(Plantacion plant){
		lstParcelas.add(plant);
		guardarParcelas();
	}
	public void recolectar(int parcela, Date fechaPlant, int cantRec){
		  for(int i = 0 ; i < lstParcelas.size();i++){
			Plantacion plant=lstParcelas.get(i);
			if(plant.getParcela()==parcela && getFechaPlan(fechaPlantacion)){
				plant.setCantRec(cantRec);
			}
			guardarParcelas();
		  }
	}
	
	private boolean getFechaPlan(DateFormat fechaPlantacion2) {
		// TODO Auto-generated method stub
		return false;
	}
	public  Plantacion getPlantacion(int parcela, Date fechaPlant){
		Plantacion plantacion= new Plantacion(parcela,fechaPlant); 
		int indice;
		indice=lstParcelas.indexOf(plantacion);

		System.out.println(lstParcelas.get(indice).toString());
		return plantacion;
		
	}
	public ArrayList <Plantacion> getPlantaciones() {
		return lstParcelas;
	}
	
		
	
	/*public String getPlantRecoger() {
		Plantacion plantacion;
		  for(int i = 0 ; i < lstParcelas.size();i++){
			  plantacion= lstParcelas.get(i);
			  if( plantacion.compareto()){
				
			  }
		  }
			
		}else{
			return "cantRec=0";
				};
	}*/
}
