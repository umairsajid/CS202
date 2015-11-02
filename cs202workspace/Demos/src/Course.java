
public class Course {
	private int courseNum;
	private String instructorName;
	
	public Course(int courseNum, String instructorName){
		this.courseNum = courseNum;		
		this.instructorName = instructorName;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String toString(){
		return courseNum + "; Instructor: " + instructorName;
	}

}
