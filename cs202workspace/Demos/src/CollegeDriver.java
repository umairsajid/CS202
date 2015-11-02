import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CollegeDriver {
	
	private static List<Department> departments = new ArrayList<Department>();

	public static void main(String[] args) {
		
		departments = new ArrayList<Department>();
		String[] choices = { "Quit", "List Courses For A Department",
				"Add A Course", "Add A Department" };
		int choice;
		do {
			choice = JOptionPane.showOptionDialog(null, "Main Menu",
					"Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");

			switch (choice) {
			case 0:
				break;
			case 1:
				if (!(departments.isEmpty()))
					listDeptClasses();
				break;
			case 2:
				if (!(departments.isEmpty()))
					addCourse();
				break;
			case 3:
				addDept();
				break;
			} // end switch

		} while (choice != 0); // end do


	}
	
	private static Department getDeptNameFromInput() {

		int choice = JOptionPane.showOptionDialog(null, "Choose A Department",
				"Choose A Department", 0, JOptionPane.QUESTION_MESSAGE, null,
				departments.toArray(), "null"); // the choices must be an array
		return departments.get(choice);
	}

	private static void listDeptClasses() {
		Department dept = getDeptNameFromInput();
		if (departments.contains(dept)) {
			List<Course> deptCourses = dept.getCourses();
			StringBuilder sb = new StringBuilder(dept.getDeptName()
					+ " offers the following courses:\n ");
			if (deptCourses.isEmpty())
				sb.append("None");
			else
				for (Course c : deptCourses)
					sb.append(c + "\n");				// note that this will use the toString() method of Course
			JOptionPane.showMessageDialog(null, sb);
		} // end if
	}

	private static void addCourse() {
		Department dept = getDeptNameFromInput();
		if (departments.contains(dept)) {
			int courseNum = Integer.parseInt(JOptionPane
					.showInputDialog("Please enter the course number"));
			String instructorName = JOptionPane
					.showInputDialog("Please enter the name of the instructor in the new course");
			dept.addCourse(new Course(courseNum, instructorName));
		}// end if
	}

	private static void addDept() {
		String deptName = JOptionPane
				.showInputDialog("Please enter the name of the new department");
		departments.add(new Department(deptName));

	}
}
