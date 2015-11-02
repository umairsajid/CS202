import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HangmanGame {
	
	//to be used for inner classes
	private String[] colors = new String[31];
	private String category;
	private Scanner userInput = new Scanner(System.in);
	private String wordToGuess;
	private String placeholders;
	private String correct = "";
	private int randomNumber;
	//keeps track of all possible guesses. Although it could be smaller, use 26 index (for all letters in alphabet) in case I want to change my code later 
	private char[] guesses = new char[26];
	private boolean win;

	public static void main(String[] args) {

		HangmanGame hGame = new HangmanGame();
		
		//reads my file
		try{
			BufferedReader in = 
					new BufferedReader(new FileReader("colors.txt"));

			int count = 0;
			while (in.ready()) { 
				hGame.colors[count] = in.readLine(); 
				count++; 
			}
			in.close(); 
		}
		catch(IOException e){
			System.out.println("Error during reading/writing");
		}

		hGame.initializeInner();

		String guessedLetter;
		
		//counter for number of incorrect guesses
		int incorrectGuesses = 0;
		//numCorrect and numIncorrect are important for printing pictures
		int numIncorrect = 0;
		int numCorrect = 0;

		int[][] hangman = new int[7][9];

		boolean stop = false;

		System.out.println("Welcome to HangMan!");
		printFrame(hangman);
		
		while(stop != true){
			System.out.println("Category: " + hGame.category + "\n");
			hGame.printGuesses();
			System.out.println("\n" + hGame.placeholders);
			System.out.print("Guess a letter: ");
			guessedLetter = hGame.userInput.next();
			
			//if want to display all letters used, use code here instead of in else statement
//			hGame.guesses[timesGuessed] = guessedLetter.charAt(0);
//			timesGuessed++;

			//replaces place holders with correct word and prints appropriate picture
			if(hGame.wordToGuess.indexOf(guessedLetter.charAt(0)) != -1){
				printCorrect(numCorrect, hangman);
				hGame.correct = hGame.correct + guessedLetter.charAt(0);
				hGame.placeholders = hGame.wordToGuess.replaceAll("[^"+hGame.correct+" ]","_ ");
				if(hGame.wordToGuess.replaceAll("["+hGame.correct+" ]","").length() == 0){
					hGame.win = true;
					stop = true;
				}
			}
			//very important bit of code for program
			else{
				printMiss(numIncorrect, hangman);
				numIncorrect++;
				numCorrect++;
				hGame.guesses[incorrectGuesses] = guessedLetter.charAt(0);
				incorrectGuesses++;
				if(numIncorrect == 7){
					hGame.win = false;
					stop = true;
				}
			}
		}
		//give end statements
		if(hGame.win){
			System.out.println("Yes! The correct word was in fact \"" + hGame.wordToGuess + "\"!\nCongratulations! You won the game!");
		}
		else{
			System.out.println("I'm sorry! The correct word was \"" + hGame.wordToGuess +"\".  You have lost the game!");
		}	
	}

	void initializeInner(){		
		win = false;

		randomNumber = 1 + (int)(Math.random() * ((30 - 1) + 1));
		wordToGuess = colors[randomNumber];
		placeholders = wordToGuess.replaceAll("[A-Za-z]","_ ");
		
		correct = "";
		
		category = colors[0];
		for(int i = 0; i < 26; i++)
			guesses[i] = '~';
	}

	void printGuesses(){
		//prints only incorrect guesses/letters because of the else statement
		System.out.print("Incorrect Letters: ");
		for(int i = 0; i < 26; i++){
			if(guesses[i] != '~')
				System.out.print(guesses[i] + " ");
		}
		System.out.println();
	}


	public static void printMiss(int timesMissed, int[][] hangman){
		//calls and prints frames when called again. Only when user guesses wrong
		timesMissed++;
		switch(timesMissed){
		case 1: System.out.println("\nIncorrect guess!");
				printFrame2(hangman);
				break;
		case 2: System.out.println("\nIncorrect guess!");
				printFrame3(hangman);
				break;
		case 3: System.out.println("\nIncorrect guess!");
				printFrame4(hangman);
				break;
		case 4: System.out.println("\nIncorrect guess!");
				printFrame5(hangman);
				break;
		case 5: System.out.println("\nIncorrect guess!");
				printFrame6(hangman);
				break;
		case 6: System.out.println("\nIncorrect guess!");
				printFrame7(hangman);
				break;
		case 7: System.out.println("\nIncorrect guess!");
				printFrame8(hangman);
				break;
		}
	}
	
	public static void printCorrect(int timesCorrect, int[][] hangman){	
		//calls and prints frames when called again. Only when user guesses correctly
		switch(timesCorrect){
		case 0: System.out.println("\nGood guess!");
				printFrame(hangman);
				break;
		case 1: System.out.println("\nGood guess!");
				printFrame2(hangman);
				break;
		case 2: System.out.println("\nGood guess!");
				printFrame3(hangman);
				break;
		case 3: System.out.println("\nGood guess!");
				printFrame4(hangman);
				break;
		case 4: System.out.println("\nGood guess!");
				printFrame5(hangman);
				break;
		case 5: System.out.println("\nGood guess!");
				printFrame6(hangman);
				break;
		case 6: System.out.println("\nGood guess!");
				printFrame7(hangman);
				break;
		}
	}

	//2D arrays for all 8 frames
	public static void printFrame(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}	
	}

	public static void printFrame2(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}
	}

	public static void printFrame3(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 79, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}
	}

	public static void printFrame4(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 79, 32, 32, 32, 124, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}
	}

	public static void printFrame5(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 79, 32, 32, 32, 124, 32, 32},
				{32, 47, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}
	}

	public static void printFrame6(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 79, 32, 32, 32, 124, 32, 32},
				{32, 47, 124, 92, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}
	}

	public static void printFrame7(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 79, 32, 32, 32, 124, 32, 32},
				{32, 47, 124, 92, 32, 32, 124, 32, 32},
				{32, 47, 32, 32, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}
	}

	public static void printFrame8(int[][] hangman){
		int[][] frame = {
				{32, 32, 43, 45, 45, 45, 43, 32, 32},
				{32, 32, 124, 32, 32, 32, 124, 32, 32},
				{32, 32, 79, 32, 32, 32, 124, 32, 32},
				{32, 47, 124, 92, 32, 32, 124, 32, 32},
				{32, 47, 32, 92, 32, 32, 124, 32, 32},
				{32, 32, 32, 32, 32, 32, 124, 32, 32},
				{61, 61, 61, 61, 61, 61, 61, 61, 61},
		};

		for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j]);
			}
			System.out.println();
		}
	}

}
