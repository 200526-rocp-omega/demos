package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is intended to act as a Utility class to provide helper methods
 * regarding obtaining connections to our database.
 * 
 * We accomplish that by using the provided interface DriverManager with it's getConnection
 * method.
 * 
 * It requires 3 parameters: the connection string, the username, and the password
 * 
 * There are also a few Exceptions that could occur, so we provide some exception handling for
 * those cases.
 */
public class ConnectionUtil {

	private static Connection conn = null;
	
	// Private constructor PREVENTS us from ever instantiating this class
	// This is fine, since our helper methods are all static, and do not need the instance
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
