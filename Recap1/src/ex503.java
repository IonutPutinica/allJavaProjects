import java.util.Scanner;

public class ex503
{
   public static void main(String args[])
   {
      int[] v = new int[6];
      int i;
      Scanner input = new Scanner(System.in);
      for (i = 0; i < 5; i++)
      {
         System.out.print("v[" + i + "]=");
         v[i] = input.nextInt();
      }
      int sum = 0;
      for (i = 0; i < 5; i++)
      {
         sum += v[i];
      }
      double avg;
      avg = sum / 5;
      int min = 666;
      for (i = 0; i < 5; i++)
      {
         if (v[i] < min)
            min = v[i];
      }
      int max = -666;
      for (i = 0; i < 5; i++)
      {
         if (v[i] > max)
            max = v[i];
      }
      System.out
            .println("The sum of the 5 integers is=" + sum + " ,the avg is= "
                  + avg + " the minimum is= " + min + " the maximum is=" + max);
   }
}
