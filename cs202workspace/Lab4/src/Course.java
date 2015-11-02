
public class Course {
	private String courseNumber;
	private String courseTitle;
	private String classMeetingTime;
	private String roomNumber;
	private String currentGrade;
	private int count = 0;

	//constructor meant for students
	public Course(String courseNumber, String courseTitle, String classMeetingTime, String roomNumber, String currentGrade){
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.classMeetingTime = classMeetingTime;
		this.roomNumber = roomNumber;
		this.currentGrade = currentGrade;
		count++;
	}
	
	//constructor meant for faculty
	public Course(String courseNumber, String courseTitle, String classMeetingTime, String roomNumber){
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.classMeetingTime = classMeetingTime;
		this.roomNumber = roomNumber;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getClassMeetingTime() {
		return classMeetingTime;
	}

	public void setClassMeetingTime(String classMeetingTime) {
		this.classMeetingTime = classMeetingTime;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getCurrentGrade() {
		return currentGrade;
	}

	public void setCurrentGrade(String currentGrade) {
		this.currentGrade = currentGrade;
	}
	
	public String toString(){
		if(currentGrade == null){
		return "Course:" +
				"\n\tCourse Number: " + courseNumber +
				"\n\tCourse Title: " + courseTitle +
				"\n\tClass Meeting Time: " + classMeetingTime +
				"\n\tRoom Number: " + roomNumber;
		}
		else{
			return "Course " + count + ":" +
					"\n\tCourse Number: " + courseNumber +
					"\n\tCourse Title: " + courseTitle +
					"\n\tClass Meeting Time: " + classMeetingTime +
					"\n\tRoom Number: " + roomNumber +
					"\n\tCurrent Grade: " + currentGrade + "\n";
		}
	}
	
}
