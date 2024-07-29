package com.smg.service;

import java.sql.Connection;

import com.smg.dao.Connect;

public class DaoService {

	public static Connection con;

	public static void Connectserv() {
		con = Connect.Connectdb();
	}

}
