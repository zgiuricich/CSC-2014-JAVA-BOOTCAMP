import java.util.Scanner; //Import Scanner from java api

public class Lab2B
{
	public static void main(String[] args)
	{
		String h = " hours, ";
		String m = " minutes, ";
		String se = " seconds, ";
		Scanner s = new Scanner(System.in); //Creates initial Scanner object for user inputs
		System.out.println("How many hours?");
		int hours = s.nextInt();
		System.out.println("How many minutes?");
		int minutes = s.nextInt();
		System.out.println("How many seconds?");
		int seconds = s.nextInt();
		//Checking for pluralities
		if (hours == 1)
		{
			h = " hour, ";
		}
		if (minutes == 1)
		{
			m = " minute, ";
		}
		if (seconds == 1);
		{
			se = " second, ";
		}
		long total = hours * 60 * 60 + minutes * 60 + seconds;
		System.out.println(hours + h + minutes + m + seconds + se + "is equivalent to " + total + " seconds");
	}
}