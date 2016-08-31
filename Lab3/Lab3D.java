public class Lab3D
{
	public static void main(String[] argv)
	{
		char[] anArray = new char[26];
		for(int i = 0; i<anArray.length; ++i)
		{
			anArray[i] = (char) (i+97);
			System.out.println(anArray[i]);
		}
	}
}