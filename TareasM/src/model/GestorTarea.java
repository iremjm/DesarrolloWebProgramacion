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
import java.util.Scanner;



	public class GestorTarea {
		
		public static final int LISTAR_TODAS=0; 
		public static final int LISTAR_REALIZADAS=1; 
		public static final int LISTAR_NO_REALIZADAS=2;
	
		private ArrayList<Tarea> lstTareas=new ArrayList<Tarea>();//el arraylist no tiene tama�o fijo,se modifica internamente.
		private static final String FILENAME = "filename.txt";
		public void leerTareas() {
			BufferedReader br = null;
			FileReader fr = null;

			try {
				fr = new FileReader(FILENAME);
				br = new BufferedReader(fr);
				String linea;
				//Es lo mismo que las dos l�neas de arriba.
				//br = new BufferedReader(new FileReader(FILENAME));
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
					//trozear lainformaci�n
					String[] datos= linea.split(","); 
					String titulo= datos[0];
					boolean hecho=Boolean.parseBoolean(datos[1].trim());
					//crear una tarea con la informaci�n
					Tarea t=new Tarea(titulo);
					if(hecho){
						t.finalizar();
					}
					//a�adir la tarea a la lista de tareas
					this.addTarea(t);
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
		public void guardarTareas(){
			BufferedWriter bw = null;
			FileWriter fw = null;

			try {

				fw = new FileWriter(FILENAME);
				bw = new BufferedWriter(fw);
				for(Tarea t:lstTareas){
					bw.write(t.toString()+", " + t.isHecho()+"\r\n");
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
		public void addTarea(Tarea t){
			//a�adimos la tarea.
			lstTareas.add(t);
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
		//
		public Tarea[] getTareas(int tipo){
			if(tipo==LISTAR_TODAS){
				return lstTareas.toArray(new Tarea[0]);
			}else{
				ArrayList<Tarea> lstAux=new ArrayList<Tarea>();
				for (Tarea t:lstTareas){
					if((tipo==LISTAR_REALIZADAS && t.isHecho()) ||
					(tipo==LISTAR_NO_REALIZADAS && !t.isHecho())){
						lstAux.add(t);
					}
				}
				return lstAux.toArray(new Tarea[0]);
			}
			
		}
}
		