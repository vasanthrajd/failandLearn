package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSetMetaData;

public class RsmetaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;	/// import it with java sql connection 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sasken";
			conn=DriverManager.getConnection(url, "root", "root");
			String sql ="select * from employee";
			PreparedStatement st=conn.prepareStatement(sql);
			
			ResultSet rs=st.executeQuery();
			/// Result Set Meta data 
			ResultSetMetaData md= (ResultSetMetaData) rs.getMetaData();
			int cols=md.getColumnCount();
			
			System.out.println("no of colums " + cols);
			
			for( int i=1; i<=cols ; ++i){
				System.out.println("Col Name " + md.getColumnName(i));
				System.out.println("Col Type " + md.getColumnTypeName(i));
				System.out.println("Scale " + md.getScale(i));	// After decimal place
				System.out.println("Precision " + md.getPrecision(i)); // before decimal place
				System.out.println("----------------");
			}
			
			
			
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

