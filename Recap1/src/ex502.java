import java.util.Scanner;

public class ex502
{
   public static void main(String args[])
   {
      int i;
      double min = 666;
      Scanner input = new Scanner(System.in);
      double[] v = new double[8];
      System.out.println("Please insert your integers=");
      for (i = 0; i < 7; i++)
      {
         v[i] = input.nextDouble();
      }
      for (i = 0; i < 7; i++)
      {
         if (v[i] < min)
            min = v[i];
      }
      System.out.println("The smallest element in the array is=" + min);
   }
}