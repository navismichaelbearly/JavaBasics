package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementSample {
	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet rs = null;
	public static void main(String[] args) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system", "navis", "lp$7Freesie");
			System.out.println("Database is connected");
			stmt = con.createStatement();
			
//			String sql = "insert into login values ('2', 'vj', 'welcome')";
//			int result = stmt.executeUpdate(sql);
//			System.out.println(result);
			
			String sql = "select * from login";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//System.out.println(rs.getString("id") + " " + rs.getString("uname") + " " + rs.getString("pwd"));
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			//Prepared will have pre compiled sql query
			//it will compile only once.
			//we will use again and agin
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
