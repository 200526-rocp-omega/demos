package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static Connection conn = null;
	
	// Private constructor PREVENTS us from ever instantiating this class
	private ConnectionUtil() {
		super();
	}
	
	public static Connection getConnection() {
		
		/*
		 * We will be using DriverManager to obtain our connection to the DB
		 * 
		 * We will need to provide it some credential information:
		 * Connection String: jdbc:oracle:thin:@ENDPOINT:PORT:SID
		 * 		jdbc:oracle:thin:@ENDPOINT:1521:ORCL
		 * username
		 * password
		 */
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			try {
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@training.cfnsfrwudzke.us-west-1.rds.amazonaws.com:1521:ORCL",
						"beaver",
						"chew"); // HARD CODED PASSWORD
				// If you push this to GitHub, everyone can see your password!
				// VERY UNSAFE!
				// Recommendation: Use environment variables instead
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			System.out.println("Did not find Oracle JDBC Driver class!");
		}
		
		return conn;
	}
}
