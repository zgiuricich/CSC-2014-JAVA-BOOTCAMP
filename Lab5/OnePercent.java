public class OnePercent
{
	public static void main(String[] argv)
	{
		double bankTotal;

		Account dTrump = new Account("Donald Trump", 20230715, 400.00);
		Account bGate = new Account("Bill Gates", 31558040, 500.00);
		Account wBuff = new Account("Warren Buffet", 44003050, 600.00);
		Account uSam = new Account("Uncle Sam", 999999999);

		bankTotal = dTrump.getBalance() + bGate.getBalance() + wBuff.getBalance() + uSam.getBalance();

		System.out.println("Before Taxes");
		System.out.println(dTrump.toString());
		System.out.println(bGate.toString());
		System.out.println(wBuff.toString());
		System.out.println(uSam.toString());
		System.out.println("The total funds in the bank is: " + bankTotal);

		uSam.deposit((dTrump.getBalance()*0.15)+(bGate.getBalance()*0.15+(wBuff.getBalance()*0.15)));
		dTrump.withdraw(dTrump.getBalance()*0.15,0);
		bGate.withdraw(bGate.getBalance()*0.15,0);
		wBuff.withdraw(wBuff.getBalance()*0.15,0);
		bankTotal = dTrump.getBalance() + bGate.getBalance() + wBuff.getBalance() + uSam.getBalance();

		System.out.println("\nAfter Taxes");
		System.out.println(dTrump.toString());
		System.out.println(bGate.toString());
		System.out.println(wBuff.toString());
		System.out.println(uSam.toString());
		System.out.println("The total funds in the bank is: " + bankTotal);

		uSam.addInterest(0.015);
		dTrump.addInterest(0.015);
		bGate.addInterest(0.015);
		wBuff.addInterest(0.015);
		bankTotal = dTrump.getBalance() + bGate.getBalance() + wBuff.getBalance() + uSam.getBalance();

		System.out.println("\nAfter 1.5% interest");
		System.out.println(dTrump.toString());
		System.out.println(bGate.toString());
		System.out.println(wBuff.toString());
		System.out.println(uSam.toString());
		System.out.println("The total funds in the bank is: " + bankTotal);
	}
}