package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CallableSample {
	public static Connection con = null;
	public static CallableStatement cst = null;
	
	public static void main(String[] args) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system", "navis", "lp$7Freesie");
			System.out.println("Database is connected");
			cst = con.prepareCall("{call insertrecord(?,?,?)}");
			cst.setInt(1, 6);
			cst.setString(2, "xy");
			cst.setString(3, "pwd");
			cst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
