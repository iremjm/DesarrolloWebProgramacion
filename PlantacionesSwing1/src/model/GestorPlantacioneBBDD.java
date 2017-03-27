package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import datos.GestorBDSQLite;
import datos.Plantacion;

public class GestorPlantacioneBBDD implements IGestorPlantaciones {
	GestorBDSQLite gbd = new GestorBDSQLite(); 
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
	@Override
	public void plantar(Plantacion plant) {
	String sql = "INSERT INTO PLANTACIONES VALUES("+
			"plant.geParcela()"+",'"+sdf.format(plant.getFechaPlan())+"'"
			+sdf.format(plant.getFechaRec())+"','"+plant.getEspecie() +"',"
			+plant.getCantPlant()+",0);";
			gbd.updateSQL(sql);
			
	}

	@Override
	public void recolectar(int parcela, Date fechaPlan, int cantRec) {
		// TODO Auto-generated method stub

	}

	@Override
	public Plantacion getPlantacion(int parcela, Date fechaPlan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Plantacion> getPlantaciones() {
		ArrayList<Plantacion> lstPlant= new ArrayList<Plantacion>();
		String sql="SELECT * FROM PLANTACIONES";
		//pedir a la base de datos todas las plnataciones.
		ResultSet rs=gbd.executeSQL(sql);
		try {
			while(rs.next()){
				int parcela=rs.getInt("PARCELA");
				Date fechaPlan = null;
				try {
					fechaPlan= sdf.parse(rs.getString("FECHAPLAN"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String especie=rs.getString("ESPECIE");
				Date fechaRec = null;
				try {
					 fechaRec= sdf.parse(rs.getString("FECHAREC"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int cantPlant=rs.getInt("CANTPLANT");
				int cantRec=rs.getInt("CANTREC");
				//crear plantación
				Plantacion plant= new Plantacion(parcela, fechaPlan, fechaRec, especie, cantPlant);
				plant.setCantRec(cantRec);
				lstPlant.add(plant);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lstPlant;
	}

	@Override
	public ArrayList<Plantacion> getPlanRecoger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getParcelas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getEspecies() {
		// TODO Auto-generated method stub
		return null;
	}

}
