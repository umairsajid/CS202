package guiDemo;

//DIFFERENT WAYS OF USING THE ACTION LISTENER


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class EventInfoClickListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("Command: " + event.getActionCommand());
		System.out.println("ID: " + event.getID());
		System.out.println("Modifiers: " + event.getModifiers());
		System.out.println("Source: " + event.getSource());
		System.out.println("Date and Time: " + new 						Date(event.getWhen()));
		System.out.println("Parameter String: " + event.paramString());
		System.out.println("Class: " + event.getClass());
	}
}

