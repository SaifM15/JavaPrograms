package com.product.controller;

import java.sql.SQLException;

import com.product.service.DaoService;

public class ConnectMain {
	public static void main(String[] args) throws SQLException {
		DaoService.connectServ();
		DaoService.fetserv();
		DaoService.loginserv();
		DaoService.registerserv();
		DaoService.updatepassword();
		DaoService.deleteUser();
	}

}
