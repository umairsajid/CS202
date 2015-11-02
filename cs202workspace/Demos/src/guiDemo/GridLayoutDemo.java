package guiDemo;
//FROM LECTURE 7

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutDemo {

	private JComponent createComponent(String s) {
		JLabel l = new JLabel(s);
		l.setBorder(BorderFactory
				.createMatteBorder(5, 5, 5, 5, Color.DARK_GRAY));
		l.setHorizontalAlignment(JLabel.CENTER);
		return l;
	}

	public static void main(String[] args){
		GridLayoutDemo g = new GridLayoutDemo();
		g.createGUI();	  
	}

	public void createGUI() {
	    JFrame frame = new JFrame("Testing for Lab 7");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    

	    // Constructor takes two arguments: rows, columns.  Try setting one to zero.
	    JPanel p = new JPanel(new GridLayout(6, 7));
	    p.add(createComponent("Component 1"));
	    p.add(createComponent("Component 2"));
	    p.add(createComponent("Component 3"));
	    p.add(createComponent("Component 4"));
	    p.add(createComponent("Component 5"));
	    p.add(createComponent("Component 6"));
	    p.add(createComponent("Component 7"));
	    p.add(createComponent("Component 8"));
	    p.add(createComponent("Component 9"));
	    p.add(createComponent("Component 10"));
	    p.add(createComponent("Component 11"));
	    p.add(createComponent("Component 12"));
	    p.add(createComponent("Component 13"));
	    p.add(createComponent("Component 14"));
	    p.add(createComponent("Component 15"));
	    p.add(createComponent("Component 16"));
	    p.add(createComponent("Component 17"));
	    p.add(createComponent("Component 18"));
	    p.add(createComponent("Component 19"));
	    p.add(createComponent("Component 20"));
	    p.add(createComponent("Component 21"));
	    p.add(createComponent("Component 22"));
	    p.add(createComponent("Component 23"));
	    p.add(createComponent("Component 24"));
	    p.add(createComponent("Component 25"));
	    p.add(createComponent("Component 26"));
	    p.add(createComponent("Component 27"));
	    p.add(createComponent("Component 28"));
	    p.add(createComponent("Component 29"));
	    p.add(createComponent("Component 30"));
	    p.add(createComponent("Component 31"));
	    p.add(createComponent("Component 32"));
	    p.add(createComponent("Component 33"));
	    p.add(createComponent("Component 34"));
	    p.add(createComponent("Component 35"));
	    p.add(createComponent("Component 36"));
	    p.add(createComponent("Component 37"));
	    p.add(createComponent("Component 38"));
	    p.add(createComponent("Component 39"));
	    p.add(createComponent("Component 40"));
	    p.add(createComponent("Component 41"));
	    p.add(createComponent("Component 42"));
	    frame.setContentPane(p);
	    
	    JPanel p2 = new JPanel();
	    p2.setBorder(BorderFactory.createLineBorder(Color.CYAN, 15));
	    JButton b = new JButton("Click Here");
	    b.setSize(100, 100);
	    p2.add(b);

	    //Display the window.
	    frame.pack();
	    frame.setVisible(true);
	  }
}
