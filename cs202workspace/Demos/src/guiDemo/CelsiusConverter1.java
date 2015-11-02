package guiDemo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CelsiusConverter1 implements ActionListener  {

	JFrame converterFrame;
	JPanel converterPanel;
	JTextField tempCelsius;
	JLabel celsiusLabel, fahrenheitLabel;
	JButton convertTemp;

	public CelsiusConverter1() {
		converterFrame = new JFrame("Convert Celsius to Fahrenheit");
		converterPanel = new JPanel();
		converterPanel.setLayout(new GridLayout(2, 2));

		addComponents();
		converterFrame.getContentPane()
		.add(converterPanel, BorderLayout.CENTER);
		converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		converterFrame.pack();
		converterFrame.setVisible(true);
	}

	private void addComponents() {
		tempCelsius = new JTextField(2);
		celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
		convertTemp = new JButton("Convert...");
		fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);
		convertTemp.addActionListener(this);
		converterPanel.add(tempCelsius);
		converterPanel.add(celsiusLabel);
		converterPanel.add(convertTemp);
		converterPanel.add(fahrenheitLabel);
		celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		fahrenheitLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	}

	// Implementation of ActionListener interface.
	public void actionPerformed(ActionEvent event) {
		int tempFahr = (int) ((Double.parseDouble(tempCelsius.getText())) * 1.8 + 32);
		fahrenheitLabel.setText(tempFahr + " Fahrenheit");
	}



	public static void main(String[] args) {
		CelsiusConverter1 converter = new CelsiusConverter1();
	}


}
