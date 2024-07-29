package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.product.entity.Login;

public class Connect {

	public static Connection con;

	public static Connection connectdb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/janojt", "root", "root");
			System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

//  Fetching the data from the table
	public static void fetchData() throws SQLException {

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select *from login");
		ArrayList<Login> al = new ArrayList();
		while (rs.next()) {
			
			al.add(new Login(rs.getInt("id" ),rs.getString("password")));
//			System.out.println(rs.getInt("id"));
//			System.out.println(rs.getString("password"));
	}
		System.out.println(al);

	}

	public static void login(int id, String password) throws SQLException {

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select *from login");
		int flg = 0;
		while (rs.next()) {
			if (rs.getInt("id") == id && (rs.getString("password").equals(password))) {
				flg = 1;
				System.out.println("Valid User");
				break;
			}
		}
		if (flg == 0)
			System.out.println("The User id and Password Does not match");

	}

	public static void insertData(int id, String pwd) throws SQLException {

		PreparedStatement ptmt = con.prepareStatement("insert into login values(?,?)");
		ptmt.setInt(1, id);
		ptmt.setString(2, pwd);

		ptmt.executeUpdate();
		System.out.println("User Registration Successfully");
	}

	public static void updatePassword(int id, String pwd) throws SQLException {

		PreparedStatement ptmt = con.prepareStatement("update login set password=? where id=?");
		ptmt.setString(1, pwd);
		ptmt.setInt(2, id);
		ptmt.executeUpdate();
		System.out.println("User password Update Successfully");
	}

	public static void deleteUser(int id) throws SQLException {

		PreparedStatement ptmt = con.prepareStatement("delete from login where id=?");

		ptmt.setInt(1, id);
		ptmt.executeUpdate();
		System.out.println("User Delete user  Successfully");
	}

}
