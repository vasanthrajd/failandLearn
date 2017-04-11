package com.sasken.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.sasken.util.PlayerUtil;

public abstract class JdbcDao {  // Not to load Driver every time the application runs

	 private static ResourceBundle rb= PlayerUtil.getBundle();
	static {
		try {

			 
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	public void closeConnection(Connection conn) {
		if (conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
	
	public Connection openConn() throws SQLException{
			String url=rb.getString("url");
			String uname=rb.getString("uname");
			String pass=rb.getString("pass");
			
			Connection conn=DriverManager.getConnection(url,uname,pass);
			return conn;
			
	}
}
