package gpa;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<SchoolRecord> records = new ArrayList<SchoolRecord>();
		records.add(new SchoolRecord("Fred"));
		records.get(0).addCourse("Geology 101", 4, 1.7);
		records.get(0).addCourse("Advanced Rock Climbing", 1, 3.7);
		
		records.add(new SchoolRecord("Wilma"));
		records.get(1).addCourse("Chemistry 101", 4, 4.0);
		records.get(1).addCourse("Automotive Engineering 203", 3, 3.0);
		
		for (SchoolRecord i : records) {
			System.out.println(i.toString());
		}
		
		System.out.println();
		
		
		
		int i = 0;
		int j = 0;
		while(i != records.size()){
			records.get(i).getCourses();
			System.out.println(records.get(i).getStudentName() + " received a " + records.get(i).getCourses().get(j).getGrade() + " in " + records.get(i).getCourses().get(j).getName());
			j++;
			if(j == records.get(i).getCourses().size()){
				i++;
				j = 0;
			}
		}
		
	}

}
	
