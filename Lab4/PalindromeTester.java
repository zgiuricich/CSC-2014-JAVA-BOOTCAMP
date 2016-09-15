//********************************************************************
//  PalindromeTester.java
//
//  Demonstrates the use of nested while loops.
//********************************************************************
import java.io.*;
import java.util.*;

public class PalindromeTester
{
   //-----------------------------------------------------------------
   //  Tests strings to see if they are palindromes.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
      int left, right;
      String str;

      File input = new File("palindromes.txt");
      Scanner scan = new Scanner(input);

      try
      {
         while(scan.ioException() == null) // allows y or Y
         {
            str = scan.nextLine();
            str = str.replaceAll("[^A-Za-z0-9]", "");
            left = 0;
            right = str.length() - 1;

            while (str.charAt(left) == str.charAt(right) && left < right)
            {
               left++;
               right--;
            }

            System.out.println();

            if (left < right)
               System.out.println (str + " is NOT a palindrome.");
            else
               System.out.println (str + " IS a palindrome.");

            System.out.println();
         }
      }
      catch(NoSuchElementException e)
      {
         System.out.println("done");
      }
   }
}