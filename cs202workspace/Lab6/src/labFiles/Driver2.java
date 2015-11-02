package labFiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
//		RadiusCannotBeNegativeException exc1 = new RadiusCannotBeNegativeException("Error! Radius cannot be less than zero!");
//		//InputNotANumberException exc2 = new InputNotANumberException("Radius has to be a number!");
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the radius of the circle: ");
//		
//		try{
//			double radius = input.nextDouble();
//			if(radius < 0){
//				throw exc1;
//			}
//			Circle c = new Circle(radius);
//			System.out.println("\n" + c);
//		}
//
//		catch(RadiusCannotBeNegativeException ex1){
//			System.out.println(ex1.getMessage());
//			//ex1.printStackTrace(System.out);
//		}
//		catch(InputMismatchException ex2){
//			System.out.println("Error! Radius has to be number!");
//			//ex1.printStackTrace(System.out);
//		}
		
		InvalidClassStatusException exc1 = new InvalidClassStatusException("Error! Class Status provided is not accepted!");
		InvalidGpaRangeException exc2 = new InvalidGpaRangeException("Error! The GPA is not within actual range!");
		
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.print("Enter the name of the student: ");
			String name = input.nextLine();
			
			System.out.print("\nEnter the CIN number of the student: ");
			long cinNumber = input.nextLong();
			
			System.out.print("\nEnter the class status of the student (freshman, sophomore, graduate, etc): ");
			String classStatus = input.next();
			if(classStatus.equals("freshman") || classStatus.equals("sophomore") || classStatus.equals("junior") || classStatus.equals("senior") || classStatus.equals("graduate")){
				
			}
			else{
				throw exc1;
			}
			
			System.out.print("\nEnter the current GPA of the student: ");
			double gpa = input.nextDouble();
			if(gpa < 0.0 || gpa > 4.0){
				throw exc2;
			}
			
			Student c = new Student(cinNumber, "sophomore", gpa, name);
			System.out.println("\n" + c);
			
			c.setClassStatus("junior");
			c.setGpa(3.56);
			
			System.out.println("\n" + c);
		}

		catch(InvalidClassStatusException ex1){
			System.out.println(ex1.getMessage());
			//ex1.printStackTrace(System.out);
		}
		catch(InvalidGpaRangeException ex2){
			System.out.println(ex2.getMessage());
			//ex1.printStackTrace(System.out);
		}
		catch(InputMismatchException ex3){
			System.out.println("Error! Input must be a number!");
			//ex1.printStackTrace(System.out);
		}
		
		

	}

}
