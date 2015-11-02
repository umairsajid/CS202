import java.util.*;
public class ConnectFour{
    public static void main(String[] args){
        System.out.println("Enter a level of AI (1 - easy, 2 - normal, 3 - hard):");
        Scanner in = new Scanner(System.in);
        int level = in.nextInt();
        while(level > 3 || level < 0){
            System.out.println("Not a valid level, please try again.");
            level = in.nextInt();
        }
        AI_Perez AI = new AI_Perez( 2, level ); // we use hard-coded 2 to indicate player 2 is ai
        GameBoard gameBoard = new GameBoard();
        gameBoard.nextTurn();
        System.out.println(gameBoard.toString());
        while (!gameBoard.isEnded())
        {
            gameBoard.nextTurn();
            int turn = gameBoard.getTurn();
            int column = -1;
            System.out.println("Player " + turn + " turn: ");
            System.out.print("Pick a column: ");
            if ( turn == 1 ) // hard-coded 1 to indicate player 1 is player's turn
            {
                // Player 1 turn, player's turn
                column = in.nextInt();
                while (column > 6 || column < 0){
                    System.out.println("Not a valid input, please try again.");
                    column = in.nextInt();
                }
            }
            else
            {
                // Player 2 turn, AI's turn
                column = AI.makeNextMove( gameBoard.getBoard() );
                System.out.println(column);
            }
            gameBoard.makeMove( turn, column );
            System.out.println(gameBoard.toString());
        }
        System.out.println( "Game ended, winner is " + gameBoard.getWinner() );
    }
}
