import java.util.ArrayList;
import java.util.List;

public class Department {
	private String deptName;
	
	private List<Course> courses;

	public Department(String deptName){
		courses = new ArrayList<Course>();
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void dropCourse(Course course) {
		courses.remove(course);
	}
	
	public String toString(){
		return deptName;
	}

}
