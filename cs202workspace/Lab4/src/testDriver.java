import java.util.ArrayList;


public class testDriver {

	public static void main(String[] args) {
		ArrayList<Student> adrian = new ArrayList<Student>();

		adrian.add(new Student("Adrian Rendon", "661-435-4138", "arendon094@gmail.com", 302435021, "Sophomore"));
		adrian.get(0).address(5711, "Columbia Way", 55, "Quartz Hill", "CA", 93536);
		adrian.get(0).addCourse("CS-202", "Intro to Object Oriented Programming", "MW 8:30-11:30am", "ECST: A-220", "B");
		adrian.get(0).addCourse("CS-101", "Intro to Computer Science", "R 11:40-1:20", "ECST: A-326", "A");

		//		for (Student i : adrian) {
		//			System.out.println(i.toString());
		//			System.out.println(i.address);
		//			//System.out.println(i.getCourses().toString());
		//		}

		for (int i = 0; i < adrian.size(); i++) {
			System.out.println(adrian.get(i).toString());
			System.out.println(adrian.get(i).address);
			System.out.println(adrian.get(i).getClassSchedule().get(0));
			System.out.println(adrian.get(i).getClassSchedule().get(1));
			System.out.println("GPA: " + adrian.get(i).getGPA());
		}

		System.out.println();

		ArrayList<Faculty> hank = new ArrayList<Faculty>();

		hank.add(new Faculty("Hank Hill", "555-555-5555", "hankhill@propane.com", 704315, "MW 10:00-11:00am; TR 3:00-4:00pm"));
		hank.get(0).address(345, "Forgot The Street St.", "Arlen", "TX", 55555);
		hank.get(0).addCourse("PRPN-101", "Fundamentals of Propane and Propane Accesories", "W 9:50-11:30am", "BIOS: C-231");
		hank.get(0).addCourse("PRPN-435", "Advanced Concepts of Propane", "MW 3:00-6:00pm", "BIOS: B-331");

		for (int i = 0; i < hank.size(); i++) {
			System.out.println(hank.get(i).toString());
			System.out.println(hank.get(i).address);
			System.out.println(hank.get(i).getClassesTeaching().get(0));
			System.out.println(hank.get(i).getClassesTeaching().get(1));
		}// TODO Auto-generated method stub

	}

}
