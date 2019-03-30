package com.niit.mockito;
import java.sql.*;
public class DBConnection {
	private Connection dbConnection;
	 
	  public void getDBConnection() throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.jdbc.Driver");
		  dbConnection=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
	  }
	 
	  public int executeQuery(String query) throws ClassNotFoundException, SQLException {
	    return dbConnection.createStatement().executeUpdate(query);
	  }
}
