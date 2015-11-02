package gui;

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

public class ConnectFourMain {

	private Color bg = new Color(192, 192, 192);
	private Color r = new Color(255, 0, 0);
	private Color b = new Color(0, 0, 255);
	private JFrame frame;
	private JButton button1, button2, button3, button4, button5, button6, button7;
	private static JLabel[][] grid = new JLabel[7][6];
	private ImageIcon emptyIcon = createImageIcon("images/whiteCircle.png");
	private C4Board game = new C4Board();
	private int turn = game.getTurn();
	private JLabel display;
	private JPanel displayPanel;
	private int[] bCounts = new int[7];	
	private boolean tie;
	private boolean gameOver = false;
	
	private void createAndShowBoard(){
		frame = new JFrame("Connect Four!");
		game.init();
		for(int i = 0; i < 7; i++){
			bCounts[i] = 0;
		}
		
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

		frame.add(buttonPanel, BorderLayout.NORTH);
	}

	private void b1(){
		bCounts[0]++;
		
		if(bCounts[0] < 7){
			game.nextTurn();
			game.move(1);
			turn = game.getTurn();
			gameOver = game.isOver();
			tie = game.isTie();
			if(turn == 2 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Red's turn!");
					displayPanel.setBackground(r);
				}
			}
			else if(turn == 1 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Blue's turn!");
					displayPanel.setBackground(b);
				}
			}
			else if(turn == 2 && gameOver){
				display.setText("Blue Wins!");
				displayPanel.setBackground(b);
				end("Blue");
			}
			else if(turn == 1 && gameOver){
				display.setText("Red Wins!");
				displayPanel.setBackground(r);
				end("Red");
			}
		}
	}
	private void b2(){
		bCounts[1]++;
		
		if(bCounts[1] < 7){
			game.nextTurn();
			game.move(2);
			turn = game.getTurn();
			gameOver = game.isOver();
			tie = game.isTie();
			if(turn == 2 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Red's turn!");
					displayPanel.setBackground(r);
				}
			}
			else if(turn == 1 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Blue's turn!");
					displayPanel.setBackground(b);
				}
			}
			else if(turn == 2 && gameOver){
				display.setText("Blue Wins!");
				displayPanel.setBackground(b);
				end("Blue");
			}
			else if(turn == 1 && gameOver){
				display.setText("Red Wins!");
				displayPanel.setBackground(r);
				end("Red");
			}
		}
	}
	private void b3(){
		bCounts[2]++;
		
		if(bCounts[2] < 7){
			game.nextTurn();
			game.move(3);
			turn = game.getTurn();
			gameOver = game.isOver();
			tie = game.isTie();
			if(turn == 2 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Red's turn!");
					displayPanel.setBackground(r);
				}
			}
			else if(turn == 1 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Blue's turn!");
					displayPanel.setBackground(b);
				}
			}
			else if(turn == 2 && gameOver){
				display.setText("Blue Wins!");
				displayPanel.setBackground(b);
				end("Blue");
			}
			else if(turn == 1 && gameOver){
				display.setText("Red Wins!");
				displayPanel.setBackground(r);
				end("Red");
			}
		}
	}
	private void b4(){
		bCounts[3]++;
		
		if(bCounts[3] < 7){
			game.nextTurn();
			game.move(4);
			turn = game.getTurn();
			gameOver = game.isOver();
			tie = game.isTie();
			if(turn == 2 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Red's turn!");
					displayPanel.setBackground(r);
				}
			}
			else if(turn == 1 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Blue's turn!");
					displayPanel.setBackground(b);
				}
			}
			else if(turn == 2 && gameOver){
				display.setText("Blue Wins!");
				displayPanel.setBackground(b);
				end("Blue");
			}
			else if(turn == 1 && gameOver){
				display.setText("Red Wins!");
				displayPanel.setBackground(r);
				end("Red");
			}
		}
	}
	private void b5(){
		bCounts[4]++;
		
		if(bCounts[4] < 7){
			game.nextTurn();
			game.move(5);
			turn = game.getTurn();
			gameOver = game.isOver();
			tie = game.isTie();
			if(turn == 2 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Red's turn!");
					displayPanel.setBackground(r);
				}
			}
			else if(turn == 1 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Blue's turn!");
					displayPanel.setBackground(b);
				}
			}
			else if(turn == 2 && gameOver){
				display.setText("Blue Wins!");
				displayPanel.setBackground(b);
				end("Blue");
			}
			else if(turn == 1 && gameOver){
				display.setText("Red Wins!");
				displayPanel.setBackground(r);
				end("Red");
			}
		}
	}
	private void b6(){
		bCounts[5]++;
		
		if(bCounts[5] < 7){
			game.nextTurn();
			game.move(6);
			turn = game.getTurn();
			gameOver = game.isOver();
			tie = game.isTie();
			if(turn == 2 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Red's turn!");
					displayPanel.setBackground(r);
				}
			}
			else if(turn == 1 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Blue's turn!");
					displayPanel.setBackground(b);
				}
			}
			else if(turn == 2 && gameOver){
				display.setText("Blue Wins!");
				displayPanel.setBackground(b);
				end("Blue");
			}
			else if(turn == 1 && gameOver){
				display.setText("Red Wins!");
				displayPanel.setBackground(r);
				end("Red");
			}
		}
	}
	private void b7(){
		bCounts[6]++;
		
		if(bCounts[6] < 7){
			game.nextTurn();
			game.move(7);
			turn = game.getTurn();
			gameOver = game.isOver();
			tie = game.isTie();
			if(turn == 2 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Red's turn!");
					displayPanel.setBackground(r);
				}
			}
			else if(turn == 1 && gameOver == false){
				if(tie){
					display.setText("It's a tie!");
					displayPanel.setBackground(Color.black);
					end2();
				}
				else{
					display.setText("Blue's turn!");
					displayPanel.setBackground(b);
				}
			}
			else if(turn == 2 && gameOver){
				display.setText("Blue Wins!");
				displayPanel.setBackground(b);
				end("Blue");
			}
			else if(turn == 1 && gameOver){
				display.setText("Red Wins!");
				displayPanel.setBackground(r);
				end("Red");
			}
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
		
		displayPanel = new JPanel();
		display = new JLabel("Welcome to Connect Four! Red goes first.");
		display.setForeground(Color.white);
		
		displayPanel.setBackground(r);
		
		displayPanel.add(display);
		
		frame.add(displayPanel, BorderLayout.SOUTH);
	}
	
	private void end(String player){
		final JFrame ending = new JFrame("Congratulations " + player + "!");
		JPanel statement = new JPanel();
		
		JLabel congrats = new JLabel("Congratulations " + player + "!" + " Thanks for Playing!");
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
	
	private void end2(){
		final JFrame ending = new JFrame("It's a tie!");
		JPanel statement = new JPanel();
		
		JLabel congrats = new JLabel("The game ends as a tie! What a long and intense game!");
		JButton button = new JButton("Exit");
		
		statement.add(congrats);
		
		ending.add(statement, BorderLayout.NORTH);
		ending.add(button, BorderLayout.SOUTH);
		ending.setSize(450, 100);
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
		ConnectFourMain connectFour = new ConnectFourMain();

		connectFour.createAndShowBoard();

	}

	static JLabel[][] getGrid() {
		return grid;
	}

	static void setGrid(JLabel[][] grid) {
		grid = grid;
	}

}
