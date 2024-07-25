package com.softworld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlCon {

	public static void main(String[] args) 
	{
		
		Connection connection=null;
		ResultSet rs= null;
		Statement stmnt=null;
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		    connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","root");
		System.out.println("connection created");
		
			  stmnt=connection.createStatement(); 
			 
			  rs=stmnt.executeQuery("select * from emp"); 
			 
			 while(rs.next()) {
				 
			 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
			 }
			
			connection.close();
			rs.close();
			stmnt.close();
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

}
}


