package final_project_remake;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DisplayBySearch {
	
	private static JFrame frame;
	private static ButtonGroup ageGroup, jsGroup, ptGroup, yosGroup, sexGroup, salaryGroup;
	
	
	public DisplayBySearch(){
		
	}
	
	public static void displayFilterMenu(){
		frame = new JFrame("Display by Search: Filter Options");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setSize(400, 300);
		
		JLabel instructions = new JLabel("Choose the elements you wish to filter for the search: ");
		JLabel age = new JLabel("Age: ");
		JLabel gender = new JLabel("Sex: ");
		JLabel pt= new JLabel("Pay Type: ");
		JLabel js = new JLabel("Job Status: ");
		JLabel yos = new JLabel("Years of Service: ");
		JLabel salary = new JLabel("Salary: ");
		
		JButton button = new JButton("Continue");
		
		GridLayout buttonLayout = new GridLayout(0,2);
		GridLayout mainLayout = new GridLayout(6,2);
		
		JPanel mainPanel = new JPanel(); mainPanel.setLayout(mainLayout);
		JPanel agePanel = new JPanel(); agePanel.setLayout(buttonLayout);
		JPanel genderPanel = new JPanel(); genderPanel.setLayout(buttonLayout);
		JPanel ptPanel = new JPanel(); ptPanel.setLayout(buttonLayout);
		JPanel jsPanel = new JPanel(); jsPanel.setLayout(buttonLayout);
		JPanel yosPanel = new JPanel(); yosPanel.setLayout(buttonLayout);
		JPanel salaryPanel = new JPanel(); salaryPanel.setLayout(buttonLayout);
		
		ageGroup = new ButtonGroup();
		JRadioButton yesAge = new JRadioButton("Yes");
		JRadioButton noAge = new JRadioButton("No");
		noAge.setActionCommand("noAge");
		noAge.setSelected(true);
		yesAge.setActionCommand("yesAge");
		ageGroup.add(yesAge);
		ageGroup.add(noAge);
		
		ptGroup = new ButtonGroup();
		JRadioButton yesPT = new JRadioButton("Yes");
		JRadioButton noPT = new JRadioButton("No");
		noPT.setActionCommand("noPT");
		noPT.setSelected(true);
		yesPT.setActionCommand("yesPT");
		ptGroup.add(yesPT);
		ptGroup.add(noPT);
		
		jsGroup = new ButtonGroup();
		JRadioButton yesJS = new JRadioButton("Yes");
		JRadioButton noJS = new JRadioButton("No");
		noJS.setActionCommand("noJS");
		noJS.setSelected(true);
		yesJS.setActionCommand("yesJS");
		jsGroup.add(yesJS);
		jsGroup.add(noJS);
		
		yosGroup = new ButtonGroup();
		JRadioButton yesYOS = new JRadioButton("Yes");
		JRadioButton noYOS = new JRadioButton("No");
		noYOS.setActionCommand("noYOS");
		noYOS.setSelected(true);
		yesYOS.setActionCommand("yesYOS");
		yosGroup.add(yesYOS);
		yosGroup.add(noYOS);
		
		sexGroup = new ButtonGroup();
		JRadioButton yesSex = new JRadioButton("Yes");
		JRadioButton noSex = new JRadioButton("No");
		noSex.setActionCommand("noSex");
		noSex.setSelected(true);
		yesSex.setActionCommand("yesSex");
		sexGroup.add(yesSex);
		sexGroup.add(noSex);
		
		salaryGroup = new ButtonGroup();
		JRadioButton yesSalary = new JRadioButton("Yes");
		JRadioButton noSalary = new JRadioButton("No");
		noSalary.setActionCommand("noSalary");
		noSalary.setSelected(true);
		yesSalary.setActionCommand("yesSalary");
		salaryGroup.add(yesSalary);
		salaryGroup.add(noSalary);
		
		agePanel.add(yesAge);
		agePanel.add(noAge);
		ptPanel.add(yesPT);
		ptPanel.add(noPT);
		jsPanel.add(yesJS);
		jsPanel.add(noJS);
		yosPanel.add(yesYOS);
		yosPanel.add(noYOS);
		genderPanel.add(yesSex);
		genderPanel.add(noSex);
		salaryPanel.add(yesSalary);
		salaryPanel.add(noSalary);
		
		mainPanel.add(age); mainPanel.add(agePanel);
		mainPanel.add(gender); mainPanel.add(genderPanel);
		mainPanel.add(pt); mainPanel.add(ptPanel);
		mainPanel.add(js); mainPanel.add(jsPanel);
		mainPanel.add(yos); mainPanel.add(yosPanel);
		mainPanel.add(salary); mainPanel.add(salaryPanel);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				createFilterQuery();
			}
		});
		
		frame.add(instructions, BorderLayout.NORTH);
		frame.add(mainPanel, BorderLayout.CENTER);
		frame.add(button, BorderLayout.SOUTH);
	}
	
	public static void createFilterQuery(){
		boolean isAge = false;
		StringBuilder sb;
		String command = null;
		int count = 0;
		
		command = ageGroup.getSelection().getActionCommand();
		
		if(command.equals("yesAge")){
			isAge = true;
			count++;
			sb = new StringBuilder("Select *, TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) AS age FROM payroll_table WHERE ");
			sb.append(ageCondition() + " ");
		}
		else{
			sb = new StringBuilder("Select * from payroll_table where ");
		}
		
		command = sexGroup.getSelection().getActionCommand();
		if(command.equals("yesSex")){
			if(count != 0){
				sb.append("AND ");
			}
			count++;
			sb.append(genderCondition() + " ");
			
		}
		command = ptGroup.getSelection().getActionCommand();
		if(command.equals("yesPT")){
			if(count != 0){
				sb.append("AND ");
			}
			count++;
			sb.append(ptCondition() + " ");
			
		}
		command = jsGroup.getSelection().getActionCommand();
		if(command.equals("yesJS")){
			if(count != 0){
				sb.append("AND ");
			}
			count++;
			sb.append(jsCondition() + " ");
			
		}
		command = yosGroup.getSelection().getActionCommand();
		if(command.equals("yesYOS")){
			if(count != 0){
				sb.append("AND ");
			}
			count++;
			sb.append(yosCondition() + " ");
			
		}
		command = salaryGroup.getSelection().getActionCommand();
		if(command.equals("yesSalary")){
			if(count != 0){
				sb.append("AND ");
			}
			count++;
			sb.append(salaryCondition() + " ");
			
		}
		
		String query = sb.toString();
//		System.out.println(query);
		if(isAge){
			DisplayPayroll.createAndShowDisplay(query, true);
		}
		else{
			DisplayPayroll.createAndShowDisplay(query, false);
		}
	}

	public static String ageCondition(){

		String age = JOptionPane.showInputDialog("Please enter an Age for search filter:");
		String[] choices  = {"Less than " + age, "Less than/Equal to " + age,"Greater than " + age, "Greater than/Equal to " + age};
		String query = null;

		int choice = 0;

		choice = JOptionPane.showOptionDialog(null, "Please specify the range of ages you are looking for.",
				"Age", 0, JOptionPane.QUESTION_MESSAGE, null,
				choices, "null");
		switch(choice)
		{
		case 0:
			query = "TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) < " + age;
			break;
		case 1:
			query = "TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) <= " + age;
			break;
		case 2:
			query = "TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) > " + age;
			break;
		case 3:
			query = "TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) >= " + age;
			break;
		}

		return query;
	}
	
	public static String yosCondition(){

		String yos = JOptionPane.showInputDialog("Please enter the employee number of Years of Service for search filter:");
		String[] choices  = {"Less than " + yos, "Less than/Equal to " + yos,"Greater than " + yos, "Greater than/Equal to " + yos};
		String query = null;

		int choice = 0;

		choice = JOptionPane.showOptionDialog(null, "Please specify the range of years you are looking for.",
				"Years of Service", 0, JOptionPane.QUESTION_MESSAGE, null,
				choices, "null");
		switch(choice)
		{
		case 0:
			query = "years_of_service < " + yos;
			break;
		case 1:
			query = "years_of_service <= " + yos;
			break;
		case 2:
			query = "years_of_service > " + yos;
			break;
		case 3:
			query = "years_of_service >= " + yos;
			break;
		}

		return query;
	}
	
	public static String salaryCondition(){

		String salary = JOptionPane.showInputDialog("Please enter a salary amount for search filter:");
		String[] choices  = {"Less than " + salary, "Less than/Equal to " + salary,"Greater than " + salary, "Greater than/Equal to " + salary};
		String query = null;

		int choice = 0;

		choice = JOptionPane.showOptionDialog(null, "Please specify the range in Salary you are looking for.",
				"Salary", 0, JOptionPane.QUESTION_MESSAGE, null,
				choices, "null");
		switch(choice)
		{
		case 0:
			query = "salary < " + salary;
			break;
		case 1:
			query = "salary <= " + salary;
			break;
		case 2:
			query = "salary > " + salary;
			break;
		case 3:
			query = "salary >= " + salary;
			break;
		}

		return query;
	}
	
	public static String genderCondition(){
		String gender = JOptionPane.showInputDialog("Please enter a gender (M or F) for search filter:");
		String condition = "sex = '" + gender + "'";
		
		return condition;
	}
	
	public static String jsCondition(){
		String js = JOptionPane.showInputDialog("Please enter a Job Status (FT, PT, or CN) for search filter:");
		String condition = "job_status = '" + js + "'";
		
		return condition;
	}
	
	public static String ptCondition(){
		String pt = JOptionPane.showInputDialog("Please enter a Pay Type (S or H) for search filter:");
		String condition = "pay_type = '" + pt + "'";
		
		return condition;
	}

}
