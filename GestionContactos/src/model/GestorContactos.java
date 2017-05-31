package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import datos.Contacto;
import datos.GestorBDSQLite;

public class GestorContactos{
	
	private GestorBDSQLite gbd = new GestorBDSQLite();
	private ArrayList<Contacto> lstContactos = new ArrayList<Contacto>();
	
	public int getSizeContactos(){
		return lstContactos.size();
	}
	public Contacto getContacto(int ind) {
		// devuelve el contacto que se encuentra en el �ndice pasado como par�metro		
		return lstContactos.get(ind);
	}

	public void addContacto(Contacto c) {
		// a�ade el contacto al arrayList
		lstContactos.add(c);
		// a la bbdd
		String sql = "INSERT INTO CONTACTOS VALUES('" + c.getNom() + "','" + c.getTlfno() + "'," + c.getEdad() + ");";
		gbd.updateSQL(sql);
		
	}

	public void modContacto(Contacto c, int ind) {
		// modifica el contacto en la bbdd
		String sql = "UPDATE CONTACTOS SET NOM='" + c.getNom() + "', TLFNO='" + c.getTlfno() + "', EDAD=" + c.getEdad()
				+ " WHERE TLFNO = " + lstContactos.get(ind).getTlfno() + ";";
		gbd.updateSQL(sql);
		// modifica el contacto del indice pasado como par�metro en el arrayList
		lstContactos.set(ind, c);
	}

	public void delContacto(int ind) {
		// elimina el contacto que se encuentra en ese �ndice de la bbdd
		String sql = "DELETE FROM CONTACTOS WHERE INDICE =" +ind + "';";
		gbd.updateSQL(sql);
		//del arrayList
		lstContactos.remove(lstContactos.get(ind));
		
	}

}
