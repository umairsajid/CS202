package guiDemo;

//DIFFERENT WAYS OF USING THE ACTION LISTENER

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventInfoGUI {
	JFrame frame;
	JButton button;
	
	private void createAndShowGUI() {
		frame = new JFrame("Event Info Demo");		
		button = new JButton("Click Me");
		frame.add(button, BorderLayout.CENTER);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("Command: " + event.getActionCommand());
				System.out.println("ID: " + event.getID());
				System.out.println("Modifiers: " + event.getModifiers());
				System.out.println("Source: " + event.getSource());
				System.out.println("Date and Time: " + new Date(event.getWhen()));
				System.out.println("Parameter String: " + event.paramString());
				System.out.println("Class: " + event.getClass());
			}});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		EventInfoGUI gui = new EventInfoGUI();
		gui.createAndShowGUI();
	};
}

