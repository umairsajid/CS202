package gui;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class C4Board {

	public char[][] board;
	public Scanner input = new Scanner(System.in);
	public int colIndex, rowIndex;
	private int turn;
	private JLabel[][] grid = gui.ConnectFourMain.getGrid();
	private ImageIcon redIcon = createImageIcon("images/redCircle.png");
	private ImageIcon blueIcon = createImageIcon("images/blueCircle.png");

	C4Board(){

	}

	public int getTurn(){
		return turn;
	}

	public void init(){
		turn = 2;
		board = new char[6][7];
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				board[i][j] = '*';
			}
		}
	}

//	public void display(){
//		System.out.println("1 2 3 4 5 6 7");
//		for(int i = 0; i < board.length; i++){
//			for(int j = 0; j < board[i].length; j++){
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

	public void nextTurn(){
		if(turn == 1){
			turn = 2;
		}
		else{
			turn = 1;
		}
	}

	public int checkCol(int colIndex){
		if(board[5][colIndex] == '*'){
			return 5;
		}
		else if(board[4][colIndex] == '*'){
			return 4;
		}
		else if(board[3][colIndex] == '*'){
			return 3;
		}
		else if(board[2][colIndex] == '*'){
			return 2;
		}
		else if(board[1][colIndex] == '*'){
			return 1;
		}
		else if(board[0][colIndex] == '*'){
			return 0;
		}
		else{
			return -1;
		}
	}

	public void move(int choice){
		char player;
//		boolean stop = false;
		int turn = getTurn();
		
		if(turn == 1){
			player = 'R';
		}
		else{
			player = 'B';
		}

//		while(stop == false){
//		System.out.print("\nPlayer " + turn + "'s Turn: ");
//		choice = input.nextInt();
//		System.out.println();

		switch (choice) {
		case 1:
			colIndex = 0;
			rowIndex = checkCol(colIndex);
			break;
		case 2:
			colIndex = 1;
			rowIndex = checkCol(colIndex);
			break;
		case 3:
			colIndex = 2;
			rowIndex = checkCol(colIndex);
			break;
		case 4:
			colIndex = 3;
			rowIndex = checkCol(colIndex);
			break;
		case 5:
			colIndex = 4;
			rowIndex = checkCol(colIndex);
			break;
		case 6:
			colIndex = 5;
			rowIndex = checkCol(colIndex);
			break;
		case 7:
			colIndex = 6;
			rowIndex = checkCol(colIndex);
			break;
		}

		if(board[rowIndex][colIndex] == '*'){
			board[rowIndex][colIndex] = player;
			if(turn == 1){
				grid[colIndex][rowIndex].setIcon(redIcon);
				gui.ConnectFourMain.setGrid(grid);
			}
			else{
				grid[colIndex][rowIndex].setIcon(blueIcon);
				gui.ConnectFourMain.setGrid(grid);
			}
		}

//		display();
		//}
	}
	public boolean checkHorizontal(int row, char player){
		int count = 0;

		for(int j = 0; j < 7; j++){
			if(board[row][j] == player){
				count++;
			}
			else{
				count = 0;
			}
			if(count == 4){
				break;
			}
		}

		if(count == 4){
//			System.out.println("Horizontal win!");
			return true;
		}
		else{
			return false;
		}
	}

	public boolean checkVertical(int col, char player){
		int cnt = 0;

		for(int i = 0; i < 6; i++){
			if(board[i][col] == player){
				cnt++;
			}
			else{
				cnt = 0;
			}
			if(cnt == 4){
				break;
			}
		}

		if(cnt == 4){
//			System.out.println("Vertical win!");
			return true;
		}

		return false;
	}

	public boolean checkDownLeft(int row, int col, char player)
	{
		int count = 0;
		int i, j;

		for(i = row, j = col; i < 6 && j >= 0; i++, j--){
			if(board[i][j] == player){
				count++;
			}
			else{
				count = 0;
			}
			if(count == 4){
				break;
			}
		}

		if(count == 4){
//			System.out.println("Down Left win!");
			return true;
		}
		else{
			return false;
		}
	}

	public boolean checkDownRight(int row, int col, char player)
	{
		int count = 0;
		int i, j;
		for(i = row, j = col; i < 6 && j < 7; i++, j++){
			if(board[i][j] == player){
				count ++;
			}
			else{
				count = 0;
			}
			if(count == 4){
//				System.out.println("Down Right win!");
				break;
			}
		}
		if(count == 4){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isOver(){
		char player;
		int turn = getTurn();
		if(turn == 1){
			player = 'R';
		}
		else{
			player = 'B';
		}
		
		for (int i = 0; i < 6; i++){
			if(checkHorizontal(i,player)){
				return true;
			}
		}  

		for (int j = 0; j < 7; j++){
			if (checkVertical(j,player)){
				return true; 
			}   
		}

		for(int j = 3; j < 7; j++){
			if(checkDownLeft(0, j, player)){
				return true;
			}
		}
		for (int i = 1; i < 3; i++){
			if (checkDownLeft (i,6,player) == true){
				return true; 
			}
		}

		for (int j = 0; j < 5 ; j++){
			if (checkDownRight (0 , j, player) == true){
				return true; 
			}
		}
		for (int i = 1; i < 3; i++){
			if (checkDownRight(i,0,player)==true){
				return true;
			}
		}

		return false;
	}
	
	public boolean checkTie(){
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if(board[i][j] == '*'){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isTie(){
		if(checkTie()){
			return true;
		}
		return false;
	}
	
	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

}
