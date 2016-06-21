package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * @author Aurélia
 * @version 15.06.2016
 */
public class DBGame {

	private DBConnection connection;
	/**
	 * Initialize the game database
	 */
	public DBGame(){
		this.connection = new DBConnection();
	}
	
	/**
	 * Execute the SQL queries
	 * @param sql
	 * 		it's a sql query
	 * @param id
	 * @return the result of the query
	 */
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
	
	/**
	 * Execute the SQL queries
	 * @param sql
	 * 		it's a sql query
	 * @return the result of the query
	 */
	public ResultSet procedure(String sql){
		try{
			CallableStatement call = connection.getConnection().prepareCall(sql);
			call.execute();
			return call.getResultSet();
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}
}
