package datos;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GestorBDMySQL2 {

	private static final String RUTA_BD=".\\plantaciones.sql";
	
	private static final String CREATE_TABLE="CREATE TABLE " + "plantacion" + ""
            + "(PARCELA int(11) NOT NULL, FECHAPLAN text COLLATE utf8_bin NOT NULL,"
            + "FECHAREC text COLLATE utf8_bin,ESPECIE text COLLATE utf8_bin,"
            + "CANTPLANT int(11) DEFAULT NULL,CANTREC int(11) DEFAULT NULL)";
	private Connection cn=null;
	private Statement st=null;
	
	public GestorBDMySQL2(){
		//cargar driver y conectar bd
		try
		{
			//cargar el driver jdbc-sqlite
			Class.forName("com.mysql.jdbc.Driver");
			
			//comprobar si existe la base de datos
			File f = new File(RUTA_BD);
			if(f.exists()) { 
				//conectarnos la la bd
				cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+RUTA_BD);
				st = cn.createStatement();
			}else{
				//si no existe la base de datos la crea
				//conectarnos la la bd
				cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+RUTA_BD);
				st = cn.createStatement();
				st.executeUpdate(CREATE_TABLE);
			}
		}
		catch (ClassNotFoundException ex){
			System.out.println("sqlite driver not found");
		}
		catch(SQLException ex1){
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

	public void updateSQL(String sql) {
		// TODO Auto-generated method stub
		try{
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
