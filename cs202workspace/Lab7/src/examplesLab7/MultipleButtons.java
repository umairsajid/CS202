package examplesLab7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultipleButtons {

	JFrame frame;
	JButton button1;
	JButton button2;
	JPanel layer;
	
	private void createAndShowGUI() {
		frame = new JFrame("Event Info Demo");	
		layer = new JPanel();
		button1 = new JButton("Click Me");
		layer.add(button1);
//		button1.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent event) {
//				System.out.println("Command: " + event.getActionCommand());
//				System.out.println("ID: " + event.getID());
//				System.out.println("Modifiers: " + event.getModifiers());
//				System.out.println("Source: " + event.getSource());
//				System.out.println("Date and Time: " + new Date(event.getWhen()));
//				System.out.println("Parameter String: " + event.paramString());
//				System.out.println("Class: " + event.getClass());
//			}
//			});
		
		button2 = new JButton("Click Me Too");
		layer.add(button2);
//		button2.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent event) {
//				System.out.println("Command: " + event.getActionCommand());
//				System.out.println("ID: " + event.getID());
//				System.out.println("Modifiers: " + event.getModifiers());
//				System.out.println("Source: " + event.getSource());
//				System.out.println("Date and Time: " + new Date(event.getWhen()));
//				System.out.println("Parameter String: " + event.paramString());
//				System.out.println("Class: " + event.getClass());
//			}
//			});

		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		MultipleButtons gui1 = new MultipleButtons();
		MultipleButtons gui2 = new MultipleButtons();
		gui1.createAndShowGUI();
		gui2.createAndShowGUI();
}


}
