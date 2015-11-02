import java.util.Scanner;

public class lab4pB {
	public static void main(String[] args){
	Scanner user_input = new Scanner(System.in);
	
	double user_current_gpa;
	do {
		System.out.println("Please enter your current GPA");
		user_current_gpa = user_input.nextDouble();
	} while (user_current_gpa < 0.0 || user_current_gpa > 4.0 );
		
int user_total_units;
	do {
		System.out.println("Please enter the total units you had taken");
		user_total_units = user_input.nextInt();
	} while (user_total_units < 0);

int user_new_units = 5;
double grade; 
	
	do{
		System.out.println("Please enter your current grade points for CS201");
		grade = user_input.nextDouble();
	} while (grade < 2.0 || grade > 4.0);

//A
	while(grade == 4.0){
		System.out.println("you will be getting an A for CS201");
	break;
	}
//A-
	while(grade == 3.7){
		System.out.println("you will be getting an A- for CS201");
	break;
	}
//B+
	while(grade == 3.3){
		System.out.println("you will be getting a B+ for CS201");
	break;
	}
//B
	while(grade == 3.0){
		System.out.println("you will be getting a B for CS201");
	break;
	}
//B-
	while(grade == 2.7){
		System.out.println("you will be getting a B- for CS201");
	break;
	}
//C+
	while(grade == 2.3){
		System.out.println("you will be getting a C+ for CS201");
	break;
	}
//C
	while(grade == 2.0){
		System.out.println("you will be getting a C for CS201");
	break;
	}
	//The new GPA calculation
		double user_new_gpa;
		user_new_gpa = Math.abs(((user_current_gpa * user_total_units) + (user_new_units * grade)) / (user_total_units + user_new_units));
		System.out.println("Your new GPA is "+ user_new_gpa + " and your old GPA was " + user_current_gpa + "\nThe diference between them is " + Math.abs(user_new_gpa - user_current_gpa));
	
	}
	
}
