package com.softworld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample 
{
	public static void main(String[] args) 
	{
		Connection connection=null;
		ResultSet rs= null;
		Statement stmnt=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		    connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","root");
		    
		    
		    PreparedStatement ps= connection.prepareStatement("insert into emp(id,name,age) values( ?,?,?)");
			
		    PreparedStatement ps1=connection.prepareStatement("select * from emp");
		
		 PreparedStatement  psU= connection.prepareStatement("update emp set age= ? where id=?");
		    
			psU.setInt(1, 29);
			psU.setInt(2, 2);
			int i=psU.executeUpdate();
			System.out.println("records updated "+i);
			ps.setInt(1, 3);
			ps.setString(2, "prabha");
			ps.setInt(3, 28);
			//ps.executeUpdate();
			ps.setInt(1, 2);
			ps.setString(2, "ram");
			ps.setInt(3, 30);
		//	ps.executeUpdate();
			ps.setInt(1, 1);
			ps.setString(2, "ragni");
			ps.setInt(3, 26);
			//ps.executeUpdate();
			int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully.");

            ResultSet rSet=  ps1.executeQuery();
            while(rSet.next())
            {
            	System.out.println(rSet.getInt(1)+""+rSet.getString(2)+""+rSet.getInt(3));
            }
            // Close resources
            ps.close();
            connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
