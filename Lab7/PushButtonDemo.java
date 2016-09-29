import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

// PushButtonDemo shows how to respond to button press actions by
// making "this" class an ActionListener.
public class PushButtonDemo implements ActionListener
{
	// Declare some class variables (or attributes)
	// that are accessible in any of the methods below
	JFrame frame;
	JTextField textField;
	JButton button;
	JFileChooser fc = new JFileChooser();
	
	public PushButtonDemo()
	{
		// Declare a push button
		button = new JButton("DO NOT PUSH THIS BUTTON");
		
		// Add this class to the button as a listener
		button.addActionListener(this);
		
		// Create another button and add the listener
		JButton newButton = new JButton("Pick a file");
		newButton.addActionListener(this);
		
		// Create a text field, and set it's width
		textField = new JTextField("This is some text", 50);

		// Create a panel (container) and add stuff to it
		JPanel panel = new JPanel();
		panel.add(textField);
		panel.add(button);
		panel.add(newButton);
	
		// Create the application frame
		frame = new JFrame("Push Button Demo");
		
		// Set what you want to happen with the X button is clicked
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add the panel to the "content pane" of the frame
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		// Pack the stuff on the frame together
		frame.pack();
		
		// Set the original size of the frame when it displays
		frame.setSize(300,  200);
		
		// Show the frame on the screen
		frame.setVisible(true);
	}

	// Main method
	public static void main(String[] args)
	{
		// Instantiate the PushButtonDemo class
		PushButtonDemo demo = new PushButtonDemo();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// Print out something about the event that happened
		// so we can see the "source" of the action
		System.out.println(arg0.getSource());
		
		// Get the text from the text field and first button
		String message = textField.getText();
		String buttonText = button.getText();
		
		// Compare the text of the first button with the
		// "action command" which is the text of whatever
		// caused the action
		if (arg0.getActionCommand() == button.getText())
		{
			// Show a message
			JOptionPane.showMessageDialog(frame, message);
		}
		else
		{
			// Pop open a file chooser
			int returnVal = fc.showOpenDialog(frame);
			
			// See if the user clicked the "open" button
			if (returnVal == JFileChooser.APPROVE_OPTION) 
			{
				// Which file did they pick?
	            File file = fc.getSelectedFile();
	            
	            // Do something with that file
	            System.out.println(file.getPath());
	        }
			else
			{
				// They didn't press the "Open" button
	            System.out.println("you didn't pick a file");
	        }
		}		
		button.setText(message);
		textField.setText(buttonText);
	}

}