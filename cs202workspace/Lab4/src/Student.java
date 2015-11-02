

import java.util.ArrayList;


public class Student extends Person {
	private int cinNumber;
	private String classStatus;
	private ArrayList<Course> classSchedule;
	
	public Student(String name, String phoneNumber, String emailAddress, int cinNumber, String classStatus){
		classSchedule = new ArrayList<Course>();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.cinNumber = cinNumber;
		this.classStatus = classStatus;
		address = new Address();
	}

	@Override
	protected void address(int streetNum, String streetName, String city, String state, int zipcode) {
		address = new Address(streetNum, streetName, city, state, zipcode);
	}

	@Override
	protected void address(int streetNum, String streetName, int apartmentNum, String city, String state, int zipcode) {
		address = new Address(streetNum, streetName, apartmentNum, city, state, zipcode);
	}

	public void addCourse(String courseNumber, String courseTitle, String classMeetingTime, String roomNumber, String currentGrade){
		Course course = new Course(courseNumber, courseTitle, classMeetingTime, roomNumber, currentGrade);
		classSchedule.add(course);
	}
	
	public ArrayList<Course> getClassSchedule() {
		return classSchedule;
	}

	public int getCinNumber() {
		return cinNumber;
	}

	public String getClassStatus() {
		return classStatus;
	}

	public double getGPA() {
		double gpa = 0;
		double total = 0;
		
		for (Course c : classSchedule) {
			double worth = 0;
			if(c.getCurrentGrade().equals("A+")){
				worth = 4.33;
			}
			else if(c.getCurrentGrade().equals("A")){
				worth = 4.00;
			}
			else if(c.getCurrentGrade().equals("A-")){
				total += 3.67;
			}
			else if(c.getCurrentGrade().equals("B+")){
				worth = 3.33;
			}
			else if(c.getCurrentGrade().equals("B")){
				worth = 3.00;
			}
			else if(c.getCurrentGrade().equals("B-")){
				worth = 2.67;
			}
			else if(c.getCurrentGrade().equals("C+")){
				worth = 2.33;
			}
			else if(c.getCurrentGrade().equals("C")){
				worth = 2.00;
			}
			else if(c.getCurrentGrade().equals("C-")){
				worth = 1.67;
			}
			else if(c.getCurrentGrade().equals("D+")){
				worth = 1.33;
			}
			else if(c.getCurrentGrade().equals("D")){
				worth = 1.00;
			}
			else if(c.getCurrentGrade().equals("D-")){
				worth = 0.67;
			}			
			else if(c.getCurrentGrade().equals("E")){
				worth = 0.00;
			}
			
			total += worth;
		}
		
		gpa = total / classSchedule.size();
		return gpa;
	}
	
	public String toString(){
		return "Student Name: " + name +
				"\nCIN: " + cinNumber +
				"\nClass Status: " + classStatus +
				"\nE-mail Address: " + emailAddress +
				"\nPhone Number: " + phoneNumber;
	}


}
