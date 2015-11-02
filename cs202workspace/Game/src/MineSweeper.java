import java.util.*;
public class MineSweeper{
    public static void main(String[] args){
        System.out.println("How large is the board?");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();        
        System.out.println("How many mines are on the board?");        
        int mines = in.nextInt();
        while(mines > length*length || mines < 0){
            System.out.println("That choice is not possible, please try again.");
            mines = in.nextInt();
        }
        GameBoard gameBoard = new GameBoard( length, mines );     
        gameBoard.generateBoard();
        System.out.println(gameBoard.toString());
        
        System.out.println("Enter x and y axis of the tile you wish to dig ...");        
        int x = in.nextInt();        
        int y = in.nextInt(); 
        while(x >= length || y >= length || x < 0 || y < 0){
            System.out.println("Not a valid choice, please try again.");
            x = in.nextInt();
            y = in.nextInt();
        }
        gameBoard.makeMove( x, y );
        System.out.println(gameBoard.toString());
        
         while ( !gameBoard.isEnded())        
        {        
            System.out.println("Enter x and y axis of the tile you wish to dig ...");        
            x = in.nextInt();        
            y = in.nextInt(); 
            while(x >= length || y >= length || x < 0 || y < 0){
                System.out.println("Not a valid choice, please try again.");
                x = in.nextInt();
                y = in.nextInt();
            }
            gameBoard.makeMove( x, y );
            System.out.println(gameBoard.toString());
        }
        
        System.out.println( gameBoard.showResult() );
    }
}