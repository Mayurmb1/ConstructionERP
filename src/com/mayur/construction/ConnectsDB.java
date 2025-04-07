package com.mayur.construction;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectsDB {

	static Connection con = null;
	public static Connection getConnect()//common method
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/construction", "root", "");
			System.out.println("Connection Established");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
}
