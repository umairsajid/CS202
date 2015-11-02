import java.util.*;
public class AI_Perez{
    public int[][] board;
    private int level;
    private int AIToken;
    private int opponentToken;
    private int move = 0;
    public AI_Perez(int token, int level){
        this.AIToken = token;
        this.level = level;
        this.opponentToken = (token == 2) ? 1 : 2;
    }
    
    public void setBoard(GameBoard other){
        GameBoard change = new GameBoard();
        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 7; j ++){
                change.getBoard()[i][j] = other.board[i][j];
            }
        }
        this.board = change.getBoard();
    }
    
        public boolean checkFilled(int col){
        int filled = 0;
        for(int i = 0; i < 6; i++){
            if(this.board[i][col] == 1 || this.board[i][col] == 2){
                filled++;
            }
            if(filled == 6){
                break;
            }
        }
        
        if(filled == 6) return true;
        else return false;
    }
    
    public int makeNextMove(int[][] board){
        int value = 0;
        int column = 0;
        this.board = board;
        Random rand = new Random();
        if(level == 1){
            do 
                {value = rand.nextInt(6);
            } while(checkFilled(value));
        }
        
        if(level == 2){
            for(int j = 0; j < 7; j++){
                if(!checkFilled(j))
                    {column = j;}
            }
            value = column;
        }
        
        if(level == 3){
            this.board = board;
            GameBoard copy = new GameBoard();  
            boolean active1 = true;
            boolean active2 = true;
            
            for (int j = 0; j < 7; j++) {
                if ( checkFilled(j) == false )
                {
                    copy = clone();
                    copy.makeMove( AIToken, j ); 
                    if (copy.isEnded() == true) {
                        active1 = false;
                        return j;                  
                    }
                }                                
            }
            
            copy = new GameBoard();
            for (int j = 0; j < 7; j++) {
                if ( checkFilled(j) == false )
                {
                    copy = clone();
                    copy.makeMove( opponentToken, j );
                    if (copy.isEnded() == true) { 
                        active2 = false;
                        return j;
                    }
                }                                
            }
            
            int col;
            Random rand2= new Random();
            if(active1 == true && active2 == true){
                do {
                    col = rand2.nextInt(7); 
                } while ( checkFilled(value) );
                
                value = col;
            }
        }        
        return value;
    }
    
    public GameBoard clone(){
        GameBoard newBoard = new GameBoard();
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                newBoard.getBoard()[i][j] = this.board[i][j];
            }
        }
        return newBoard;
    }
}
