package test;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Courses> entries = new ArrayList<Courses>();
		
		entries.add(new Courses("CS201", "Computer Science"));
		entries.add(new Courses("CS332F", "Computer Science"));
		entries.add(new Courses("CS337", "Computer Science"));
		
		System.out.println(entries.get(0).getId());
		System.out.println(entries.get(1).getId());
		System.out.println(entries.get(2).getId());

	}

}
