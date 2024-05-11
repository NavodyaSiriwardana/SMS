package com.sms.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbContext {

	private static String url = "jdbc:mysql://localhost:3306/sms";
	private static String userName = "root";
	private static String password = "Navodya@2001";
	private static Connection conection;
	
	public static Connection getConnection() {
		
		try {
			
			// register the mysql driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish connection with database
			conection = DriverManager.getConnection(url, userName, password);
		}
		catch(Exception ex){
			
			System.out.println("cannot connect Database");
			ex.printStackTrace();
		}
		
		return conection;
	}

    
}
