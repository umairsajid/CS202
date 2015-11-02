package final_project_remake;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModifyEmployee {
	
	static String searchQuery;
	private static JFrame frame;
	private static JTextField lnField, hdField, dobField, sexField,
		jsField, ptField, salaryField, yosField;
	private static JButton modifyEmployee; 
	static int id;
	final static int numFields = 8;
	static PayrollFields entry;
	
	
	public ModifyEmployee(){
		
	}
	
	public static void displayPopUp(){
		id = Integer.parseInt(JOptionPane.showInputDialog("Enter the employee's ID"));

		searchQuery = "Select * from payroll_table where emp_id=" + id + ";";
		
		displayModify();
	}
	
	public static void displayModify(){
		frame = new JFrame("Modify Employee");
		
		createMainPanel();
		
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void createMainPanel(){
		entry = null;
		
		Connection c = null;
        try
        {
            String url = "jdbc:mysql://localhost/cs245_payroll";
            String username = "adrian_work";
            String password = "TwoGlasses00!";
            
            c = DriverManager.getConnection( url, username, password );
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(searchQuery);
            
            if(rs.next()){
            	entry = new PayrollFields(rs.getString("last_name"), rs.getString("hire_date"), rs.getString("date_of_birth"), rs.getString("sex"), 
            			rs.getString("job_status"), rs.getString("pay_type"), rs.getInt("salary"), rs.getInt("years_of_service"));
            }
        }
        catch (Exception e){
			e.printStackTrace();
		}
		
		JPanel mainPanel = new JPanel();
		GridLayout mainLayout = new GridLayout(9, 2);
		
		mainPanel.setLayout(mainLayout);
		
		JLabel lnLabel = new JLabel("Enter Employee Last Name: ");
		JLabel hdLabel = new JLabel("Enter Employee Hire Date: ");
		JLabel dobLabel = new JLabel("Enter Employee Date of Birth: ");
		JLabel sexLabel = new JLabel("Enter Employee Sex: ");
		JLabel jsLabel = new JLabel("Enter Employee Job Status: ");
		JLabel ptLabel = new JLabel("Enter Employee Pay Type: ");
		JLabel salaryLabel = new JLabel("Enter Employee Salary: ");
		JLabel yosLabel = new JLabel("Enter Employee Years of Service: ");
		JLabel buttonLabel = new JLabel("Click Button When Done");
		
		lnField = new JTextField(""+ entry.getLastName() + "");
		hdField = new JTextField(""+ entry.getHireDate() + "");
		dobField = new JTextField(""+ entry.getDob() + "");
		sexField = new JTextField(""+ entry.getSex() + "");
		jsField = new JTextField(""+ entry.getJobStatus() + "");
		ptField = new JTextField(""+ entry.getPayType() + "");
		salaryField = new JTextField(""+ entry.getSalary() + "");
		yosField = new JTextField(""+ entry.getYos() + "");
		
		modifyEmployee = new JButton("Modify");
		
		mainPanel.add(lnLabel); mainPanel.add(lnField);
		mainPanel.add(hdLabel); mainPanel.add(hdField);
		mainPanel.add(dobLabel); mainPanel.add(dobField);
		mainPanel.add(sexLabel); mainPanel.add(sexField);
		mainPanel.add(jsLabel); mainPanel.add(jsField);
		mainPanel.add(ptLabel); mainPanel.add(ptField);
		mainPanel.add(salaryLabel); mainPanel.add(salaryField);
		mainPanel.add(yosLabel); mainPanel.add(yosField);
		mainPanel.add(buttonLabel); mainPanel.add(modifyEmployee);
		
		modifyEmployee.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				modifyEmployee();
			}
		});
		
		frame.add(mainPanel, BorderLayout.CENTER);
	}
	
	public static void modifyEmployee(){
		Connection c = null;
		
		String modifyLastName = "update payroll_table set last_name = \"" + lnField.getText().trim() + "\" where emp_id = " + id + ";";
        String modifyHireDate = "update payroll_table set hire_date = '" + hdField.getText().trim() + "' where emp_id = " + id + ";";
        String modifyDob = "update payroll_table set date_of_birth = '" + dobField.getText().trim() + "' where emp_id = " + id + ";";
        String modifySex = "update payroll_table set sex = '" + sexField.getText().trim() + "' where emp_id = " + id + ";";
        String modifyJobStatus = "update payroll_table set job_status = '" + jsField.getText().trim() + "' where emp_id = " + id + ";";
        String modifyPayType = "update payroll_table set pay_type = '" + ptField.getText().trim() + "' where emp_id = " + id + ";";
        String modifySalary = "update payroll_table set salary = '" + salaryField.getText().trim() + "' where emp_id = " + id + ";";
        String modifyYos = "update payroll_table set years_of_service = '" + yosField.getText().trim() + "' where emp_id = " + id + ";";
		
        try
        {
            String url = "jdbc:mysql://localhost/cs245_payroll";
            String username = "adrian_work";
            String password = "TwoGlasses00!";
            
            c = DriverManager.getConnection( url, username, password );
            Statement stmt = c.createStatement();

            stmt.executeUpdate(modifyLastName);
            stmt.executeUpdate(modifyHireDate);
            stmt.executeUpdate(modifyDob);
            stmt.executeUpdate(modifySex);
            stmt.executeUpdate(modifyJobStatus);
            stmt.executeUpdate(modifyPayType);
            stmt.executeUpdate(modifySalary);
            stmt.executeUpdate(modifyYos);
        }
        catch (Exception e){
			e.printStackTrace();
		}
        
        JOptionPane.showMessageDialog(null, "The employee was succesfully modified!");
		frame.setVisible(false);
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
}
