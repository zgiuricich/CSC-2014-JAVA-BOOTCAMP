import java.text.DecimalFormat;

public class PassengerData
{
	private Passenger[] collection;
	private int count, numSurvivors, numMales, numFemales, numSurvMale, numSurvFem, numSurvChild, numChild;
	private double percSurvMale, percSurvFem, percSurvChild;
	private static DecimalFormat df2 = new DecimalFormat(".##");

	public PassengerData()
	{
		collection = new Passenger[1];
		count = 0;
		numSurvivors = 0;
		numMales = 0;
		numFemales = 0;
		numChild = 0;
		numSurvMale = 0;
		numSurvFem = 0;
		numSurvChild = 0;

	}

	public void addPassenger(int status, boolean child, String sex, boolean survivor)
	{
		if(count == collection.length)
		{
			increaseSize();
		}
		if (status == 1)
		{
			collection[count] = new FirstClassPassenger(child, sex, survivor);
		}
		else if (status == 2)
		{
			collection[count] = new SecondClassPassenger(child, sex, survivor);
		}
		else if (status == 3)
		{
			collection[count] = new ThirdClassPassenger(child, sex, survivor);
		}
		else if (status == 4)
		{
			collection[count] = new CrewClassPassenger(child, sex, survivor);
		}
		
		count++;
		if (survivor == true)
		{
			numSurvivors++;
		}
		if (child == true)
		{
			numChild++;
			if (survivor == true)
			{
				numSurvChild++;
			}
		}
		if (sex.equals("male"))
		{
			numMales++;
			if (survivor == true)
			{
				numSurvMale++;
			}
		}
		if (sex.equals("female"))
		{
			numFemales++;
			if (survivor == true)
			{
				numSurvFem++;
			}
		}
	}

	public void increaseSize()
	{
		Passenger[] temp = new Passenger[collection.length+1];
		for (int i = 0; i < collection.length; ++i)
		{
			temp[i] = collection[i];
		}
		collection = temp;
	}

	public String toString()
	{
		String passData = "Titanic Passenger Data\n";
		passData += "Number of passengers: " + count + "\n";
		passData += "Number of survivors: " + numSurvivors + "\n";
		passData += "Passenger list:\n\n" ;
		for (int i=0; i<collection.length; ++i)
		{
			passData += collection[i] + "\n";
		}

		percSurvChild = (double)numSurvChild/numChild*100;
		percSurvFem = (double)numSurvFem/numFemales*100;
		percSurvMale = (double)numSurvMale/numMales*100;

		

		passData += "Number of males: " + numMales + "\n";
		passData += "Number of females: " + numFemales + "\n";
		passData += "Number of children: " + numChild + "\n";
		passData += "Percent survival of males: " + df2.format(percSurvMale) + "%\n";
		passData += "Percent survival of females: " + df2.format(percSurvFem) + "%\n";
		passData += "Percent survival of children: " + df2.format(percSurvChild) + "%\n";
		return passData;
	}
}