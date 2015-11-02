package test;

import java.sql.*;

public class jdbcdemo{

public static void main(String args[]){


try {

	String url = "jdbc:mysql_embedded://localhost/cs245project";
	String username = "root";
	String password = "";
	Connection connection = null;

	
	    System.out.println("Connecting database...");
	    connection = DriverManager.getConnection(url, username, password);
	    System.out.println("Database connected!");



Statement stmt = connection.createStatement();

try{
	 String table = 
	  "CREATE TABLE Employee11(Emp_code integer, Emp_name varchar(10))";
	  stmt.executeUpdate(table);
	  System.out.println("Table creation process successfully!");
	  }
	  catch(SQLException s){
	  System.out.println("Table already exists!");
	  }
	  connection.close();
	  }
	  catch (Exception e){
	  e.printStackTrace();
	  }
	  }
	}

