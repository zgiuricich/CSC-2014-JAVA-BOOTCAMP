import java.util.Scanner;

public class Lab2D
{
	public static void main(String[] argv)
	{
		Scanner s = new Scanner(System.in);
		double max = 0;
		double[] x;
		x = new double[4];
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
				max = x[i];
			}
		}
		System.out.println(max);
	}
}
