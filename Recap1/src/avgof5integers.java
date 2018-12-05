import java.util.Scanner;

public class avgof5integers
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int integer;
      int sum = 0;
      double avg;
      for (int i = 0; i < 5; i++)
      {
         System.out.print("Input the integer=");
         integer = input.nextInt();
         sum += integer;

      }
      avg = (double) sum / 5;
      System.out.println("The sum of the 5 integers is=" + sum
            + " and the average of the 5 integers is=" + avg);
   }
}
