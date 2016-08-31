public class Lab3B
{
	public static void main(String[] argv)
	{
		double[] anArray = new double[100];

		for(int i = 0; i<anArray.length; ++i)
		{
			anArray[i] = Math.random();
			System.out.println(anArray[i]);
		}
	}
}