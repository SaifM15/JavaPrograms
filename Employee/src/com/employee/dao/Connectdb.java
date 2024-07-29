package com.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectdb {

	public static Connection con;
	

	public static Connection ConnectDb() {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
		System.out.println("Connection Done Successfully");
	
	}catch(

	SQLException e)
	{
		e.printStackTrace();
	}catch(
	ClassNotFoundException e)
	{
		e.printStackTrace();
	}return con;
}
}