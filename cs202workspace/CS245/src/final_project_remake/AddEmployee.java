package final_project_remake;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddEmployee {
	
	private static JFrame frame;
	private static JTextField lnField, hdField, dobField, sexField,
		jsField, ptField, salaryField, yosField;
	private static JButton addEmployee; 
	
	public AddEmployee(){
		
	}
	
	public static void diplayAddMenu(){
		frame = new JFrame("Add Employee");
		
		createMainPanel();
		
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void createMainPanel(){
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
		
		lnField = new JTextField();
		hdField = new JTextField();
		dobField = new JTextField();
		sexField = new JTextField();
		jsField = new JTextField();
		ptField = new JTextField();
		salaryField = new JTextField();
		yosField = new JTextField();
		
		addEmployee = new JButton("Add");
		
		mainPanel.add(lnLabel); mainPanel.add(lnField);
		mainPanel.add(hdLabel); mainPanel.add(hdField);
		mainPanel.add(dobLabel); mainPanel.add(dobField);
		mainPanel.add(sexLabel); mainPanel.add(sexField);
		mainPanel.add(jsLabel); mainPanel.add(jsField);
		mainPanel.add(ptLabel); mainPanel.add(ptField);
		mainPanel.add(salaryLabel); mainPanel.add(salaryField);
		mainPanel.add(yosLabel); mainPanel.add(yosField);
		mainPanel.add(buttonLabel); mainPanel.add(addEmployee);
		
		
		addEmployee.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				addEmployee();
			}
		});
		
		frame.add(mainPanel, BorderLayout.CENTER);
	}
	
	public static void addEmployee(){
		Connection c = null;
        try
        {
            String url = "jdbc:mysql://localhost/cs245_payroll";
            String username = "adrian_work";
            String password = "TwoGlasses00!";

            String sql = "insert into payroll_table (last_name, hire_date, date_of_birth, sex, " +
            		"job_status, pay_type, salary, years_of_service) values (?, ?, ?, ?, ?, ?, ?, ?)";

            c = DriverManager.getConnection( url, username, password );
            PreparedStatement pstmt = c.prepareStatement( sql );

            pstmt.setString(1, lnField.getText().trim());
            pstmt.setString(2, hdField.getText().trim());
            pstmt.setString(3, dobField.getText().trim());
            pstmt.setString(4, sexField.getText().trim());
            pstmt.setString(5, jsField.getText().trim());
            pstmt.setString(6, ptField.getText().trim());
            pstmt.setInt(7, Integer.parseInt(salaryField.getText().trim()));
            pstmt.setInt(8, Integer.parseInt(yosField.getText().trim()));
            pstmt.executeUpdate();
        }
        catch (Exception e){
			e.printStackTrace();
		}
        
        JOptionPane.showMessageDialog(null, "The employee was succesfully added!");
		frame.setVisible(false);
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
}
