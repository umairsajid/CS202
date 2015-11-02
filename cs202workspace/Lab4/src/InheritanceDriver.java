import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


//import java.util.ArrayList;


public class InheritanceDriver {

	private static List<Faculty> faculty = new ArrayList<Faculty>();
	private static List<Student> students = new ArrayList<Student>();
	
	public static void main(String[] args) {
		faculty = new ArrayList<Faculty>();
		students = new ArrayList<Student>();
		String[] choices = { "Quit", "Add a Faculty Member",
				"Add a Student", "Add Faculty Courses", "Add Student Courses", 
				"List Faculty Information", "List Student Information", "List All Information" };
		int choice;
		do {
			choice = JOptionPane.showOptionDialog(null, "Main Menu",
					"Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");

			switch (choice) {
			case 0:
				break;
			case 1:
					addFaculty();
					break;
			case 2:
					addStudent();
					break;
			case 3:
					if (!(faculty.isEmpty()))
						addFacultyCourse();
					break;
			case 4:
					if (!(students.isEmpty()))
						addStudentCourse();
					break;
			case 5:
					if (!(faculty.isEmpty()))
						listFacClasses();
					break;
			case 6:
					if(!(students.isEmpty()))
						listStuClasses();
					break;
			case 7:
				if(!(students.isEmpty()) && !(faculty.isEmpty()))
					listAllClasses();
				break;
			}
			

		} while (choice != 0); 
		
	}
	
