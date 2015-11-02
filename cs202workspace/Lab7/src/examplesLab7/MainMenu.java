package examplesLab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu {

	JFrame mainMenu;
	JButton oneVC;
	JButton onev2;
	JLabel statementLayer;
	boolean mode1vC = false;
	boolean mode1v2 = false;
	
	public MainMenu(){}
	
	private void createMainMenu(){
		mainMenu = new JFrame("Connect Four");
		statementLayer = new JLabel("Choose a game mode!");
		statementLayer.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 11));
		statementLayer.setBorder(BorderFactory.createEmptyBorder(2, 5, 4, 5));
		
		oneVC = new JButton("1 Player vs. Computer");
		onev2 = new JButton("1 Player vs. 2 Player");
		
		
		mainMenu.add(oneVC);
		mainMenu.add(onev2);
		
		mainMenu.setLayout(new GridLayout(3, 1));
	    //mainMenu.pack();
	    mainMenu.setSize(320, 140);
	    mainMenu.setBackground(Color.black);
		mainMenu.setVisible(true);
		mainMenu.setLocationRelativeTo(null);
		mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainMenu.add(statementLayer, BorderLayout.PAGE_END);
		statementLayer.setForeground(Color.black);
	}
	
	private void chooseGameMode(){
		oneVC.addActionListener(new vsComputer());
		onev2.addActionListener(new vsOther());
	}
	
	private class vsComputer implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			mode1vC = true;
			ColorChoice cMenu = new ColorChoice();
			cMenu.createColorMenu();
			if(mode1v2 == false && mode1vC == true){
				System.out.println("You chose the one player versus computer mode option");
			}
		}
	}
	private class vsOther implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			mode1v2 = true;
			ColorChoice cMenu = new ColorChoice();
			cMenu.createColorMenu();
			if(mode1v2 == true && mode1vC == false){
				System.out.println("You chose the one player versus two player mode option");
				cMenu.p1p2ChooseColor();
				//cMenu.p2ChooseColor();
			}
		}
	}
	
	public boolean get1vC(){
		return mode1vC;
	}
	public void set1vC(boolean statement){
		mode1vC = statement;
	}
	public boolean get1v2(){
		return mode1v2;
	}
	public void set1v2(boolean statement){
		mode1v2 = statement;
	}
	
	
	
	public static void main(String[] args) {
		MainMenu mMenu = new MainMenu();
		
		mMenu.createMainMenu();
		mMenu.chooseGameMode();
		
		
		
	}
}
