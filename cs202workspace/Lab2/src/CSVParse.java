//File to read: C:\Users\Adrian\Documents\CS202\Labs\demo2b.txt
import java.io.*;
import java.util.*;

public class CSVParse {

	Lect16Student[] students;
	int numRecords = 5;

	public static void main(String[] args) {
		CSVParse parser = new CSVParse();
		try{
			parser.readFile();
			}
			
		catch (Exception e){e.printStackTrace();}
		
		parser.showGrades();
	}
	
	public void showGrades(){
		for(Lect16Student s: students){
			System.out.println(s.toString());			
		}		
		showAverage();
	}
	
	public void showAverage(){
		double total = 0;
		for(Lect16Student stu: students) total+= stu.getGrade();
		System.out.println("Class Average: " + total / students.length);
	}

	public void readFile() throws IOException {
        students = new Lect16Student[numRecords];
        try {
			System.out.println("Enter a filepath to read from ");
			Scanner in = new Scanner(System.in);
	        File inFile  = new File(in.next());  // File to read from.
			Scanner freader = new Scanner(inFile);

			freader.nextLine();  // skip the header
	
	// this would crash if the length of the array did not match the number of lines in the file.
	// next term you will learn to use lists, which are much more robust
			for(int counter =0; counter < students.length; counter++) {
				String line = freader.nextLine();
				
				String[] fields = line.split(",");
				String name = fields[0];
				double grade = Double.parseDouble(fields[1]);
				students[counter] = new Lect16Student(name, grade);	
			}
			freader.close();  // Close to unlock.

        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
	}
}

