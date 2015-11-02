package final_project;

import java.awt.BorderLayout;
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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class jdbcdemo{

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
				resetTables();
			}
		});
		
		addEntry.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				addEntry();
			}
		});
		
		removeEntry.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				deleteEntry();
			}
		});
		
		modifyEntry.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				modifyByID();
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
				findByID();
			}
		});
		
		displayFilter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				filterSearch();
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
	
	public static void filterSearch(){
		final JFrame frame = new JFrame("Filter Options");
		JLabel instructions = new JLabel("Choose the elements you wish to filter for the search: ");
		JLabel age = new JLabel("Age: ");
		JLabel gender = new JLabel("Sex: ");
		JLabel hand = new JLabel("Handedness: ");
		JLabel wave = new JLabel("Wave Type: ");
		
		JButton button = new JButton("Continue");
		
		GridLayout buttonLayout = new GridLayout(0,2);
		GridLayout bigLayout = new GridLayout(4,2);
		
		JPanel bigPanel = new JPanel(); bigPanel.setLayout(bigLayout);
		JPanel agePanel = new JPanel(); agePanel.setLayout(buttonLayout);
		JPanel genderPanel = new JPanel(); genderPanel.setLayout(buttonLayout);
		JPanel handPanel = new JPanel(); handPanel.setLayout(buttonLayout);
		JPanel wavePanel = new JPanel(); wavePanel.setLayout(buttonLayout);
		
		//Create Action Groups
		final ButtonGroup ageGroup = new ButtonGroup();
		JRadioButton yesAge = new JRadioButton("Yes");
		JRadioButton noAge = new JRadioButton("No");
		noAge.setActionCommand("noAge");
		noAge.setSelected(true);
		yesAge.setActionCommand("yesAge");
		ageGroup.add(yesAge);
		ageGroup.add(noAge);
		
		final ButtonGroup genderGroup = new ButtonGroup();
		JRadioButton yesGender = new JRadioButton("Yes");
		JRadioButton noGender = new JRadioButton("No");
		noGender.setActionCommand("noGender");
		noGender.setSelected(true);
		yesGender.setActionCommand("yesGender");
		genderGroup.add(yesGender);
		genderGroup.add(noGender);
		
		final ButtonGroup handGroup = new ButtonGroup();
		JRadioButton yesHand = new JRadioButton("Yes");
		JRadioButton noHand = new JRadioButton("No");
		noHand.setActionCommand("noHand");
		noHand.setSelected(true);
		yesHand.setActionCommand("yesHand");
		handGroup.add(yesHand);
		handGroup.add(noHand);
		
		final ButtonGroup waveGroup = new ButtonGroup();
		JRadioButton yesWave = new JRadioButton("Yes");
		yesWave.setActionCommand("yesWave");
		JRadioButton noWave = new JRadioButton("No");
		noWave.setActionCommand("noWave");
		noWave.setSelected(true);
		waveGroup.add(yesWave);
		waveGroup.add(noWave);
		
		agePanel.add(yesAge);
		agePanel.add(noAge);
		genderPanel.add(yesGender);
		genderPanel.add(noGender);
		handPanel.add(yesHand);
		handPanel.add(noHand);
		wavePanel.add(yesWave);
		wavePanel.add(noWave);
		
		bigPanel.add(age);
		bigPanel.add(agePanel);
		bigPanel.add(gender);
		bigPanel.add(genderPanel);
		bigPanel.add(hand);
		bigPanel.add(handPanel);
		bigPanel.add(wave);
		bigPanel.add(wavePanel);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StringBuilder sb = new StringBuilder("Select * from eeg where ");
				String command = null;
				int count = 0;
				
				command = ageGroup.getSelection().getActionCommand();
				
				if(command.equals("yesAge")){
					count++;
					sb.append(ageCondition() + " ");
				}
				
				
				command = genderGroup.getSelection().getActionCommand();
				if(command.equals("yesGender")){
					if(count != 0)
						sb.append("AND ");
					count++;
					sb.append(genderCondition() + " ");
					
				}
				
				command = handGroup.getSelection().getActionCommand();
				if(command.equals("yesHand")){
					if(count != 0)
						sb.append("AND ");
					count++;
					sb.append(handCondition() + " ");
				}
					
				
				
				command = waveGroup.getSelection().getActionCommand();
				if(command.equals("yesWave")){
					if(count != 0)
						sb.append("AND ");
					count++;
					sb.append(waveCondition() + " ");
				}
				String query;
				sb.append(";");
				if(count == 0)
					query = "Select * from eeg;";
				else
					query = String.valueOf(sb);
				
				frame.setVisible(false);
				displayData(query);
				
			}
		});
		
		frame.add(instructions, BorderLayout.NORTH);
		frame.add(bigPanel, BorderLayout.CENTER);
		frame.add(button, BorderLayout.SOUTH);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static String ageCondition(){
		
		String age = JOptionPane.showInputDialog("Enter an Age:");
		String[] choices  = {"Less than", "Less than/Equal to","Greater than", "Greater than/Equal to"};
		String query = null;
		
		int choice = 0;
		
			choice = JOptionPane.showOptionDialog(null, "Main Menu",
					"Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");
			switch(choice)
			{
			case 0:
				query = "age < " + age;
				break;
			case 1:
				query = "age <= " + age;
				break;
			case 2:
				query = "age > " + age;
				break;
			case 3:
				query = "age >= " + age;
				break;
			}
			
		return query;
	}
	
	public static String genderCondition(){
		String gender = JOptionPane.showInputDialog("Please enter a gender (M or F):");
		String condition = "Sex = '" + gender + "'";
		
		return condition;
	}
	
	public static String waveCondition(){
		String wave = JOptionPane.showInputDialog("Please enter a wave type: ");
		String condition = "WaveType = '" + wave + "'";
		
		return condition;
	}
	
	public static String handCondition(){
		String hand = JOptionPane.showInputDialog("Please enter the handedness (L, R, or Both):");
		String condition = "handedness = '" + hand + "'";
		
		return condition;

	}

	public static void deleteEntry(){
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the patient's ID"));
		
		String query = "DELETE from eeg where eegNo="+ id +";";
		String checker = "Select * from eeg where eegNo="+ id + ";";
		
		try{
			String url = "jdbc:mysql://localhost/cs245project";
			String username = "root";
			String password = "";
			Connection connection = null;
	    	connection = DriverManager.getConnection(url, username, password);

	    	final Statement stmt = connection.createStatement();
	    	
	    	try{
	    		ResultSet cs = stmt.executeQuery(checker);
	    		int count = 0;
	    		while(cs.next())
	    			++count;
	    		
	    		if(count != 0){
	    			stmt.executeUpdate(query);
	    			JOptionPane.showMessageDialog(null, "Transaction complete.");
	    		}
	    
	    		else
	    			JOptionPane.showMessageDialog(null, "No entry was found.");

	    		
	    	}catch(SQLException s){
	    		System.out.println("Failure on SQL Exception on deleteEntry");
	    	}
		}catch(Exception e1){
			System.out.println("Error in the delete method");
		}
		
		
	}
	
	public static void displayAll(){
		String query = "Select * from eeg;";
		displayData(query);

	}
	public static void addEntry(){
		final JFrame frame = new JFrame("Add Entry");
		JPanel panel = new JPanel();
		
		
		GridLayout layout = new GridLayout(9, 2);
		panel.setLayout(layout);
		
		JLabel EEGNum = new JLabel("EEG No: ");
		JLabel LastName = new JLabel("Last Name: ");
		JLabel eEGDate = new JLabel("EEG Date: ");
		JLabel dateOfBirth = new JLabel("DOB: ");
		JLabel Age = new JLabel("Age: ");
		JLabel Sex = new JLabel("Sex: ");
		JLabel handed = new JLabel("Handedness: ");
		JLabel Consciousness = new JLabel("Consciousness: ");
		JLabel WaveType = new JLabel("Wave Type: "); 
		JButton button = new JButton("Finish");
		JLabel instructions = new JLabel("Please fill out the following entries: ");
		instructions.setSize(100, 40);
		
		final JTextField IDField = new JTextField();
		final JTextField lastNameField = new JTextField();
		final JTextField EEGDateField = new JTextField();
		final JTextField DOBField = new JTextField();
		final JTextField ageField = new JTextField();
		final JTextField sexField = new JTextField();
		final JTextField handednessField = new JTextField();
		final JTextField consciousnessField = new JTextField();
		final JTextField waveTypeField = new JTextField();
		
		panel.add(EEGNum); panel.add(IDField);
		panel.add(LastName); panel.add(lastNameField);
		panel.add(eEGDate); panel.add(EEGDateField);
		panel.add(dateOfBirth); panel.add(DOBField);
		panel.add(Age); panel.add(ageField);
		panel.add(Sex); panel.add(sexField);
		panel.add(handed); panel.add(handednessField);
		panel.add(Consciousness); panel.add(consciousnessField);
		panel.add(WaveType); panel.add(waveTypeField);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(button, BorderLayout.SOUTH);
		frame.add(instructions, BorderLayout.NORTH);
		frame.setSize(250, 500);
		frame.setVisible(true);
		
		 button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int updateID = Integer.parseInt(IDField.getText().trim());
					String updateLastName = lastNameField.getText().trim();
					String updateEEGDate = EEGDateField.getText().trim();
					String updateDOB = DOBField.getText().trim();
					String updateAge = ageField.getText().trim();
					String updateSex = sexField.getText().trim();
					String updateHandedness = handednessField.getText().trim();
					String updateConsciousness = consciousnessField.getText().trim();
					String updateWaveType = waveTypeField.getText().trim();
										
					String query = "insert into eeg values('"+updateID+"', '"+updateLastName+"', '"+updateEEGDate + 
							"', '"+updateDOB+"', '"+updateAge+"', '"+updateSex+"', '"+updateHandedness+"', '"+updateConsciousness+
							"', '"+updateWaveType+"');";
					
					try{
						String url = "jdbc:mysql://localhost/cs245project";
						String username = "root";
						String password = "";
						Connection connection = null;
				    	connection = DriverManager.getConnection(url, username, password);

				    	final Statement stmt = connection.createStatement();
				    	
				    	try{
				    		
				    		stmt.executeUpdate(query);

				    		
				    	}catch(SQLException s){
				    		System.out.println("Failure on SQL Exception on addEntry");
				    	}
					}catch(Exception e1){
						System.out.println("Error in the modify method");
					}
					
					
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "Transaction complete.");

				}
			});

	}

	public static void resetTables(){
		try {
		
		String url = "jdbc:mysql://localhost/cs245project";
		String username = "root";
		String password = "";
		Connection connection = null;

	
	    System.out.println("Connecting database...");
	    connection = DriverManager.getConnection(url, username, password);
	    System.out.println("Database connected!");



	    Statement stmt = connection.createStatement();

	    try{
	    	String dataLoad = 
	    			"LOAD DATA LOCAL INFILE 'EMGPatients.csv' " +
	   				"INTO TABLE EEG " +
	   				"FIELDs TERMINATED BY ',' " +
	   				"LINES TERMINATED BY '\r\n' " +
	   				"IGNORE 1 LINES;";
	 
	    	String table =
	    			"create table EEG (EEGNo int(20), SubjectLastName varchar(20), " +
	    			"EEGDate date, DOB date, Age int(5), Sex varchar(10), Handedness varchar(20), " +
	    			"LevelOfConsciousness varchar(20), WaveType varchar(5));";
	 
	    	stmt.executeUpdate(table);
	    	stmt.executeUpdate(dataLoad);
	   
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

	//finds a single entry by ID
	public static void findByID(){
		int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the patient's ID."));
		String command = "Select * from eeg where eegno = ' "+ id + "'";
		displayData(command);
	}
	
	//modifies a single entry by ID
	public static void modifyByID(){
		final int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the patient's ID"));
		String retrieveCommand = "Select * from EEG where EEGNo = '" + id +"'";
		
		try{
			String url = "jdbc:mysql://localhost/cs245project";
			String username = "root";
			String password = "";
			Connection connection = null;

	    	connection = DriverManager.getConnection(url, username, password);

	    	final Statement stmt = connection.createStatement();
	    	
	    	try{
	    		final JFrame frame = new JFrame();
	    		JPanel panel = new JPanel();
	    	
	    		//gets the column count for the size
	    		ResultSet cs = stmt.executeQuery(retrieveCommand);
	    		int count = 0;
	    		while(cs.next())
	    			++count;
	    			    		
	    		GridLayout layout = new GridLayout(9, 2);
	    		panel.setLayout(layout);
	    		
	    		JLabel EEGNum = new JLabel("EEG No: ");
	    		JLabel LastName = new JLabel("Last Name: ");
	    		JLabel eEGDate = new JLabel("EEG Date: ");
	    		JLabel dateOfBirth = new JLabel("DOB: ");
	    		JLabel Age = new JLabel("Age: ");
	    		JLabel Sex = new JLabel("Sex: ");
	    		JLabel handed = new JLabel("Handedness: ");
	    		JLabel Consciousness = new JLabel("Consciousness: ");
	    		JLabel WaveType = new JLabel("Wave Type: "); 
	    		
	    		int EEGno = 0;  			 
   			 	String lastName = null;   			 
   			 	String EEGDate = null;   			 
   			 	String DOB = null;   			 
   			 	int age = 0;   			 
   			 	String sex = null;   			 
   			 	String handedness = null;   			 
   			 	String consciousness = null; 			 
   			 	String waveType = null;
	    		
	    		
	    		ResultSet rs = stmt.executeQuery(retrieveCommand);
	    		
	    		 while (rs.next())
	    	      {
	    			 EEGno = rs.getInt("EEGNo");
	    			 lastName = rs.getString("SubjectLastName");
	    			 EEGDate = rs.getString("EEGDate");
	    			 DOB = rs.getString("DOB");
	    			 age = rs.getInt("Age");
	    			 sex = rs.getString("Sex");
	    			 handedness = rs.getString("Handedness");
	    			 consciousness = rs.getString("LevelOfConsciousness");
	    			 waveType = rs.getString("WaveType");
	    	      }
	    		 
	    		 //**************************
    			 panel.add(EEGNum);
    			 final JTextField EEGNoField = new JTextField(String.valueOf(EEGno));
    			 panel.add(EEGNoField);
    			 
    			 panel.add(LastName);
 	    		 final JTextField lastNameField = new JTextField(lastName);
 	    		 panel.add(lastNameField);
 	    		 
 	    		 panel.add(eEGDate);
    			 final JTextField EEGDateField = new JTextField(EEGDate);
    			 panel.add(EEGDateField);
    			 
    			 panel.add(dateOfBirth);
    			 final JTextField DOBField = new JTextField(DOB);
    			 panel.add(DOBField);
    			 
    			 panel.add(Age);
    			 final JTextField ageField = new JTextField(String.valueOf(age));
    			 panel.add(ageField);
    			 
    			 panel.add(Sex);
    			 final JTextField sexField = new JTextField(sex);
    			 panel.add(sexField);
    			 
    			 panel.add(handed);
    			 final JTextField handednessField = new JTextField(handedness);
    			 panel.add(handednessField);
    			 
    			 panel.add(Consciousness);
    			 final JTextField consciousnessField = new JTextField(consciousness);
    			 panel.add(consciousnessField);
    			 
    			 panel.add(WaveType);
    			 final JTextField waveTypeField = new JTextField(waveType);
    			 panel.add(waveTypeField);
    			 	    		 
	    		 JButton assessor = new JButton("Proceed");
	    		 
	    		 assessor.addActionListener(new ActionListener() {
	    				public void actionPerformed(ActionEvent e) {
	    					int updateID = Integer.parseInt(EEGNoField.getText().trim());
	    					String updateLastName = lastNameField.getText().trim();
	    					String updateEEGDate = EEGDateField.getText().trim();
	    					String updateDOB = DOBField.getText().trim();
	    					String updateAge = ageField.getText().trim();
	    					String updateSex = sexField.getText().trim();
	    					String updateHandedness = handednessField.getText().trim();
	    					String updateConsciousness = consciousnessField.getText().trim();
	    					String updateWaveType = waveTypeField.getText().trim();
	    					
	    					//good
	    					String modifyLastName = "update eeg set SubjectLastName = '" + updateLastName + "' where EEGNo = " + id + ";";
	    					String modifyEEGDate = "update eeg set EEGDate = '" + updateEEGDate + "' where EEGNo = " + id + ";";
	    					String modifyDOB = "update eeg set DOB = '" + updateDOB + "' where EEGNo = " + id + ";";
	    					String modifyAge = "update eeg set age = " + updateAge + " where EEGNo = " + id + ";";
	    					String modifySex = "update eeg set Sex = '" + updateSex + "' where EEGNo = " + id + ";";
	    					String modifyHandedness = "update eeg set Handedness = '" + updateHandedness + "' where EEGNo = " + id + ";";
	    					String modifyConsciousness = "update eeg set LevelOfConsciousness = '" + updateConsciousness + "' where EEGNo = " + id + ";";
	    					String modifyWaveType = "update eeg set WaveType = '" + updateWaveType + "' where EEGNo = " + id + ";";
	    					String modifyID = "update eeg set EEGNo = " + updateID + " where EEGNo = " + id + ";";
	    					
	    					try{
	    					stmt.executeUpdate(modifyLastName);
	    					stmt.executeUpdate(modifyEEGDate);
	    					stmt.executeUpdate(modifyDOB);
	    					stmt.executeUpdate(modifyAge);
	    					stmt.executeUpdate(modifySex);
	    					stmt.executeUpdate(modifyHandedness);
	    					stmt.executeUpdate(modifyConsciousness);
	    					stmt.executeUpdate(modifyWaveType);
	    					stmt.executeUpdate(modifyID);
	    					}catch(SQLException l){
	    						System.out.println("Failure in actionlistener method. Line 219");
	    					}
	    					
	    					frame.setVisible(false);
	    					JOptionPane.showMessageDialog(null, "Transaction complete.");

	    				}
	    			});
	    		 
	    		 frame.add(panel, BorderLayout.NORTH);
	    		 frame.add(assessor, BorderLayout.SOUTH);
	    		 frame.pack();
		    	 if(count == 0){
		    		JOptionPane.showMessageDialog(null, "Entry not found");
		    		frame.setVisible(false);
		    	 }
		    	 else{
		    		 frame.setVisible(true);
		    	 }

	    		
	    	}catch(SQLException s){
	    		System.out.println("Failure on SQL Exception on displayData");
	    	}
		}catch(Exception e){
			System.out.println("Error in the modify method");
		}
		
		
	}

//creates list of entries to display
	public static void displayData(String query){
		try{
			String url = "jdbc:mysql://localhost/cs245project";
//			String url = "jdbc:mysql://localhost:3306/cs245project";
			String username = "root";
			String password = "";
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
	    		
	    		 while (rs.next())
	    	      {
	    			 int EEGno = rs.getInt("EEGNo");
	    			 panel.add(new JLabel(String.valueOf(EEGno)));
	    			 
	    			 String lastName = rs.getString("SubjectLastName");
	    			 panel.add(new JLabel(lastName));
	    			 
	    			 String EEGDate = rs.getString("EEGDate");
	    			 panel.add(new JLabel(EEGDate));
	    			 
	    			 String DOB = rs.getString("DOB");
	    			 panel.add(new JLabel(DOB));
	    			 
	    			 int age = rs.getInt("Age");
	    			 panel.add(new JLabel(String.valueOf(age)));
	    			 
	    			 String sex = rs.getString("Sex");
	    			 panel.add(new JLabel(sex));
	    			 
	    			 String handedness = rs.getString("Handedness");
	    			 panel.add(new JLabel(handedness));
	    			 
	    			 String consciousness = rs.getString("LevelOfConsciousness");
	    			 panel.add(new JLabel(consciousness));
	    			 
	    			 String waveType = rs.getString("WaveType");
	    			 panel.add(new JLabel(waveType));
	    			 
	    	      }
	    		 
	    		 int fixedSize = 500;
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
