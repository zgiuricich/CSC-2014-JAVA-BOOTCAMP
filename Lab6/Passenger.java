public class Passenger
{
	private int status; 
	private boolean child, survivor;
	private String sex;

	public Passenger(int status, boolean child, String sex, boolean survivor)
	{
		this.status = status;
		this.child = child;
		this.sex = sex;
		this.survivor = survivor;
	}

	public String toString()
	{
		String pass = "Status: " + status + "\nChild: " + child + "\nSex: " + sex + "\nSurvivor: " + survivor + "\n";
		return pass;
	}
}