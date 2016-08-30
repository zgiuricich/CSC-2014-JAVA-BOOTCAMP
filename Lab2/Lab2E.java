import java.util.Scanner; //Import Scanner from java api

public class Lab2E
{
	public static void main(String[] argv)
	{
		int max = 0;
		Scanner s = new Scanner(System.in); //Create initial scanner for user inputs
		System.out.println("Finding the maximum of some values. How many will there be?");
		int num = s.nextInt();
		System.out.println("Please enter " + num + " numbers, separated by spaces:");
		String newLineCancel = s.nextLine(); //Fires nextLine() method to escape newline character remaining from previous input
		String input = s.nextLine();
		int[] x = new int[num];
		Scanner sc = new Scanner(input);
		for (int i = 0; i < num; i++)
		{
			x[i] = sc.nextInt();
			if (x[i]>max)
			{
				max = x[i]; //Iterates through the list of user input numbers to find the maximum
			}
		}
		System.out.println("The largest value entered is " + max);
		s.close();
		sc.close();
	}
}