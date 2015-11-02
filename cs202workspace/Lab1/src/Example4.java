import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		//Guess word will be: indigo
		String word = "indigo";
		
		//create the place holders and display them
		int[] placeholders = new int[word.length()];
		
		for(int i = 0; i< placeholders.length; i++) {
			placeholders[i] = 95;
		}
		for(int i = 0; i< placeholders.length; i++) {
			System.out.print((char)placeholders[i] + " ");
		}
		
		//create array to keep track of wrong guesses:
		//7 wrong guesses is a game over
		String[] wrongGuesses = new String[7];
		
		
		//begin user input
		Scanner guesses = new Scanner(System.in);
		
		boolean correctGuess = false;
		
		System.out.print("\n\nMake a guess: ");
		String guess1 = guesses.next();
		char ofGuess1 = guess1.charAt(0);
		while(correctGuess != true){				
			for(int i = 0; i< placeholders.length; i++) {
				if (ofGuess1 == word.charAt(i)){
					placeholders[i] = ofGuess1;
					correctGuess = true;
				}
				else{
					placeholders[i] = 95;
				}
				System.out.print((char)placeholders[i] + " ");
			}
			if(correctGuess == false){
				System.out.print("\n\nMake a guess: ");
				guess1 = guesses.next();
				ofGuess1 = guess1.charAt(0);
			}
		}
		
		System.out.print(correctGuess);
		
		correctGuess = false;
		System.out.println(correctGuess);
		System.out.println(ofGuess1);
		System.out.print("\n\nMake a guess: ");
		String guess2 = guesses.next();
		char ofGuess2 = guess2.charAt(0);
		while(correctGuess != true){				
			for(int i = 0; i< placeholders.length; i++) {
				if (ofGuess1 == word.charAt(i)){
					placeholders[i] = ofGuess1;
				}
				if (ofGuess2 == word.charAt(i)){
					placeholders[i] = ofGuess2;
					correctGuess = true;
				}
				else{
					placeholders[i] = 95;
				}
				System.out.print((char)placeholders[i] + " ");
			}
			if(correctGuess == false){
				System.out.print("\n\nMake a guess: ");
				guess2 = guesses.next();
				ofGuess2 = guess2.charAt(0);
			}
		}	
		System.out.print(correctGuess);
		
//		System.out.print("\n\nMake a guess: ");
//		String guess3 = guesses.next();
//		char ofGuess3 = guess3.charAt(0);
//		
//		for(int i = 0; i< placeholders.length; i++) {
//			placeholders[i] = 95;
//			if (ofGuess1 == word.charAt(i)){
//				placeholders[i] = ofGuess1;
//			}
//			if (ofGuess2 == word.charAt(i)){
//				placeholders[i] = ofGuess2;
//			}
//			if (ofGuess3 == word.charAt(i)){
//				placeholders[i] = ofGuess3;
//			}
//			System.out.print((char)placeholders[i] + " ");
//		}
//		
//		System.out.print("\n\nMake a guess: ");
//		String guess4 = guesses.next();
//		char ofGuess4 = guess4.charAt(0);
//		
//		for(int i = 0; i< placeholders.length; i++) {
//			placeholders[i] = 95;
//			if (ofGuess1 == word.charAt(i)){
//				placeholders[i] = ofGuess1;
//			}
//			if (ofGuess2 == word.charAt(i)){
//				placeholders[i] = ofGuess2;
//			}
//			if (ofGuess3 == word.charAt(i)){
//				placeholders[i] = ofGuess3;
//			}
//			if (ofGuess4 == word.charAt(i)){
//				placeholders[i] = ofGuess4;
//			}
//			System.out.print((char)placeholders[i] + " ");
//		}
//		
//		System.out.print("\n\nMake a guess: ");
//		String guess5 = guesses.next();
//		char ofGuess5 = guess5.charAt(0);
//		
//		for(int i = 0; i< placeholders.length; i++) {
//			placeholders[i] = 95;
//			if (ofGuess1 == word.charAt(i)){
//				placeholders[i] = ofGuess1;
//			}
//			if (ofGuess2 == word.charAt(i)){
//				placeholders[i] = ofGuess2;
//			}
//			if (ofGuess3 == word.charAt(i)){
//				placeholders[i] = ofGuess3;
//			}
//			if (ofGuess4 == word.charAt(i)){
//				placeholders[i] = ofGuess4;
//			}
//			if (ofGuess5 == word.charAt(i)){
//				placeholders[i] = ofGuess5;
//			}
//			System.out.print((char)placeholders[i] + " ");
//		}


	}

}
