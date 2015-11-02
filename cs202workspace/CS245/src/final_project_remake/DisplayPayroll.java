package final_project_remake;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class DisplayPayroll {
	private static String searchQuery;
	private static boolean isAge;
	private static JFrame frame;
	private static JLabel ageLabel;
	
	public DisplayPayroll(){
//		searchQuery = "SELECT * FROM payroll_table;";
	}
	
	public static void createAndShowDisplay(String query, boolean age){
		frame = new JFrame("Display Data");
		isAge = age;
		searchQuery = query;
		Connection c = null;
		List<PayrollFields> entries = new ArrayList<PayrollFields>();
        try
        {
            String url = "jdbc:mysql://localhost/cs245_payroll";
            String username = "adrian_work";
            String password = "TwoGlasses00!";
            
            c = DriverManager.getConnection( url, username, password );
            Statement stmt = c.createStatement();
            
            try{
            	ResultSet rs = stmt.executeQuery(searchQuery);
            	
            	if(isAge){
            		while(rs.next()){
                		PayrollFields entry = new PayrollFields(rs.getInt("emp_id"), rs.getString("last_name"), rs.getString("hire_date"), rs.getString("date_of_birth"), 
                				rs.getString("sex"), rs.getString("job_status"), rs.getString("pay_type"), rs.getInt("salary"), rs.getInt("years_of_service"), rs.getInt("age"));
                		entries.add(entry);
                	}
            	}
            	else{
            		while(rs.next()){
                		PayrollFields entry = new PayrollFields(rs.getInt("emp_id"), rs.getString("last_name"), rs.getString("hire_date"), rs.getString("date_of_birth"), 
                				rs.getString("sex"), rs.getString("job_status"), rs.getString("pay_type"), rs.getInt("salary"), rs.getInt("years_of_service"));
                		entries.add(entry);
                	}
            	}
            	
            	int eCount = entries.size();
            	JPanel mainPanel = new JPanel();
            	
            	GridLayout layout = new GridLayout(eCount + 1, 9);
	    		mainPanel.setLayout(layout);
	    		
	    		JLabel idLabel = new JLabel("ID");
	    		JLabel lnLabel = new JLabel("Last Name");
	    		JLabel hdLabel = new JLabel("Hire Date");
	    		JLabel dobLabel = new JLabel("Date of Birth");
	    		JLabel sexLabel = new JLabel("Sex");
	    		JLabel jsLabel = new JLabel("Job Status");
	    		JLabel ptLabel = new JLabel("Pay Type");
	    		JLabel salaryLabel = new JLabel("Salary");
	    		JLabel yosLabel = new JLabel("Years of Service");
	    		if(isAge){
	    			ageLabel = new JLabel("Age");
	    		}
	    		
	    		idLabel.setBackground(Color.blue);idLabel.setOpaque(true);idLabel.setBorder(BorderFactory.createLineBorder(Color.black)); idLabel.setForeground(Color.white);
	    		lnLabel.setBackground(Color.blue);lnLabel.setOpaque(true);lnLabel.setBorder(BorderFactory.createLineBorder(Color.black)); lnLabel.setForeground(Color.white);
	    		hdLabel.setBackground(Color.blue);hdLabel.setOpaque(true);hdLabel.setBorder(BorderFactory.createLineBorder(Color.black)); hdLabel.setForeground(Color.white);
	    		dobLabel.setBackground(Color.blue);dobLabel.setOpaque(true);dobLabel.setBorder(BorderFactory.createLineBorder(Color.black)); dobLabel.setForeground(Color.white);
	    		sexLabel.setBackground(Color.blue);sexLabel.setOpaque(true);sexLabel.setBorder(BorderFactory.createLineBorder(Color.black)); sexLabel.setForeground(Color.white);
	    		jsLabel.setBackground(Color.blue);jsLabel.setOpaque(true);jsLabel.setBorder(BorderFactory.createLineBorder(Color.black)); jsLabel.setForeground(Color.white);
	    		ptLabel.setBackground(Color.blue);ptLabel.setOpaque(true);ptLabel.setBorder(BorderFactory.createLineBorder(Color.black)); ptLabel.setForeground(Color.white);
	    		salaryLabel.setBackground(Color.blue);salaryLabel.setOpaque(true);salaryLabel.setBorder(BorderFactory.createLineBorder(Color.black)); salaryLabel.setForeground(Color.white);
	    		yosLabel.setBackground(Color.blue);yosLabel.setOpaque(true);yosLabel.setBorder(BorderFactory.createLineBorder(Color.black)); yosLabel.setForeground(Color.white);
	    		if(isAge){
	    			ageLabel.setBackground(Color.blue);ageLabel.setOpaque(true);ageLabel.setBorder(BorderFactory.createLineBorder(Color.black)); ageLabel.setForeground(Color.white);
	    		}
	    		
	    		
	    		mainPanel.add(idLabel);
	    		mainPanel.add(lnLabel);
	    		mainPanel.add(hdLabel);
	    		mainPanel.add(dobLabel);
	    		mainPanel.add(sexLabel);
	    		mainPanel.add(jsLabel);
	    		mainPanel.add(ptLabel);
	    		mainPanel.add(salaryLabel);
	    		mainPanel.add(yosLabel);
	    		if(isAge){
	    			mainPanel.add(ageLabel);
	    		}
	    		
	    		if(isAge){
	    			for(PayrollFields i: entries){
		    			mainPanel.add(new JLabel(String.valueOf(i.getId())));
		    			mainPanel.add(new JLabel(i.getLastName()));
		    			mainPanel.add(new JLabel(i.getHireDate()));
		    			mainPanel.add(new JLabel(i.getDob()));
		    			mainPanel.add(new JLabel(i.getSex()));
		    			mainPanel.add(new JLabel(i.getJobStatus()));
		    			mainPanel.add(new JLabel(i.getPayType()));
		    			mainPanel.add(new JLabel(String.valueOf(i.getSalary())));
		    			mainPanel.add(new JLabel(String.valueOf(i.getYos())));
		    			mainPanel.add(new JLabel(String.valueOf(i.getAge())));
		    			System.out.println(i.toString());
		    		}
	    		}
	    		else{
	    			for(PayrollFields i: entries){
		    			mainPanel.add(new JLabel(String.valueOf(i.getId())));
		    			mainPanel.add(new JLabel(i.getLastName()));
		    			mainPanel.add(new JLabel(i.getHireDate()));
		    			mainPanel.add(new JLabel(i.getDob()));
		    			mainPanel.add(new JLabel(i.getSex()));
		    			mainPanel.add(new JLabel(i.getJobStatus()));
		    			mainPanel.add(new JLabel(i.getPayType()));
		    			mainPanel.add(new JLabel(String.valueOf(i.getSalary())));
		    			mainPanel.add(new JLabel(String.valueOf(i.getYos())));
		    		}
	    		}
	    		
	    		int fixedSize = 500;
	    		 if(eCount < 25){
	    			 fixedSize = eCount *40 + 40;
	    		 }
	    		 
	    		JScrollPane scrollPane = new JScrollPane(mainPanel);
//	    		scrollPane.createVerticalScrollBar();
	    		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	    		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    	    scrollPane.setViewportBorder(new LineBorder(Color.RED));
	    	    scrollPane.setBounds(2, 2, 1000, fixedSize);
	    	    
	    	    JPanel contentPane = new JPanel(null);
	            contentPane.setPreferredSize(new Dimension(1005, fixedSize + 5));
	            contentPane.add(scrollPane);
	    		
//	    		frame.add(mainPanel, BorderLayout.NORTH);
//	    		frame.setSize(1050, fixedSize);
//	    		frame.add(scrollPane, BorderLayout.EAST);
	            frame.setContentPane(contentPane);
	            frame.pack();
	    		frame.setLocationRelativeTo(null);
//	    		frame.setVisible(true);
	    		if(eCount == 0){
		    		JOptionPane.showMessageDialog(null, "No entries found!");
		    	}else{
		    		frame.setVisible(true);
		    	}
            }
            catch(Exception e){
            	e.printStackTrace();
            	System.out.println("Error displaying data! :(");
            }
        }
        catch (Exception e){
			System.out.println("Failed to connect to database! :(");
		}
	}
}
