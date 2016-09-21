import java.util.*;
import java.io.*;

public class Titanic
{
	public static void main(String[] argv) throws IOException
	{
		File input = new File("titanic.txt");
		Scanner scan = new Scanner(input);

		PassengerData titanic = new PassengerData();

		try
      	{
	        while(scan.ioException() == null) // allows y or Y
	        {
	        	titanic.addPassenger(scan.nextInt(), scan.nextBoolean(), scan.next(), scan.nextBoolean());
	       	}
      	}
		catch(NoSuchElementException e)
		{
			System.out.println("done");
		}

		System.out.println(titanic);
	}
}