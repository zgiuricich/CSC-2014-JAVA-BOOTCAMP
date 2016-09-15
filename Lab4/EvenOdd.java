//********************************************************************
//  EvenOdd.java
//
//  Demonstrates the use of the JOptionPane class.
//********************************************************************

import javax.swing.JOptionPane;

public class EvenOdd
{
   //-----------------------------------------------------------------
   //  Determines if the value input by the user is even or odd.
   //  Uses multiple dialog boxes for user interaction.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String numStr, result;
      float num, again;
      int choice = -1;

      do 
      {
         numStr = JOptionPane.showInputDialog ("Enter a float: ");
         num = Float.parseFloat(numStr);
         Object[] options = {"Square Root", "Absolute Value", "Sine", "Cosine", "Tangent", "Floor", "Ceiling"};
         choice = JOptionPane.showOptionDialog(null, "Choose your calculation", "Calculation Options",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
            null, options, options[0]);

         switch(choice)
         {
            case (0):
               result = "The square root is " + (Math.sqrt(num));
               break;
            case (1):
               result = "The absolute value is " + (Math.abs(num));
               break;
            case (2):
               result = "The sine is " + (Math.sin(num));
               break;
            case (3):
               result = "The cosine is " + (Math.cos(num));
               break;
            case (4):
               result = "The tangent is " + (Math.tan(num));
               break;
            case (5):
               result = "The floor is " + (Math.floor(num));
               break;
            case (6):
               result = "The ceiling is " + (Math.ceil(num));
            default:
               result = "The number is " + num;
               break;
         }
         

         JOptionPane.showMessageDialog (null, result);
         again = JOptionPane.showConfirmDialog (null, "Do Another?");
      }
      while (again == JOptionPane.YES_OPTION);
   }
}