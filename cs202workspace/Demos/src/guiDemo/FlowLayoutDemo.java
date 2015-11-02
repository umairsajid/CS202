package guiDemo;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FlowLayoutDemo extends JFrame {
	JRadioButton RtoLbutton;
	JRadioButton LtoRbutton;
	FlowLayout experimentLayout = new FlowLayout();
	final String RtoL = "Right to left";
	final String LtoR = "Left to right";
	JButton applyButton = new JButton("Apply component orientation");

	public FlowLayoutDemo(String string) {
		// TODO Auto-generated constructor stub
	}


	public void addComponentsToPane(final Container pane) {
		final JPanel compsToExperiment = new JPanel();
		compsToExperiment.setLayout(experimentLayout);
		experimentLayout.setAlignment(FlowLayout.TRAILING);
		JPanel controls = new JPanel();
		controls.setLayout(new FlowLayout());

		LtoRbutton = new JRadioButton(LtoR);
		LtoRbutton.setActionCommand(LtoR);
		LtoRbutton.setSelected(true);
		RtoLbutton = new JRadioButton(RtoL);
		RtoLbutton.setActionCommand(RtoL);

		// Add buttons to the experiment layout
		compsToExperiment.add(new JButton("Button 1"));
		compsToExperiment.add(new JButton("Button 2"));
		compsToExperiment.add(new JButton("Button 3"));
		compsToExperiment.add(new JButton("Long-Named Button 4"));
		compsToExperiment.add(new JButton("5"));
		/*compsToExperiment.add(new JButton("lotsa text here"));
		compsToExperiment.add(new JButton("'nothing to see here, move along, said the policeman' last "
		+" Monday night as we were strolling along the Boulevard"));
		compsToExperiment.add(new JButton("abcdefghijklmnopqrstuvwxyz"));
		compsToExperiment.add(new JButton("'1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30"));	*/

		// Left to right component orientation is selected by default
		compsToExperiment
		.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		// Add controls to set up the component orientation in the experiment layout
		final ButtonGroup group = new ButtonGroup();
		group.add(LtoRbutton);
		group.add(RtoLbutton);
		controls.add(LtoRbutton);
		controls.add(RtoLbutton);
		controls.add(applyButton);

		// Process the Apply component orientation button press
		applyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = group.getSelection().getActionCommand();
				// Check the selection
				if (command.equals("Left to right")) {
					compsToExperiment
					.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				} else {
					compsToExperiment
					.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
				}
				// update the experiment layout
				compsToExperiment.validate();
				compsToExperiment.repaint();
			}
		});
		pane.add(compsToExperiment, BorderLayout.CENTER);
		pane.add(controls, BorderLayout.SOUTH);

	}


	private static void createAndShowGUI() {
		// Create and set up the window.
		FlowLayoutDemo frame = new FlowLayoutDemo("FlowLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set up the content pane.
		frame.addComponentsToPane(frame.getContentPane());
		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}


	public static void main(String[] args) {
		createAndShowGUI();

	}

}
