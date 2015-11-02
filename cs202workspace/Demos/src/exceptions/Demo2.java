package exceptions;

import java.util.Scanner;

public class Demo2 {

	public static double quotient(double num1, double num2){
		if(num2 == 0) throw new ArithmeticException("Divisor cannot be zero");
		return num1/num2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double num1= input.nextDouble();
		double num2= input.nextDouble();
		
		try{
			double result = quotient(num1, num2);
			System.out.println(num1 + "/" + num2 +"=" + result);			
		}
		
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());			
		}
		finally{input.close();}


	}

}
