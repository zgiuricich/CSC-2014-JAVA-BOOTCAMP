import java.util.Scanner;

public class Lab2A
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = s.next();
		System.out.println("Please enter your pet's name:");
		String petName = s.next();
		System.out.println("Please enter your age:");
		int age = s.nextInt();
		System.out.println("Hello, my name is " + name + " and I am " + age + 
			" years old. I'm enjoying my time at Villanova, though I miss my pet " +
			petName + " very much!");
	}
}