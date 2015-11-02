package final_project_remake;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SetTable {
	
	private static JFrame frame;
	private static JTextField promoNumField;
	private static JTextField readField;
	private static JButton readFile, runButton;
	private static JLabel display;
	private static boolean isRunning = false;
	
	
	public SetTable(){
		
	}
	
	public static void createAndShowSetTable(){
		frame = new JFrame("Set Table");
		
		createMainPanel();
		
		frame.setSize(400, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	static void createMainPanel(){
		JPanel mainPanel = new JPanel();
		GridLayout mainLayout = new GridLayout(2, 2);
		
		mainPanel.setLayout(mainLayout);
		
		readFile = new JButton("Select file to read from");
		
		readField = new JTextField();
		
		runButton = new JButton("Run!");
		display = new JLabel("Waiting to run.");
		display.setHorizontalAlignment(JLabel.CENTER);
		
		mainPanel.add(readFile); mainPanel.add(readField);
		mainPanel.add(runButton); mainPanel.add(display);
			
		readFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				getReadFilePath(e);
			}
		});
		
		runButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				execute();
			}
		});
		
		frame.add(mainPanel, BorderLayout.CENTER);
	}
	
	static void getReadFilePath(ActionEvent e){
		final JFileChooser fc = new JFileChooser();
		if(e.getSource() == readFile){
			int returnVal = fc.showOpenDialog(frame);
			
			if(returnVal == JFileChooser.APPROVE_OPTION){
				File file = fc.getSelectedFile();
				String path = file.getAbsolutePath();
				readField.setText(path);
			}	
		}
	}
	
	static void execute(){
		isRunning = true;
		if(isRunning){
			display.setText("Running");
		}
		
		try {

			String url = "jdbc:mysql://localhost/cs245_payroll";
			String username = "adrian_work";
			String password = "TwoGlasses00!";
			Connection connection = null;


			System.out.println("Connecting database...");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Database connected!");



			Statement stmt = connection.createStatement();

			try{
				String dataLoad = 
						"LOAD DATA INFILE '" + readField.getText() + "' " +
								"INTO TABLE payroll_table " +
								"FIELDs TERMINATED BY ',' " +
								"LINES TERMINATED BY '\n';";// +
//								"IGNORE 1 LINES;";
				
				String dropIfExists = 
						"DROP TABLE IF EXISTS payroll_table;";
				
				String table =
						"create table payroll_table (emp_id int primary key, last_name varchar(255), " +
								"hire_date date, date_of_birth date, Sex varchar(10),job_status varchar(10), " +
								"pay_type varchar(10), salary int, years_of_service int);";
				
				System.out.println("executing");
				stmt.executeUpdate(dropIfExists);
				System.out.println("drop check");
				stmt.executeUpdate(table);
				System.out.println("table check");
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

		
		runButton.setBackground(Color.GREEN);
		display.setText("Done!");
		isRunning = false;
	}
	
}
