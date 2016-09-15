import java.util.*;
import java.io.*;

public class Lab4D
{
	public static void main(String[] argv) throws IOException
	{
		final int NUMCHARS = 26;
		int[] upper = new int[NUMCHARS];
		int[] lower = new int[NUMCHARS];
		char current;
		int other = 0;
		File input = new File("old-man.txt");
		String content = new Scanner(input).useDelimiter("\\Z").next();
		

		for (int ch = 0; ch < content.length(); ch++)
      	{
	        current = content.charAt(ch);
	        if (current >= 'A' && current <= 'Z')
	        	upper[current-'A']++;
	        else if (current >= 'a' && current <= 'z')
	        	lower[current-'a']++;
	        else
	        other++;
      	}

      System.out.println("Number of characters: " + content.length());
      System.out.println ("Non-alphabetic characters: " + other);
      for (int letter=0; letter < upper.length; letter++)
      {
      	 String hist = new String(new char[upper[letter]/100+1]).replace("\0", "#");
      	 if(upper[letter]==0)
      	 {
      	 	hist = "";
      	 }
         System.out.println ((char) (letter + 'A') + ": " + upper[letter] + "\n" + hist);
      }
      for (int letter=0; letter < lower.length; ++letter)
      {
      	 String hist = new String(new char[lower[letter]/100+1]).replace("\0", "#");
      	 if(lower[letter]==0)
      	 {
      	 	hist = "";
      	 }
      	 System.out.println ((char) (letter + 'a') + ": " + lower[letter] + "\n" + hist);
      }

      
	}
}