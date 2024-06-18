package com.tnsif.jdbccruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Import java.sql package
 • Load and register the driver-
 • Establish a connection to the database server
 • Create a statement
 • Execute the statement
 • Retrieve the result
 • Close the statement and connection
 */
public class DBUtil {

	
	public static  Connection cn;
	public static final String DB_DRIVER_URL="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/test";
	public static final String DB_UserName="root";
	public static final String DB_Password="Nayna@123";
	public static Connection getConnection() {

		try {
			// step 1
			Class.forName(DB_DRIVER_URL);
			System.out.println("Registration is successful...");

			// Step 2
			 cn = DriverManager.getConnection(DB_URL, DB_UserName, DB_Password);
			
			System.out.println("Connection is Established...");
			
		} catch (ClassNotFoundException e) {
			System.err.println("Driver class not found.." + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Failed to establish connection.." + e.getMessage());
		}
		return cn;
	}

}
