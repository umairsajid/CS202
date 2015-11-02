package gpa;

import java.util.ArrayList;
import java.util.List;

public class SchoolRecord {
	private List<Course> courses;
	private String studentName;

	public SchoolRecord(String studentName) {
		courses = new ArrayList<Course>();
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void addCourse(String courseName, int units, double grade) {
		Course course = new Course(courseName, units, grade);
		courses.add(course);
	}

	public double getGPA() {
		double sum = 0;
		int totalUnits = 0;
		int currUnits = 0;
		for (Course c : courses) {
			currUnits = c.getUnits();
			sum += c.getGrade() * currUnits;
			totalUnits += currUnits;
		}
		return sum / totalUnits;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public String toString() {
		return studentName + " has a GPA of " + getGPA();
	}
}
