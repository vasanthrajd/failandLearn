package com.pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sasken";
			conn=DriverManager.getConnection(url, "root", "root");
			// Procedure having IN and OUT can be done only by callablestatement 
			CallableStatement st=conn.prepareCall("{call p2(?,?)}");   // Temp variable for second ?
			st.setInt(1, 3);
			st.registerOutParameter(2, Types.VARCHAR);	// registering the parameter for OUT variable which is got form the DB
			ResultSet rs= st.executeQuery();
			st.execute();
			
			// Display of the OUT results of the Procedure function which is called.
			System.out.println(st.getString(2));  // will fire the OUT parameter from the callable statement,
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn !=null){
				closeConn(conn);		// function is called below.. 
			}
		}

	}
	public static void closeConn(Connection conn){
		if(conn != null){
			try {
				conn.close();			// forced to handle the exception 
				} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}
	}


