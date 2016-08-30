import java.util.Scanner;

public class Lab2C
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many seconds?");
		int inSec = sc.nextInt();
		if ((inSec/60)/60 >= 1)
		{
			int hours = (inSec/60)/60;
			int hoursToSecs = hours*60*60;
			int minutes = (inSec-(hoursToSecs))/60;
			int minsHoursToSecs = (hours*60*60)+(minutes*60);
			int seconds = (inSec-minsHoursToSecs);
			System.out.println(inSec + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
		}
		else if (inSec/60 >= 1)
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