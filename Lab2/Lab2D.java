import java.util.Scanner; //Import Scanner from java api

public class Lab2D
{
	public static void main(String[] argv)
	{
		Scanner s = new Scanner(System.in); //Create initial Scanner object for user inputs
		double max = 0;
		double[] x;
		x = new double[4]; //Stores user input values in an array to compare
		System.out.println("Enter a value for a:");
		x[0] = s.nextDouble();
		System.out.println("Enter a value for b:");
		x[1] = s.nextDouble();
		System.out.println("Enter a value for c:");
		x[2] = s.nextDouble();
		System.out.println("Enter a value for d:");
		x[3] = s.nextDouble();
		for (int i = 0; i < x.length; i++)
		{
			if (x[i]>max)
			{
				max = x[i]; //Checks array and sets max equal to the greatest value
			}
		}
		System.out.println(max);
	}
}
