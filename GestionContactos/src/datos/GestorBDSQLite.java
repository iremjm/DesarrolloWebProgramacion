package datos;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorBDSQLite {
	private static final String RUTA_BD = ".\\Contactos.sqlite";
	private static final String CREATE_TABLE = "CREATE TABLE "+"'CONTACTOS' ('nom' TEXT, 'tlfno' TEXT PRIMARY KEY  NOT NULL , 'edad' NUMERIC));";
	private Connection cn = null;
	private Statement st = null;

	public GestorBDSQLite() {
		// cargar driver y conectar bd
		try {
			// cargar el driver jdbc-sqlite
			Class.forName("org.sqlite.JDBC");

			// comprobar si existe la base de datos
			File f = new File(RUTA_BD);
			if (f.exists()) {
				// conectarnos la la bd
				cn = DriverManager.getConnection("jdbc:sqlite:" + RUTA_BD);
				st = cn.createStatement();
			} else {
				// si no existe la base de datos la crea
				// conectarnos a la bd
				cn = DriverManager.getConnection("jdbc:sqlite:" + RUTA_BD);
				st = cn.createStatement();
				st.executeUpdate(CREATE_TABLE);
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("sqlite driver not found");
		} catch (SQLException ex1) {
			System.out.println("Error abriendo bd");
		}
	}

	public ResultSet executeSQL(String sql) {
		// TODO Auto-generated method stub
		try {
			return st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void updateSQL(String sql){
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
