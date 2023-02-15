package com.jdc.mkt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private static final String URL = "jdbc:mysql://localhost:3306/library_db";
	private static final String USER = "minkhant";
	private static final String PASSWORD = "mkt123";
	

	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	public static void tableReset(String name) {
		String sql = "TRUNCATE TABLE "+name ;
		try(var con = getConnection();
				var stmt =con.prepareStatement(sql) ){
			
			stmt.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
