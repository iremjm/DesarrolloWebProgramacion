package model;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



	public class GestorTarea {
		
		public static final int LISTAR_TODAS=0; 
		public static final int LISTAR_REALIZADAS=1; 
		public static final int LISTAR_NO_REALIZADAS=2;
	
		private static final String FICHERO_LISTADO=".\\listarTareas.ser";//Cargar los datos del fichero
		private ArrayList<Tarea> lstTareas=new ArrayList<Tarea>();//el arraylist no tiene tama�o fijo,se modifica internamente.
		
		public GestorTarea(){
			leerListado();
		}
		private void leerListado() {
			//m�todo que lee del fichero los datos de los alumnos
			FileInputStream fin = null;
			ObjectInputStream ois = null;

			try {
				//puede que no exista el fichero
				fin = new FileInputStream(FICHERO_LISTADO);
				ois = new ObjectInputStream(fin);
				lstTareas = (ArrayList<Tarea>) ois.readObject();

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
		public void guardarListado(){
			//m�todo que guarda en un fichero los datos de los alumnos
				FileOutputStream fout=null;
				ObjectOutputStream oos=null;
				try {
					fout = new FileOutputStream(FICHERO_LISTADO);
					oos = new ObjectOutputStream(fout);
					oos.writeObject(lstTareas);
					
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
		public void addTarea(Tarea t){
			//a�adimos la tarea.
			System.out.println("Nombre tarea: ");
		}
		public void finTarea(String titulo){
			Tarea tarea;
			  for(int i = 0 ; i < lstTareas.size();i++){
				  tarea= lstTareas.get(i);
				  if(tarea.toString().equals(titulo)){
					  tarea.finalizar();
				  }
			  }
		}

		public int getTareasSinHacer(){
			  for(int i = 0 ; i < lstTareas.size();i++){
				  Tarea t= lstTareas.get(i);
				  if(t.isHecho()==false){
					  lstTareas.add(t);
				  }else{
					  t.isHecho();
				  }
			  }
			return 0;	  
		}
		public Tarea[] getTareas(int tipo){
			if(tipo==LISTAR_TODAS){
				return lstTareas.toArray(new Tarea[0]);
			}else{
				ArrayList<Tarea> lstAux=new ArrayList<Tarea>();
				for (Tarea t:lstTareas){
					if((tipo==LISTAR_REALIZADAS && t.isHecho()) ||
					(tipo==LISTAR_REALIZADAS && !t.isHecho())){
						lstAux.add(t);
					}
				}
				return lstAux.toArray(new Tarea[0]);
			}
			
		}
}
		