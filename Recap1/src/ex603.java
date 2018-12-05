import java.util.Scanner;
import java.util.ArrayList;

public class ex603
{
   public static void main(String args[])
   {
      int integer, i, max = 0, min = 0;
      ArrayList<Integer> positive = new ArrayList<Integer>();
      ArrayList<Integer> negative = new ArrayList<Integer>();
      Scanner input = new Scanner(System.in);
      do
      {
         System.out.print("Input an integer=");
         integer = input.nextInt();
         if (integer > 0)
            positive.add(integer);
         else if (integer < 0)
            negative.add(integer);
      }
      while (integer != 0);
      System.out
            .println("The number of positive integers is=" + positive.size());
      System.out
            .println("The number of negative integers is=" + negative.size());
      for (i = 0; i < positive.size(); i++)
      {
         if (positive.get(i) > max)
            max = positive.get(i);
      }
      for (i = 0; i < negative.size(); i++)
      {
         if (negative.get(i) < min)
            min = negative.get(i);
      }
      System.out.println("The largest value is=" + max);
      System.out.println("The smallest value is=" + min);
   }
}
