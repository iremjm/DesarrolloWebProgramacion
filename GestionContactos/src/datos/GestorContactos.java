package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import datos.Contacto;
import model.GestorBdSqlite;

public class GestorContactos{
	
	private GestorBdSqlite gbd = new GestorBdSqlite();
	private ArrayList<Contacto> lstContactos = new ArrayList<Contacto>();
	
	public GestorContactos(){
	//cargar los contactos de la bbdd al arrayList
		cargarLstContactos();
	}
	public void cargarLstContactos(){
		String sql = "SELECT * FROM CONTACTOS";
		// pedir a la base de datos todas los contactos.
		ResultSet rs = gbd.executeSQL(sql);	
		try {
			while (rs.next()) {
				String nombre = rs.getString("nom");
				String tlfno = rs.getString("tlfno");
				int edad = rs.getInt("edad");
				// crear contacto
				Contacto c = new Contacto();
				c.setNom(nombre);
				c.setTlfno(tlfno);
				c.setEdad(edad);
				lstContactos.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getSizeContactos(){
		return lstContactos.size();
	}
	public Contacto getContacto(int ind) {
		// devuelve el contacto que se encuentra en el índice pasado como parámetro		
		if (ind>=0 &&ind<lstContactos.size()){
			return lstContactos.get(ind);
		}else{
			return null;
		}
	}

	public void addContacto(Contacto c) {
		// añade el contacto al arrayList
		lstContactos.add(c);
		// a la bbdd
		String sql = "INSERT INTO CONTACTOS(nom,tlfno,edad) VALUES('" + c.getNom() + "','" + c.getTlfno() + "'," + c.getEdad() + ");";
		gbd.updateSQL(sql);
		
	}

	public void modContacto(Contacto c, int ind) {
		// modifica el contacto en la bbdd
		String sql = "UPDATE CONTACTOS SET NOM='" + c.getNom() + "', TLFNO='" + c.getTlfno() + "', EDAD=" + c.getEdad()
				+ " WHERE TLFNO = " + lstContactos.get(ind).getTlfno() + ";";
		gbd.updateSQL(sql);
		// modifica el contacto del indice pasado como parámetro en el arrayList
		lstContactos.set(ind, c);
	}

	public void delContacto(int ind) {
		// elimina el contacto que se encuentra en ese índice de la bbdd
		String sql = "DELETE FROM CONTACTOS WHERE TLFNO ='" +lstContactos.get(ind).getTlfno() + "';";
		gbd.updateSQL(sql);
		//del arrayList
		lstContactos.remove(ind);
		}
}
