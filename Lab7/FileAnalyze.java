import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class FileAnalyze implements ActionListener
{
	JFileChooser fc = new JFileChooser();
	File file;
	JButton getFileButton;
	JButton saveStatsButton;
	JTextPane textPane;
	Scanner sc;
	JFrame frame;
	String str = "";

	public FileAnalyze()
	{
		getFileButton = new JButton("Choose A File");
		getFileButton.addActionListener(this);
		saveStatsButton = new JButton("Save Statistics");
		saveStatsButton.addActionListener(this);

		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setSize(50, 50);

		//JSplitPane splitter = new JSplitPane();

		JPanel panel = new JPanel();
		panel.add(textPane);
		panel.add(getFileButton);
		//panel.add(splitter);

		frame = new JFrame("File Analyzer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setSize(1000, 800);
		frame.setVisible(true);
	}

	public static void main(String[] argv)
	{
		FileAnalyze start = new FileAnalyze();
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		System.out.println(arg0.getSource());

		if(arg0.getActionCommand() == getFileButton.getText())
		{
			int returnVal = fc.showOpenDialog(frame);
			
			// See if the user clicked the "open" button
			try
			{
				if (returnVal == JFileChooser.APPROVE_OPTION) 
				{
					// Which file did they pick?
		            file = fc.getSelectedFile();
		            
		            sc = new Scanner(file);
		            // Do something with that file
		            System.out.println(file.getPath());

		            str = "";

		            try
				    {
				        while(sc.ioException() == null) // allows y or Y
				        {
				    	    str += sc.nextLine();
				        }
				    }
				    catch(NoSuchElementException e)
				    {
				       System.out.println("done");
				    }

		            textPane.setText(str);
		        }
				else
				{
					// They didn't press the "Open" button
		            System.out.println("you didn't pick a file");
		        }
	    	}
	    	catch(FileNotFoundException e)
	    	{
	    		System.out.println("No file chosen");
	    	}
		}
	}
}