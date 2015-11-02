import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class CircleGUI {

	private JFrame frame;
	private JButton button;
	private JTextField input;
	private JTextField output;
	
	private void createAndShowGUI(){
		frame = new JFrame("Area of a Circle");
		
		input = new JTextField("Erase and Enter Radius of Circle Here");
		button = new JButton("Find Area");
		output = new JTextField("Area Will Show Here");
		
		frame.getContentPane().add(input);
		frame.getContentPane().add(button);
		frame.getContentPane().add(output);
		
		button.addActionListener(new calculate());
		
		frame.getContentPane().setLayout(new GridLayout(3, 1));
		frame.setSize(270, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private class calculate implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			String text = input.getText();
			
			double radius = Double.parseDouble(text);
			Circle circle = new Circle(radius);
			
			String area = Double.toString(circle.getArea());
			
			output.setText(area);
			
		}
	}

	public static void main(String[] args) {
		CircleGUI converter = new CircleGUI();
		
		converter.createAndShowGUI();

	}

}
