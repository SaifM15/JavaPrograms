package com.employee.service;

import java.sql.Connection;

import com.employee.dao.Connectdb;

public class ConnectServ {
	
	public static Connection con;
	
	public static void Connectdbserv() {
		
		con=Connectdb.ConnectDb();
	}

}
