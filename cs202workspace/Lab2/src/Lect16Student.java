
public class Lect16Student {

	String name;
	double grade;
	
	public Lect16Student(String nameIn, double gradeIn){
		name = nameIn;
		grade = gradeIn;
	}

	public String getName(){
		return name;
	}
	
	public double getGrade(){
		return grade;
	}
	
	public String toString(){
		return(name + " recieved grade: " + grade);
	}

}
