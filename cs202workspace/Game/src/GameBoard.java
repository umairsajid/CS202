import java.util.*;
public class GameBoard{
    public int[][] board;
    private int turn = 1;
    public GameBoard(){
        board = new int[6][7];
        this.board = board;
    }
    
    public int getTurn(){
        return this.turn;
    }
    
    public int[][] getBoard(){
        return this.board;
    }
    
    public boolean checkHorizontal(int row, int player){
        int count = 0;
        for(int j = 0; j < 7; j++){
            if(this.board[row][j] == player)
                {count++;}
            else
                {count = 0;}
            if(count == 4)
                {break;}
        }
        if(count == 4)
            {return true;}
        else
            {return false;}
    }
    
    public boolean checkVertical(int col, int player){
        int count = 0;
        for(int i = 0; i < 6; i ++){
            if(this.board[i][col] == player)
                {count++;}
            else
                {count = 0;}
            if(count == 4)
                {break;}
        }
        if(count == 4)
            {return true;}
        else
            {return false;}
    }
    
    public boolean checkDownLeft(int col, int row, int player){
        int count = 0;
        for(int i = row; i < 6; i ++){
            for(int j = col; j >= 0; j --){
                if(this.board[i][j] == player)
                    {count ++;}
                else
                    {count = 0;}
                if(count == 4)
                    {break;}
            }
        }
        if(count == 4)
            {return true;}
        else
            {return false;}
    }
    
    public boolean checkDownRight(int col, int row, int player){
        int count = 0;
         for(int i = row; i < 6; i ++){
            for(int j = col; j < 7; j ++){
                if(this.board[i][j] == player)
                    {count ++;}
                else
                    {count = 0;}
                if(count == 4)
                    {break;}
            }
        }
        if(count == 4)
            {return true;}
        else
            {return false;}
    }
    
    public boolean isEnded(){
        for (int player = 1; player < 3; player++)
        {
            for (int i = 0; i < 6; i++){
                if(checkHorizontal(i,player) == true){
                    return true;
                }
            }       
            for (int j = 0 ; j < 7; j++){
                if (checkVertical(j,player) == true){
                    return true; 
                }   
            }
            for (int j = 0; j < 7 ; j++) {
                if (checkDownLeft (j,0,player) == true) {
                    return true; 
                }
            }
            for (int i = 0; i< 6; i++){
                if (checkDownLeft (6,i,player) == true){
                    return true; 
                }
            }
            for (int j = 0; j < 7 ; j++) {
                if (checkDownRight (j,0,player) == true) {
                    return true; 
                }
            }
            for (int i=0; i< 6; i++){
                if (checkDownRight(0,i,player)==true){
                    return true;
                }
            }
        }
        return false;
    }
    
    public String toString(){
        String str = "";
        for(int[] eleRow: this.board){
            int place = 0;
            str = str + "---------------" + "\n";
            for(int eleCol: eleRow){
                if(place != (eleRow.length - 1) && eleCol == 1)
                    {str = str + "|" + "X";}                
                if(place == (eleRow.length - 1) && eleCol == 1)
                    {str = str + "|" + "X" + "|";}                
                if(place != (eleRow.length -1) && eleCol == 2)
                    {str = str + "|" + "0";}               
                if(place == (eleRow.length - 1) && eleCol == 2)
                    {str = str + "|" + "0" + "|";}                
                if(place != (eleRow.length -1) && eleCol == 0)
                    {str = str + "|" + " ";}               
                if(place == (eleRow.length - 1) && eleCol == 0)
                    {str = str + "|" + " " + "|";} 
                place ++;
            }
            str = str + "\n";
        }
        str = str + "---------------" + "\n";
        str = str + " 0 1 2 3 4 5 6";
        return str;
    }
    
    public void makeMove(int player, int column){
        Scanner input = new Scanner(System.in);
        int test = column;
        if(checkFilled(column) == false){
            while(test == column){
                System.out.println("The column is filled, please try again.");
                test = input.nextInt();}
        }
        else{
            for(int i = 5; i >= 0; i --){
                if(turn == 1){
                    if(this.board[i][test] == 0)
                        {board[i][test] = 1;
                         break;}
                }
                else{
                    if(this.board[i][test] == 0)
                        {board[i][test] = 2;
                         break;}
                }
            }
        }
    }
    
    public void nextTurn(){
        if(turn == 1)
            {turn = 2;}
        else
            {turn = 1;}
    }
    
    public boolean checkFilled(int col){
        int fill = 0;
        for(int i = 0; i < 6; i ++){
            if(this.board[i][col] == 1 || this.board[i][col] == 2)
                {fill ++;}
            if(fill == 6)
                {break;}
        }
        if(fill == 6)
            {return false;}
        else
            {return true;}
    }
    
    public String getWinner(){
        String str2 = "";
        if(turn == 1){
            if(isEnded() == true)
                {str2 = "Player 1";}            
        }
        else{
            if(isEnded() == true)
                {str2 = "Player 2";}
        }
        return str2;
    }
}