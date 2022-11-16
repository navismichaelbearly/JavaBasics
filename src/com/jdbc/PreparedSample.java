package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedSample {
	public static Connection con = null;
	public static PreparedStatement prepStmt = null;
	public static String query = "insert into login values (?,?,?)";
	public static void main(String[] args) {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system", "navis", "lp$7Freesie");
			System.out.println("Database is connected");
			prepStmt = con.prepareStatement(query);
			for(int i = 0; i < 3; i++) {
				prepStmt.setInt(1, i + 3);
				prepStmt.setString(2, "ab");
				prepStmt.setString(3, "welcome");
				prepStmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
