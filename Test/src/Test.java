import java.util.Scanner;

public class Test
{
   public static void main(String args[])
   {

      int n, i;
      Scanner input = new Scanner(System.in);
      System.out.print("Insert n:");
      n = input.nextInt();
      for (i = 1; i <= n; i++)
         System.out.print(i + " ");
      System.out.println();
      for (i = 1; i <= n; i++)
         System.out.print(2 * i + " ");
      System.out.println();
      for (i = 1; i <= n; i++)
         System.out.print(Math.pow(i, 2) + " ");

   }
}