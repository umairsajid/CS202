package codingProblem;

import java.util.ArrayList;


public class SimulatorDriver {


	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>(); 
		Simulator sim = new Simulator();
		
		int numberOfStudents = 40;
		double percentMale = 60.0;
		
		double gpaMean = 3.0;
		double gpaStanDev = 0.5;
		double gpaMin = 0.0;
		double gpaMax = 100.0;
		
		double ageMean = 23.0;
		double ageStanDev = 3.0;
		double ageMin = 14.0;
		double ageMax = 80.0;
		
		boolean[] gender = new boolean[numberOfStudents];
		gender = sim.getBooleans(numberOfStudents, percentMale); 
		
		double[] gpa = new double[numberOfStudents];
		gpa = sim.getGaussianData(gpaMean, gpaStanDev, numberOfStudents, gpaMin, gpaMax); 
		
		double[] age = new double[numberOfStudents];
		age = sim.getGaussianData(ageMean, ageStanDev, numberOfStudents, ageMin, ageMax); 
		
		for(int i = 0; i < numberOfStudents; i++){
			double gpaIn = gpa[i];
			boolean genderIn = gender[i];
			double ageIn = age[i];
			
			students.add(new Student(gpaIn, genderIn, ageIn));
		}
		
		for(int i = 0; i < students.size(); i++){
			System.out.println(students.get(i).toString());
		}

	}

}
