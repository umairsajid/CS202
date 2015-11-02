package examples;

import java.util.Scanner;

public class GPAexample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lets calculate your GPA!\nEnter the number of grades recieved: ");
		int numGrades = input.nextInt();
		
		String[] grades = new String[numGrades];
		
		System.out.print("\nEnter the grades received(note: \"+\" and \"-\" do matter): ");
		for(int i = 0; i < grades.length; i++){
			grades[i] = input.next();
			//System.out.print(grades[i] + " ");
		}
		
		double gpa = getGPA(numGrades, grades);
		
		System.out.println("\nGPA: " + Math.round(gpa*100.0)/100.0);
		input.close();
	}
	
	public static double getGPA(int totalNum, String[] grades){
		double gpa;
		
		double total = 0;
		for(int i = 0; i < grades.length; i++){
			double worth = 0;
			if(grades[i].equals("A+")){
				worth = 4.33;
			}
			else if(grades[i].equals("A")){
				worth = 4.00;
			}
			else if(grades[i].equals("A-")){
				total += 3.67;
			}
			else if(grades[i].equals("B+")){
				worth = 3.33;
			}
			else if(grades[i].equals("B")){
				worth = 3.00;
			}
			else if(grades[i].equals("B-")){
				worth = 2.67;
			}
			else if(grades[i].equals("C+")){
				worth = 2.33;
			}
			else if(grades[i].equals("C")){
				worth = 2.00;
			}
			else if(grades[i].equals("C-")){
				worth = 1.67;
			}
			else if(grades[i].equals("D+")){
				worth = 1.33;
			}
			else if(grades[i].equals("D")){
				worth = 1.00;
			}
			else if(grades[i].equals("D-")){
				worth = 0.67;
			}			
			else if(grades[i].equals("E")){
				worth = 0.00;
			}
			
			total += worth;
		}
		
		gpa = total / totalNum;
		
		return gpa;
	}

}
