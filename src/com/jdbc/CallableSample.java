package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CallableSample {
	public static Connection con = null;
	public static CallableStatement cst = null;
	/**
	 * MYsql Stored Procedure - preset
	 * --------------------------------
	DELIMITER $$
	CREATE PROCEDURE insertrecord
	(IN in_id int,
	 IN in_username varchar(30),
	IN in_password varchar(20))
	BEGIN
	  INSERT INTO login (id, uname, pwd) 
	  values (in_id, in_username, in_password);
	END$$
	DELIMITER ; 
	*/
	public static void main(String[] args) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system", "navis", "lp$7Freesie");
			System.out.println("Database is connected");
			cst = con.prepareCall("{call insertrecord(?,?,?)}");
			cst.setInt(1, 7);
			cst.setString(2, "th");
			cst.setString(3, "ing");
			cst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
