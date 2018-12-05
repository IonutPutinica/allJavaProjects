import java.util.Scanner;

public class Exercise4_08
{
   public static void main(String[] args)
   {
      int n, i, j;
      double p = 1, s = 1;
      System.out.println("Insert n");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for (i = 0; i < n; i++)
      {
         for (j = n; j >= n; j--)
         {
            p = p * 0.5;
         }
         s = s + p;
      }
      System.out.println("S(" + n + ")=" + s);
   }
}