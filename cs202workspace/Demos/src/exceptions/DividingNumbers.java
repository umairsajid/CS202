package exceptions;

import java.util.Scanner;

public class DividingNumbers {
	
	
	public static double quotient(double num1, double num2){
		DivideByZeroException newExc = new DivideByZeroException("Cannot divide by zero!");
		if(num2 == 0){
			throw newExc;
		}
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double num1= input.nextDouble();
		double num2= input.nextDouble();
		
		try{
			double result = quotient(num1, num2);
			System.out.println(num1 + "/" + num2 +" = " + result);			
		}
		
		catch(DivideByZeroException ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace(System.out);
		}
		finally{input.close();}

	}

}
