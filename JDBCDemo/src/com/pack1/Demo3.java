package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo3 {

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
			String sql ="call p1()";
			PreparedStatement st=conn.prepareStatement(sql);
			
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				System.out.printf("%d %s %f %s \n", rs.getInt("emp_id"),rs.getString("emp_name"),
						rs.getDouble("emp_sal"), rs.getString("desig"));
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
