public class Lab4B
{
	public static void main(String[] argv)
	{
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count0 = 0;
		int[] randomSet = new int[1000000];
		for (int i = 0; i < 1000000; ++i)
		{
			randomSet[i] = (int) Math.floor(Math.random()*11);
			switch(randomSet[i])
			{
				case (1):
					count1++;
					break;
				case (2):
					count2++;
					break;
				case (3):
					count3++;
					break;
				case (4):
					count4++;
					break;
				case (5):
					count5++;
					break;
				case (6):
					count6++;
					break;
				case (7):
					count7++;
					break;
				case (8):
					count8++;
					break;
				case (9):
					count9++;
					break;
				case (0):
					count0++;
					break;
				default:
					break;
			}
		}
		String c0h = new String(new char[count0/10000]).replace("\0", "#");
		String c1h = new String(new char[count1/10000]).replace("\0", "#");
		String c2h = new String(new char[count2/10000]).replace("\0", "#");
		String c3h = new String(new char[count3/10000]).replace("\0", "#");
		String c4h = new String(new char[count4/10000]).replace("\0", "#");
		String c5h = new String(new char[count5/10000]).replace("\0", "#");
		String c6h = new String(new char[count6/10000]).replace("\0", "#");
		String c7h = new String(new char[count7/10000]).replace("\0", "#");
		String c8h = new String(new char[count8/10000]).replace("\0", "#");
		String c9h = new String(new char[count9/10000]).replace("\0", "#");

		System.out.println("0: " + c0h + " " + count0);
		System.out.println("1: " + c1h + " " + count1);
		System.out.println("2: " + c2h + " " + count2);
		System.out.println("3: " + c3h + " " + count3);
		System.out.println("4: " + c4h + " " + count4);
		System.out.println("5: " + c5h + " " + count5);
		System.out.println("6: " + c6h + " " + count6);
		System.out.println("7: " + c7h + " " + count7);
		System.out.println("8: " + c8h + " " + count8);
		System.out.println("9: " + c9h + " " + count9);
	}
}