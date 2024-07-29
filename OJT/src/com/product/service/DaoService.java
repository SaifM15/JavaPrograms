package com.product.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.product.dao.Connect;

public class DaoService {

	public static Connection con;

	public static void connectServ() {

		con = Connect.connectdb();
	}

	public static void fetserv() throws SQLException {
		Connect.fetchData();
	}

	public static void loginserv() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id and Password");
		Connect.login(sc.nextInt(), sc.next());
	}

	public static void registerserv() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id and Password For Register ");
		Connect.insertData(sc.nextInt(), sc.next());
	}

	public static void updatepassword() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id and Password For Password updatation");
		Connect.updatePassword(sc.nextInt(), sc.next());
	}

	public static void deleteUser() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id For delete User");
		Connect.deleteUser(sc.nextInt());
	}

}
