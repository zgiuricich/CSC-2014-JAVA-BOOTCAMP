import java.util.Scanner;

public class Lab2E
{
	public static void main(String[] argv)
	{
		int max = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Finding the maximum of some values. How many will there be?");
		int num = s.nextInt();
		System.out.println("Please enter " + num + " numbers, separated by spaces:");
		String input = s.next();
		int[] x = new int[num];
		Scanner sc = new Scanner(input);
		for (int i = 0; i < num; i++)
		{
			//x[i] = sc.nextInt();
			//if (x[i]>max)
			//{
			//	max = x[i];
			//}
			System.out.println(sc.nextInt());
		}
		//System.out.println("The largest value entered is " + max);
		s.close();
		sc.close();
	}
}