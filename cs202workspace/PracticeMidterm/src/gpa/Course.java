package gpa;

public class Course {
	private String name;
	private int units;
	private double grade;

	public Course(String nameIn, int unitsIn, double gradeIn) {
		name = nameIn;
		units = unitsIn;
		grade = gradeIn;
	}

	public String getName() {
		return name;
	}

	public int getUnits() {
		return units;
	}

	public double getGrade() {
		return grade;
	}

	public String toString() {
		return "Course Name: " + name + "; Units: " + units + "; Grade: "
				+ grade;

	}
}

//Scanner input = new Scanner(System.in);
//boolean stop = false;
//boolean stopWhile = false;
//int k = 0;
//while(stop == false){
//	System.out.println("Enter the name of the student(if no more students then enter \"done\"): ");
//	String name = input.next();
//	if(name == "stop"){
//		stop = true;
//	}
//	records.add(new SchoolRecord(name));
//	while(stopWhile == false){
//		System.out.print("Enter the course name, number of units, and grade recieved (enter \"done\" if there are no more courses): ");
//		String courseName = input.nextLine();
//		if(courseName == "done"){
//			k++;
//			continue;
//		}
//		int units = input.nextInt();
//		double grade = input.nextDouble();
//		records.get(k).addCourse(courseName, units, grade);
//	}
//}
