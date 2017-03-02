package manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import model.Entrena;

public class GestorEntrena {
	
	private ArrayList<Entrena> lstEntrena = new ArrayList<Entrena>();
	
	private DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	
	private final String FILENAME = "listadoEntrena.txt";
	
	public GestorEntrena(){
		try {
			leerDatos();
		} catch (NumberFormatException | ParseException e) {
			System.out.println("ERROR: Lectura incorrecta de datos almacenados!!!");
		}
	}
	
	private void leerDatos() throws NumberFormatException, ParseException{
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String sCurrentLine;
			String[] parts;
			while ((sCurrentLine = br.readLine()) != null) {
				parts=sCurrentLine.split(",");
				addEntrena(new Entrena(formatoFecha.parse(parts[0]), parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3])));
			}
		} catch (IOException e) {
			System.out.println("Creando almacenamiento...");
			guardarDatos();
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
	
	private void guardarDatos(){
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			for (Entrena entrena : lstEntrena) {
				bw.write(formatoFecha.format(entrena.getFecha())+","+entrena.getLugar()+","+entrena.getKms()+","+entrena.getMins()+"\r\n");
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
	
	public void delEntrena(Entrena e){
		lstEntrena.remove(e);
		guardarDatos();
	}
	
	public void addEntrena(Entrena e){
		lstEntrena.add(e);
		guardarDatos();
	}
	
	public void modEntrena(Entrena viejo,Entrena nuevo){
		int index = lstEntrena.indexOf(viejo);
		lstEntrena.set(index, nuevo);
		guardarDatos();
	}
	
	public boolean existeEntrena(Entrena e){
		for (Entrena entrena : lstEntrena) {
			if (entrena.equals(e)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Entrena> getEntrenas(){
		return lstEntrena;
	}
	
	public double getTotalKms(){
		double totalKms=0;
		for (Entrena entrena : lstEntrena) {
			totalKms=totalKms+entrena.getKms();
		}
		return totalKms;
	}
	
	public int getTotalMins(){
		int totalMins=0;
		for (Entrena entrena : lstEntrena) {
			totalMins=totalMins+entrena.getMins();
		}
		return totalMins;
	}

	public double getVelocidadMedia() {
		return getTotalKms()/getTotalMins()*60;
	}
}
