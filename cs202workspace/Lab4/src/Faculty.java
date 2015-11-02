import java.util.ArrayList;


public class Faculty extends Person {
	private int employeeID;
	private String officeHours;
	private ArrayList<Course> classesTeaching;

	public Faculty(String name, String phoneNumber, String emailAddress, int employeeID, String officeHours) {
		classesTeaching = new ArrayList<Course>();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.employeeID = employeeID;
		this.officeHours = officeHours;
		address = new Address();
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getOfficeHours() {
		return officeHours;
	}
	
	public void addCourse(String courseNumber, String courseTitle, String classMeetingTime, String roomNumber){
		Course course = new Course(courseNumber, courseTitle, classMeetingTime, roomNumber);
		classesTeaching.add(course);
	}

	public ArrayList<Course> getClassesTeaching() {
		return classesTeaching;
	}

	@Override
	protected void address(int streetNum, String streetName, int apartmentNum, String city, String state, int zipcode) {
		address = new Address(streetNum, streetName, apartmentNum, city, state, zipcode);
	}

	@Override
	protected void address(int streetNum, String streetName, String city, String state, int zipcode) {
		address = new Address(streetNum, streetName, city, state, zipcode);	
	}
	
	public String toString(){
		return "Faculty Name: " + name +
				"\nEmployee Identification Number: " + employeeID +
				"\nOffice Hours: " + officeHours +
				"\nE-mail Address: " + emailAddress +
				"\nPhone Number: " + phoneNumber;
	}

}
