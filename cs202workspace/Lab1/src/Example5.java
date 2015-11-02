import java.util.Scanner;

public class Example5 {

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
				
		//begin user input
		Scanner guesses = new Scanner(System.in);
		
		
//		String guess1 = guesses.next();
//		String guess2 = guesses.next();
//		String guess3 = guesses.next();
//		String guess4 = guesses.next();
//		String guess5 = guesses.next();
//		String guess6 = guesses.next();
//		String guess7 = guesses.next();
//		String guess8 = guesses.next();
//		char ofGuess1 = guess1.charAt(0);
//		char ofGuess2 = guess2.charAt(0);
//		char ofGuess3 = guess3.charAt(0);
//		char ofGuess4 = guess4.charAt(0);
//		char ofGuess5 = guess5.charAt(0);
//		char ofGuess6 = guess6.charAt(0);
//		char ofGuess7 = guess7.charAt(0);
//		char ofGuess8 = guess8.charAt(0);
		
		
		boolean wL = true;
		do{
			System.out.print("\n\nMake a guess: ");
			String guess1 = guesses.next();
			char ofGuess1 = guess1.charAt(0);
			
			for(int i = 0; i< placeholders.length; i++) {
				if (ofGuess1 == word.charAt(i)){
					placeholders[i] = ofGuess1;
				}
				else{
					placeholders[i] = 95;
				}
				System.out.print((char)placeholders[i] + " ");
			}
		}
		while(wL != false);
	
	}
}
