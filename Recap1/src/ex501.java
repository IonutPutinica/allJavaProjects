import java.util.Scanner;

public class ex501
{
   public static void main(String args[])
   {
      int i;
      Scanner input = new Scanner(System.in);
      int[] v = new int[11];
      System.out.println("Please insert your numbers");
      for (i = 0; i < 10; i++)
      {
         v[i] = input.nextInt();
      }
      for (i = 9; i >= 0; i--)
      {
         System.out.print(v[i] + " ");
      }
   }
}
