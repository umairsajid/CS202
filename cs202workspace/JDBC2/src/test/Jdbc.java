package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		Connection connection = null;

		try {

			String url = "jdbc:mysql://localhost/lyric";
			String username = "adrian_work";
			String password = "TwoGlasses00!";


			System.out.println("Connecting database...");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Database connected!");



			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery( "select * from Genre" );
			
			while( rs.next() )
            {
				System.out.println(rs.getString("Genre"));
            }


			connection.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

}
