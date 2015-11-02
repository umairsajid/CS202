package guiDemo;

//DIFFERENT WAYS OF USING THE ACTION LISTENER
//USES THE "EventInfoClickListener" CLASS

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventInfoGUI2 {
	JFrame frame;
	JButton button;
	
	private void createAndShowGUI() {
		frame = new JFrame("Event Info Demo");		
		button = new JButton("Click Me");
		frame.add(button, BorderLayout.CENTER);
		button.addActionListener(new EventInfoClickListener());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		EventInfoGUI2 gui = new EventInfoGUI2();
		gui.createAndShowGUI();
	};
}
