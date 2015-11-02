package final_project_remake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class RemoveEmployee {

	
	public RemoveEmployee(){
		
	}
	
	public static void displayPopUp(){
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the employee's ID"));
		Connection c = null;
		
		String query = "DELETE from payroll_table where emp_id=" + id + ";";
		String checker = "Select * from payroll_table where emp_id=" + id + ";";
		
		try
        {
            String url = "jdbc:mysql://localhost/cs245_payroll";
            String username = "adrian_work";
            String password = "TwoGlasses00!";
            
            c = DriverManager.getConnection( url, username, password );
            Statement stmt = c.createStatement();
            
            ResultSet cs = stmt.executeQuery(checker);
    		int count = 0;
    		while(cs.next()){
    			++count;
    		}
    		
    		if(count != 0){
    			stmt.executeUpdate(query);
    			JOptionPane.showMessageDialog(null, "Employee Removal complete.");
    		}
    
    		else{
    			JOptionPane.showMessageDialog(null, "No employee was found.");
    		}
        }
        catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
