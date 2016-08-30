import java.util.Scanner; //Import Scanner from java api

public class Lab2C
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Create initial Scanner object for user inputs
		System.out.println("How many seconds?");
		int inSec = sc.nextInt();
		if ((inSec/60)/60 >= 1) //Checks if there are enough seconds to fill an hour
		{
			int hours = (inSec/60)/60;
			int hoursToSecs = hours*60*60;
			int minutes = (inSec-(hoursToSecs))/60;
			int minsHoursToSecs = (hours*60*60)+(minutes*60);
			int seconds = (inSec-minsHoursToSecs);
			System.out.println(inSec + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
		}
		else if (inSec/60 >= 1) //Checks if there are enough seconds to fill a minute
		{
			int minutes = inSec/60;
			int seconds = inSec-(minutes*60);
			System.out.println(inSec + " seconds is equivalent to " + minutes + " minutes and " + seconds + " seconds.");
		}
		else if (inSec < 60)
		{
			System.out.println(inSec + " seconds is simply " + inSec + " seconds.");
		}
	}
}