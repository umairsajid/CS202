package labFiles;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		RadiusCannotBeNegativeException exc1 = new RadiusCannotBeNegativeException("\nError! Radius cannot be less than zero! Returning to main menu.\n");
		InvalidClassStatusException exc2 = new InvalidClassStatusException("\nError! Class Status provided is not accepted! Returning to main menu.\n");
		InvalidGpaRangeException exc3 = new InvalidGpaRangeException("\nError! The GPA is not within actual range! Returning to main menu.\n");
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		
		do{
			String t = null;
			printMenu(t);
			
			System.out.print("Enter choice (1-5): ");
			int choice = input.nextInt();
			System.out.print("\n");
			
			if(choice == 1){
				try{
					System.out.print("Enter the radius of the circle: ");
					double radius = input.nextDouble();
					if(radius < 0){
						throw exc1;
					}
					Circle c = getCircle(radius);
					System.out.println("\n" + c);
				}

				catch(RadiusCannotBeNegativeException ex1){
					System.out.println(ex1.getMessage());
					//ex1.printStackTrace(System.out);
				}
				catch(InputMismatchException ex2){
					System.out.println("\nError! Radius has to be number! Returning to main menu.\n");
					//input.nextLine();
					//ex1.printStackTrace(System.out);
				}
				
			}
			
			if(choice == 2){
				try{	
					System.out.print("\nEnter the CIN number of the student: ");
					long cinNumber = input.nextLong();
					
					System.out.print("\nEnter the name of the student (noSpaces): ");
					String name = input.next();
					
					System.out.print("\nEnter the class status of the student (freshman, sophomore, graduate, etc): ");
					String classStatus = input.next();
					if(classStatus.equals("freshman") || classStatus.equals("sophomore") || classStatus.equals("junior") || classStatus.equals("senior") || classStatus.equals("graduate")){
						
					}
					else{
						throw exc2;
					}
					
					System.out.print("\nEnter the current GPA of the student: ");
					double gpa = input.nextDouble();
					if(gpa < 0.0 || gpa > 4.0){
						throw exc3;
					}
					
					Student c = getStudent(cinNumber, classStatus, gpa, name);
					System.out.println("\n" + c);
				}

				catch(InvalidClassStatusException ex2){
					System.out.println(ex2.getMessage());
					//ex1.printStackTrace(System.out);
				}
				catch(InvalidGpaRangeException ex3){
					System.out.println(ex3.getMessage());
					//ex1.printStackTrace(System.out);
				}
				catch(InputMismatchException ex4){
					System.out.println("\nError! Input must be a number! Returning to the main menu.\n");
					input.nextLine();
					//ex1.printStackTrace(System.out);
				}
			}
			
			if(choice == 3){
				try{
					System.out.print("Re-enter the radius of the circle: ");
					double radius = input.nextDouble();
					if(radius < 0){
						throw exc1;
					}
					Circle c = getCircle(radius);
					
					System.out.print("Type a new value for the radius: ");
					double radius2 = input.nextDouble();
					c.setRadius(radius2);
					
					System.out.println("\n" + c);
				}

				catch(RadiusCannotBeNegativeException ex1){
					System.out.println(ex1.getMessage());
					//ex1.printStackTrace(System.out);
				}
				catch(InputMismatchException ex2){
					System.out.println("\nError! Radius has to be number! Returning to main menu.\n");
					input.nextLine();
					//ex1.printStackTrace(System.out);
				}
			}
			
			if(choice == 4){
				try{	
					System.out.print("\nRe-enter the CIN number, name, class status, and gpa of the student: ");
					long cinNumber = input.nextLong();
					String name = input.next();
					String classStatus = input.next();
					double gpa = input.nextDouble();
					
					if(classStatus.equals("freshman") || classStatus.equals("sophomore") || classStatus.equals("junior") || classStatus.equals("senior") || classStatus.equals("graduate")){
						
					}
					else{
						throw exc2;
					}
					
					if(gpa < 0.0 || gpa > 4.0){
						throw exc3;
					}
					
					boolean endLoop = false;
					Student c = getStudent(cinNumber, classStatus, gpa, name);
					do{
						System.out.println("\nIf you want to change the CIN number press 1\nIf you want to change the class status press 2\nIf you would like to change the gpa press 3\nIf you would like to change the name press 4\nIf done press 0 ");
						int itc = input.nextInt();
						if(itc == 1){
							System.out.println("\nEnter a new CIN number: ");
							long newCin = input.nextLong();
							c.setCinNumber(newCin);
						}
						if(itc == 2){
							System.out.println("\nEnter a new class status: ");
							String newStatus = input.next();
							c.setClassStatus(newStatus);
						}
						if(itc == 3){
							System.out.println("\nEnter a new gpa: ");
							double newGpa = input.nextDouble();
							c.setGpa(newGpa);
						}
						if(itc == 4){
							System.out.println("\nEnter a new name: ");
							String newName = input.next();
							c.setName(newName);
						}
						if(itc == 0){
							endLoop = true;
						}
					}
					while(endLoop == false);
					
					System.out.println("\n" + c);
				}

				catch(InvalidClassStatusException ex2){
					System.out.println(ex2.getMessage());
					//ex1.printStackTrace(System.out);
				}
				catch(InvalidGpaRangeException ex3){
					System.out.println(ex3.getMessage());
					//ex1.printStackTrace(System.out);
				}
				catch(InputMismatchException ex4){
					System.out.println("\nError! Input must be a number! Returning to the main menu.\n");
					input.nextLine();
					//ex1.printStackTrace(System.out);
				}
			}
			
			if(choice == 5){
				System.out.println("Program will now exit.");
				loop = false;
			}
			
		}
		while(loop == true);
	}
	
	public static void printMenu(String j) {
		System.out.println("======Welcome to the Main Menu======");
		System.out.println("1. Create the Circle Object");
		System.out.println("2. Create the Student Object");
		System.out.println("3. Change the Information of the Circle Object");
		System.out.println("4. Change Information of the Student Object");
		System.out.println("5. Exit");
		System.out.println("=====================================");
	}
	
	public static Circle getCircle(double radius){
		Circle c = new Circle(radius);
		
		return c;
	}
	
	public static Student getStudent(long cin, String classStatus, double gpa, String name){
		Student c = new Student(cin, classStatus, gpa, name);
		
		return c;
	}
}
