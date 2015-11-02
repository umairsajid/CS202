package labFiles;


public class Student {
	private long cinNumber;
	private String classStatus;
	private double gpa;
	private String name;
	
	public Student(long cinNumber, String classStatus, double gpa, String name){
		this.cinNumber = cinNumber;
		this.classStatus = classStatus;
		this.gpa = gpa;
		this.name = name;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		InvalidGpaRangeException newExc = new InvalidGpaRangeException("Error! The GPA is not within actual range!");
		if(gpa < 0.0 || gpa > 4.0){
			throw newExc;
		}
		this.gpa = gpa;
	}

	public long getCinNumber() {
		return cinNumber;
	}
	
	public void setCinNumber(long cinNumber) {
		this.cinNumber = cinNumber;
	}

	public String getClassStatus() {
		return classStatus;
	}
	
	public void setClassStatus(String classStatus) {
		InvalidClassStatusException newExc = new InvalidClassStatusException("Error! Class Status provided is not accepted!");
		if(classStatus.equals("freshman") || classStatus.equals("sophomore") || classStatus.equals("junior") || classStatus.equals("senior") || classStatus.equals("graduate")){
			
		}
		else{
			throw newExc;
		}
		this.classStatus = classStatus;
	}
	
	public String toString(){
		return "Student Name: " + name +
				"\nCIN: " + cinNumber +
				"\nClass Status: " + classStatus +
				"\nGPA: " + gpa;
	}


}
