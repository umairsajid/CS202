package final_project;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class test {

	public static void main(String args[]){
		
		mainMenu();
		}

		public static void mainMenu(){
			final JFrame frame = new JFrame("Main Menu");
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(8,0));
			
			JButton resetTable = new JButton("Set Table");
			JButton addEntry = new JButton("Add Entry");
			JButton removeEntry = new JButton("Remove Entry");
			JButton modifyEntry = new JButton("Modify Entry");
			JButton displayAll = new JButton("Display All");
			JButton searchID = new JButton("Search ID");
			JButton displayFilter = new JButton("Display by Filter");
			JButton quit = new JButton("Quit");
			
			panel.add(resetTable);
			panel.add(addEntry);
			panel.add(removeEntry);
			panel.add(modifyEntry);
			panel.add(displayAll);
			panel.add(searchID);
			panel.add(displayFilter);
			panel.add(quit);
			
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
			

			resetTable.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
//					resetTables();
				}
			});
			
			addEntry.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
//					addEntry();
				}
			});
			
			removeEntry.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
//					deleteEntry();
				}
			});
			
			modifyEntry.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
//					modifyByID();
				}
			});
			
			displayAll.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					displayAll();
				}
			});
			
			searchID.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
//					findByID();
				}
			});
			
			displayFilter.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
//					filterSearch();
				}
			});
			
			quit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JOptionPane.showMessageDialog(null, "You have chosen to quit the program. Goodbye!");
					frame.setVisible(false);
					System.exit(0);
				}
			});
		}
	
	
	
	
		public static void displayAll(){
			String query = "Select * from payroll;";
			displayData(query);

		}
	
	
	
	
	//creates list of entries to display
		public static void displayData(String query){
			try{
				String url = "jdbc:mysql://localhost/cs320stu57";
				String username = "cs320stu57";
				String password = "bBM5iA2!";
				Connection connection = null;

		    	connection = DriverManager.getConnection(url, username, password);

		    	Statement stmt = connection.createStatement();
		    	
		    	try{
		    		JFrame frame = new JFrame("Display List");
		    		JPanel panel = new JPanel();
		    	
		    		//gets the column count for the size
		    		ResultSet cs = stmt.executeQuery(query);
		    		int count = 0;
		    		while(cs.next())
		    			++count;
		    		
		    		GridLayout layout = new GridLayout(count + 1,9);
		    		panel.setLayout(layout);
		    		
		    		JLabel EEGNum = new JLabel("EEG No.");
		    		JLabel LastName = new JLabel("Last Name");
		    		JLabel eEGDate = new JLabel("EEG Date");
		    		JLabel dateOfBirth = new JLabel("DOB");
		    		JLabel Age = new JLabel("Age");
		    		JLabel Sex = new JLabel("Sex");
		    		JLabel handed = new JLabel("Handedness");
		    		JLabel Consciousness = new JLabel("Consciousness");
		    		JLabel WaveType = new JLabel("Wave Type");
		    		
		    		
		    		EEGNum.setBackground(Color.blue);EEGNum.setOpaque(true);EEGNum.setBorder(BorderFactory.createLineBorder(Color.black));
		    		eEGDate.setBackground(Color.blue);eEGDate.setOpaque(true);eEGDate.setBorder(BorderFactory.createLineBorder(Color.black));
		    		dateOfBirth.setBackground(Color.blue);dateOfBirth.setOpaque(true);dateOfBirth.setBorder(BorderFactory.createLineBorder(Color.black));
		    		LastName.setBackground(Color.blue);LastName.setOpaque(true);LastName.setBorder(BorderFactory.createLineBorder(Color.black));
		    		Age.setBackground(Color.blue);Age.setOpaque(true);Age.setBorder(BorderFactory.createLineBorder(Color.black));
		    		Sex.setBackground(Color.blue);Sex.setOpaque(true);Sex.setBorder(BorderFactory.createLineBorder(Color.black));
		    		handed.setBackground(Color.blue);handed.setOpaque(true);handed.setBorder(BorderFactory.createLineBorder(Color.black));
		    		Consciousness.setBackground(Color.blue);Consciousness.setOpaque(true);Consciousness.setBorder(BorderFactory.createLineBorder(Color.black));
		    		WaveType.setBackground(Color.blue);WaveType.setOpaque(true);WaveType.setBorder(BorderFactory.createLineBorder(Color.black));
		   		
		    		
		    		panel.add(EEGNum);
		    		panel.add(LastName);
		    		panel.add(eEGDate);
		    		panel.add(dateOfBirth);
		    		panel.add(Age);
		    		panel.add(Sex);
		    		panel.add(handed);
		    		panel.add(Consciousness);
		    		panel.add(WaveType);
		    		
		    		
		    		ResultSet rs = stmt.executeQuery(query);
		    		
//		    		employee_id 			int primary key,
//		    	    lastname 				varchar(255),
//		    	    hire_date 				varchar(255),
//		    		birth_date 				varchar(255),
//		    	    sex 						varchar(255),
//		    	    job_status 			varchar(255),
//		    	    pay_type 				varchar(255),
//		    	    annual_salary 		double,
//		    	    years_service 		int
		    		
		    		 while (rs.next())
		    	      {
		    			 int EEGno = rs.getInt("employee_id ");
		    			 panel.add(new JLabel(String.valueOf(EEGno)));
		    			 
		    			 String lastName = rs.getString("lastname");
		    			 panel.add(new JLabel(lastName));
		    			 
		    			 String EEGDate = rs.getString("hire_date");
		    			 panel.add(new JLabel(EEGDate));
		    			 
		    			 String DOB = rs.getString("birth_date");
		    			 panel.add(new JLabel(DOB));
		    			 
		    			 String age = rs.getString("sex");
		    			 panel.add(new JLabel(String.valueOf(age)));
		    			 
		    			 String sex = rs.getString("job_status");
		    			 panel.add(new JLabel(sex));
		    			 
		    			 String handedness = rs.getString("pay_type");
		    			 panel.add(new JLabel(handedness));
		    			 
		    			 double consciousness = rs.getDouble("annual_salary");
		    			 panel.add(new JLabel(String.valueOf(consciousness)));
		    			 
		    			 int waveType = rs.getInt("years_service");
		    			 panel.add(new JLabel(String.valueOf(waveType)));
		    			 
		    	      }
		    		 
		    		 int fixedSize = 101;
		    		 if(count < 25){
		    			 fixedSize = count *40 + 40;
		    		 }
		    		 
		    		JScrollPane scrollPane = new JScrollPane(panel);
		    		frame.setSize(1000, fixedSize);
			    	frame.add(scrollPane);
			    	
			    	if(count == 0){
			    		JOptionPane.showMessageDialog(null, "No entries found!");
			    	}else{
			    		frame.setVisible(true);
			    	}
		    		
		    	}catch(SQLException s){
		    		System.out.println("Failure on SQL Exception on displayData");
		    	}
			}catch(Exception e){
				System.out.println("Error in the displayData method");
			}
		}

}
