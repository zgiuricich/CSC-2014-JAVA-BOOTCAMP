import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PushButton implements ActionListener
{
	JTextField textField;
	JButton button;
	
	public PushButton()
	{
		textField = new JTextField("hello world", 25);
		
		button = new JButton("one");
		button.setPreferredSize(new Dimension(100, 30));
		button.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(textField);
		
		JFrame frame = new JFrame("Our Simple Push Button Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setMinimumSize(new Dimension(300, 100));
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new PushButton();
	}

	public void actionPerformed(ActionEvent e)
	{
		//JOptionPane.showMessageDialog(null,  "I asked you not to push me!");
		//JOptionPane.showMessageDialog(null, (JButton)(e.getSource()));
		String text = button.getText();
		if (text == "one")
			text = "two";
		else if (text == "two")
			text = "three";
		else
			text = "one";
		textField.setText(text);
		button.setText(text);
	}
}