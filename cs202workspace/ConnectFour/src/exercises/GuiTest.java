package exercises;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiTest {
	
	private static JLabel[][] grid = new JLabel[7][6];
	private ImageIcon redIcon = createImageIcon("images/blueCircle.png");
	private ImageIcon blueIcon = createImageIcon("images/redCircle.png");
	
	private void createBoardPanel(){
		JPanel boardPanel = new JPanel();
		GridLayout boardLayout = new GridLayout(6, 7);

		boardPanel.setLayout(boardLayout);

		//create the individual Jlabels
		for (int y = 0 ; y < 6 ; y++){
			for ( int x = 0 ; x < 7 ; x++){
				grid[x][y] = new JLabel(blueIcon);
			}
		}
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
	
	private void check(){
		if(grid[5][5] == grid[5][5]){
			System.out.println("They are the same");
		}
		else{
			System.out.println("They are not the same");
		}
	}
	
	public static void main(String[] args) {
		GuiTest test = new GuiTest();
		test.createBoardPanel();
		
		test.check();
		
		System.out.println("hi");
		
		

	}

}
