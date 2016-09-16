//********************************************************************
//  Account.java
//
//  Represents a bank account with methods deposit and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account
{
   int acctNumber;
   double balance;
   String name;

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner's name, account 
	//   number, and initial balance.
   //-----------------------------------------------------------------
   public Account (String x, int y, double z)
   {
      name = x;
      acctNumber = y;
      balance = z;
   }

   public Account (String x, int y)
   {
      name = x;
      acctNumber = y;
   }
   //-----------------------------------------------------------------
   //  Deposits the specified amount x into the account. 
   //-----------------------------------------------------------------
   public void deposit (double x)
   {
      balance = balance + x;
   }

   //-----------------------------------------------------------------
   //  Withdraws the specified amount from the account and applies
   //  the fee. 
   //-----------------------------------------------------------------
   public void withdraw (double x, double fee)
   {
      balance = balance - x - fee;
   }

   public void withdraw (double x)
   {
      balance = balance-x;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance ()
   {
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      return ("Bank of Java\n" + acctNumber + " - " + name + " - " + fmt.format(balance));
   }

   public void addInterest(double interest)
   {
      balance = balance+(balance*interest);
   }
}