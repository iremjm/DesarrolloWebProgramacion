package gui;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import model.Alquilable;
import model.Alumno;
import model.Persona;
import model.Profesor;
public class Programa {
	private static final String FICHERO_LISTADO=".\\listado.ser";
	private ArrayList<Alumno> lstAlumnos=new ArrayList<Alumno>();
	
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
	public void leerListado(){
	//m�todo que lee del fichero los datos de los alumnos
		FileInputStream fin = null;
		ObjectInputStream ois = null;

		try {

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
	
	public static void main(String[] args) {
		//crear un objeto de la clase
		Programa p= new Programa();
		//crear un alumno
		Alumno al1=new Alumno("Juan",5);
		//a�adirlo al listado
		p.lstAlumnos.add(al1);
		//guardar el listado
		p.guardarListado();
		
		
		//rellenar el listado con 10 alumnos
		Scanner sc=new Scanner(System.in);
		String nombre;
		double nota;
		for(int i=0;i<10;i++){
			//pedir el nombre por consola
			System.out.println("Nombre:");
			//leer el nombre
			nombre=sc.nextLine();
			//pedir la nota por consola
			System.out.println("Nota:");
			//leer la nota
			nota=sc.nextDouble();
			sc.nextLine();
			//crear un alumno
			Alumno al=new Alumno(nombre,nota);
			//introducir el alumno en el ArrayList
			//lstAlumnos.add(al);
		}
		
		
		
		
/*		Alumno[] listado=new Alumno[10];
		listado[0]=new Alumno("Juan",2);
		listado[1]=new Alumno("Pedro",3);
		listado[2]=new Alumno("Luis",8);
		listado[3]=new Alumno("Nati",9);
		listado[4]=new Alumno("Cipriano",7);
		listado[5]=new Alumno("Elene",3);
		listado[6]=new Alumno("Indalecio",10);
		listado[7]=new Alumno("Juanma",9);
		listado[8]=new Alumno("Matilde",7);
		listado[9]=new Alumno("Aitor",4);
		
		//ordenar el array por nota utilizando Arrays.sort()
		Arrays.sort(listado);
		
		//mostrar el array ordenado por
		for(int i=0; i<listado.length;i++){
			System.out.println(listado[i]);
		}
		
		// TODO Auto-generated method stub
		Persona p1=new Persona("Juan");
		Persona profe1=new Profesor("Aitor");
		Persona profe0= profe1;
		((Profesor)profe1).saluda();
		if (profe1 instanceof Profesor){
			Profesor profe2= (Profesor)profe1;
			profe2.setPrecioHora(60);
			//Alquilable b=new Alquilable();->NO!!
			Alquilable a=profe2;//->OK!!
			//Alquilable aluAlqu=new Alumno();->NO!!
			Alquilable[] lista=new Alquilable[100];
			
		}
		//pruebas interface Alquilable
		
				
		System.out.println(p1);
		System.out.println(profe1);
		
		Persona al1=new Alumno("juan",5);
	
		al1.setNombre("Marius");
		System.out.println(al1);
		
	*/	
		
	}
}