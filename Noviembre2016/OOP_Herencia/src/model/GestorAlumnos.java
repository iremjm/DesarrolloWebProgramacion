/*Ejercicios Gesti�n Instituto

Modifica el proyecto de Gesti�n de Instituto siguiendo los siguientes pasos:

Implementa todas las funciones que definimos en la clase GestorAlumnos para poder a�adir, modificar, eliminar, buscar, obtener un listado,.... 

Modifica la clase Programa para poder trabajar con un objeto de la clase GestorAlumnos. El programa nos permitir� la gesti�n de alumnos utilizando el siguiente men�:

***** MEN� DE ALUMNOS ********
1.-A�adir
2.- Modificar 
3.- Borrar
4.- Buscar
5.- Imprime
6.- Salir
Opci�n:

Opci�n 1(A�adir)-> solicitar� al usuario por consola los datos necesarios para crear un alumno y llamar� al m�todo addAlumno del gestor para que a�ada el alumno. Volver al men� principal.

Opci�n 2(Modificar)-> solicitar� el �ndice del alumno que desea modificar y los datos del nuevo alumno(nombre, nota),crear un alumno con dichos datos y  posteriormente llamaremos al m�todo modAlumno(index, al) para que modifique el alumno de esa posici�n.Volver al men� principal.

Opci�n 3(Borrar)->solicitar� el �ndice del alumno que se desea eliminar y llamaremos al m�todo delAlumno(index) del gestor.Volver al men� principal.

Opci�n 4(Buscar)->solicitar� el �ndice del alumno que desea buscar, y si existe mostrar� la informaci�n correspondiente a ese alumno por consola.Volver al men� principal.

Opci�n 5(Imprime)->solicitar� al gestor de alumnos un array de alumnos con la informaci�n de todos los alumnos llamando al m�todo []Alumno getAlumnos(), y mostrar� por consola la informaci�n de los alumnos.Volver al men� principal.

Opci�n 6(Salir)->Finaliza el programa.

Intenta tratar los posibles errores que se puedan generar durante la ejecuci�n del programa.

Teniendo en cuenta lo que hemos hecho para implementar la clase GestorAlumnos, dise�a un GestorProfesores para poder realizar las acciones necesarias en la gesti�n del profesorado.
*/

package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class GestorAlumnos {
	private static final String FICHERO_LISTADO=".\\listado.ser";//Cargar los datos del fichero
	private ArrayList<Alumno> lstAlumnos=new ArrayList<Alumno>();//el arraylist no tiene tama�o fijo,se modifica internamente.
	public GestorAlumnos(){
		leerListado();
		
	}
	public void leerListado(){

		//m�todo que lee del fichero los datos de los alumnos
			FileInputStream fin = null;
			ObjectInputStream ois = null;

			try {
				//puede que no exista el fichero
				fin = new FileInputStream(FICHERO_LISTADO);
				ois = new ObjectInputStream(fin);
				lstAlumnos = (ArrayList<Alumno>) ois.readObject();

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
			oos.writeObject(lstAlumnos);
			
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
	public void addAlumno(Alumno a){
		lstAlumnos.add(a);
			}
	//Eliminar alumno
	public void delAlumno(int index){//elimina el objeto que se encuentra en el indice
		lstAlumnos.remove(index);
		guardarListado();
	}
	public void delAlumno(Alumno al){
		lstAlumnos.remove(al);
		guardarListado();
	}
	//modificar alumno
	public void modAlumno(int index, Alumno al){
		lstAlumnos.set(index, al);
		guardarListado();
	}
	//Contar cuantos alumnos hay
	public int getCantidadAlumnos(){
		
		return lstAlumnos.size();
	}
	//Buscar un alumno
	public Alumno getAlumno(String nombre){
		  for(int i = 0 ; i < lstAlumnos.size();i++) {
			  Alumno a=lstAlumnos.get(i);
			  	if(a.getNombre().toUpperCase().equals(nombre.toUpperCase())){
			  		return a;
			  	}
		  }
		  return null;
	}
	
	public Alumno getAlumno(int index){
		return lstAlumnos.get(index);
	}
	
}
