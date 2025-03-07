package com.sbpdcl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	static String url="jdbc:mysql://localhost:3306/anjalidb";
	static String user="root";
	static String password="WJ28@krhps";
	
	 public static Connection createConnection() throws SQLException
     {
		 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
    	 Connection connection =DriverManager.getConnection(url,user,password);
    	 return connection;
     }

}
