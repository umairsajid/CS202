package final_project_remake;

import java.sql.*;

public class jdbcdemo{

public static void main(String args[]){


try {
//	Class.forName("com.mysql.jdbc.Driver");/

	String url = "jdbc:mysql://localhost/lyric";
	String username = "adrian_work";
	String password = "TwoGlasses00!";
	Connection connection = null;

	
	    System.out.println("Connecting database...");
	    connection = DriverManager.getConnection(url, username, password);
	    System.out.println("Database connected!");



//Statement stmt = connection.createStatement();
//
//try{
//	 String table = 
//	  "CREATE TABLE Employee11(Emp_code integer, Emp_name varchar(10))";
//	  stmt.executeUpdate(table);
//	  System.out.println("Table creation process successfully!");
//	  }
//	  catch(SQLException s){
//	  System.out.println("Table already exists!");
//	  }
//	  connection.close();
	  }
	  catch (Exception e){
	  e.printStackTrace();
	  }
	  }
	}
