package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insertEmp {

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
			String sql ="insert into employee values(?,?,?,?)";
			PreparedStatement st=conn.prepareStatement(sql);	
			st.setInt(1,6);
			st.setString(2, "kiran");
			st.setDouble(3,10000);
			st.setString(4, "hr");
			int res=st.executeUpdate();
			if(res>0){
				System.out.println("Inserted..");
			}
			else{
				System.out.println("Not inserted");
			}
		/*	while(rs.next()){
						Displaying the data from the database
			}*/
			// To access stored procedure
			
			
			
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
