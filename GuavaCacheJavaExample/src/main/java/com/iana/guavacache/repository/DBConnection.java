package com.iana.guavacache.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() throws Exception {
		Connection conn = null;
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
	  	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"uiialive","root","admin");
	  	
	  	return conn;
	}
}
