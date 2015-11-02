package guiDemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {

	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("HelloWorldSwing");
		
		// Tell the application to close when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the "Hello World" label.
		JLabel label = new JLabel("Hello, World");
		frame.add(label);

		// Tell the window to adjust to the size of its components
		frame.pack();

		// Display the window.
		frame.setVisible(true);
	}

	
	public static void main(String[] args) {
		createAndShowGUI();

	}

}
