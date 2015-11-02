package aaVersion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConnectFourMainAA {

	private Color bg = new Color(192, 192, 192);
	private JFrame frame;
	private JButton button1, button2, button3, button4, button5, button6, button7;
	private static JLabel[][] grid = new JLabel[7][6];
	private ImageIcon emptyIcon = createImageIcon("images/whiteCircle.png");
//	private ImageIcon arrowIcon = createImageIcon("images/arrow.png");
	private C4BoardAA game = new C4BoardAA();
	private int turn = game.getTurn();
	private JLabel display;
	private boolean gameOver = false;
	
	private void createAndShowBoard(){
		frame = new JFrame("Connect Four!");
		game.init();
		
		createButtonPanel();
		createBoardPanel();
		createDisplayPanel();
		
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void createButtonPanel(){
		JPanel buttonPanel = new JPanel();
		GridLayout buttonLayout = new GridLayout(1, 7);
		
		buttonPanel.setLayout(buttonLayout);
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		
//		button1 = new JButton(arrowIcon);
//		button2 = new JButton(arrowIcon);
//		button3 = new JButton(arrowIcon);
//		button4 = new JButton(arrowIcon);
//		button5 = new JButton(arrowIcon);
//		button6 = new JButton(arrowIcon);
//		button7 = new JButton(arrowIcon);
//		
//		button1.setBackground(bg);
//		button2.setBackground(bg);
//		button3.setBackground(bg);
//		button4.setBackground(bg);
//		button5.setBackground(bg);
//		button6.setBackground(bg);
//		button7.setBackground(bg);
		
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		
		if(game.isOver()){
			System.out.println("Game over!");
			gameOver = true;
		}
		if(gameOver == false){
			button1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					b1();
				}
			});
			button2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					b2();
				}
			});
			button3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					b3();
				}
			});
			button4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					b4();
				}
			});
			button5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					b5();
				}
			});
			button6.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					b6();
				}
			});
			button7.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					b7();
				}
			});
		}
		
		frame.add(buttonPanel, BorderLayout.NORTH);
	}
	
	private void b1(){
		game.nextTurn();
		game.move(1);
		turn = game.getTurn();
		gameOver = game.isOver();
		if(turn == 2 && gameOver == false){
			display.setText("Alonso's turn!");
		}
		else if(turn == 1 && gameOver == false){
			display.setText("Adrian's turn!");
		}
		else if(turn == 2 && gameOver){
				display.setText("Adrian Wins! Better Luck next time Alonso!");
				end();
		}
		else if(turn == 1 && gameOver){
				display.setText("Alonso Wins! Better Luck next time Adrian!");
				end();
		}
	}
	private void b2(){
		game.nextTurn();
		game.move(2);
		turn = game.getTurn();
		gameOver = game.isOver();
		if(turn == 2 && gameOver == false){
			display.setText("Alonso's turn!");
		}
		else if(turn == 1 && gameOver == false){
			display.setText("Adrian's turn!");
		}
		else if(turn == 2 && gameOver){
				display.setText("Adrian Wins! Better Luck next time Alonso!");
				end();
		}
		else if(turn == 1 && gameOver){
				display.setText("Alonso Wins! Better Luck next time Adrian!");
				end();
		}
	}
	private void b3(){
		game.nextTurn();
		game.move(3);
		turn = game.getTurn();
		gameOver = game.isOver();
		if(turn == 2 && gameOver == false){
			display.setText("Alonso's turn!");
		}
		else if(turn == 1 && gameOver == false){
			display.setText("Adrian's turn!");
		}
		else if(turn == 2 && gameOver){
				display.setText("Adrian Wins! Better Luck next time Alonso!");
				end();
		}
		else if(turn == 1 && gameOver){
				display.setText("Alonso Wins! Better Luck next time Adrian!");
				end();
		}
	}
	private void b4(){
		game.nextTurn();
		game.move(4);
		turn = game.getTurn();
		gameOver = game.isOver();
		if(turn == 2 && gameOver == false){
			display.setText("Alonso's turn!");
		}
		else if(turn == 1 && gameOver == false){
			display.setText("Adrian's turn!");
		}
		else if(turn == 2 && gameOver){
				display.setText("Adrian Wins! Better Luck next time Alonso!");
				end();
		}
		else if(turn == 1 && gameOver){
				display.setText("Alonso Wins! Better Luck next time Adrian!");
				end();
		}
	}
	private void b5(){
		game.nextTurn();
		game.move(5);
		turn = game.getTurn();
		gameOver = game.isOver();
		if(turn == 2 && gameOver == false){
			display.setText("Alonso's turn!");
		}
		else if(turn == 1 && gameOver == false){
			display.setText("Adrian's turn!");
		}
		else if(turn == 2 && gameOver){
				display.setText("Adrian Wins! Better Luck next time Alonso!");
				end();
		}
		else if(turn == 1 && gameOver){
				display.setText("Alonso Wins! Better Luck next time Adrian!");
				end();
		}
	}
	private void b6(){
		game.nextTurn();
		game.move(6);
		turn = game.getTurn();
		gameOver = game.isOver();
		if(turn == 2 && gameOver == false){
			display.setText("Alonso's turn!");
		}
		else if(turn == 1 && gameOver == false){
			display.setText("Adrian's turn!");
		}
		else if(turn == 2 && gameOver){
				display.setText("Adrian Wins! Better Luck next time Alonso!");
				end();
		}
		else if(turn == 1 && gameOver){
				display.setText("Alonso Wins! Better Luck next time Adrian!");
				end();
		}
	}
	private void b7(){
		game.nextTurn();
		game.move(7);
		turn = game.getTurn();
		gameOver = game.isOver();
		if(turn == 2 && gameOver == false){
			display.setText("Alonso's turn!");
		}
		else if(turn == 1 && gameOver == false){
			display.setText("Adrian's turn!");
		}
		else if(turn == 2 && gameOver){
				display.setText("Adrian Wins! Better Luck next time Alonso!");
				end();
		}
		else if(turn == 1 && gameOver){
				display.setText("Alonso Wins! Better Luck next time Adrian!");
				end();
		}
	}

	private void createBoardPanel(){
		JPanel boardPanel = new JPanel();
		GridLayout boardLayout = new GridLayout(6, 7);

		boardPanel.setLayout(boardLayout);

		//create the individual Jlabels
		for (int y = 0 ; y < 6 ; y++){
			for ( int x = 0 ; x < 7 ; x++){
				getGrid()[x][y] = new JLabel(emptyIcon);
				boardPanel.add(getGrid()[x][y]);
			}
		}
		
		boardPanel.setBackground(bg);
		
		frame.add(boardPanel, BorderLayout.CENTER);
	}
	
	private void createDisplayPanel(){
		
		JPanel displayPanel = new JPanel();
		display = new JLabel("Welcome to Connect Four! Alonso goes first.");
		
		displayPanel.add(display);
		
		frame.add(displayPanel, BorderLayout.SOUTH);
	}
	
	private void end(){
		final JFrame ending = new JFrame("Congratulations!");
		JPanel statement = new JPanel();
		
		JLabel congrats = new JLabel("Congratulations! Thanks for Playing!");
		JButton button = new JButton("Exit");
		
		statement.add(congrats);
		
		ending.add(statement, BorderLayout.NORTH);
		ending.add(button, BorderLayout.SOUTH);
		ending.setSize(250, 100);
		ending.setLocationRelativeTo(null);
		ending.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
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
	
	public static void main(String[] args) {
		ConnectFourMainAA connectFour = new ConnectFourMainAA();

		connectFour.createAndShowBoard();

	}

	static JLabel[][] getGrid() {
		return grid;
	}

	static void setGrid(JLabel[][] grid) {
		grid = grid;
	}

}
