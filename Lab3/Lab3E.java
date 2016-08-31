import java.util.Scanner;

class Lab3E
{
	public static void main(String[] args)
	{
		int[] anArray = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < anArray.length; ++i)
		{
			System.out.println("Enter an integer:");
			anArray[i]=sc.nextInt();
		}
		for (int i = 0; i < anArray.length; ++i)
		{
			System.out.println("Element at index " + i + ": " + anArray[i]);
		}
	}
}