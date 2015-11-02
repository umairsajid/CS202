package final_project_remake;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CompanyPayroll {
	
	private static JFrame frame;
	private static JButton setTableButton, addButton, deleteButton, modifyButton, searchButton, displayButton, quitButton;
	
	public static void createAndShowMenu(){
		frame = new JFrame("Payroll");
		
		createButtonPanel();
		
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
//		frame.setLocationByPlatform(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static void createButtonPanel(){
		JPanel buttonPanel = new JPanel();
		GridLayout buttonLayout = new GridLayout(7, 0);
		
		buttonPanel.setLayout(buttonLayout);
		
		setTableButton = new JButton("Set Payroll Table"); 
		addButton = new JButton("Add Employee"); 
		deleteButton = new JButton("Remove Employee");
		modifyButton = new JButton("Modify Employee"); 
		searchButton = new JButton("Search Employee"); 
		displayButton = new JButton("Display Payroll"); 
		quitButton = new JButton("Quit");
		
		buttonPanel.add(setTableButton);
		buttonPanel.add(addButton);
		buttonPanel.add(deleteButton);
		buttonPanel.add(modifyButton);
		buttonPanel.add(searchButton);
		buttonPanel.add(displayButton);
		buttonPanel.add(quitButton);
		
		setTableButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
//				SetTable.createAndShowSetTable();
				System.out.println("Button is currently not working.\nThank you for your patience.");
			}
		});
		addButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				AddEmployee.diplayAddMenu();
			}
		});
		deleteButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				RemoveEmployee.displayPopUp();
			}
		});
		modifyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ModifyEmployee.displayPopUp();
			}
		});
		searchButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				DisplayBySearch.displayFilterMenu();
			}
		});
		displayButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				DisplayPayroll.createAndShowDisplay("SELECT * FROM payroll_table;", false);
			}
		});
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "You have chosen to quit the program. Goodbye!");
				frame.setVisible(false);
				System.exit(0);
			}
		});
		
		frame.add(buttonPanel);
	}
	
	public static void main(String[] args) {
		createAndShowMenu();
	}

}
