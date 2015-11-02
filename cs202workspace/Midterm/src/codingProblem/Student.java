package codingProblem;

public class Student {
	private double gpa;
	private boolean isMale;
	// a real application would track DOB and calculate age as needed!
	private double age;

	public Student(double gpa, boolean isMale, double age){
		this.gpa = gpa;
		this.isMale = isMale;
		this.age = age;		
	}
	
	public String toString(){
		return "GPA: " + (double) Math.round(gpa * 100) / 100 + "; " + (isMale?"Male": "Female")+"; " + (double)Math.round(age * 10) / 10 + " years old";		
	}
}
