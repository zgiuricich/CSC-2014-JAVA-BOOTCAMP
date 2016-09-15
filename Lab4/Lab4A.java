public class Lab4A
{
	public static void main(String[] argv)
	{
		String secretMessage = "If you live long enough, you'll make mistakes. But if you learn from them, you'll be a better person. It's how you handle adversity, not how it affects you. The main thing is never quit, never quit, never quit.";
		String encMessage = "";
		String decMessage = "";
		//System.out.println(secretMessage.length());
		for (int i = 0; i < secretMessage.length(); ++i)
		{
			char c = (char) (secretMessage.charAt(i)-3);
			encMessage += c;
		}
		System.out.println(encMessage);
		for (int i = 0; i < encMessage.length(); ++i)
		{
			char c = (char) (encMessage.charAt(i)+3);
			decMessage += c;
		}
		System.out.println(decMessage);
	}
}