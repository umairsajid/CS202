/**
  * NAME:Ali Velazquez
  * FILE: Lab 6
  * COMMENTS:This program uses a for loop to display numbers 1-5.
  * Then it uses a for loop to display seconds up to one minute
  * Next a for loop is used to add up five numbers
  * Lastly, the user is prompted to enter the number of ages
  * Then a for loop is used to add up the ages and displays the average
  */
import java.util.Scanner;
public class lab_6challenge
{
   public static void main(String[] args)
   {
     String i = "";
     String endProgram = "no";
     int num = 0;
     int num1 = 0;
     double real1 = 0.0;
     double real2 = 0.0;
     int num2 = 0;
     int num3 = 0;
     int num4 = 0;
//     String i;
//     int num;
//     int num1;
//     double real1;
//     double real2;
//     int num2;
//     int num3;
//     int num4;
     Scanner keyboard = new Scanner(System.in);
//     declareVariables(i, num, num1, real1, real2, num2, num3, num4 );
     while(endProgram.equals("no"))
     {
    	 //instead of using this method
    	 declareVariables(i, num, num1, real1, real2, num2, num3, num4);
    	 // Do this (basically the same thing your method does): 
//    	 i = "no";
//    	 num = 0;
//    	 num1 = 0;
//    	 real1 = 0.0;
//    	 real2 = 0.0;
//    	 num2 = 0;
//    	 num3 = 0;
//    	 num4 = 0;
    	 System.out.println(i + ", " + num + ", " + num1 + ", " + real1 + ", " + real2 + ", " + num2 + ", " + num3 + ", " + num4);
    	 num2 = getNumber(keyboard, num2);
    	 System.out.println(i + ", " + num + ", " + num1 + ", " + real1 + ", " + real2 + ", " + num2 + ", " + num3 + ", " + num4);
    	 real1 = getScores(keyboard, real1, num2, num3, num);
    	 System.out.println(i + ", " + num + ", " + num1 + ", " + real1 + ", " + real2 + ", " + num2 + ", " + num3 + ", " + num4);
    	 real2 = getAverage(keyboard, real1, num2, real2);
    	 System.out.println(i + ", " + num + ", " + num1 + ", " + real1 + ", " + real2 + ", " + num2 + ", " + num3 + ", " + num4);
    	 printAverage(real2);
    	 System.out.println(i + ", " + num + ", " + num1 + ", " + real1 + ", " + real2 + ", " + num2 + ", " + num3 + ", " + num4);

    	 System.out.println("Do you want to end the program?(Enter no to process a new set of test scores)");
    	 //keyboard.next();
    	 endProgram = keyboard.next();
    	 System.out.println(i + ", " + num + ", " + num1 + ", " + real1 + ", " + real2 + ", " + num2 + ", " + num3 + ", " + num4);
     }
   }
   public static void declareVariables(String endProgram, int counter, int age, double averageScore, double totalScore, int number, int score, int total)
   {   // declare variables
	   //Prob
     endProgram = "no";
     counter = 1;
     age = 0;
     averageScore = 0.0;
     totalScore = 0.0;
     number = 0;
     score = 0;
     total = 0;
     
   }
   public static int getNumber(Scanner keyboard, int number)
   {
     int result;
     System.out.println("How many students took the test?");
     result = keyboard.nextInt();
     System.out.println("number in getnumber module is " + result);
     return result;
   }
   public static double getScores(Scanner keyboard, double totalScore, int number, int score, int counter)
   {
     for(counter = 1; counter <= number; counter++)
     {
       System.out.println("Enter their score");
       score = keyboard.nextInt();
       totalScore = totalScore + score;
     }
     return totalScore;
   }
   public static double getAverage(Scanner keyboard, double totalScore, int number, double averageScore)
   {
     averageScore = totalScore / number;
   return averageScore;
   }
   public static void printAverage(double averageScore)
   {
     System.out.println("The average score is " + averageScore);
   }  
} 