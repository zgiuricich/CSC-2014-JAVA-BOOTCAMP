class Lab3A
{
	public static void main(String[] args)
	{
		int[] anArray;
		int cur = 0;

		anArray = new int[5];

		for (int i = 0; i < anArray.length; ++i)
		{
			anArray[i] = cur + 100;
			cur += 100;
			System.out.println("Element at index " + i + ": " + anArray[i]);
		}
	}
}