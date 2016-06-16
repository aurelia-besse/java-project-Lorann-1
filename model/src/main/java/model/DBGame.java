package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBGame {

	private DBConnection connection;
	public DBGame(){
		this.connection = new DBConnection();
	}
	
	public ResultSet procedure(String sql, int id){
		try{
			CallableStatement call = connection.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			return call.getResultSet();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
