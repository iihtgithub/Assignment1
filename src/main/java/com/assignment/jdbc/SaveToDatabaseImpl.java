package com.assignment.jdbc;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.Statement;


import com.assignment.utility.DBConnection;


public class SaveToDatabaseImpl implements SaveToDatabase{
    
    java.util.Properties props = new java.util.Properties();
    
    
    
    
    
    public void saveToDatabase(String pattern, Integer noOfOccurrences) throws Exception{
        java.sql.Connection connection = DBConnection.getConnection();
        String query = "insert into regex_data values ('"+pattern+"',"+noOfOccurrences+")"; 
        Statement statement = connection.createStatement();
        statement.execute(query);
    }
    
    public void cleanDatabaseTables(){
        
    }
}
