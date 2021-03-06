package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorEntrena {
	private ArrayList<Entrena> lstEntrena=new ArrayList<Entrena>();//el arraylist no tiene tama�o fijo,se modifica internamente.
	private static final String FICHERO_LISTADO=".\\listadoEntrena.ser";//Cargar los datos del fichero
	
	private void leerDatos(){
		//m�todo que lee del fichero los datos de los alumnos
		FileInputStream fin = null;
		ObjectInputStream ois = null;

		try {
			//puede que no exista el fichero
			fin = new FileInputStream(FICHERO_LISTADO);
			ois = new ObjectInputStream(fin);
			lstEntrena = (ArrayList<Entrena>) ois.readObject();

		}catch (FileNotFoundException fnfe){
			//no eiste el fichero,porque no se han
			//introducido datos...
		}
		catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	private void guardarDatos(){
		//m�todo que guarda en un fichero los datos de los alumnos
				FileOutputStream fout=null;
				ObjectOutputStream oos=null;
				try {
					fout = new FileOutputStream(FICHERO_LISTADO);
					oos = new ObjectOutputStream(fout);
					oos.writeObject(lstEntrena);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Fichero no encontrado!!");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					
					System.out.println("Error de escritura");
				}		
				finally {

					if (fout != null) {
						try {
							fout.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (oos != null) {
						try {
							oos.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
	
	public void addEntrena(Entrena ent){
		//A�adimos entrena
		lstEntrena.add(ent);
		guardarDatos();
	}
	public void modEntrena(Entrena old , Entrena neww){
		for(int i = 0 ; i < lstEntrena.size();i++){
			if(!old.equals(neww)){
				lstEntrena.add(neww);
				guardarDatos();
			}
		}
	}
	public void delEntrena( int index){
		lstEntrena.remove(index);
		guardarDatos();
		
	}
	public ArrayList<Entrena>  getEntrena(){
		return lstEntrena;
		}
	
	public double getTotalKm(){
		double sumaKm=0;
		 for(int i = 0 ; i < lstEntrena.size();i++){
			 Entrena e=lstEntrena.get(i);
			 double kms=e.getKms();
			 sumaKm=sumaKm+kms;  
		}
		return sumaKm;
	}
	public int getTotalMins(){
		int sumaMins=0;
		 for(int i = 0 ; i < lstEntrena.size();i++){
			  Entrena e=lstEntrena.get(i);
			  int mins=e.getMins();
			  sumaMins=sumaMins+mins;
		}
		return sumaMins;
	}
}