	private static void addFaculty() {
		String name = JOptionPane
				.showInputDialog("Please enter the name of the faculty member");
		String phoneNumber = JOptionPane
				.showInputDialog("Please enter " + name + "'s phone number(include dashes where appropriate)");
		String emailAddress = JOptionPane
				.showInputDialog("Please enter " + name + "'s e-mail address");
		int employeeID = Integer.parseInt(JOptionPane
				.showInputDialog("Please enter " + name + "'s employee ID number"));
		String officeHours = JOptionPane
				.showInputDialog("Please enter " + name + "'s office hours(if more than one, separate with a semicolon)");
		faculty.add(new Faculty(name, phoneNumber, emailAddress, employeeID, officeHours));
		int streetNum = Integer.parseInt(JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the number of the house"));
		String streetName = JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the name of the street");
		int apartmentNumber = Integer.parseInt(JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the apartment number(if does not apply enter 0"));
		String city = JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the city");
		String state = JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the state");
		int zipcode = Integer.parseInt(JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the zipcode"));
		int index = indexOfFaculty(faculty);
		if(apartmentNumber == 0){
			faculty.get(index).address(streetNum, streetName, city, state, zipcode);
		}
		else{
			faculty.get(index).address(streetNum, streetName, apartmentNumber, city, state, zipcode);
		}
	}
	
	public static int indexOfFaculty(List<Faculty> faculty){
		int index = faculty.size() - 1;
		return index;		
	}
	public static int indexOfStudent(List<Student> students){
		int index = students.size() - 1;
		return index;		
	}
	
	private static void addStudent() {
		String name = JOptionPane
				.showInputDialog("Please enter the name of the student");
		String phoneNumber = JOptionPane
				.showInputDialog("Please enter " + name + "'s phone number(include dashes where appropriate)");
		String emailAddress = JOptionPane
				.showInputDialog("Please enter " + name + "'s e-mail address");
		int cinNumber = Integer.parseInt(JOptionPane
				.showInputDialog("Please enter " + name + "'s student CIN number"));
		String classStatus = JOptionPane
				.showInputDialog("Please enter " + name + "'s class status (freshman-senior)");
		students.add(new Student(name, phoneNumber, emailAddress, cinNumber, classStatus));
		int streetNum = Integer.parseInt(JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the number of the house"));
		String streetName = JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the name of the street");
		int apartmentNumber = Integer.parseInt(JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the apartment number(if does not apply enter 0"));
		String city = JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the city");
		String state = JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the state");
		int zipcode = Integer.parseInt(JOptionPane
				.showInputDialog("Please give " + name + "'s home address: enter the zipcode"));
		int index = indexOfStudent(students);
		if(apartmentNumber == 0){
			students.get(index).address(streetNum, streetName, city, state, zipcode);
		}
		else{
			students.get(index).address(streetNum, streetName, apartmentNumber, city, state, zipcode);
		}
	}
	
	private static Faculty getFalcNameFromInput() {

		int choice = JOptionPane.showOptionDialog(null, "Choose A Faculty Member",
				"Choose A Faculty Member", 0, JOptionPane.QUESTION_MESSAGE, null,
				faculty.toArray(), "null"); // the choices must be an array7
		return faculty.get(choice);
	}
	
	private static Student getStuNameFromInput() {

		int choice = JOptionPane.showOptionDialog(null, "Choose A Faculty Member",
				"Choose A Student", 0, JOptionPane.QUESTION_MESSAGE, null,
				students.toArray(), "null"); // the choices must be an array
		return students.get(choice);
	}
	
	private static void addFacultyCourse() {
		Faculty falc = getFalcNameFromInput();
		if (faculty.contains(falc)) {
			String courseNumber = JOptionPane
					.showInputDialog("Please enter the course number");
			String courseTitle = JOptionPane
					.showInputDialog("Please enter the course title");
			String classMeetingTime = JOptionPane
					.showInputDialog("Please enter the time the class meets");
			String roomNumber = JOptionPane
					.showInputDialog("Please enter the room number of the course");
			falc.addCourse(courseNumber, courseTitle, classMeetingTime, roomNumber);
		}// end if
	}
	
	private static void addStudentCourse() {
		Student stu = getStuNameFromInput();
		if (students.contains(stu)) {
			String courseNumber = JOptionPane
					.showInputDialog("Please enter the course number");
			String courseTitle = JOptionPane
					.showInputDialog("Please enter the course title");
			String classMeetingTime = JOptionPane
					.showInputDialog("Please enter the time the class meets");
			String roomNumber = JOptionPane
					.showInputDialog("Please enter the room number of the course");
			String currentGrade = JOptionPane
					.showInputDialog("Please enter the student's current grade in the course");
			stu.addCourse(courseNumber, courseTitle, classMeetingTime, roomNumber, currentGrade);
		}// end if
	}
	
	private static void listFacClasses() {
		Faculty falc = getFalcNameFromInput();
		int j = 0;
		if (faculty.contains(falc)) {
			StringBuilder sb = new StringBuilder(falc.getName()
					+ " teaches the following courses:\n ");
			if (faculty.isEmpty())
				sb.append("None");
			else
				
				for (Faculty c : faculty){
					sb.append(c.getClassesTeaching().get(j) + "\n");		
					if(j != c.getClassesTeaching().size() -1){ j++;}
			JOptionPane.showMessageDialog(null, sb);
				}
		} // end if
	}
	
	private static void listStuClasses() {
		Student stu = getStuNameFromInput();
		int j = 0;
		if (students.contains(stu)) {
			StringBuilder sb = new StringBuilder(stu.getName()
					+ " teaches the following courses:\n ");
			if (students.isEmpty())
				sb.append("None");
			else
				
				for (Student c : students){
					sb.append(c.getClassSchedule().get(j) + "\n");		
					if(j != c.getClassSchedule().size() -1){ j++;}
			JOptionPane.showMessageDialog(null, sb);
				}
		} // end if
	}
	
	private static void listAllClasses() {
	
		System.out.println("Students: ");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
			System.out.println(students.get(i).address);
			for(int j = 0; j < students.get(i).getClassSchedule().size(); j++){
				System.out.println(students.get(i).getClassSchedule().get(j));
			}
			System.out.println("GPA: " + students.get(i).getGPA());	
			System.out.println();
		}
		
		System.out.println("Faculty: ");
		for (int i = 0; i < faculty.size(); i++) {
			System.out.println(faculty.get(i).toString());
			System.out.println(faculty.get(i).address);
			for(int j = 0; j < faculty.get(i).getClassesTeaching().size(); j++){
				System.out.println(faculty.get(i).getClassesTeaching().get(j));
			}
			System.out.println();
		}
		 
	}

}


