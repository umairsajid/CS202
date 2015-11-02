package console;

import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		boolean gameOver = false;
		char player1 = 'R';
		char player2 = 'B';
		C4board board = new C4board();
		
		intro();
		
		board.init();
		
		board.display();
		
		while(gameOver == false){
			board.nextTurn();
			board.move(player1);
			gameOver = board.isOver(player1);
	
			if(gameOver){break;}
			
			board.nextTurn();
			board.move(player2);
			gameOver = board.isOver(player2);
			if(gameOver){break;}
		}
		
		ending(board);
	}
	
	public static void intro(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Connect Four!");
		System.out.println("In order to play the game properly enter numbers between 1 and 7. " +
				"These numbers correlate with the columns of the board.");
		System.out.print("Enter 1 to begin.");
		
		int start = input.nextInt();
		
		if(start != 1){
			System.out.println("\nYou did not enter 1!\n");
	        System.exit(0);
	    }
	}
	
	public static void ending(C4board board){
		int turn = board.getTurn();
		
		System.out.println("Player " + turn + " wins!\nCongratulations!");
	}

}
