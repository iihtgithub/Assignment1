package com.assignment.utility;

import java.io.FileInputStream;
import java.sql.DriverManager;

public class DBConnection {

	public static java.sql.Connection getConnection() throws Exception{
    	java.util.Properties props = new java.util.Properties();
    	FileInputStream fis = new FileInputStream("jdbc.properties");
    	props.load(fis);
    	Class.forName("com.mysql.jdbc.Driver"); 
    	String server = props.getProperty("server");
    	String port = props.getProperty("port");
    	String user = props.getProperty("user");
    	String password = props.getProperty("password");
    	String db = props.getProperty("schema");
    	String url = "jdbc:mysql://"+server+":"+port+"/"+db;
    	java.sql.Connection conn = DriverManager.getConnection(url, user, password);
    	return conn;
    }
}
